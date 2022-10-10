package com.example.adventure.adventure.repositories;

import com.example.adventure.adventure.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface playerRepository extends JpaRepository<Player, Long> {
}