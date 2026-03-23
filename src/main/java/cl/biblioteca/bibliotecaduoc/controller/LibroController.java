package cl.biblioteca.bibliotecaduoc.controller;

import cl.biblioteca.bibliotecaduoc.model.Libro;
import cl.biblioteca.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroService.obtenerLibros();
    }

    @GetMapping("{id}")
    public Libro obtenerPorId(@PathVariable int id) {
        return libroService.buscarPorId(id);
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    @PutMapping("{id}")
    public Libro actualizar(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.actualizar(id, libro);
    }

    @DeleteMapping("{id}")
    public boolean eliminar(@PathVariable int id) {
        return libroService.eliminar(id);
    }
}
