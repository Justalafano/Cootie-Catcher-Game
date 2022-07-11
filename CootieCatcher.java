import java.util.*;

public class CootieCatcher {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      Cootie catcher = new Cootie();

      String userQuestion = "";
      String userInput = "";
      String numDisplay = "";

      boolean error = false;

      System.out.println("Use the Cootie Catcher to answer your question.");

         System.out.println("What is your question?");

         userQuestion = in.nextLine();

      do{
         try{
            error = false;

            System.out.println("What color do you pick? (red, green, blue, yellow)");

            userInput = in.nextLine();

            if(userInput.equalsIgnoreCase("red")){
               for(int i = 0; i < userInput.length() + 1; i++){
                  numDisplay = catcher.numToggle(i);
                  
                  System.out.println(numDisplay);
               }
            }
            else if(userInput.equalsIgnoreCase("green")){
               for(int i = 0; i < userInput.length() + 1; i++){
                  numDisplay = catcher.numToggle(i);
                  
                  System.out.println(numDisplay);
               }
            
            }
            else if(userInput.equalsIgnoreCase("blue")){
               for(int i = 0; i < userInput.length() + 1; i++){
                  numDisplay = catcher.numToggle(i);
                  
                  System.out.println(numDisplay);
               }
            
            }
            else if(userInput.equalsIgnoreCase("yellow")){
               for(int i = 0; i < userInput.length() + 1; i++){
                  numDisplay = catcher.numToggle(i);
                  
                  System.out.println(numDisplay);
               }
            }
            else{
            throw new IllegalArgumentException("Incorrect input");
            }
            System.out.println("\n" + "The Cootie Catcher landed on: " + numDisplay + ".");
            
            System.out.println("Please pick out of these numbers.");
            
         }
         catch(Exception e){
            error = true;
         }
      }while(error);

   }
}