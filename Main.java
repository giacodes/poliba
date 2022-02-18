import java.util.Scanner;

public class Main {

    public static class Lista{

        public class Node{

            private Integer element;
            private Node next;

            public Node(Integer e, Node n){
                element = e;
                next = n;
            }

            public Integer getElement() {
                return element;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

        }

        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public Lista(){
        }

        public void addLast(Integer e){
            Node nuovo = new Node(e,null);
            if(size == 0) head = nuovo;
            else tail.setNext(nuovo);
            tail = nuovo;
            size++;
        }

        public void addFirst(Integer e){
            head = new Node(e,head);
            if(size == 0) tail = head;
            size++;
        }

        public Integer removeFirst(){
            if(size == 0) return null;
            Integer e = head.getElement();
            head = head.getNext();
            size--;
            if(size == 0) tail = null;
            return e;
        }

        public Integer removeLast(){
            if (size == 0) return null;
            Node cur = head;
            Integer e;
            while(cur.getNext() != tail){
                cur = cur.getNext();
            }
            e = tail.getElement();
            tail = cur;
            tail.setNext(null);
            size--;
            return e;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, N = 3;
        Integer e;
        Lista l = new Lista();

        for (i = 0; i < N; i++) {

            System.out.print("Digitare intero " + i + "_");
            e = input.nextInt();
            l.addLast(e);

        }

        System.out.println("Lista popolata");

        int max = 0;
        Lista.Node cur = l.head;

        for (i = 0; i < N; i++) {

            if (cur.getElement() > max) max = cur.getElement();
            cur = cur.getNext();

        }

        System.out.println("Il valore massimo è " + max);
        input.close();
    }
}
