/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akuramas;

import masmt.*;
public class BidderAgent extends MaSMTAgent{
  
    public BidderAgent(String group, String role, int id) {
       super(group,role,id);
    }
    
     int lifeconter;
    @Override
    public void active() {
       System.out.println("I am in active");
    }

    @Override
    public void live() {
        
       MaSMTMessage m;
        m = waitForMessage();
        System.out.println(agent + " -GET- " + m);

        m.setReceiver(m.getSender());
      //  m.setSender(agent);
      //  m.setMessage("Reply");
      //  m.setHeader("local");
     // sendMessage(m);

        
    }

    @Override
    public void end() {
       System.out.println("I am in end");
    }

    
    
}
