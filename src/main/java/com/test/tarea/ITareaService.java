package com.test.tarea;

import java.util.List;

public interface ITareaService {
    List<Tarea> find();
    Tarea create(Tarea tarea);
    Tarea update(Long id, String descripcion, Boolean vigente);
    void delete(Long id);
}
