package pl.tomek.budżet.dto;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class AktywaEncjaDTO {

    private UUID id;
    private BigDecimal kwota;

    public AktywaEncjaDTO() {
    }

    public AktywaEncjaDTO(UUID id, BigDecimal kwota) {
        this.id = id;
        this.kwota = kwota;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getKwota() {
        return kwota;
    }

    public void setKwota(BigDecimal kwota) {
        this.kwota = kwota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AktywaEncjaDTO that = (AktywaEncjaDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AktywaEncjaDTO{" +
                "id=" + id +
                ", kwota=" + kwota +
                '}';
    }
}
