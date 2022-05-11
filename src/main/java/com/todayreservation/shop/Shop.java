package com.todayreservation.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop {
    /**
     * String title - 업체, 기관명
     * String category - 업체, 기관의 분류 정보
     * String description - 업체, 기관에 대한 설명
     * String telephone - 업체, 기관의 연락처
     * String link - 업체, 기관의 사이트 주소
     * String address - 업체, 기관의 주소
     * String roadAddress - 업체, 기관의 도로명 주소
     * float mapx - 업체, 기관의 lattitude 좌표
     * float mapy - 업체, 기관의 longitude 좌표
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String category;
    String description;
    String telephone;
    String link;
    String address;
    String roadAddress;
    String mapx;
    String mapy;
    String createdDate;
    String modifiedDate;    

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoadAddress() {
        return roadAddress;
    }

    public void setRoadAddress(String roadAddress) {
        this.roadAddress = roadAddress;
    }

    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapx) {
        this.mapx = mapx;
    }

    public String getMapy() {
        return mapy;
    }

    public void setMapy(String mapy) {
        this.mapy = mapy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Shop() {
    }

    public Shop(String title) {
        this.title = title;
    }

    public Shop(String title, String category, String description, String telephone, String link, String address,
            String roadAddress, String mapx, String mapy, String createdDate, String modifiedDate) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.telephone = telephone;
        this.link = link;
        this.address = address;
        this.roadAddress = roadAddress;
        this.mapx = mapx;
        this.mapy = mapy;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Shop [address=" + address + ", category=" + category + ", description=" + description + ", link=" + link
                + ", mapx=" + mapx + ", mapy=" + mapy + ", roadAddress=" + roadAddress + ", telephone=" + telephone
                + ", title=" + title + "]";
    }
    
}
