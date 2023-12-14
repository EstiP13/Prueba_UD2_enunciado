import modelo.FiguraGeometrica;

public class App {
   public static void main(String[] args) throws Exception {
        
        System.out.println("La versión de Java utilizada es: "  + System.getProperty("java.version"));
        FiguraGeometrica figura = new FiguraGeometrica(3, "triángulo");
        figura.showInfo();

        FiguraGeometrica figura2 = new FiguraGeometrica();
        figura2.setNombre("cuadrado");
        figura2.setNumLados(4);
        figura2.showInfo();
        
    }
}
