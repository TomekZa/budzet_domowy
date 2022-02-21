package pl.tomek.budżet.encje;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "aktywa")
public class AktywaEncja {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "kwota")
    private BigDecimal kwota;

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
        AktywaEncja that = (AktywaEncja) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(kwota, that.kwota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kwota);
    }

    @Override
    public String toString() {
        return "AktywaEncja{" +
                "id=" + id +
                ", kwota=" + kwota +
                '}';
    }
}
