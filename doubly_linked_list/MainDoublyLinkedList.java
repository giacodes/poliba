import java.util.Scanner;

public class MainDoublyLinkedList {

    public static class ListaDoppiamenteConcatenata{

        public class Node{

            private Node next;
            private Node prev;
            private Integer element;

            public Node(Integer e, Node prev, Node next){
                element = e;
                this.prev = prev;
                this.next = next;
            }

            public Node getPrev() {
                return prev;
            }

            public Node getNext() {
                return next;
            }

            public Integer getElement() {
                return element;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public void setPrev(Node prev) {
                this.prev = prev;
            }

        }

        private Node header = new Node(null, null, null);
        private Node trailer = new Node(null, null, null);
        private int size = 0;

        public ListaDoppiamenteConcatenata(){

        }

        public void addLast(Integer e){
            if(size == 0) addBetween(e,header,trailer);
            else addBetween(e,trailer.getPrev(),trailer);
            size++;
        }

        public void addFirst(Integer e){
            addBetween(e, header, header.getNext());
            if(size == 0) addBetween(e, header, trailer);
            size++;
        }

        public void addBetween(Integer e, Node predecessor, Node successor){
            Node nuovo = new Node(e, predecessor, successor);
            predecessor.setNext(nuovo);
            successor.setPrev(nuovo);
            size++;
        }

        public Integer remove(Node n){
            if (size == 0) return null;
            n.getPrev().setNext(n.getNext());
            n.getNext().setPrev(n.getPrev());
            size--;
            return n.getElement();
        }

        public Integer getPosition(Node n){
            if (size == 0) return null;
            int i,ans = 0;
            Node curr = header.getNext();
            for (i = 0; i < size; i++){
                if(curr == n) ans = i;
                curr = curr.getNext();
            }
            return ans;
        }

        public void addBefore(Node n, Integer e){
            addBetween(e, n.getPrev(), n);
            size++;
        }

        public void addAfter(Node n, Integer e){
            addBetween(e, n, n.getNext());
            size++;
        }

        public static void print(ListaDoppiamenteConcatenata l){
            System.out.println("--- Contenuto della lista ---");
            ListaDoppiamenteConcatenata.Node curr = l.header.getNext();
            while(curr != l.trailer){

                System.out.print(" " + curr.getElement() + " ");
                curr = curr.getNext();

            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ListaDoppiamenteConcatenata dll = new ListaDoppiamenteConcatenata();
        int i, N = 6;
        Integer e;

        for(i = 0; i < N; i++){

            System.out.print("Inserire l'elemento " + i + "_ ");
            dll.addLast(input.nextInt());

        }

        ListaDoppiamenteConcatenata.print(dll);

        int max = 0, min = dll.header.getNext().getElement();
        ListaDoppiamenteConcatenata.Node curr = dll.header.getNext();
        for(i = 0; i < N; i++){

            if(curr.getElement() > max) max = curr.getElement();
            if(curr.getElement() < min) min = curr.getElement();
            curr = curr.getNext();

        }

        System.out.println("Il massimo elemento è " + max + " mentre il minore è " + min);

        System.out.print("Inserire l'elemento da eliminare_ ");
        e = input.nextInt();
        curr = dll.header.getNext();
        for(i = 0; i < N; i++){

            if(curr.getElement() == e) dll.remove(curr);
            curr = curr.getNext();

        }
        N--;

        ListaDoppiamenteConcatenata.print(dll);

        System.out.print("Inserire elemento da aggiungere dopo il massimo nella lista_ ");
        e = input.nextInt();
        curr = dll.header.getNext();
        max = 0;
        for(i = 0; i < N; i++){

            if(curr.getElement() > max) max = curr.getElement();
            curr = curr.getNext();

        }

        curr = dll.header.getNext();
        for(i = 0; i < N; i++){

            if(curr.getElement() == max) dll.addAfter(curr, e);
            curr = curr.getNext();

        }

        ListaDoppiamenteConcatenata.print(dll);

    }

}
