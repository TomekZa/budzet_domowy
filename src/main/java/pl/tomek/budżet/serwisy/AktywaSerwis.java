package pl.tomek.budżet.serwisy;

import org.springframework.stereotype.Service;
import pl.tomek.budżet.dto.AktywaDTO;
import pl.tomek.budżet.dto.AktywaEncjaDTO;
import pl.tomek.budżet.encje.AktywaEncja;
import pl.tomek.budżet.mapper.AktywaMapper;
import pl.tomek.budżet.repozytorium.AktywaRepozytorium;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AktywaSerwis {

    private AktywaRepozytorium aktywaRepozytorium;
    private AktywaMapper aktywaMapper;

    public AktywaSerwis(AktywaRepozytorium aktywaRepozytorium, AktywaMapper aktywaMapper) {
        this.aktywaRepozytorium = aktywaRepozytorium;
        this.aktywaMapper = aktywaMapper;
    }

    public AktywaDTO getAktywaDTO() {
        List<AktywaEncja> aktywaEncja = aktywaRepozytorium.findAll();
        List<Integer> kwota = aktywaEncja.stream()
                .map(encja -> encja.getKwota().intValue())
                .collect(Collectors.toList());

        AktywaDTO aktywaDTO = new AktywaDTO();
        aktywaDTO.setListaAktyw(kwota);
        return aktywaDTO;
    }

    //    public AktywaDTO pobierzWszystkieAktywa() {
//        AktywaDTO aktywaDTO = new AktywaDTO();  // można też var aktywaDTO = new AktywaDTO();
//        aktywaDTO.setListaAktyw(asList(1, 2, 3));
//        return aktywaDTO;
//    }

    public void zapiszAktywa(int aktywa) {
        AktywaEncjaDTO aktywaEncjaDTO = new AktywaEncjaDTO();
        aktywaEncjaDTO.setKwota(new BigDecimal(aktywa));
        AktywaEncja encja = aktywaMapper.konwertujDTODoEncji(aktywaEncjaDTO);

        aktywaRepozytorium.save(encja);

    }
}
