package com.todayreservation.shop;

import java.time.*;
import java.util.ArrayList;

import jakarta.persistence.Entity;

@Entity
public class ShopResponse {

    LocalDateTime responsedTime;
    ArrayList<Shop> items;

    public LocalDateTime getResponsedTime() {
        return responsedTime;
    }
    public void setModifiedTime(LocalDateTime responsedTime) {
        this.responsedTime = responsedTime;
    }
    public ArrayList<Shop> getItems() {
        return items;
    }
    public void setItems(ArrayList<Shop> items) {
        this.items = items;
    }    

    public ShopResponse() {

    }
    public ShopResponse(LocalDateTime responsedTime, ArrayList<Shop> items) {
        this.responsedTime = responsedTime;
        this.items = items;        
    }
    
}
