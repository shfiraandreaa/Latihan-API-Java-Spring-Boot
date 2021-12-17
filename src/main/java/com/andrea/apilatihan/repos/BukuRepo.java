package com.andrea.apilatihan.repos;

import com.andrea.apilatihan.model.Buku;

import org.springframework.data.repository.CrudRepository;

public interface BukuRepo extends CrudRepository<Buku, Long>{
    
}
