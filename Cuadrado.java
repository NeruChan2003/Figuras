public class Cuadrado extends Figuras {
    private double lado;

    public Cuadrado() {
        this.lado = 0;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: Lado = " + lado;
    }
}
