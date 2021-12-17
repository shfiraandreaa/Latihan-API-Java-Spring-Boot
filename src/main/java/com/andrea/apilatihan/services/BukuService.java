package com.andrea.apilatihan.services;

import javax.transaction.Transactional;

import com.andrea.apilatihan.model.Buku;
import com.andrea.apilatihan.repos.BukuRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class BukuService {
    
    @Autowired
    public BukuRepo bukuRepo;

    public Buku save(Buku buku){
        return bukuRepo.save(buku);
    }

    public Iterable<Buku> findAll(){
        return bukuRepo.findAll();
    }
    
    public Buku findOne(Long id){
        return bukuRepo.findById(id).get();
    }

    public void removeOne(Long id){
        bukuRepo.deleteById(id);
    }
}
