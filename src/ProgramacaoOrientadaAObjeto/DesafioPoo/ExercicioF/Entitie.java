package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioF;

public class Entitie {
    public double width;
    public double heigth;

    public double Area() {
        return width * heigth;
    }

    public double Perimeter() {
        return (width + width) + (heigth + heigth);
    }

    public double Diagonal() {
        return Math.sqrt(width * width + heigth  * heigth);
    }
}
