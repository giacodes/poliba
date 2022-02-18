import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int i;
        Integer n;
        ListaDoppiamenteConcatenata l;
        Stack.ArrayStack<ListaDoppiamenteConcatenata> s = new Stack.ArrayStack<ListaDoppiamenteConcatenata>();

        do {

            System.out.print("Inserire un numero intero_ ");
            n = input.nextInt();
            if(n != 0) {
                if (s.isEmpty()) {

                    l = new ListaDoppiamenteConcatenata();
                    l.addLast(n);
                    s.push(l);

                } else {

                    ListaDoppiamenteConcatenata.Node curr = s.top().header;
                    do {
                        curr = curr.getNext();
                    }
                    while (curr.getNext() != s.top().trailer);
                    if (n > curr.getElement()) s.top().addLast(n);
                    else {

                        l = new ListaDoppiamenteConcatenata();
                        l.addLast(n);
                        s.push(l);

                    }
                }
            }
        }
        while(n != 0);

        int stop = s.size();
        for(i = 0; i < stop; i++){

            ListaDoppiamenteConcatenata.print(s.pop());

        }

    }

}
