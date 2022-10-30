package com.example.SpringBootCRUDJavaWeb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long>{

}