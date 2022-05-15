package com.saitej.springentitytodto.modelmapper.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDTO {
    private Long Id;
    private String name;
    private String description;
    private Double price;

}
