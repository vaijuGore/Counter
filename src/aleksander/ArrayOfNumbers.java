package aleksander;

/**
 * Created by AC15 on 10/02/2018
 */
public class ArrayOfNumbers {
    private int arrayOfIntegers[];

    public ArrayOfNumbers(int arraySize) {
        this.arrayOfIntegers = new int[arraySize];
    }

    public ArrayOfNumbers(int[] arrayOfIntegers) {
//        int arraySize = arrayOfIntegers.length;
//        this.arrayOfIntegers = new int[arraySize];
//
//        for (int i = 0; i < arraySize; i++) {
//            this.arrayOfIntegers[i] = arrayOfIntegers[i];
//        }

        this.arrayOfIntegers = arrayOfIntegers.clone();
    }

    int getItem(int index) {
        return arrayOfIntegers[index];
    }

    void setItem(int index, int value) {
        arrayOfIntegers[index] = value;
    }
}
