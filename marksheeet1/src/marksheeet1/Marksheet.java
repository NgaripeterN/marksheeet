package marksheeet1;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Peter Ndung'u Ngari";
        String regNo = "C026-01-0910/2022";
        int semester = 2;
    	Scanner scanner = new Scanner(System.in);

    

         // Display the header information
         System.out.println("                Department of Computer Science");
         System.out.println("                      End Semester results");
         System.out.println("-----------------------------------------------------------------------------------------------");
         System.out.println("|Name:" + name + "     " + "|Roll_No:" + regNo + "   Semester: " + semester);
         System.out.println("_______________________________________________________________________________________________");
         System.out.println("|Unit Code                    |Unit Name:                  Score");
         System.out.println("-----------------------------------------------------------------------------------------------");

         // Initialize variables to store the total and average scores
         int total = 0;
         float average = 0.0f;

         // Prompt the user to enter the unit code, unit name, and score for each unit
         for (int i = 0; i < 4; i++) {             
             String unitCode = scanner.next();
             String unitName = scanner.next();
             int score = scanner.nextInt();

             // Update the total score
             total += score;

             // Print the unit code, unit name, and score
             System.out.print("|" + unitCode + "\t\t      ");
             System.out.print("|"+unitName);
             System.out.print("\t\t\t   ");
             System.out.println("|"+score);
         }

         // Calculate the average score
         average = (float) total / 4;

         // Print the total and average scores
         System.out.println("-----------------------------------------------------------------------------------------------");
         System.out.println("|Total                                                     |" +total);
         System.out.println("-----------------------------------------------------------------------------------------------");
         System.out.println("|Average                                                   |" +average);
         System.out.println("-----------------------------------------------------------------------------------------------");

         // Calculate the grade
         Character grade = null;
         if (average >= 70 && average <= 100) {
             grade = 'A';
         } else if (average >= 60 && average <= 69) {
             grade = 'B';
         } else if (average >= 50 && average <= 59) {
             grade = 'C';
         } else if (average >= 40 && average <= 49) {
             grade = 'D';
         } else if (average <= 39) {
             grade = 'F';
         }

         // Print the grade
         System.out.println("|Grade                                                     |" +grade);
         System.out.println("-----------------------------------------------------------------------------------------------");

         // Display the grading criteria
         System.out.println("                                           Recommendation|");
         System.out.println("-----------------------------------------------------------------------------------------------");
         System.out.println("Grading Criteria                   Overall Grade(A-D)     Recommend Pass");
         System.out.println("70-100\t\tA");
         System.out.println("60-70\t\tB");
         System.out.println("50-60\t\tC");
         System.out.println("40-50\t\tD");
         System.out.println("Below 40\tF");
         System.out.println("-----------------------------------------------------------------------------------------------");

         // Close the Scanner object
         scanner.close();
     }
 }


	


