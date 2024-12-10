public class Casting {
    public static void main(String[] args) {
        double value = 33.333;

        int intValue = (int) value;
        float floatValue = (float) value;

        System.out.println("Original double value: " + value);
        System.out.println("Casted to int: " + intValue);
        System.out.println("Casted to float: " + floatValue);
    }
}
