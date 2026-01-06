package com.example.loginapp.repository;

import com.example.loginapp.entity.Egreso;
import com.example.loginapp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EgresoRepository extends JpaRepository<Egreso, Integer> {

    List<Egreso> findByUsuario(Usuario usuario);

}
