package C1;

public class NumbersArray {
    public static void main(String[] args) {
        int[] array = {20,50,40,60,70};
        int total = 0;

        for(int i : array){
            total += i;

        }
         System.out.println("Total of array elements: " + total);
    }
}
