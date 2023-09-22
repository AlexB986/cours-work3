package ru.skypro.lessons.springboot.coursvork4.service;

import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.pojo.Bid;

import java.util.List;

public interface BidService {
    /**
     *  Get Получить информацию о первом ставившем на лот
     * Имя первого ставившего и дата первой ставки
     */
    List<FullLot> getFirstBid(int id);

    /**
     *  Get  Возвращает имя ставившего на данный лот наибольшее количество раз
     * Имя первого ставившего и дата его последней ставки
     */
    List<FullLot> getFrequentBid(int id);


}
