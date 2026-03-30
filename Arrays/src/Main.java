import java.util.*;
public class Main extends secondLargest{
    public static void main(String[] args) {
        secondLargest a=new secondLargest();
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the array length");
        n=s.nextInt();
        System.out.println("enter the array of numbers");
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=s.nextInt();
        }
        System.out.println(a.sLargest(nums));

        int[] nums1 = {1,2,3,4};
        productOfArrayExceptItself obj=new productOfArrayExceptItself();
        System.out.println(Arrays.toString(obj.productExceptSelf(nums1)));
    }
}