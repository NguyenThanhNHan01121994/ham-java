package random;
import java.util.Random;

public class random {

public static void main(String[] args) {
    Random rd = new Random();  
    int number = rd.nextInt(); 
    System.out.println("So vua duoc sinh ra la " + number);
         
    int number1 = rd.nextInt(4); 
    System.out.println("So vua duoc sinh ra la " + number1);
    int number2 = -4 + rd.nextInt(4);   
    System.out.println("So vua duoc sinh ra la " + number2);	
}
}
