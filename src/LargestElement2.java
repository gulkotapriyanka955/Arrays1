public class LargestElement2 {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};
        System.out.println("The largest element in the given array is " +largest(array,6));
    }
    public static int largest(int[] array,int n){
        int max = array[0];
        for(int i=1;i<n;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
