package com.example.characters.service;

import com.example.characters.dto.CharacterDto;
import com.example.characters.dto.WeaponDto;
import com.example.characters.mapper.CharacterMapper;
import com.example.characters.model.CharacterEntity;
import com.example.characters.model.WeaponEntity;
import com.example.characters.repository.CharactersRepository;
import com.example.characters.repository.WeaponRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CharactersService {

    CharactersRepository repository;
    WeaponRepository weaponRepository;
    CharacterMapper mapper;

    public List<CharacterDto> getCharacters(){

        List<CharacterEntity> object = repository.findAll();
        return object.stream().map(mapper::characterToDTO).toList();
    }

    public List<WeaponDto> getWeapons(){


        List<WeaponEntity> entities = weaponRepository.findAll();
        return entities.stream().map(mapper::weaponToDTO).toList();}

    public Optional<CharacterEntity> getCharactersById(Long id){

        Optional<CharacterEntity> character = repository.findById(id);
        return character;
    }

    public Optional<WeaponEntity> getWeaponsById(Long id){

        Optional<WeaponEntity> weapon = weaponRepository.findById(id);
        return weapon;
    }

    public WeaponEntity addWeapon(WeaponEntity weaponEntity){
        WeaponEntity weapon = weaponRepository.save(weaponEntity);
        return weapon;
    }
}
