package com.yuri.galeria.galeriaapi.controller;

import com.yuri.galeria.galeriaapi.model.Tecnologia;
import com.yuri.galeria.galeriaapi.repository.TecnologiaRepository;
import com.yuri.galeria.galeriaapi.service.TecnologiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tecnologias")
@CrossOrigin(origins = "http://localhost:5173")
public class TecnologiaController {

    @Autowired
    private TecnologiaService tecnologiaService;

    @GetMapping
    public List<Tecnologia> listarTodas() {
        return tecnologiaService.listarTodas();
    }
}
