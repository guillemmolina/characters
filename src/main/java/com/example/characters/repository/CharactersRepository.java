package com.example.characters.repository;

import com.example.characters.model.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CharactersRepository extends JpaRepository<CharacterEntity, Long> {

    List<CharacterEntity> findAll();
    Optional<CharacterEntity> findById(Long id);

}
