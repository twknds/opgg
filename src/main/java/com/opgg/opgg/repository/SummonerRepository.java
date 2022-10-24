package com.opgg.opgg.repository;

import com.opgg.opgg.entity.Summoner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummonerRepository extends JpaRepository<Summoner, Long> {
}
