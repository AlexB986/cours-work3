package ru.skypro.lessons.springboot.coursvork4.service;

import lombok.AllArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoPersonData;
import ru.skypro.lessons.springboot.coursvork4.repository.LotRepository;
import ru.skypro.lessons.springboot.coursvork4.repository.PagingLotRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class LotServiceImp implements LotService {
    private final LotRepository lotRepository;
    private final PagingLotRepository pagingLotRepository;


    @Override
    public List<FullLot> getFullLot(int id) {
        return lotRepository.getFullLot(id);
    }

//    @Override
//    public List<InfoLot> getLotToFilter(int page, int size) {
//        return lotRepository.getLotToFilter(page, size);
//    }
//
//    @Override
//    public CSVFormat unloadFile() {
//        return lotRepository.unloadFile();
//    }




    @Override
    public List<InfoLot> getLotToFilter(String status, int page, int size) {
        return null;
    }

    @Override
    public CSVFormat unloadFile() {
        return null;
    }
////////////////////////////////////
    @Override
    public void startBargain(int id) {
    }

    @Override
    public String placeBet(int id) {
        return null;
    }

    @Override
    public void stopBargain(int id) {

    }

    @Override
    public void createLot() {

    }
}
