import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

    
     String input_a = JOptionPane.showInputDialog("Enter first value");
     String input_b = JOptionPane.showInputDialog("Enter second value");
     String input_c = JOptionPane.showInputDialog("Enter third value");
     
     double a = Double.valueOf(input_a);
     double b = Double.valueOf(input_b);
     double c = Double.valueOf(input_c);
     
     
//   To calculate the Discriminant
     double dis = b*b -4*a*c;
     System.out.println("Discriminant = " +dis);     
    
     
     if(dis>0) {     
    	 
     System.out.println("There are two solutions:");
    	 
     double x1 = (-b+Math.sqrt(dis))/(2*a);     
     double x2 = (-b-Math.sqrt(dis))/(2*a);
     
     System.out.println("first solution x1 = "+x1 + ", second solution x2 = " +x2);

     }
     else if(dis<0){    	 
     System.out.println("There are no Real solutions");    	 
     }
     else if(dis==0){
    	 double x = -b/(2*a);
    	 System.out.println("the is one solution x = " +x);
     }    		
	}
}
