package com.webapp.app.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeOrder {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
}
