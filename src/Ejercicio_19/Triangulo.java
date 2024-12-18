package Ejercicio_19;

public class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        return 3 * lado;
    }

    public double obtenerAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double obtenerArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
}
