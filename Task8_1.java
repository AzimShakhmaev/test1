public class Task8_1 {
    public static void main(String[] args) {
        int[] myIntegers = new int[20];
        try {
            myIntegers[20] = 199;
            System.out.println(myIntegers[20]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues ");
    }
}
