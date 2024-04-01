import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    void puedeCursarMateriaSinCorrelativas() {
        Materia sistemasYOrganizaciones = new Materia(1, "K0001", "Sistemas y Organizaciones", new ArrayList());
        Alumno alumno = new Alumno("Francisco Veiga", 123456);
        assertTrue(alumno.puedeCursar(sistemasYOrganizaciones));
    }
    @Test
    void puedeCursarDisenoSiAproboAnalisis() {
        Materia analisis = new Materia(1, "K0001", "Analisis de sistemas", new ArrayList<Materia>());
        ArrayList<Materia> correlativasDiseno = new ArrayList<Materia>();
        correlativasDiseno.add(analisis);
        Materia diseno = new Materia(2, "K0002", "Diseno de sistemas", correlativasDiseno);
        Alumno alumno = new Alumno("Francisco Veiga", 123456);
        alumno.materiasAprobadas.add(analisis);
        assertTrue(alumno.puedeCursar(diseno));
    }
}