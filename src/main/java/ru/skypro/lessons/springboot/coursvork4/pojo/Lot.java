package ru.skypro.lessons.springboot.coursvork4.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.skypro.lessons.springboot.coursvork4.service.Status;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
@Setter
public class Lot {
    private Status typeStatus;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String status =String.valueOf( Status.CREATED);
    private String title;
    private String description;
    private Integer startPrice;
    private Integer bigPrice;
    @OneToMany(mappedBy ="lot")
    private List <Bid> bidList;

}
