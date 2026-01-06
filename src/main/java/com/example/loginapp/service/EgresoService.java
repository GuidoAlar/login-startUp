package com.example.loginapp.service;

import com.example.loginapp.entity.Egreso;
import com.example.loginapp.entity.Usuario;
import com.example.loginapp.repository.EgresoRepository;
import com.example.loginapp.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EgresoService {

    private final EgresoRepository egresoRepository;
    private final UsuarioRepository usuarioRepository;

    public EgresoService(EgresoRepository egresoRepository,
                         UsuarioRepository usuarioRepository) {
        this.egresoRepository = egresoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Egreso guardarEgreso(Egreso egreso, Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no existe"));

        egreso.setUsuario(usuario);
        return egresoRepository.save(egreso);
    }

    public List<Egreso> listarPorUsuario(Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new RuntimeException("Usuario no existe"));

        return egresoRepository.findByUsuario(usuario);
    }
}
