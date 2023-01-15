package com.suleiman.spring.files.upload.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suleiman.spring.files.upload.repository.AgenteRepository;

@Controller
public class AgenteController {

    @Autowired
    AgenteRepository repository;

    @GetMapping("/agentes")
    @ResponseBody public List findAll(){
        return repository.findAll();
    }
    
    @GetMapping("/agentes/{sigla}")
    @ResponseBody public List findBySigla(@PathVariable("sigla") String sigla){
        return repository.findBySigla(sigla);
    }

}
