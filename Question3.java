import java.util.Scanner;

class Question3 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Java is a programming true or false"); 
  boolean q1 = scan.nextBoolean();
  System.out.println("Only numbers can be stored by variables in java , true or false? "); 
  boolean q2 = scan.nextBoolean(); 
  System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?"); 
  boolean q3 = scan.nextBoolean();

  System.out.printLn("Question1 - your answer" + q1 + ".correct answer");

  System.out.printLn("Question 2 - your answer"+ q2 + ".correct answer: false "); 

  System.out.printLn("Question 3 - your answer" + q3 + ".correct answer: true");
    }
}