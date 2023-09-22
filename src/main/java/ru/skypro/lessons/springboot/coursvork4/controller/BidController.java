package ru.skypro.lessons.springboot.coursvork4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.pojo.Bid;
import ru.skypro.lessons.springboot.coursvork4.service.BidService;

import java.util.List;

@RestController
@RequestMapping("bid")
@RequiredArgsConstructor
public class BidController {

    private static BidService bidService;

    public BidController (BidService bidService){
        this.bidService = bidService;
    }
    /**
     * Get Получить информацию о первом ставившем на лот
     * Имя первого ставившего и дата первой ставки
     */
    @GetMapping("/{id}/first")
    public List<FullLot>getFirstBid(@PathVariable(value = "id",required = false)Integer id){
        return bidService.getFirstBid(id);
    }

    /**
     * Get  Возвращает имя ставившего на данный лот наибольшее количество раз
     * Имя первого ставившего и дата его последней ставки
     */
    @GetMapping("/{id}/frequent")
    public List<FullLot>getFrequentBid(@PathVariable(value = "id",required = false)Integer id){
        return bidService.getFrequentBid(id);
    }


}
