package com.example.characters.mapper;

import com.example.characters.dto.CharacterDto;
import com.example.characters.dto.WeaponDto;
import com.example.characters.model.CharacterEntity;
import com.example.characters.model.WeaponEntity;
import org.mapstruct.*;

import java.util.Optional;


@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring")
public interface CharacterMapper {
    CharacterDto characterToDTO(CharacterEntity characterEntity);

    WeaponDto weaponToDTO(WeaponEntity weaponEntities);


}



