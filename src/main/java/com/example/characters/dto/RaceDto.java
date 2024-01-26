package com.example.characters.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceDto {
    private Long id;
    private String nombre;
    private String descripcion;
}
