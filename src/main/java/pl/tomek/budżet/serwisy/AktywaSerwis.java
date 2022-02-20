package pl.tomek.budżet.serwisy;

import org.springframework.stereotype.Service;
import pl.tomek.budżet.dto.AktywaDTO;

import static java.util.Arrays.asList;

@Service
public class AktywaSerwis {

    public AktywaDTO pobierzWszystkieAktywa() {
        AktywaDTO aktywaDTO = new AktywaDTO();  // można też var aktywaDTO = new AktywaDTO();
        aktywaDTO.setListaAktyw(asList(1, 2, 3));
        return aktywaDTO;
    }
}
