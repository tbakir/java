
package ihk_2014_2015_3;

public class IHK_2014_2015_3 
{

    public static void main(String[] args) 
    {
        double [][] einkommen_miete = { {4200. , 1200.},
                                         {900.  , 340.},
                                         {1800. , 600.},
                                         {3600., 1100.},
                                         {2700., 800.},
                                         {5900., 1300.},
                                         {700. , 220. },
                                         {1900., 570.},
                                         {2500., 810.},
                                         {3100., 900.},
                                         {4100., 750.},
                                         {1700., 420.},
                                         {2800., 620.}};
        
        int anzahlgruppen = 5;
        double staffelung = 1000;
        
        double[] pz;
        
        pz = prozente(einkommen_miete, anzahlgruppen, staffelung);
        
        for (int i=0; i < anzahlgruppen; i++)
            System.out.format("%.2f\n",pz[i]);
        
        // Der folgende Teil ist die Lösung von Handlungsschritt 4
        
        double [][] pz_sort;
        
        pz_sort = sortProzente(pz);
        
        for (int k=0; k < pz_sort.length; k++)
            System.out.format("Gruppe: %.2f Prozent: %.2f\n",pz_sort[k][0],
            pz_sort[k][1]);
            
    }    
     public static double [] prozente(double [][] einkommen_miete,
                                      int anzahlgruppen,
                                      double staffelung)
     {
          double [] prozentzahlen  = new double[anzahlgruppen];
          double [] summeEinkommen = new double[anzahlgruppen];
          double [] summeMiete     = new double[anzahlgruppen]; 
          
          int gruppe = 0;
          
          for (int i=0; i < einkommen_miete.length; i++)
          {
              gruppe = (int)(einkommen_miete[i][0] / staffelung);
              if (gruppe >= anzahlgruppen)
                  gruppe = anzahlgruppen - 1;
              
              summeEinkommen[gruppe] += einkommen_miete[i][0];
              summeMiete[gruppe]     += einkommen_miete[i][1];
              
          }
          
          /* Ausgabe zu Testzwecken
          for (int j=0; j < anzahlgruppen; j++)
              System.out.println(summeEinkommen[j]+ " "+summeMiete[j]);
          */
          
          for (int i= 0; i < anzahlgruppen; i++)
              prozentzahlen[i] = summeMiete[i]/summeEinkommen[i]*100;
          
          return prozentzahlen;
     } 
     
     // Lösung zum Handlungsschritt 4
     
     public static double [][] sortProzente(double [] pz)
     {
         int anzahlZeilen = pz.length;
         double [][] pz_s = new double[anzahlZeilen][2];
         
         double q;
         double p;
         
         for (int i=0; i <= anzahlZeilen - 1; i++)
         {
             pz_s[i][0] = i;
             pz_s[i][1] = pz[i];
         }
         
         for (int i=0; i <= anzahlZeilen - 1; i++)
         {
             for(int j=0; j <= anzahlZeilen - i - 2; j++)
             {
                 if (pz_s[j][1] > pz_s[j+1][1])
                 {
                     q            = pz_s[j][0];
                     p            = pz_s[j][1];
                     pz_s[j][0]   = pz_s[j+1][0];
                     pz_s[j][1]   = pz_s[j+1][1];
                     pz_s[j+1][0] = q;
                     pz_s[j+1][1] = p;
                 }
             }
         }
         
         return pz_s;
     }
 }
    
