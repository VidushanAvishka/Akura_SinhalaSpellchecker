/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akuramas;
import masmt.*;
/**
 *
 * @author SINGER
 */
public class SayLifeTime extends MaSMTAgent {
     public SayLifeTime(String group, String role, int id) {
        super(group, role, id);
    }
 int lifeconter;
    @Override
    public void active() {
        System.out.println("I am in active");
        lifeconter =10;
    }

    @Override
    public void live() {
         System.out.println("I am (" + agent+ ") exit on "+ lifeconter + " seconds");
     
     wait(1000);
     lifeconter--;
     
     if(lifeconter == 0)
             setLive(false);
     
    
    }

    @Override
    public void end() {
        System.out.println("I am in end");
    }
    
}
