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
public class GrammarCheck3_3_4 {

        public void checkWord(String word)
    {
       
   if(word.length()>3) {
           
       
       if(word.charAt(word.length()-3)=='ර')    

       {
           if(word.charAt(word.length()-2)=='ණ'){
                if(word.charAt(word.length()-1)=='්')
                {
                    System.out.println("waradi");
                }
           }else{
               System.out.println("hriii");
           }
           
          // System.out.println("dshbx");
       }
    }
    }
    //   System.out.print(" ");
         
    
    
    public static void main(String[] args) {
        
    
    //Scanner input=new Scanner(System.in);
    //String word=NewJFrame.Word;

  
    
   }

}      
