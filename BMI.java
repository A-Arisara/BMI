import java.util.Scanner;
class BMI {
    public static void main (String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Weight (kg.) : ");
        double w = sc.nextDouble();
        System.out.print("Height (cm.) : ");
        // cm.
        double h = sc.nextDouble(); 
        // m.
        h = h/100;
        double bmi = w/(h*h);
        System.out.println("BMI : "+bmi);
    }
}