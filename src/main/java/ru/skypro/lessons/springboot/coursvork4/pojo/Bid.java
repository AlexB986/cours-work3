package ru.skypro.lessons.springboot.coursvork4.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SourceType;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
@Setter
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String biggerName;
    @CreationTimestamp(source = SourceType.DB)
    private Timestamp timestamp;
    @ManyToOne
    @JoinColumn(name = "lot_id",insertable = false,updatable = false)
    private Lot lot;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bid bid = (Bid) o;
        return Objects.equals(id, bid.id) && Objects.equals(biggerName, bid.biggerName) && Objects.equals(timestamp, bid.timestamp) && Objects.equals(lot, bid.lot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, biggerName, timestamp, lot);
    }
}
