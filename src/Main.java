public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(countEvenNumbers(array, 0 ));
    }

    public static int countEvenNumbers(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        if (array[index] % 2 == 0){
            return (1 + countEvenNumbers(array, index + 1));
        }else {
            return (countEvenNumbers(array, index + 1));
        }
    }
}