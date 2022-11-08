import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      

	    System.out.println("g·ð͂µĂ­¾³¢");
            double g = new Scanner(System.in).nextInt();
	    System.out.println("̏dð͂µĂ­¾³¢");
            double kg = new Scanner(System.in).nextInt();
            double cm = g/100.0;
            
            double bmi = kg/(cm*cm);
            
            double f = ((double)Math.round(bmi*100))/100;
            System.out.println("BMIは"+ f);
        
            
        
    }
}
