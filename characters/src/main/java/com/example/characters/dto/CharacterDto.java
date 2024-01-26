package com.example.characters.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDto {
    private Long id;
    private String nombre;
    private String genero;
    private String descripcion;
    private RaceDto race;
    private WeaponDto armaPrincipal;
}
