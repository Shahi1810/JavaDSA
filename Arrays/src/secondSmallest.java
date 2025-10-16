public class secondSmallest {
    //https://www.naukri.com/code360/problems/ninja-and-the-second-order-elements_6581960?leftPanelTabValue=SUBMISSION
    public static int ssmallest(int []arr)
    {
        int min=arr[0], smin=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        return smin;
    }
}
