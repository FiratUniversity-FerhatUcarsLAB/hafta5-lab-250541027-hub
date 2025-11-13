/*
 * Ad Soyad: [Emine Zehra Duyar]
 * Ogrenci No: [250541027]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner ;
 public class GeometriHesap {
     //Kare
    public static double calculateSquareArea(double side) {
        return side*side ;
    }
    public static double calculateSquarePerimeter(double side) {
        return 4*side ;
    }
    // dikdörtgen
    public static double calculateRectangleArea(double widht , double height){
        return widht*height ;
    }
     public static double calculateRectanglePerimeter(double widht , double height){
        return 2*(widht+height);
     }
     // Daire 
    public static double calculateCircleArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double calculateCircleCircumference( double radius){
        return 2*Math.PI*radius;
    }
    //Üçgen
    public static double calculateTriangleArea(double base, double height){
        return base*height/2;
    }
    public static double calculateTrianglePerimeter(double a,double b, double c ) {
        return a+b+c ;
    }
   
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        // kare
        System.out.print("Kare kenar uzunluğu: ");
        double side = input.nextDouble();
        

        // dikdörtgen
        System.out.println("\nDikdörtgen: ");
        System.out.print("Kisa Kenar (cm):");
        double width = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double height = input.nextDouble();

        //Daire
        System.out.println("\nDaire:");
        System.out.print("Yaricap (cm):");
        double radius = input.nextDouble();

        // Üçgen
        System.out.println("\nUcgen");
        System.out.print("Taban: ");
        double base = input.nextDouble();
        System.out.print("Yükseklik (cm):");
        double triHeight = input.nextDouble();
        System.out.print("1.kenar (cm):");
        double a = input.nextDouble();
        System.out.print("2.kenar (cm):");
        double b = input.nextDouble();
        System.out.print("3.kenar (cm):");
        double c = input.nextDouble();
 

        //Hesaplamalar 
        double kareAlan = calculateSquareArea(side);
        double kareCevre = calculateSquarePerimeter(side);
        double dikdortgenAlan = calculateRectangleArea(width,height);
        double dikdortgenCevre = calculateRectanglePerimeter(width,height);
        double daireAlan = calculateCircleArea(radius);
        double daireCevre = calculateCircleCircumference(radius);
        double ucgenAlan = calculateTriangleArea(base,height);
        double ucgenCevre = calculateTrianglePerimeter(a,b,c);
        // Metodların Çağrılması
         System.out.printf("Kare Alani: %.2f\n",calculateSquareArea(side));
         System.out.printf("Kare Cevresi: %.2f\n", calculateSquarePerimeter(side));
         System.out.printf("Dikdörtgen Alani: %.2f\n", calculateRectangleArea(width, height));
         System.out.printf("Dikdörtgen Çevresi: %.2f\n\n", calculateRectanglePerimeter(width, height));
         System.out.printf("Daire Alani: %.2f\n", calculateCircleArea(radius));
         System.out.printf("Daire Çevresi: %.2f\n\n", calculateCircleCircumference(radius));
         System.out.printf("Üçgen Alani: %.2f\n", calculateTriangleArea(base, height));
         System.out.printf("Üçgen Çevresi: %.2f\n", calculateTrianglePerimeter(a, b, c));





       
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");
        
        System.out.printf("\nKARE (kenar: %.1f cm):\n", side);
        System.out.printf("Kare Alan: %.2f\n", kareAlan);
        System.out.printf("KareCevre: %.2f\n", kareCevre);

        
        
        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", width, height);
        System.out.printf("Dikdortgenin Alani: %.2f\n", dikdortgenAlan);
        System.out.printf("Dikdörtgen Çevre: %.2f\n", dikdortgenCevre);
        
        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("Daire Alan: %.2f\n", daireAlan);
        System.out.printf("Daire Çevre : %.2f\n", daireCevre);
        
        
        
        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("Üçgen Alan: %.2f\n", ucgenAlan);
        System.out.printf("Üçgen Çevre: %.2f\n", ucgenCevre);
       
        System.out.println("========================================");
        
        input.close();
    }








 }
   
        
