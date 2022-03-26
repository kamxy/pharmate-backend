package com.kamay.backendforpharmate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    private int id;
    private String name;
    private double totalPercent;
    private double plasticPercent;
    private double drugPercent;
    private String imagePath;
    private double km;
    private double lang;
    private double lat;
}
