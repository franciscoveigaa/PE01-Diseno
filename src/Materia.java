import java.util.ArrayList;

public class Materia {
    public int codigo;
    public String comision;
    public String descripcion;
    public ArrayList<Materia> correlativas;

    public Materia(int codigo, String comision, String descripcion, ArrayList<Materia> correlativas) {
        this.codigo = codigo;
        this.comision = comision;
        this.descripcion = descripcion;
        this.correlativas = correlativas;
    }
}
