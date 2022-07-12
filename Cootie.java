public class Cootie {
   private String digits;
   private String[] messages = new String[8];{
      messages[0] = "It is certain.";
      messages[1] = "Without a doubt.";
      messages[2] = "Most likely.";
      messages[3] = "Ask again later.";
      messages[4] = "Cannot predict now.";
      messages[5] = "Don't count on it.";
      messages[6] = "My sources say no.";
      messages[7] = "Very doubtful.";
   }
   private String message;
   
   //display digits based on length of color chosen
   public String makeChoice(int num){   
         if (num % 2 == 0){
            digits = ("1, 2, 5, 6");
         }
         else if (num % 2 == 1){
            digits = ("3, 4, 7, 8");
         }
         return digits;
   }
   //display Cootie Catcher message based on number chosen
   public String cootieMessage(int num){
      message = messages[num];
      
      return message;
   }
}


