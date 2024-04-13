package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioY;

public class Entitie {
    public String name;
    public double A;
    public double B;
    public double C;

    public double Total() {
        return A + B + C;
    }

    public double Resu() {
        if(Total() < 60.0) {
            return 60.0 - Total();
        } else {
            return 0.0;
        }
    }
}
