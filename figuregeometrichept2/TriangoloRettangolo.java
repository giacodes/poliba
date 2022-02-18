public class TriangoloRettangolo extends FiguraGeometrica  {
    private double base;
    private double altezza;

    public TriangoloRettangolo(){
        this.base = 1;
        this.altezza = 2;
    }

    public TriangoloRettangolo(double b, double a){
        this.base = b;
        this.altezza = a;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltezza(){
        return this.altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setBase(int base){
        this.base = base;
    }

    public double ipotenusa() {
        return Math.sqrt((this.altezza*this.altezza)+(this.base*this.base));
    }

    public double area() throws InvalidShapeException{
        if(this.base <= 0 || this.altezza <= 0) throw new InvalidShapeException();
        else return (this.base * this.altezza)/2;
    }

    public double perimetro() throws InvalidShapeException{
        if(this.base <= 0 || this.altezza <= 0) throw new InvalidShapeException();
        else return this.base + this.altezza + this.ipotenusa();
    }

    @Override
    public String toString() {
        return "triangolo rettangolo";
    }
}