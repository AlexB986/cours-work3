package ru.skypro.lessons.springboot.coursvork4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.skypro.lessons.springboot.coursvork4.dto.FullLotDTO;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;

import java.util.List;
import java.util.Optional;

public interface LotRepository extends JpaRepository<Lot, Integer> {


}