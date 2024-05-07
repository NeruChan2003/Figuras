public class Triangulo extends Figuras {
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo: Base = " + base + ", Altura = " + altura;
    }
}
