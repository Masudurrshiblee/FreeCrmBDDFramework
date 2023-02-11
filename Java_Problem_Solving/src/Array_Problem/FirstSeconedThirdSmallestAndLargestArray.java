package Array_Problem;

import java.util.Arrays;

public class FirstSeconedThirdSmallestAndLargestArray {
    public static void main(String []args){
        int temp;
        int [] arr ={34,25,78,56,98,50};
        Arrays.sort(arr);
        System.out.println("Elements are sorted in ascending order");
        int size=arr.length;
        for(int i=0; i<size; i++){
            for(int j=i+1;j<size; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Smallest"+arr[0]);
        System.out.println("2nd Smallest"+arr[1]);
        System.out.println("3rd Smallest"+arr[2]);
////// Finding largest value
        System.out.println("Largest "+arr[size-1]);
        System.out.println("2nd Largest "+arr[size-2]);
        System.out.println("3rd Largest "+arr[size-3]);
    }
}
