package ru.skypro.lessons.springboot.coursvork4.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.lessons.springboot.coursvork4.pojo.Lot;

public interface PagingLotRepository extends PagingAndSortingRepository<Lot,Integer> {
}
