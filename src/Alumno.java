import java.util.ArrayList;

public class Alumno {
    String nombre;
    int legajo;
    ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }
    public boolean puedeCursar(Materia materia) {
        for (int i = 0; i < materia.correlativas.size(); i++) {
            Materia correlativa = materia.correlativas.get(i);
            if (!this.materiasAprobadas.contains(correlativa)) {
                return false;
            }
        }
        return true;
    }
}
