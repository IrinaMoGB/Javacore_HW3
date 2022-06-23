package Part1;

public class ArrayElements <T> {
    T supporting;

    public T [] replacementElements (T[] array, int indexA, int indexB){
        supporting = array[indexA];
        array[indexA]= array[indexB];
        array[indexB]= supporting;
        return array;
    }
}
