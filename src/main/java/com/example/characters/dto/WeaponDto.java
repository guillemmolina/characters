package com.example.characters.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeaponDto {
    private Long id;
    private String arma;
    private String velocidad;
    private String ataque;
}
