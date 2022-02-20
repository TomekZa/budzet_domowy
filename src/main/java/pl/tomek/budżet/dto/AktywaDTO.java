package pl.tomek.budżet.dto;

import java.util.List;
import java.util.Objects;

public class AktywaDTO {

    private List<Integer> listaAktyw;

    public List<Integer> getListaAktyw() {
        return listaAktyw;
    }

    public void setListaAktyw(List<Integer> listaAktyw) {
        this.listaAktyw = listaAktyw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AktywaDTO aktywaDTO = (AktywaDTO) o;
        return Objects.equals(listaAktyw, aktywaDTO.listaAktyw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaAktyw);
    }

    @Override
    public String toString() {
        return "AktywaDTO{" +
                "Lista Aktyw: " + listaAktyw +
                '}';
    }
}
