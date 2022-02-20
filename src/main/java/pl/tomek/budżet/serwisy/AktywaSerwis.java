package pl.tomek.budżet.serwisy;

import org.springframework.stereotype.Service;
import pl.tomek.budżet.dto.AktywaDTO;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Service
public class AktywaSerwis {

    private AktywaDTO aktywaDTO = new AktywaDTO();

    public AktywaDTO getAktywaDTO() {
        return aktywaDTO;
    }

    //    public AktywaDTO pobierzWszystkieAktywa() {
//        AktywaDTO aktywaDTO = new AktywaDTO();  // można też var aktywaDTO = new AktywaDTO();
//        aktywaDTO.setListaAktyw(asList(1, 2, 3));
//        return aktywaDTO;
//    }

    public void ustawAktywa(int aktywa) {
        List<Integer> wszystkieAktywa = aktywaDTO.getListaAktyw();
        if (wszystkieAktywa == null) {
            wszystkieAktywa = new ArrayList<>();
        }
        wszystkieAktywa.add(aktywa);
        aktywaDTO.setListaAktyw(wszystkieAktywa);
    }
}
