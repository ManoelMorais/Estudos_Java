package ProgramacaoOrientadaAObjeto.CalcTriangulo;

public class CalcTriangulo {
    // faze 1, aula02 de poo
    public double a;
    public double b;
    public double c;

    // faze 2, aula03 de poo
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
