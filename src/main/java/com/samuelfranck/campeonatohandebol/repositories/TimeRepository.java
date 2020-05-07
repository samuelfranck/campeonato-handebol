package com.samuelfranck.campeonatohandebol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.samuelfranck.campeonatohandebol.domain.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {

}
