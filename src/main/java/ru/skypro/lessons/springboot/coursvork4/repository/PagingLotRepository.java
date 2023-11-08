package ru.skypro.lessons.springboot.coursvork4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;

public interface PagingLotRepository extends PagingAndSortingRepository<Lot,Integer> {
}
