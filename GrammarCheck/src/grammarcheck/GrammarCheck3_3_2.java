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
public class GrammarCheck3_3_2 {

        public void checkWord(String word)
    {
      //  System.out.println("hh");
       for(int k=0;k<word.length();k++){
    //  System.out.print(word.charAt(k));
           
       System.out.print("");
       if(word.charAt(k)=='ඍ' )    

       {
           
        //  System.out.println("dshbx");
           if(k+1<=word.length()-1)
           {    //System.out.println("nnnnnnnn");
               if (word.charAt(k+1)=='න'){
                
           System.out.println("waradi");
               }else{
                   System.out.println("hari");
               }
               }
           }
        }
       
       for(int k=0;k<word.length();k++){
    //  System.out.print(word.charAt(k));
           
       System.out.print("");
       if(word.charAt(k)=='ර'|word.charAt(k)=='ෂ' )    

       {
           
        //  System.out.println("dshbx");
           if(k+1<=word.length()-1)
           {    //System.out.println("nnnnnnnn");
               if (word.charAt(k+1)=='්'){
                
           if (word.charAt(k+2)=='න'){
                
           System.out.println("waradi");
               }else{
                   System.out.println("hari");
               }
               }
           }
        }
       
       
        }
       }
    //   System.out.print(" ");
         
    
    
    public static void main(String[] args) {
        
    
    //Scanner input=new Scanner(System.in);
    //String word=NewJFrame.Word;

  
    
   }

}      
