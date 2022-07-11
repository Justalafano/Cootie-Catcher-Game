import java.util.ArrayList;

public class Cootie {
   private String digits;
   private String[] messages = new String[8];
   
   public Cootie(){
      digits = "";
   }
   public String numToggle(int num){
         if(num % 2 == 0){
            digits = ("1, 2, 5, 6");
         }
         else if(num % 2 == 1){
            digits = ("3, 4, 7, 8");
         }
         return digits;
   }

   }


