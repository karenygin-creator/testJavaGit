public class Printer {
//    public static <T>void print(T value) {
//        System.out.println("я печатаю: "+value);
//    }
    public static <T,S>void print1(T array,S number) {
        if (array instanceof Number && number instanceof Number) {
            double d = ((Number) array).doubleValue()+((Number) number).doubleValue();
            System.out.println(d);

        }
        else {
            System.out.println("Not a number");
        }
    }
}
