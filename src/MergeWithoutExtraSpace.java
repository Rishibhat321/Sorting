import java.util.*;

public class MergeWithoutExtraSpace {

    public static void merge(long[] arr1, long[] arr2, int n, int m)
    {
        int i=0,j=0,k=n-1;
        while(i<=k && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                long temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                k--;
                j++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);


    }

    public static void printSortedArray(long[] arr1, long[] arr2)
    {
        for(long ele: arr1)
        {
            System.out.print(ele + " ");
        }

        System.out.println();

        for(long ele: arr2)
        {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        long[] arr1 = {1, 3, 5, 7};
        int n = arr1.length;

        long[] arr2 = {0, 2, 6, 8, 9};
        int m = arr2.length;

        merge(arr1, arr2, n, m);

        printSortedArray(arr1, arr2);


    }
}
