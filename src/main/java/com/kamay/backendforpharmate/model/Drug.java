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
public class Drug {
    @Id
    private int id;
    private String name;
    private String imgUrl;
    private int count;
}
