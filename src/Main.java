import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Materia analisis = new Materia(1, "K0001", "Analisis de sistemas", new ArrayList());
        ArrayList<Materia> tmp = new ArrayList();
        tmp.add(analisis);
        Materia diseno = new Materia(2, "K0002", "Diseno de sistemas", tmp);
        System.out.println("hola");
    }
}