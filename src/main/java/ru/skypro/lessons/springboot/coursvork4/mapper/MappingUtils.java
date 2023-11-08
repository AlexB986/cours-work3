package ru.skypro.lessons.springboot.coursvork4.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.coursvork4.dto.BiderInfo;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.model.Bid;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;

import java.util.List;

@Service
public class MappingUtils {

    public FullLotDTO mapToFullLotDTO(Lot lotEntity, Bid bidEntity){
        FullLotDTO fullLotDTO  = new FullLotDTO();
        fullLotDTO.setId(lotEntity.getId());
        fullLotDTO.setStatus(lotEntity.getStatus());
        fullLotDTO.setTitle(lotEntity.getTitle());
        fullLotDTO.setDescription(lotEntity.getDescription());
        fullLotDTO.setStartPrice(lotEntity.getStartPrice());
        fullLotDTO.setBidPrice(lotEntity.getBidPrice());

        BiderInfo biderDTO = new BiderInfo();
        biderDTO.setId(bidEntity.getId());
        biderDTO.setBidderName(bidEntity.getBidderName());
        biderDTO.setBidDate(bidEntity.getTimestamp());

        fullLotDTO.setLastBid(biderDTO);

        return fullLotDTO;

    }

    public Lot mapToLotEntity(FullLotDTO fullLotDTO, BiderInfo biderInfo){
        Lot lot = new Lot();
        lot.setId(fullLotDTO.getId());
        lot.setStatus(fullLotDTO.getStatus());
        lot.setTitle(fullLotDTO.getTitle());
        lot.setDescription(fullLotDTO.getDescription());
        lot.setStartPrice(fullLotDTO.getStartPrice());
        lot.setBidPrice(fullLotDTO.getBidPrice());

        Bid bid = new Bid();
        bid.setId(biderInfo.getId());
        bid.setBidderName(biderInfo.getBidderName());
        bid.setTimestamp(biderInfo.getBidDate());

        lot.setBidList((List<Bid>)bid);
        return lot;
    }
}
