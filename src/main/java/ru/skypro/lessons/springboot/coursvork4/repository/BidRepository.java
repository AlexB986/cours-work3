package ru.skypro.lessons.springboot.coursvork4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.model.Bid;

import java.util.Optional;

public interface BidRepository extends JpaRepository<Bid, Integer> {
//    @Query("SELECT new ru.skypro.lessons.springboot.coursvork4.dto. " +
//            "FullLotDTO (b.id, b.status, b.lot.title, b.description,b.startPrice, b.bidPrice, b.currentPrice, b.lastBid) " +
//            "FROM Bid b JOIN FETCH b.lot  " +
//            "WHERE b.id =:id " +
//            "ORDER BY b.timestamp DESC")
//    Optional<FullLotDTO> fullLotFromLot(@Param("id") Integer id);

    @Query("SELECT new ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO(b.lot.id, b.lot.status, b.lot.title, b.lot.description, b.lot.startPrice, b.lot.bidPrice, b.currentPrice, b.lastBid) " +
            "FROM Bid b JOIN FETCH b.lot " +
            "WHERE b.id =:id " +
            "ORDER BY b.timestamp DESC")
    Optional<FullLotDTO> fullLotFromLot(@Param("id") Integer id);
    }