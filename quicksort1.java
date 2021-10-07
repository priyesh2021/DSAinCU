import java.util.Scanner;
class QuickSort 
{
    
    
    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[(low+high)/2];
        
        while(low <= high)
        {
            while(arr[low] < pivot)
            {
                low++;
            }
            while(arr[high] > pivot)
            {
                high--;
            }
            if(low<=high)     //i<=j
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                
                low++;
                high--;
            }
        }return low;
    }
    
    void quickSortRec(int[] arr, int low, int high)
    {
        int pi = partition(arr, low, high);
        
        if(low < pi-1)
        {
            quickSortRec(arr,low,pi-1);
        }
        if(pi<high)
        {
            quickSortRec(arr,pi,high);
        }
    }
    void printArray(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        int leng = arr.length;
        QuickSort qs = new QuickSort();
        qs.quickSortRec(arr, 0, leng-1);
        qs.printArray(arr);
        
    }
}       
