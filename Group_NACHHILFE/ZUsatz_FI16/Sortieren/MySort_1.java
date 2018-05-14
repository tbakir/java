
package Sortieren;

public class MySort_1 
{
    public static void main(String[] args) 
    {
        String [] arr ={"Tag","Nacht","Wald","Zahl","Stadt","Strasse","Verwaltung",
                        "Anfang","Essen","Kaffee"};
        
        String merk;
        boolean vertausch = true;
                
        for (int j=arr.length - 1; vertausch && j > 0; j--)  /* Schleife ueber alle Sortierdurchganege */
        {
            vertausch = false;
            for (int i=0; i < j; i++)           /* Schleife fuer einen Sortierdurchgang */
            {
                if (arr[i].compareTo(arr[i+1]) > 0)
                {
                    merk     = arr[i+1];    /* Strings vertauschen */
                    arr[i+1] = arr[i];
                    arr[i]   = merk;
                    vertausch = true;       /* Notieren, dass vertauscht wurde */
                }
            }
        }
        
        System.out.println();
        for (String x:arr)
            System.out.println(x);
    }
    
    
}
