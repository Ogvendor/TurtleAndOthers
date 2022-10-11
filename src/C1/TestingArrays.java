package C1;

public class TestingArrays {
    public static void main(String[] args) {
        //ARRAY INITIALIZER
        //int [] numbers = {5,3,1,4,6};
        int[] numbers = new int[5];
      numbers[0] = 5;
        numbers[1] = 3;
       numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 6;

        for (int i = 0; i <= numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
