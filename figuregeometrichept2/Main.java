import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        FiguraGeometrica[] arr = new FiguraGeometrica[5];
        int i,tipo;
        double b,a;
        Scanner input = new Scanner(System.in);

        for(i = 0; i < 5; i++){

            System.out.println("Digitare tipo da inserire nella posizione " + i + " (1 - rettangolo, 2 - triangolo rettangolo)_");
            tipo = input.nextInt();
            System.out.println("Digitare la base_ ");
            b = input.nextInt();
            System.out.println("Digitare l'altezza_ ");
            a = input.nextInt();

            switch(tipo){
                case 1 :
                    arr[i] = new Rettangolo(b,a);
                    break;
                case 2 :
                    arr[i] = new TriangoloRettangolo(b,a);
                    break;
                default:
                    System.err.println("Figura non conosciuta");
            }

        }

        for(i = 0; i < 5; i++){

            try {
                System.out.println("Tipo figura " + arr[i].toString());
                System.out.println("Area " + arr[i].area());
                System.out.println("Perimetro " + arr[i].perimetro() + "\n");
            }

            catch(InvalidShapeException e){
                System.out.println("Forma/e non valida");
            }

        }
        input.close();
    }
}
