package com.example.characters.mapper;

import com.example.characters.dto.CharacterDto;
import com.example.characters.dto.RaceDto;
import com.example.characters.dto.WeaponDto;
import com.example.characters.model.CharacterEntity;
import com.example.characters.model.RaceEntity;
import com.example.characters.model.WeaponEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-26T23:54:50+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class CharacterMapperImpl implements CharacterMapper {

    @Override
    public CharacterDto characterToDTO(CharacterEntity characterEntity) {
        if ( characterEntity == null ) {
            return null;
        }

        CharacterDto characterDto = new CharacterDto();

        if ( characterEntity.getId() != null ) {
            characterDto.setId( characterEntity.getId() );
        }
        if ( characterEntity.getNombre() != null ) {
            characterDto.setNombre( characterEntity.getNombre() );
        }
        if ( characterEntity.getGenero() != null ) {
            characterDto.setGenero( characterEntity.getGenero() );
        }
        if ( characterEntity.getDescripcion() != null ) {
            characterDto.setDescripcion( characterEntity.getDescripcion() );
        }
        if ( characterEntity.getRace() != null ) {
            characterDto.setRace( raceEntityToRaceDto( characterEntity.getRace() ) );
        }
        if ( characterEntity.getArmaPrincipal() != null ) {
            characterDto.setArmaPrincipal( weaponToDTO( characterEntity.getArmaPrincipal() ) );
        }

        return characterDto;
    }

    @Override
    public WeaponDto weaponToDTO(WeaponEntity weaponEntities) {
        if ( weaponEntities == null ) {
            return null;
        }

        WeaponDto weaponDto = new WeaponDto();

        if ( weaponEntities.getId() != null ) {
            weaponDto.setId( weaponEntities.getId() );
        }
        if ( weaponEntities.getArma() != null ) {
            weaponDto.setArma( weaponEntities.getArma() );
        }
        if ( weaponEntities.getVelocidad() != null ) {
            weaponDto.setVelocidad( weaponEntities.getVelocidad() );
        }
        if ( weaponEntities.getAtaque() != null ) {
            weaponDto.setAtaque( weaponEntities.getAtaque() );
        }

        return weaponDto;
    }

    protected RaceDto raceEntityToRaceDto(RaceEntity raceEntity) {
        if ( raceEntity == null ) {
            return null;
        }

        RaceDto raceDto = new RaceDto();

        if ( raceEntity.getId() != null ) {
            raceDto.setId( raceEntity.getId() );
        }
        if ( raceEntity.getNombre() != null ) {
            raceDto.setNombre( raceEntity.getNombre() );
        }
        if ( raceEntity.getDescripcion() != null ) {
            raceDto.setDescripcion( raceEntity.getDescripcion() );
        }

        return raceDto;
    }
}
