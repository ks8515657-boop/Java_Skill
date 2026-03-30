import java.util.Scanner;

public class hy {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total_class = 100;
        System.out.println( "Enter Number of student: ");
        int n =sc.nextInt();
            System.out.println("\nEnter student" + i +"details: ");
            System.out.println("Enter Roll  No: ");
            int Roll_no = sc.nextInt();
            System.out.println("Enter class Attended :");
            int class_Attended = sc.nextInt();
            double parcentage = ((double)  class_Attended / total_class) * 100;
            boolean Eligible;

            if (parcentage>= 75) {
                Eligible =true;
            } else {
                Eligible =false;
            }
            System.out.println("\n---student " + i +" details---");
            System.out.println("Roll No: " + Roll_no);
            System.out.println("Attendence parcentage;" + parcentage + "%");
            
            if (Eligible) {
                System.out.println(" Eligible status Eligible for Exam");
            } else {
                System.out.println("eligible  status:not  eligible");
            }

        }
        
    }
}

