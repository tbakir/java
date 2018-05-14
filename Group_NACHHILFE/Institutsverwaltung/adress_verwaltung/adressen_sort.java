
package adress_verwaltung;

public class adressen_sort 
{
     public adressen_sort()
     { }
     
    public void adressen_sortieren_1(Adressen [] arr)
    {
        Adressen merk;
        
        for (int j= arr.length-1; j > 0; j--)
        {
            for (int i=0; i < j; i++)
            {
                if (arr[i].compareTo(arr[i+1]) > 0)
                {
                   merk = arr[i+1];
                   arr[i+1] = arr[i];
                   arr[i] = merk;
                }
            }
        }
    }    
}
