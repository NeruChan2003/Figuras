import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        Scanner figu = new Scanner(System.in);

        System.out.println("Ingrese los datos para el Triángulo:");
        System.out.print("Base: ");
        double baseTriangulo = figu.nextDouble();
        System.out.print("Altura: ");
        double alturaTriangulo = figu.nextDouble();

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(baseTriangulo);
        triangulo.setAltura(alturaTriangulo);
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println(triangulo);

        System.out.println();

        System.out.println("Ingrese los datos para el Cuadrado:");
        System.out.print("Lado: ");
        double ladoCuadrado = figu.nextDouble();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(ladoCuadrado);
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println(cuadrado);

        System.out.println();

    }
}