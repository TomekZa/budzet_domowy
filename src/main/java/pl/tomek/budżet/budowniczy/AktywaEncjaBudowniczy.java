package pl.tomek.budżet.budowniczy;

import pl.tomek.budżet.dto.AktywaEncjaDTO;
import pl.tomek.budżet.encje.AktywaEncja;

import java.math.BigDecimal;
import java.util.UUID;

public class AktywaEncjaBudowniczy {

    private UUID id;
    private BigDecimal kwota;

    public AktywaEncjaBudowniczy budujID(UUID id) {
        this.id = id;
        return this;
    }

    public AktywaEncjaBudowniczy budujKwote(BigDecimal kwota) {
        this.kwota = kwota;
        return this;
    }

    public AktywaEncja buduj() {
        AktywaEncja aktywaEncja = new AktywaEncja();
        aktywaEncja.setId(this.id);
        aktywaEncja.setKwota(this.kwota);

        return aktywaEncja;
    }
}
