package pl.tomek.budżet.mapper;

import org.springframework.stereotype.Component;
import pl.tomek.budżet.budowniczy.AktywaEncjaBudowniczy;
import pl.tomek.budżet.budowniczy.AktywaEncjaDTOBudowniczy;
import pl.tomek.budżet.dto.AktywaEncjaDTO;
import pl.tomek.budżet.encje.AktywaEncja;

import java.util.Objects;

@Component
public class AktywaMapper {

    public AktywaEncja konwertujDTODoEncji(AktywaEncjaDTO aktywaEncjaDTO){
        if (Objects.isNull(aktywaEncjaDTO)){
            return null;
        }
        AktywaEncjaBudowniczy aktywaEncjaBudowniczy = new AktywaEncjaBudowniczy();
        if (Objects.nonNull(aktywaEncjaDTO.getId())){
            aktywaEncjaBudowniczy.budujID(aktywaEncjaDTO.getId());
        }
        if (Objects.nonNull(aktywaEncjaDTO.getKwota())){
            aktywaEncjaBudowniczy.budujKwote(aktywaEncjaDTO.getKwota());
        }
        return aktywaEncjaBudowniczy.buduj();
    }

    public AktywaEncjaDTO konwertujEncjeDoDTO(AktywaEncja aktywaEncja){
        if(Objects.isNull(aktywaEncja)){
            return null;
        }
        AktywaEncjaDTOBudowniczy aktywaEncjaDTOBudowniczy = new AktywaEncjaDTOBudowniczy();
        if (Objects.nonNull(aktywaEncja.getId())){
            aktywaEncjaDTOBudowniczy.budujID(aktywaEncja.getId());
        }
        if (Objects.nonNull(aktywaEncja.getKwota())){
            aktywaEncjaDTOBudowniczy.budujKwote(aktywaEncja.getKwota());
        }
        return aktywaEncjaDTOBudowniczy.buduj();
    }

}
