package modelo;

public class FiguraGeometrica {

// ESTER PINO DOMÍNGUEZ

    private int numLados;

    
    public FiguraGeometrica(int numLados) {
        this.numLados = numLados;
    }


    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }


    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private static final int MIN_NUMBER = 3;

    public void showInfo() {
        System.out.printf("Soy un %s. Tengo %d lados%n", nombre, numLados);
    }


    public FiguraGeometrica(int numLados, String nombre) throws Exception {
        if (numLados < MIN_NUMBER) {
            throw new Exception("El número de lados debe ser mayor que " + MIN_NUMBER);
        }
        this.numLados = numLados;
        this.nombre = nombre;
    }


    public FiguraGeometrica() {
    }



   


}
