package ru.skypro.lessons.springboot.coursvork4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.pojo.Bid;

import java.util.List;
@Service
@AllArgsConstructor

public class BidServiceImp implements BidService {
    /**
     * Get Получить информацию о первом ставившем на лот
     * Имя первого ставившего и дата первой ставки
     */
    @Override
    public List<FullLot> getFirstBid(int id) {
        return null;
    }

    /**
     * Get  Возвращает имя ставившего на данный лот наибольшее количество раз
     * Имя первого ставившего и дата его последней ставки
     */

    @Override
    public List<FullLot> getFrequentBid(int id) {
        return null;
    }
}
