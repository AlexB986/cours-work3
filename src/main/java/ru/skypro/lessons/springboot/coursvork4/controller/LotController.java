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
@RequestMapping("lot")
public class LotController {

    private LotService lotService;
    private BidService bidService;


    public LotController(LotService lotService, BidService bidService) {
        this.lotService = lotService;
        this.bidService = bidService;
    }

    public LotController() {
    }

    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    @GetMapping("/{id}")
    public Optional<FullLotDTO> findLotById(@PathVariable(value = "id", required = false) Integer id) {
        return bidService.findLotById(id);
    }


}

