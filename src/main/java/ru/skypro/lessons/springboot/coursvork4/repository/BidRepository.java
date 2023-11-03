package ru.skypro.lessons.springboot.coursvork4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.model.Bid;

import java.util.Optional;

public interface BidRepository extends JpaRepository <Bid, Integer>{
    @Query(value = "SELECT * FROM bid WHERE id= :id ORDER BY timestamp LIMIT 1",nativeQuery = true)
    Optional<FullLotDTO> fullLotFromLot(@Param("id") Integer id);
}
