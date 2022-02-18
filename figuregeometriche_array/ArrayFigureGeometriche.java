import java.util.ArrayList;

public class ArrayFigureGeometriche<T> {
    T[] array;
    int contatore = 0;

    public ArrayFigureGeometriche(int N){
        array = (T[]) new Object[N];
    }

    public void add(T oggetto) throws NoMoreSpaceException {
        if (array.length == contatore) throw new NoMoreSpaceException();
        array[contatore++] = oggetto;
    }

    public T get(int posizione) throws NoElementException{
        if(array[posizione] == null) throw new NoElementException();
        return array[posizione];
    }
}
