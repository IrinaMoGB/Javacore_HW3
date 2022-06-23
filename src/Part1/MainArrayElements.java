package Part1;

import Part1.ArrayElements;

import java.util.Arrays;

public class MainArrayElements {
    static Integer[]  arrayInteger = {7, 6, 5};

    public static void main(String[] args) {
        ArrayElements<Object> mainArrayElements = new ArrayElements<>();
        try {
            System.out.println(Arrays.toString(mainArrayElements.replacementElements(arrayInteger, 1, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }

    }
}
