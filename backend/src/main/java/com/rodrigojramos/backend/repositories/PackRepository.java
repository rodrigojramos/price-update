package com.rodrigojramos.backend.repositories;

import com.rodrigojramos.backend.entities.Pack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackRepository extends JpaRepository<Pack, Long> {
}
