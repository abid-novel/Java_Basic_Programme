package Assignment3;

//Task_3:  Find the max and min number from a given array


public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {2,5,10,3,55,45,88,20,0,5,9};
        System.out.println("Maximum value is: "+getMaxValue(arr));
        System.out.println("Minimum value is: "+getMinValue(arr));

    }

     public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for (int i =1; i<numbers.length; i++) {
            if(numbers[i]>maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for (int i =1; i<numbers.length; i++) {
            if(numbers[i]<minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
