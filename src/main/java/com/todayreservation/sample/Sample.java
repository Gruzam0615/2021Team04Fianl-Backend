package com.todayreservation.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String column2;    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColumn2() {
        return column2;
    }
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public Sample() {}

    public Sample(int id, String column2) {
        this.id = id;
        this.column2 = column2;
    }

    public Sample(Sample param) {
        this.id = param.getId();
        this.column2 = param.getColumn2();
    }
}