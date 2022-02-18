public class Rettangolo extends FiguraGeometrica {
    private double base;
    private double altezza;

    public Rettangolo(){
        this.base = 3;
        this.altezza = 1;
    }

    public Rettangolo(double b, double a){
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

    public double area() throws InvalidShapeException{
        if(this.base <= 0 || this.altezza <= 0) throw new InvalidShapeException();
        else return this.base*this.altezza;
    }

    public double perimetro() throws InvalidShapeException{
        if(this.base <= 0 || this.altezza <= 0) throw new InvalidShapeException();
        else return 2 * (this.base + this.altezza);
    }

    @Override
    public String toString() {
        return "rettangolo";
    }

}