package com.rodrigojramos.backend.services;

import com.rodrigojramos.backend.dto.PackDTO;
import com.rodrigojramos.backend.entities.Pack;
import com.rodrigojramos.backend.repositories.PackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PackService {

    @Autowired
    private PackRepository packRepository;

    @Transactional(readOnly = true)
    public PackDTO findById(Long id) {
        Pack pack = packRepository.findById(id).get();
        return new PackDTO(pack);
    }

    @Transactional(readOnly = true)
    public List<PackDTO> findAll() {
        List<Pack> result = packRepository.findAll();
        return result.stream().map(x -> new PackDTO(x)).toList();
    }
}
