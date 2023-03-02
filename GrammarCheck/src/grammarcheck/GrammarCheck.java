/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarcheck;

import java.util.Scanner;

/**
 *
 * @author HASHINI
 */
public class GrammarCheck {

        public void checkWord(String word)
    {
         
       for(int k=0;k<word.length()-1;k++){
      //System.out.print(word.charAt(k));
           
       System.out.print("");
       if(word.charAt(k)=='ශ' | word.charAt(k)=='ස' )
       {
           
          // System.out.println("dshbx");
           if(word.charAt(k+1)=='ණ')
           {
           System.out.println("waradi");
               
           }
           else if(k+2<word.length()&(word.charAt(k+1)=='ා'
                  |word.charAt(k+1)=='ැ'|
                   word.charAt(k+1)=='ෑ'|
                   word.charAt(k+1)=='ි'|
                   word.charAt(k+1)=='ී'|word.charAt(k+1)=='ු'|word.charAt(k+1)=='ූ'|word.charAt(k+1)=='ෘ'|
                   word.charAt(k+1)=='ෲ'|word.charAt(k+1)=='ෙ'|word.charAt(k+1)=='ේ'|word.charAt(k+1)=='ෛ'|
                   word.charAt(k+1)=='ො'|word.charAt(k+1)=='ෝ'|word.charAt(k+1)=='ෞ'|word.charAt(k+1)=='ං'|word.charAt(k+1)=='ඃ'|word.charAt(k+1)=='ඃ'))  

           {
               if(word.charAt(k+2)=='ණ')
               {
                   System.out.println("waradi");
              
               }
           }
       
       }
       }
       System.out.print(" ");
         }
    
    
    public static void main(String[] args) {
        
    
    //Scanner input=new Scanner(System.in);
    //String word=NewJFrame.Word;

  
    
   }

}      
