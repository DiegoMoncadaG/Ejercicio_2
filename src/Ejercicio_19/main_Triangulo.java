package Ejercicio_19;

import java.util.Scanner;

public class main_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del triangulo equilatero: ");
        double lado = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado);

        double perimetro = triangulo.obtenerPerimetro();
        double altura = triangulo.obtenerAltura();
        double area = triangulo.obtenerArea();

        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Altura del triangulo: " + altura);
        System.out.println("Area del triangulo: " + area);
    }
}
