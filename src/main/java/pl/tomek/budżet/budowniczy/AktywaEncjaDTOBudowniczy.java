package pl.tomek.budżet.budowniczy;

import pl.tomek.budżet.dto.AktywaEncjaDTO;

import java.math.BigDecimal;
import java.util.UUID;

public class AktywaEncjaDTOBudowniczy {

    private UUID id;
    private BigDecimal kwota;

    public AktywaEncjaDTOBudowniczy budujID(UUID id) {
        this.id = id;
        return this;
    }

    public AktywaEncjaDTOBudowniczy budujKwote(BigDecimal kwota) {
        this.kwota = kwota;
        return this;
    }

    public AktywaEncjaDTO buduj() {
        AktywaEncjaDTO aktywaEncjaDTO = new AktywaEncjaDTO();
        aktywaEncjaDTO.setId(this.id);
        aktywaEncjaDTO.setKwota(this.kwota);

        return aktywaEncjaDTO;
    }
}
