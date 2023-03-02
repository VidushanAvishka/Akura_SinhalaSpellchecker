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
public class GrammarCheck2 {

        public void checkWord(String word)
    {
         
       for(int k=1;k<word.length();k++){
      System.out.print(word.charAt(k));
           
       System.out.print("");
       if(word.charAt(k)=='ට' |word.charAt(k)=='ඨ'|word.charAt(k)=='ඩ'|word.charAt(k)=='ඪ'|word.charAt(k)=='ණ')
       {
           
          //System.out.println("dshbx");
           if(word.charAt(k-1)=='ශ'| word.charAt(k-1)=='ස')
           {
           System.out.println("waradi");
               
           }
           else if(k-2>0&(word.charAt(k-1)=='ා'
                  |word.charAt(k-1)=='ැ'|
                   word.charAt(k-1)=='ෑ'|
                   word.charAt(k-1)=='ි'|
                   word.charAt(k-1)=='ී'|word.charAt(k-1)=='ු'|word.charAt(k-1)=='ූ'|word.charAt(k-1)=='ෘ'|
                   word.charAt(k-1)=='ෲ'|word.charAt(k-1)=='ෙ'|word.charAt(k-1)=='ේ'|word.charAt(k-1)=='ෛ'|
                   word.charAt(k-1)=='ො'|word.charAt(k-1)=='ෝ'|word.charAt(k-1)=='ෞ'|word.charAt(k-1)=='ං'|word.charAt(k-1)=='ඃ'|word.charAt(k-1)=='ඃ'|
                   word.charAt(k-1)=='්'))  

           {
              if(word.charAt(k-1)=='ශ'| word.charAt(k-1)=='ස')
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
