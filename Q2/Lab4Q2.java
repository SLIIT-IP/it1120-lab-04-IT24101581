import java.util.Scanner;

public class IT24100452Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks.terminating Program.");
        } else {

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();


         if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks.terminating Program.");
        } else {


         System.out.print("Enter percentage for exam marks: ");
         double examPercentage = input.nextDouble();
         System.out.print("Enter percentage for lab marks: ");
         double labPercentage = input.nextDouble();


         if (examPercentage + labPercentage != 100) {
             System.out.println("Percentages must add up to 100.terminating Program.");
         } else {
                  

         double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
             System.out.println("Final marks: " + finalMarks);
          }
       }
    }

  }
}
