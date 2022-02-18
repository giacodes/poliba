import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        String k;
        int v;

        do {

            System.out.print("Inserire \n - 1 per aggiungere una entry \n - 2 per rimuovere una entry \n - 3 per visualizzare il dizionario \n - 0  per uscire \n");
            v = input.nextInt();

            switch (v) {
                case 1:

                    System.out.print("inserire  chiave_ ");
                    k = input.next();
                    System.out.print("inserire  valore_ ");
                    v = input.nextInt();
                    map.putIfAbsent(k, v);
                    break;

                case 2:

                    System.out.print("Inserire chiave_ ");
                    k = input.next();
                    v = map.remove(k);
                    System.out.println("Elemento rimosso: " + v);
                    break;

                case 3:

                    System.out.println("Contenuto del dizionario ");
                    System.out.println(map.entrySet());

                    break;

                default : break;
            }
        }
        while (v != 0);
        input.close();
    }
}
