package ru.skypro.lessons.springboot.coursvork4.service;

import lombok.AllArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoLot;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;
import ru.skypro.lessons.springboot.coursvork4.repository.BidRepository;
import ru.skypro.lessons.springboot.coursvork4.repository.LotRepository;
import ru.skypro.lessons.springboot.coursvork4.repository.PagingLotRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class LotServiceImp implements LotService {



//    @Override раскоментировать
//    public List<FullLotDTO> getFullLot(int id) {
//    public Optional<FullLotDTO> findLotById(Integer id) {
//        FullLotDTO fullLotDTO1 = new FullLotDTO();
//        Optional<FullLotDTO> fullLotDTOOptional = lotRepository.fullLotFromLot(id);
//        Integer current = fullLotDTOOptional.get().getStartPrice() * fullLotDTOOptional.get().getBidPrice() + fullLotDTOOptional.get().getStartPrice();
//        fullLotDTO1.setCurrentPrice(current);
//        System.out.println("current");
//        return Optional.of(fullLotDTO1);
//            return bidRepository.fullLotFromLot(id);

}
