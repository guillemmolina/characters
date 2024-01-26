package com.example.characters.repository;

import com.example.characters.model.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {
    List<WeaponEntity> findAll();

    Optional<WeaponEntity> findById(Long id);

    WeaponEntity save(WeaponEntity weaponEntity);
}
