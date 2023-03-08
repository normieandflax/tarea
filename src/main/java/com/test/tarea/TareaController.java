package com.test.tarea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TareaController {
    @Autowired
    private TareaService service;

    @GetMapping("/tareas")
    public List<Tarea> mostrarTareas() {
        return service.find();
    }

    @PostMapping("/tarea")
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return service.create(tarea);
    }

    @PatchMapping("/tarea/{id}")
    public Tarea modificarTarea(@PathVariable Long id, @RequestBody Map<String, Object> payload) {
        return service.update(id, (String) payload.get("descripcion"), (Boolean) payload.get("vigente"));
    }

    @DeleteMapping("/tarea/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void eliminarTarea(@PathVariable Long id) {
        service.delete(id);
    }
}
