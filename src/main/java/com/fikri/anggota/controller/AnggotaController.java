/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.anggota.controller;

import com.fikri.anggota.AnggotaServiceApplication;
import com.fikri.anggota.entity.Anggota;
import com.fikri.anggota.service.AnggotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fikri
 */
@RestController
@RequestMapping("/anggota")
public class AnggotaController {
    @Autowired
    private AnggotaService anggotaService;
    
    @PostMapping("/")
    public Anggota saveAnggota(@RequestBody Anggota anggota){
        return anggotaService.saveAnggota(anggota);
    
    }
    @GetMapping("/{id}")
    public Anggota findAnggotaById(@PathVariable("id")Long anggotaId){
        return anggotaService.findAnggotaById(anggotaId);
    }
}