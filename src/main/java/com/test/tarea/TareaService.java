package com.test.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService implements ITareaService {
    @Autowired
    private TareaRepository repository;

    @Override
    public List<Tarea> find() {
        return repository.findAll();
    }

    @Override
    public Tarea create(Tarea tarea) {
        return repository.save(tarea);
    }

    @Override
    public Tarea update(Long id, String descripcion, Boolean vigente) {
        return repository.findById(id).map(tarea -> {
            tarea.setDescripcion(descripcion);
            tarea.setVigente(vigente);
            return repository.save(tarea);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
