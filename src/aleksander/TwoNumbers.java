package aleksander;

/**
 * Created by AC15 on 06/02/2018
 */
public class TwoNumbers {
    private int first;
    private int second;

    TwoNumbers(int first, int second) {
        this.first = first;
        this.second = second;
    }

    int getFirst() {
        return first;
    }

    int getSecond() {
        return second;
    }

    int max() {
        return (Integer.compare(first, second) == 1) ? first : second;
    }

    boolean equal() {
        return Integer.compare(first, second) == 0;
    }

    int gcd(int first, int second) {
        while (first != second) {
            int smallerNumber = (first < second) ? first : second;
            int largerNumber = (first > second) ? first : second;
            int difference = largerNumber - smallerNumber;

            first = smallerNumber;
            second = difference;
        }

        return first;
    }

    public void addNumbers(int firstInteger, int secondInteger) {
        first += firstInteger;
        second += secondInteger;
    }

    public void addObject(TwoNumbers twoNumbers) {
        first += twoNumbers.getFirst();
        second += twoNumbers.getSecond();
    }

    public TwoNumbers sum(TwoNumbers twoNumbers) {
        int newFirst = first + twoNumbers.getFirst();
        int newSecond = second + twoNumbers.getSecond();

        return new TwoNumbers(newFirst, newSecond);
    }

    @Override
    public String toString() {
        return "First number = " + first +
                "\nSecond number = " + second +
                "\nMax = " + max() +
                "\nEqual = " + equal() +
                "\nGCD = " + gcd(first, second) +
                "\n";
    }
}
