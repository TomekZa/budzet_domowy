package pl.tomek.budżet.serwisy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.tomek.budżet.dto.AktywaDTO;

import java.util.List;


class AktywaSerwisTest {

    @Test
    void SprawdzanieLiczby() {

        // given

        int aktywa = 1;
        AktywaSerwis aktywaSerwis = new AktywaSerwis();
        aktywaSerwis.ustawAktywa(aktywa);

        // when

        // AktywaDTO rezultat = aktywaSerwis.pobierzWszystkieAktywa();
        AktywaDTO rezultat = aktywaSerwis.getAktywaDTO();

        // then

        List<Integer> lista = rezultat.getListaAktyw();
        Assertions.assertThat(lista)
                .hasSize(1)
                .containsExactly(aktywa);
    }

    @Test
    void SprawdzanieDwóchLiczb() {

        // given

        int aktywaJeden = 1;
        int aktywaDwa = 3;
        AktywaSerwis aktywaSerwis = new AktywaSerwis();
        aktywaSerwis.ustawAktywa(aktywaJeden);
        aktywaSerwis.ustawAktywa(aktywaDwa);

        // when

        // AktywaDTO rezultat = aktywaSerwis.pobierzWszystkieAktywa();
        AktywaDTO rezultat = aktywaSerwis.getAktywaDTO();

        // then

        List<Integer> lista = rezultat.getListaAktyw();
        Assertions.assertThat(lista)
                .hasSize(2)
                .containsExactly(aktywaJeden, aktywaDwa);
    }
}