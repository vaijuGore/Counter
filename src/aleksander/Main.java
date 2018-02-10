package aleksander;

public class Main {

    public static void main(String[] args) {
        // getItem
        ArrayOfNumbers array = new ArrayOfNumbers(10);
        System.out.println(array.getItem(0));

        // setItem
        array.setItem(0, 5);
        System.out.println(array.getItem(0));

        // max
        System.out.println(array.max());

        // equal
        System.out.println(array.equal(0, 1));
        System.out.println(array.equal(1, 2));

//        TwoNumbers a = new TwoNumbers(12, 18);
//        TwoNumbers b = new TwoNumbers(17, 17);
//
//        System.out.println(a);
//        System.out.println(b);
//
//        a.addNumbers(5, 14);
//
//        System.out.println(a);
//
//        b.addObject(a);
//
//        System.out.println(a);
//        System.out.println(b);
//
//        TwoNumbers c = a.sum(b);
//
//        System.out.println(c);
    }
}
