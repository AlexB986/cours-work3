package ru.skypro.lessons.springboot.coursvork4.dto;

import org.springframework.stereotype.Component;
import ru.skypro.lessons.springboot.coursvork4.model.Bid;
import ru.skypro.lessons.springboot.coursvork4.model.Lot;
import ru.skypro.lessons.springboot.coursvork4.service.Status;
@Component
public class FullLotDTO {
    private Integer id;
    private Status status;
    private String title;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;
    private Integer currentPrice;
    private Bid lastBid;


    public FullLotDTO(Integer id, Status status, String title, String description, Integer startPrice, Integer bidPrice, Integer currentPrice, Bid lastBid) {
        this.id = id;
        this.status = status;
        this.title = title;
        this.description = description;
        this.startPrice = startPrice;
        this.bidPrice = bidPrice;
        this.currentPrice = currentPrice;
        this.lastBid = lastBid;
    }

    public FullLotDTO() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    public Integer getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {

        this.currentPrice = currentPrice;
    }

    public Bid getLastBid() {
        return lastBid;
    }

    public void setLastBid(Bid lastBid) {
        this.lastBid = lastBid;
    }

    }



