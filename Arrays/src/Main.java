import java.util.*;
public class Main extends largestNumber{
    public static void main(String[] args) {
        largestNumber a=new largestNumber();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the array of numbers");
        int nums[]=new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i]=s.nextInt();
        }
        System.out.println(a.findLargest(nums));
    }
}