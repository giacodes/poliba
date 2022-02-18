import java.util.Scanner;

public class Main {

    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double b,a;

            System.out.print("Inserire base rettangolo_ ");
            b = input.nextInt();
            System.out.print("Inserire altezza rettangolo_ ");
            a = input.nextInt();

            Rettangolo r = new Rettangolo(b,a);

            System.out.print("Inserire base triangolo_ ");
            b = input.nextInt();
            System.out.print("Inserire altezza triangolo_ ");
            a = input.nextInt();

            TriangoloRettangolo tr = new TriangoloRettangolo(b,a);

            try {
                    System.out.println("Area rettangolo_ " + r.area());
                    System.out.println("Perimetro rettangolo_ " + r.perimetro());
                    System.out.println("Area triangolo_ " + tr.area());
                    System.out.println("Perimetro triangolo_ " + tr.perimetro());
            }
            catch(InvalidShapeException e){
                    System.out.print("Forma/e non valida");
            }
            input.close();
    }
}
