/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fikri.anggota.service;

import com.fikri.anggota.entity.Anggota;
import com.fikri.anggota.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fikri
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;
    
    public Anggota saveAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
    
    public Anggota findAnggotaById(Long anggotaId){
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
}