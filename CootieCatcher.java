
import java.util.*;

public class CootieCatcher {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      Cootie catcher = new Cootie();

      String userInput = "";
      String numDisplay = "";
      int userNumPick = 0;
      int numberConv = 0;

      boolean error = false;
      boolean numCheck = false;
      String userLoop = "";

      System.out.println("Use the Cootie Catcher to answer your question.");

      do{ //Loop user until Q is pressed
         System.out.println("\n" + "What is your question?");
         
         in.nextLine(); 

         do{ //Loop user if incorrect color/input is entered
            try{
               error = false;

               System.out.println("\n" + "What color do you pick? (red, green, blue, yellow)");

               userInput = in.nextLine();

               //Toggle through Cootie Catcher numbers based on length of color chosen
               if (userInput.equalsIgnoreCase("red")){
                  for (int i = 0; i < userInput.length(); i++){
                     numDisplay = catcher.makeChoice(i);
                     
                     System.out.println(userInput.charAt(i) + " " + numDisplay);
                  }
               }
               else if (userInput.equalsIgnoreCase("green")){
                  for (int i = 0; i < userInput.length(); i++){
                     numDisplay = catcher.makeChoice(i);
                     
                     System.out.println(userInput.charAt(i) + " " + numDisplay);
                  }
               }
               else if (userInput.equalsIgnoreCase("blue")){
                  for (int i = 0; i < userInput.length(); i++){
                     numDisplay = catcher.makeChoice(i);
                     
                     System.out.println(userInput.charAt(i) + " " + numDisplay);
                  }
               }
               else if (userInput.equalsIgnoreCase("yellow")){
                  for (int i = 0; i < userInput.length(); i++){
                     numDisplay = catcher.makeChoice(i);
                     
                     System.out.println(userInput.charAt(i) + " " + numDisplay);
                  }
               }
               else{
                  throw new IllegalArgumentException("\n" + "Incorrect input");
               }
            }
            catch (Exception e){
               error = true;

               System.out.println(e.getMessage());
            }
         }while (error);

         do{ //Loop user if incorrect number/input is entered
            try{
               numCheck = true;

               System.out.println("\n" + "The Cootie Catcher landed on: " + numDisplay + ".");
               
               System.out.println("Please pick a number that the Cootie Catcher landed on.");

               userNumPick = in.nextInt();
            
               // Check if user's choice matches Cootie Catcher numbers specified
               for (int i = 0; i < numDisplay.length(); i += 3) {
                  numberConv = Character.getNumericValue(numDisplay.charAt(i));
                  
                  if (userNumPick == numberConv){
                     numCheck = false;
                  }
               }
               if (numCheck == true){
                  System.out.println("\n" + "Error, please try again.");
               }
            }
            catch (InputMismatchException i){
               in.nextLine(); // Flush buffer

               numCheck = true;

               System.out.println("\n" + "Error, a number must be entered.");
            }
            catch (Exception e){
               in.nextLine(); // Flush buffer

               numCheck = true;

               System.out.println("\n" + e.getMessage());
            }
         
         }while (numCheck);
               
         System.out.println("\n" + "The Cootie Catcher's answer is: " + 
            catcher.cootieMessage(userNumPick-1));
         
         System.out.println("\n" + "Do you want to ask another question?" + 
            "\n" + "Press any key to continue or Q to quit.");
         
         in.nextLine(); // Flush buffer

         userLoop = in.nextLine();
      
      }while (!userLoop.equalsIgnoreCase ("Q"));

      in.close();
   }
}