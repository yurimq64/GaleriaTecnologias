package com.yuri.galeria.galeriaapi.service;

import com.yuri.galeria.galeriaapi.model.Tecnologia;
import com.yuri.galeria.galeriaapi.repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TecnologiaService {

    @Autowired
    private TecnologiaRepository tecnologiaRepository;

    public List<Tecnologia> listarTodas() {
        return tecnologiaRepository.findAll();
    }
}
