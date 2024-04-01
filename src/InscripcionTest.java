import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    void aprobada() {
        Materia analisis = new Materia(1, "K0001", "Analisis de sistemas", new ArrayList<Materia>());
        Materia paradigmas = new Materia(2, "K0002", "Paradigmas de programacion", new ArrayList<Materia>());

        ArrayList<Materia> correlativas = new ArrayList<Materia>();
        correlativas.add(analisis);
        correlativas.add(paradigmas);
        Materia diseno = new Materia(3, "K0002", "Diseno de sistemas", correlativas);
        Materia gestion = new Materia(4, "K0003", "Gestion de datos", correlativas);

        Alumno alumno = new Alumno("Francisco Veiga", 123456);
        alumno.materiasAprobadas.add(analisis);
        alumno.materiasAprobadas.add(paradigmas);

        ArrayList<Materia> materiasInscripcion = new ArrayList();
        materiasInscripcion.add(diseno);
        materiasInscripcion.add(gestion);
        Inscripcion inscripcion = new Inscripcion(alumno, LocalDateTime.now(), materiasInscripcion);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    void noAprobada() {
        Materia analisis = new Materia(1, "K0001", "Analisis de sistemas", new ArrayList<Materia>());
        Materia paradigmas = new Materia(2, "K0002", "Paradigmas de programacion", new ArrayList<Materia>());

        ArrayList<Materia> correlativas = new ArrayList<Materia>();
        correlativas.add(analisis);
        correlativas.add(paradigmas);
        Materia diseno = new Materia(3, "K0002", "Diseno de sistemas", correlativas);
        Materia gestion = new Materia(4, "K0003", "Gestion de datos", correlativas);

        Alumno alumno = new Alumno("Francisco Veiga", 123456);
        alumno.materiasAprobadas.add(analisis);

        ArrayList<Materia> materiasInscripcion = new ArrayList();
        materiasInscripcion.add(diseno);
        materiasInscripcion.add(gestion);
        Inscripcion inscripcion = new Inscripcion(alumno, LocalDateTime.now(), materiasInscripcion);

        assertFalse(inscripcion.aprobada());
    }
}