package ru.skypro.lessons.springboot.coursvork4.repository;

import org.apache.commons.csv.CSVFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLot;
import ru.skypro.lessons.springboot.coursvork4.pojo.Lot;

import java.util.List;

@Repository
public interface LotRepository extends JpaRepository<Lot, Integer> {


    /**
     * Get  Получить полную информацию о лоте
     * Возвращает полную информацию о лоте с последним ставившим и текущей ценой
     */
    @Query("SELECT new ru.skypro.lessons.springboot.coursvork4.dto. " +
            "FullLot(l.id,l.status,l.descriptor,l.startPrice,l.bidPrice,l.currentPrice,b.lastBid) " +
            "FROM Lot l join fetch Bid b " +
            "WHERE l.id == id")
    List<FullLot> getFullLot(Integer id);

//    SELECT a FROM Author a WHERE (SELECT count(b) FROM Book b WHERE a MEMBER OF b.authors ) > 1

    /**
     * Get  Получить все лоты, основываясь на фильтре статуса и номере страницы
     */


    /**
     * Get  Экспортировать все лоты в файл CSV
     */


    /**
     * Post   Начать торги по лоту
     */

    /**
     * Post Сделать ставку по лоту
     */

    /**
     * Post   Остановить торги по лоту
     */
    /**
     *  Post    Создает новый лот
     */

}
