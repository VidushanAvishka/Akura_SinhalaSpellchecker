/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akuramas;

import masmt.*;
public class ManagerAgent extends MaSMTManager {

    @Override
    public void active() {
        System.out.println("I am manager in the active");
         setNumberofClients(2);
       agents[0] = new SellerAgent("seller", "rice", 1);
       agents[1] = new BidderAgent("bidder", "rice", 1);
     //   MaSMTMessage m;
     //    m = waitForMessage();
   //     setAgentGroup("rice");
     //   sendToClient(m);
      // activeAllClients();
    activeMessageParsing();
     MaSMTMessage m = new MaSMTMessage();
        m.setReceiver(new MaSMTAbstractAgent("bidder", "rice", 1));
        m.setReceiver(new MaSMTAbstractAgent("seller", "rice", 1));
         m.setMessage("Hiiiiiiiugoguygjhgtygf ");
        m.setHeader("local");
         sendToClient(m);
         
        
        
        activeAllClients();
       activeMessageParsing();
      
      
    }

    @Override
    public void live() {
    //  System.out.println("I am in live");
        wait(2000);
        //setLive(false);
    }

    @Override
    public void end() {
      //  System.out.println("I am in end");
    }
    
}
