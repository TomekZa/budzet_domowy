package pl.tomek.budżet.kontrolery;

import org.springframework.web.bind.annotation.*;
import pl.tomek.budżet.dto.AktywaDTO;
import pl.tomek.budżet.serwisy.AktywaSerwis;

@RestController
@RequestMapping("/api")
public class KontrolerAktywów {

    private final AktywaSerwis aktywaSerwis;

    public KontrolerAktywów(AktywaSerwis aktywaSerwis) {
        this.aktywaSerwis = aktywaSerwis;
    }

    @GetMapping("/aktywa")
    public AktywaDTO pobierzAktywa() {

        return aktywaSerwis.getAktywaDTO();
    }

    @PostMapping("/aktywa/{aktywa}")
    public void ustawAktywa(@PathVariable("aktywa") int aktywa) {

        aktywaSerwis.zapiszAktywa(aktywa);
    }

}
