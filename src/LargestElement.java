import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] array1 =(readElements(5));
        System.out.println("The array elements are "+Arrays.toString(array1));
        int largestNum = (maxElement(array1));
        System.out.println("The largest number in the array is "+largestNum);
    }
    public static int[] readElements(int count) {
        System.out.println("Enter "+count+" elements");
        int[] array = new int[count];
        for(int i=0;i<array.length;i++){
            int value = scanner.nextInt();
            scanner.nextLine();
            array[i]=value;
        }
        return array;
    }
     public static int maxElement(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            int val = array[i];
            if(val>max){
                max = val;
            }
        }
         return max;
     }
}
