public class arrays2 {
    public static void main(String[] args) {
        /* Calcutale the average of array values
         *
         * - Declares an array of size 10.
                * - Fills the array with random values between 1 and 100.
                * - Calculates and prints the average of the values in the array.
         */

        // Your code here:
        int [] nums = {
                11,
                15,
                14,
                33,
                95,
                1,
                18,
                21,
                2,
                3,
        };
       int suma = 0;
               for (int num : nums) {
                   suma += num;
               }
 double promedio = (double) suma / nums.length;
        System.out.println("La suma de todos los numeros es:" + " " + suma);
        System.out.println("Tu promedio es" + " " + promedio);

        // queria agregarle algo de otras clases

        if (promedio >= 12) {
            System.out.println("Buen promedio");
    } else {
            System.out.println("Que mal promedio");
}
        }
    }