package com.rodrigojramos.backend.controllers;

import com.rodrigojramos.backend.dto.PackDTO;
import com.rodrigojramos.backend.services.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/packs")
public class PackController {

    @Autowired
    private PackService packService;

    @GetMapping(value = "/{id}")
    private PackDTO findById(@PathVariable Long id) {
        PackDTO dto = packService.findById(id);
        return dto;
    }

    @GetMapping
    public List<PackDTO> findAll() {
        List<PackDTO> result = packService.findAll();
        return result;
    }
}
