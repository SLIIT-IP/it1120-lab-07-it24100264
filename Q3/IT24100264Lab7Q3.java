import java.util.Scanner; 
public class IT24100264Lab7Q3{ 
public static void main(String[] args){ 
   Scanner input = new Scanner(System.in); 
 
double discountRate=0.05; 
 
for(int i=1;i<=5;i++){ 
     System.out.println("Customer "+i+":"); 
 
     System.out.print("Enter total bill amount:"); 
     double totalbill = input.nextDouble(); 
 
     System.out.print("Enter payment mode(C for cash,or O for other):"); 
     char paymentMode = input.next().charAt(0); 
    
if(paymentMode =='C'){  
   double dicount=totalbill*discountRate; 
   double amountToPay=totalbill-dicount; 
   System.out.println("Discount is:"+dicount); 
   System.out.println("Amount to be paid is:"+amountToPay); 
   System.out.println();
}else if(paymentMode =='O'){ 
       System.out.print("No discount applicable"); 
}else{ 
       System.out.print("Payment mode is not valid"); 
} 
System.out.println(); 
} 
 
  } 
}