package ec.edu.puce.clasesabstractas;

public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo("Rectángulo 1");
        rectangulo1.setAncho(5);
        rectangulo1.setAlto(11);
        System.out.println(rectangulo1);

        Rectangulo rectangulo2 = new Rectangulo("Rectángulo 2");
        rectangulo2.setAncho(45);
        rectangulo2.setAlto(23);
        System.out.println(rectangulo2);

        if (rectangulo1.esMayorQue(rectangulo2)) {
            System.out.println("El mayor es: " + rectangulo1);
        } else {
            System.out.println("El mayor es: " + rectangulo2);
        }

        Triangulo triangulo1 = new Triangulo("Triángulo 1");
        triangulo1.setBase(35);
        triangulo1.setAltura(70);
        System.out.println(triangulo1);

        Triangulo triangulo2 = new Triangulo("Triángulo 2");
        triangulo2.setBase(10);
        triangulo2.setAltura(30);
        System.out.println(triangulo2);

        if (triangulo1.esMayorQue(triangulo2)) {
            System.out.println("El mayor es: " + triangulo1);
        } else {
            System.out.println("El mayor es: " + triangulo2);
        }

        Circulo circulo1 = new Circulo("Círculo 1");
        circulo1.setRadio(18);
        System.out.println(circulo1);

        Circulo circulo2 = new Circulo("Círculo 2");
        circulo2.setRadio(20);
        System.out.println(circulo2);

        if (circulo1.esMayorQue(circulo2)) {
            System.out.println("El mayor es: " + circulo1);
        } else {
            System.out.println("El mayor es: " + circulo2);
        }
    }
}