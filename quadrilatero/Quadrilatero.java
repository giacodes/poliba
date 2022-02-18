import java.util.Scanner;

public class Quadrilatero {

    private int base;
    private int altezza;

    public Quadrilatero(int b, int a){
        this.base = b;
        this.altezza = a;
    }

    public Quadrilatero(){
        this(1,1);
    }

    public int getBase(){
        return this.base;
    }

    public int getAltezza(){
        return this.altezza;
    }

    public void setBase(int b){
        this.base = b;
    }

    public void setAltezza(int a){
        this.altezza = a;
    }

    public int getPerimetro(){
        return (this.base + this.altezza) * 2;
    }

    public int getArea(){
        return this.base * this.altezza;
    }

    public boolean isQuadrato(){
        if(this.base == this.altezza) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserire il primo lato_ ");
        int l1 = input.nextInt();
        System.out.print("Inserire il secondo lato_ ");
        int l2 = input.nextInt();
        Quadrilatero figura = new Quadrilatero(l1,l2);
        System.out.print("Il perimetro della figura è " + figura.getPerimetro());
        System.out.print("\nL'area della figura è " + figura.getArea());
        if (figura.isQuadrato()) System.out.print("\nLa figura è un quadrato");
        else System.out.print("\nLa figura è un rettangolo");
        input.close();
    }

}
