/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.ardhan.service;

import me.ardhan.model.ModelMahasiswa;
import me.ardhan.repository.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Ardhan
 */
@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository repository;
    
    public void addMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }
    
    public ModelMahasiswa getMhs(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(ModelMahasiswa mhs) {
        repository.save(mhs);
    }
    
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }
    
    public List<ModelMahasiswa> getAllMahasiswa() {
        return repository.findAll();
    }
}
