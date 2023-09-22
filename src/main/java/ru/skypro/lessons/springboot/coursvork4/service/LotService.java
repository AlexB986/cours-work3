package ru.skypro.lessons.springboot.coursvork4.service;

import org.apache.commons.csv.CSVFormat;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoLot;
import ru.skypro.lessons.springboot.coursvork4.dto.InfoPersonData;

import java.util.List;

public interface LotService {

    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    List<FullLot> getFullLot(int id);

    /**
     * Get  Получить все лоты, основываясь на фильтре статуса и номере страницы
     */
    List<InfoLot> getLotToFilter(String status, int page, int size);

    /**
     * Get  Экспортировать все лоты в файл CSV
     */
    CSVFormat unloadFile();

    /**
     * Post   Начать торги по лоту
     */
    void startBargain(int id);

    /**
     * Post Сделать ставку по лоту
     */
    String placeBet(int id);

    /**
     * Post   Остановить торги по лоту
     */
    void stopBargain(int id);
    /**
     *  Post    Создает новый лот
     */
    void createLot();

}
