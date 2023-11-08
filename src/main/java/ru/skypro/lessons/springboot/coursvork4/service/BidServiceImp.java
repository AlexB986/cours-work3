package ru.skypro.lessons.springboot.coursvork4.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.repository.BidRepository;
import ru.skypro.lessons.springboot.coursvork4.repository.LotRepository;

import java.util.List;
import java.util.Optional;

//@Service
@AllArgsConstructor
//
//public class BidServiceImp implements BidService {
//
//    @Autowired
//    private BidRepository bidRepository;
//    @Autowired
//    private  FullLotDTO fullLotDTO;
//
//
//
//    public BidServiceImp() {
//    }
//
//    public BidServiceImp(BidRepository bidRepository, FullLotDTO fullLotDTO) {
//        this.bidRepository = bidRepository;
//        this.fullLotDTO = fullLotDTO;
//    }
//
//    /**
//     * Get  Получить полную информацию о лоте
//     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
//     */
//    @Override
//    public Optional<FullLotDTO> findLotById(Integer id) {
////        Optional<FullLotDTO> lotById = bidRepository.fullLotFromLot(id);
//
////        if (lotById.isPresent()) {
////            FullLotDTO fullLotDTO = lotById.get();
////            Integer current = fullLotDTO.getStartPrice() * fullLotDTO.getBidPrice() + fullLotDTO.getStartPrice();
////
////            fullLotDTO.setId(fullLotDTO.getId());
////            fullLotDTO.setStatus(fullLotDTO.getStatus());
////            fullLotDTO.setTitle(fullLotDTO.getTitle());
////            fullLotDTO.setDescription(fullLotDTO.getDescription());
////            fullLotDTO.setStartPrice(fullLotDTO.getStartPrice());
////            fullLotDTO.setLastBid(fullLotDTO.getLastBid());
//
////            fullLotDTO.setCurrentPrice(current);
////            return Optional.of(fullLotDTO);
////        } else {
////            return Optional.empty();
////        }
//
//
//        return bidRepository.fullLotFromLot(id);
//    }
//}
@Service
public class BidServiceImp implements BidService {

    @Autowired
    private BidRepository bidRepository;

    public BidServiceImp() {
    }

//    public BidServiceImp(BidRepository bidRepository) {
//        this.bidRepository = bidRepository;
//    }

    @Override
    public Optional<FullLotDTO> findLotById(Integer id) {
        Optional<FullLotDTO> lotById = bidRepository.fullLotFromLot(id);

        if (lotById.isPresent()) {
            FullLotDTO fullLotDTO = lotById.get();
            Integer current = fullLotDTO.getStartPrice() * fullLotDTO.getBidPrice() + fullLotDTO.getStartPrice();

            fullLotDTO.setCurrentPrice(current);
            return Optional.of(fullLotDTO);
        } else {
            return Optional.empty();
        }
    }
}