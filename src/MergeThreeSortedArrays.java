import java.util.*;

public class MergeThreeSortedArrays {

   public static ArrayList<Integer> merge3sorted(int[] A, int[] B, int[] C)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int i=0,j=0,k=0;

        while(i<A.length && j<B.length && k<C.length)
        {
            if(A[i]<=B[j] && A[i]<=C[k])
            {
                list.add(A[i]);
                i++;
            }

            else if(B[j]<=C[k] && B[j]<=A[i])
            {
                list.add(B[j]);
                j++;
            }

            else if(C[k]<=B[j] && C[k]<=A[i])
            {
                list.add(C[k]);
                k++;
            }

            else if(A[i]<B[j] && A[i]<C[k])
            {
                list.add(A[i]);
                i++;
            }

            else if(B[j]<C[k] && B[j]<A[i])
            {
                list.add(B[j]);
                j++;
            }

            else{
                list.add(C[k]);
                k++;
            }
        }


        while(i<A.length && j<B.length)
        {
            if(A[i]<=B[j])
            {
                list.add(A[i]);
                i++;
            }
            else{
                list.add(B[j]);
                j++;
            }
        }

        while(j<B.length && k<C.length)
        {
            if(B[j]<=C[k])
            {
                list.add(B[j]);
                j++;
            }
            else{
                list.add(C[k]);
                k++;
            }
        }

        while(i<A.length && k<C.length)
        {
            if(A[i]<=C[k]){
                list.add(A[i]);
                i++;
            }

            else{
                list.add(C[k]);
                k++;
            }
        }

        while(i<A.length)
        {
            list.add(A[i]);
            i++;
        }

        while(j<B.length)
        {
            list.add(B[j]);
            j++;
        }

        while(k<C.length)
        {
            list.add(C[k]);
            k++;
        }

        return list;
    }
    public static void main(String[] args) {

      int[] A = {1, 2, 3, 4};
      int[] B = {1, 2, 3, 4, 5};
      int[] C = {1, 2, 3, 4, 5, 6};

      ArrayList<Integer> res = merge3sorted(A, B, C);

        System.out.println("The resultant sorted array is: ");

        System.out.println(res);

    }
}
