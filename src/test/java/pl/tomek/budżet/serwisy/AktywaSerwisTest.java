package pl.tomek.budżet.serwisy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.tomek.budżet.dto.AktywaDTO;
import pl.tomek.budżet.mapper.AktywaMapper;

import java.util.List;


class AktywaSerwisTest {

    private TymczasoweNieprawdziweRepozytorium tymczasoweNieprawdziweRepozytorium;
    private AktywaMapper aktywaMapper;

    public AktywaSerwisTest(TymczasoweNieprawdziweRepozytorium tymczasoweNieprawdziweRepozytorium, AktywaMapper aktywaMapper) {
        this.tymczasoweNieprawdziweRepozytorium = tymczasoweNieprawdziweRepozytorium;
        this.aktywaMapper = aktywaMapper;
    }

    @Test
    void SprawdzanieLiczby() {

        // given

        int aktywa = 1;
        AktywaSerwis aktywaSerwis = new AktywaSerwis(tymczasoweNieprawdziweRepozytorium, aktywaMapper);
        aktywaSerwis.zapiszAktywa(aktywa);

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
        AktywaSerwis aktywaSerwis = new AktywaSerwis(tymczasoweNieprawdziweRepozytorium, aktywaMapper);
        aktywaSerwis.zapiszAktywa(aktywaJeden);
        aktywaSerwis.zapiszAktywa(aktywaDwa);

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