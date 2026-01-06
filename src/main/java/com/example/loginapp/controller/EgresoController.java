package com.example.loginapp.controller;

import com.example.loginapp.entity.Egreso;
import com.example.loginapp.service.EgresoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/egresos")
@CrossOrigin
public class EgresoController {

    private final EgresoService egresoService;

    public EgresoController(EgresoService egresoService) {
        this.egresoService = egresoService;
    }

    // ✅ Guardar egreso
    @PostMapping("/{idUsuario}")
    public Egreso guardarEgreso(
            @PathVariable Integer idUsuario,
            @RequestBody Egreso egreso
    ) {
        return egresoService.guardarEgreso(egreso, idUsuario);
    }

    // ✅ Listar egresos por usuario
    @GetMapping("/{idUsuario}")
    public List<Egreso> listarEgresos(@PathVariable Integer idUsuario) {
        return egresoService.listarPorUsuario(idUsuario);
    }
}
