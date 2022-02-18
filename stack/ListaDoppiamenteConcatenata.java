public class ListaDoppiamenteConcatenata {

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

        public Node header = new Node(null, null, null);
        public Node trailer = new Node(null, null, null);
        public int size = 0;

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
