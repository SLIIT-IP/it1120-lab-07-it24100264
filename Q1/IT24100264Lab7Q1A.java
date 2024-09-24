import java.util.Scanner;
public class IT24100264Lab7Q1A{
    public static void main(String[] args){
        Scanner myKey=new Scanner(System.in);
        int i=0;
        int total=0;
        System.out.println("Enter for four subjects: ");
        while(i<4){
            System.out.print("Enter subject mark "+(i+1)+": ");
            int marks=myKey.nextInt();
            total+=marks;
            i++;
        }
        double avg=total/4.0;
        System.out.println();
        System.out.println("Averege is :"+avg);
        if(avg>=75&&avg<101){
            System.out.println("Overall grade is : Distinction");
        }else if (avg>=50&&avg<75){
            System.out.println("Overall grade is : Credit");
        }else if (avg>=0&&avg<50){
            System.out.println("Overall grade is : Fail");
        } else{
             System.out.println("Enter correct marks"); 
            }      
    }
}