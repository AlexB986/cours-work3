package ru.skypro.lessons.springboot.coursvork4.controller;

import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.springframework.web.bind.annotation.*;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoPersonData;
import ru.skypro.lessons.springboot.coursvork4.service.LotService;
import ru.skypro.lessons.springboot.coursvork4.service.Status;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("lot")
public class LotController {
    private static LotService lotService;

    public LotController(LotService lotService) {
        this.lotService = lotService;
    }

    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    @GetMapping("/{id}/frequent")
    public List<FullLot> getFullLot(@PathVariable(value = "id", required = false) Integer id) {
        return lotService.getFullLot(id);
    }

    /**
     * Get  Получить все лоты, основываясь на фильтре статуса и номере страницы
     */
    @GetMapping("/{page}/{status}")
    public List<InfoLot> getLotToFilter(@PathVariable(required = false) int page, String status) {
        int size = 10;
        return lotService.getLotToFilter(status, page, size);

    }
    /**
     * Get  Экспортировать все лоты в файл CSV
     */
    /**
     * Post   Начать торги по лоту
     */
    @PostMapping(value = "/{id}/start")
    public void startBargain(@PathVariable(required = false)int id){
        lotService.startBargain(id);
    }

    /**
     * Post Сделать ставку по лоту
     */
    @PostMapping(value = "/{id}/bid")
    public void placeBet(@PathVariable(required = false)int id){
        lotService.placeBet(id);
    }
    /**
     * Post   Остановить торги по лоту
     */
    @PostMapping(value = "/{id}/stop")
    public void stopBargain(@PathVariable(required = false)int id){
        lotService.stopBargain(id);
    }
    /**
     *  Post    Создает новый лот
     */
    @PostMapping(value = "/create")
    public void createLot(){
        lotService.createLot();
    }

}

