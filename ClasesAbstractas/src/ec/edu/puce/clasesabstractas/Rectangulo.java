package ec.edu.puce.clasesabstractas;

public class Rectangulo extends FiguraGeometrica {

    private double ancho;
    private double alto;

    public Rectangulo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}