package com.example.characters.controller;

import com.example.characters.dto.CharacterDto;
import com.example.characters.dto.WeaponDto;
import com.example.characters.model.CharacterEntity;
import com.example.characters.model.WeaponEntity;
import com.example.characters.service.CharactersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//pruebas git
@RestController
@RequestMapping("/characters")
@AllArgsConstructor
public class CharactersController {

    private CharactersService service;



    @GetMapping
    public List<CharacterDto> getCharacters(){
        return service.getCharacters();
    }
    @GetMapping("/response")
    public ResponseEntity<List<CharacterDto>> getResponse(){
        String caca = "caca";
        HttpHeaders headers = new HttpHeaders();
        headers.add("FIRST HEADER", "caquita");
        ResponseEntity<List<CharacterDto>> responseEntity = new ResponseEntity<>(service.getCharacters(), headers, HttpStatus.FOUND);
        return responseEntity;
    }

    @GetMapping(path = "/{id}")
    public Optional<CharacterEntity> getCharactersById(@PathVariable Long id){
        List<String> merda = new ArrayList<>();
        merda.add(0, "hola");
        merda.add(1,"tomeu");
        System.out.println();
        return service.getCharactersById(id);
    }

    @GetMapping("/weapons")
    public List<WeaponDto> getWeapons(){
        return service.getWeapons();
    }

    @GetMapping("/weapons/{id}")
    public Optional<WeaponEntity> getWeaponsById(@PathVariable Long id){
        return service.getWeaponsById(id);
    }

    @PostMapping("/weapons/add")
    public ResponseEntity<String> addWeapons(@RequestBody WeaponEntity weaponEntity){
        WeaponEntity savedWeapon = service.addWeapon(weaponEntity);
        return new ResponseEntity<>("Arma guardad con éxito", HttpStatus.CREATED);
    }

//    @PutMapping("/characters/update/{id}")
//    public ResponseEntity<CharacterDto>

    @GetMapping("/merda")
    public String merda(){
        return "hola merda";
    }
}
