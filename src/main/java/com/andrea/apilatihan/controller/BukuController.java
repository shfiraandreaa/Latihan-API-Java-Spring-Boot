package com.andrea.apilatihan.controller;

import com.andrea.apilatihan.model.Buku;
import com.andrea.apilatihan.repos.BukuRepo;
import com.andrea.apilatihan.services.BukuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/buku")
public class BukuController {
    
    @Autowired
    public BukuService bukuService;

    @PostMapping
    public Buku save(@RequestBody Buku buku){
        return bukuService.save(buku);
    }

    @GetMapping
    public Iterable<Buku> findAll(){
        return bukuService.findAll();
    }

    @GetMapping("/{id}")
    public Buku findOne(@PathVariable("id") Long id){
        return bukuService.findOne(id);
    }

    @PutMapping("/{id}")
    public Buku update(@RequestBody Buku buku){
        return bukuService.save(buku);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable Long id){
        bukuService.removeOne(id);
    }

}
