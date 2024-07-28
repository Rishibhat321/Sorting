
public class BubbleSort {

   public static void bubbleSort(int[] arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printSortedArray(int[] arr){

       for(int ele: arr)
       {
           System.out.print(ele + " ");
       }
    }
    public static void main(String[] args) {

       int[] nums = {4, 1, 3, 9, 7};

       bubbleSort(nums, nums.length);

       printSortedArray(nums);

    }
}