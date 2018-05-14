
package Sortieren;

public class MySort_0 
{
    public static void main(String[] args) 
    {
        int [] arr ={12,4,89,35,41,23,8,12,67,37,55,72,88,48};
        int merk;
        
        for (int j=arr.length - 1; j > 0; j--)  /* Schleife ueber alle Sortierdurchganege */
        {
            for (int i=0; i < j; i++)           /* Schleife fuer einen Sortierdurchgang */
            {
                if (arr[i] > arr[i+1])
                {
                    merk     = arr[i+1];    
                    arr[i+1] = arr[i];
                    arr[i]   = merk;
                }
            }
        }
        
        System.out.println();
        for (int x:arr)
            System.out.println(x);
    }
    
}
