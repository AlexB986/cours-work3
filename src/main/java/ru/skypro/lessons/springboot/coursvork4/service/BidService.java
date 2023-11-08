package ru.skypro.lessons.springboot.coursvork4.service;

import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;

import java.util.List;
import java.util.Optional;

public interface BidService {

    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    Optional<FullLotDTO> findLotById(Integer id);
}
