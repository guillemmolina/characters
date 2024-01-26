package com.example.characters.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "personajes_señor_de_los_anillos")
public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String genero;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "raza", referencedColumnName = "nombre")
    private RaceEntity race;

    @ManyToOne
    @JoinColumn(name = "arma_principal", referencedColumnName = "arma")
    private WeaponEntity armaPrincipal;
}
