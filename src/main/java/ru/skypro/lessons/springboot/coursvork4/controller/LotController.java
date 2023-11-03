package ru.skypro.lessons.springboot.coursvork4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoLot;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;
import ru.skypro.lessons.springboot.coursvork4.service.BidService;
import ru.skypro.lessons.springboot.coursvork4.service.LotService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("lot")
public class LotController {
    @Autowired
    private static LotService lotService;
    @Autowired
    private static BidService bidService;


    public LotController(LotService lotService,BidService bidService) {
        this.lotService = lotService;
        this.bidService = bidService;
    }

    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    @GetMapping("/{id}")
    public Optional<FullLotDTO> findLotById(@PathVariable(value = "id", required = false) Integer id) {
        return bidService.findLotById(id);
    }
//
//    /**
//     * Get  Получить все лоты, основываясь на фильтре статуса и номере страницы
//     */
//    @GetMapping("/{page}/{status}")
//    public List<InfoLot> getLotToFilter(@PathVariable(required = false) int page, String status) {
//        int size = 10;
//        return lotService.getLotToFilter(status, page, size);
//
//    }
//    /**
//     * Get  Экспортировать все лоты в файл CSV
//     */
//    /**
//     * Post   Начать торги по лоту
//     */
//    @PostMapping(value = "/{id}/start")
//    public void startBargain(@PathVariable(required = false) int id) {
//        lotService.startBargain(id);
//    }
//
//    /**
//     * Post Сделать ставку по лоту
//     */
//    @PostMapping(value = "/{id}/bid")
//    public void placeBet(@PathVariable(required = false) int id) {
//        lotService.placeBet(id);
//    }
//
//    /**
//     * Post   Остановить торги по лоту
//     */
//    @PostMapping(value = "/{id}/stop")
//    public void stopBargain(@PathVariable(required = false) int id) {
//        lotService.stopBargain(id);
//    }
//
//    /**
//     * Post    Создает новый лот
//     */
//    @PostMapping(value = "/create")
//    public void createLot() {
//        lotService.createLot();
//    }
//
//    /**
//     * Get Получить информацию о первом ставившем на лот
//     * Имя первого ставившего и дата первой ставки
//     */
//    @GetMapping("/{id}/first")
//    public List<FullLotDTO>getFirstBid(@PathVariable(value = "id",required = false)Integer id){
//        return bidService.getFirstBid(id);
//    }
//
//    /**
//     * Get  Возвращает имя ставившего на данный лот наибольшее количество раз
//     * Имя первого ставившего и дата его последней ставки
//     */
//    @GetMapping("/{id}/frequent")
//    public List<FullLotDTO>getFrequentBid(@PathVariable(value = "id",required = false)Integer id){
//        return bidService.getFrequentBid(id);
//    }

}

