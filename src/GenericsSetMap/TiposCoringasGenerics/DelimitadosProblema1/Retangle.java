package GenericsSetMap.TiposCoringasGenerics.DelimitadosProblema1;

public class Retangle implements Shape {
    private Double width;
    private Double height;

    public Retangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }
}
