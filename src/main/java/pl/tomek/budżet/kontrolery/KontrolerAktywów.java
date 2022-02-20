package pl.tomek.budżet.kontrolery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomek.budżet.dto.AktywaDTO;
import pl.tomek.budżet.serwisy.AktywaSerwis;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/api")
public class KontrolerAktywów {

    private final AktywaSerwis aktywaSerwis;

    public KontrolerAktywów(AktywaSerwis aktywaSerwis) {
        this.aktywaSerwis = aktywaSerwis;
    }

    @GetMapping("/aktywa")
    public AktywaDTO pobierzAktywa() {

        return aktywaSerwis.pobierzWszystkieAktywa();
    }

}
