import java.time.LocalDateTime;
import java.util.ArrayList;

public class Inscripcion {
    Alumno alumno;
    LocalDateTime fecha;
    ArrayList<Materia> materias;

    public Inscripcion(Alumno alumno, LocalDateTime fecha, ArrayList<Materia> materias) {
        this.alumno = alumno;
        this.fecha = fecha;
        this.materias = materias;
    }

    boolean aprobada() {
        for (int i = 0; i < materias.size(); i++) {
            if (!alumno.puedeCursar(materias.get(i))) {
                return false;
            }
        }
        return true;
    }
}
