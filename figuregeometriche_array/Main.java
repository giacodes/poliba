import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int i,p,N = 3;
        ArrayFigureGeometriche<Rettangolo> ArrayFigureGeometriche = new ArrayFigureGeometriche<Rettangolo>(N);
        double b,a;
        Rettangolo r;
        Scanner input = new Scanner(System.in);

        for(i = 0; i < N; i++){

            System.out.println("Digitare la base del rettangolo " + i);
            b = input.nextDouble();
            System.out.println("Digitare l'altezza del rettangolo " + i);
            a = input.nextDouble();

            r = new Rettangolo(b,a);
            try {
                ArrayFigureGeometriche.add(r);
            }
            catch(NoMoreSpaceException e){
                System.out.println("Array pieno!");
            }
        }

        System.out.print("Digitare una posizione_ ");
        p = input.nextInt();

        try {
            System.out.print("Il rettangolo in posizione " + p + " ha area " + ArrayFigureGeometriche.get(p).area() + " e perimetro " + ArrayFigureGeometriche.get(p).perimetro());
        }
        catch(NoElementException e){
            System.out.println("Posizione vuota!");
        }

        // Garbage Collector

        Runtime rs =  Runtime.getRuntime();

        System.out.println("Memoria libera nella JVM prima del Garbage Collection = "+rs.freeMemory());
        r = null;
        rs.gc();
        System.out.println("Memoria libera nella JVM dopo del Garbage Collection = "+rs.freeMemory());


        // La memoria libera sarà uguale perché si perde il riferimento
        r = new Rettangolo(10, 10);
        System.out.println("Memoria libera nella JVM = "+rs.freeMemory());

        r = new Rettangolo(20, 20);
        System.out.println("Memoria libera nella JVM = "+rs.freeMemory());

        input.close();
    }
}
