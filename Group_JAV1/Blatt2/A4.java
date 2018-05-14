package blatt2;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        int gramm1=0,gramm2=0;
        float preis1=0.0f,preis2=0.0f,erg1=0.0f,erg2=0.0f,erg=0.0f;
        Scanner eingabe=new Scanner(System.in);
        System.out.println("Bitte geben Sie die Grammzahl von Produkt 1 ein");
        gramm1=eingabe.nextInt();
        System.out.println("Bitte geben Sie den Preis von Produkt 1 ein");
        preis1=eingabe.nextFloat();
        System.out.println("Bitte geben Sie die Grammzahl von Produkt 2 ein");
        gramm2=eingabe.nextInt();
        System.out.println("Bitte geben Sie den Preis von Produkt 2 ein");
        preis2=eingabe.nextFloat();
        erg1=preis1/gramm1;
        erg2=preis2/gramm2;
        if (erg1<erg2) {
            System.out.println("Produkt 1 ist günstiger, es kostet "+erg1+"/pro Gramm"+"\n1kg von Produkt 1 kommt somit auf "+erg1*1000+"Euro\n1kg von Produkt 2 kommt dagegen auf "+erg2*1000+" Euro\nVielen dank für Ihre Anfage");            
        }
        else {
            System.out.println("Produkt 2 ist günstiger, es kostet "+erg2+"/pro Gramm"+"\n1kg von Produkt 2 kommt somit auf "+erg2*1000+"Euro\n1kg von Produkt 1 kommt dagegen auf "+erg1*1000+" Euro\nVielen dank für Ihre Anfage");            
        }
    }
    
}

