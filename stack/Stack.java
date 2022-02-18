public class Stack {

    public static class ArrayStack<E> {
        public static final int CAPACITY = 1000;
        private E[] data;
        private int t = -1;

        public ArrayStack(){
            this(CAPACITY);
        }

        public ArrayStack(int capacity){
            data = (E[]) new Object[capacity];
        }

        public int size(){
            return t+1;
        }

        public boolean isEmpty(){
            return (t == -1);
        }

        public void push(E e) throws IllegalStateException{
            if(this.size() == data.length)
                throw new IllegalStateException("Lo Stack è pieno");
            t++;
            data[t] = e;
        /*
        Alternativamente avrei potuto scrivere
        data[++t] = e;
         */
        }

        public E top() {
            if (this.isEmpty())
                return null;
            return data[t];
        }

        public E pop() {
            if (this.isEmpty())
                return null;
            E answer = data[t];
            data[t] = null;
            t--;
            return answer;
        }
    }

}
