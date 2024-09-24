import java.util.Scanner;
public class IT24100264Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
          
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();
            
            int total = mark1 + mark2 + mark3 + mark4;
            double average = total / 4.0;
            
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
         
            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();  
        }
    }
}