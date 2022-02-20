package pl.tomek.budżet.kontrolery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/api")
public class KontrolerAktywów {

   @GetMapping("/aktywa")
    public List<Integer> pobierzAktywa(){

        return asList(1, 2, 3);
   }

}
