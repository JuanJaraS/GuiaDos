package cl.biblioteca.bibliotecaduoc.repository;

import cl.biblioteca.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // Metodo que retorna todos los libros
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(int id) {
    for (Libro libro : listaLibros) {
        if (libro.getId() == id) {
            return libro;
        }
    }
    return null;
    }

    public Libro buscarPorIsbn(String isbn) {
    for (Libro libro : listaLibros) {
        if (libro.getIsbn().equals(isbn)) {
            return libro;
        }
    }
    return null;
    }

    public Libro guardar(Libro libro) {
    listaLibros.add(libro);
    return libro;
    }

    public Libro actualizar(int id, Libro libroActualizado) {
    for (int i = 0; i < listaLibros.size(); i++) {
        if (listaLibros.get(i).getId() == id) {
            listaLibros.set(i, libroActualizado);
            return libroActualizado;
        }
    }
    return null;
    }

    public boolean eliminar(int id) {
    return listaLibros.removeIf(libro -> libro.getId() == id);
    }


}

