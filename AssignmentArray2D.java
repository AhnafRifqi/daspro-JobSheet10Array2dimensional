import java.util.Scanner;


public class AssignmentArray2D {
    public static void main(String[] args) {
       
        int[][] survey = {
            {5, 4, 3, 4, 5, 4}, 
            {3, 2, 5, 4, 3, 5},  
            {4, 5, 4, 3, 2, 4},  
            {3, 4, 2, 4, 4, 3},  
            {5, 5, 3, 4, 5, 4},   
            {4, 3, 4, 3, 4, 5},  
            {3, 4, 5, 4, 3, 4},  
            {4, 5, 4, 5, 4, 3},  
            {5, 4, 3, 4, 5, 4},  
            {4, 3, 4, 5, 4, 3},    
        };
        
        System.out.println("1. Survey Results:");
        System.out.println("              Q1  Q2  Q3  Q4  Q5  Q6");
        for (int person = 0; person < 10; person++) {
            System.out.print("Respondent " + (person + 1)+ ": "); 
            
        
            for (int question = 0; question < 6; question++) {
                System.out.print(" " + survey[person][question] + "  ");
            }
            System.out.println(); 
        }
        System.out.println();
        
        
        System.out.println("2. Average for each respondent:");
        for (int person = 0; person < 10; person++) {
           
            int sum = 0;
            for (int question = 0; question < 6; question++) {
                sum = sum + survey[person][question];
            }
            
            double average = (double) sum / 6;
            System.out.println("Respondent " + (person + 1) + " average: " + average);
        }
        System.out.println();
        
        
        System.out.println("3. Average for each question:");
        for (int question = 0; question < 6; question++) {
            
            int sum = 0;
            for (int person = 0; person < 10; person++) {
                sum = sum + survey[person][question];
            }
            
            double average = (double) sum / 10;
            System.out.println("Question " + (question + 1) + " average: " + average);
        }
        System.out.println();
        
        
        System.out.println("4. Overall average:");
        int totalSum = 0;
        
        for (int person = 0; person < 10; person++) {
            for (int question = 0; question < 6; question++) {
                totalSum = totalSum + survey[person][question];
            }
        }
        
        double overallAverage = (double) totalSum / (10 * 6);
        System.out.println("Overall average: " + overallAverage);

    }
}