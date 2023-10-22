package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Mahasiswa;


@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{

}
