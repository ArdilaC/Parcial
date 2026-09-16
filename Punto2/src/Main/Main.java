package Main;

import Client.Client;
import Sends.EcologicSend;
import Sends.EconomicSend;
import Sends.ExpressSend;

public class Main {
    public static void main (String []args){
        Client Client = new Client ();
        
        System.out.println("\nThe Client:");
        Client.send();
        
        System.out.println("\nThe client choose the economic option");
        Client.setSendsBehavior(new EconomicSend());
        Client.send();
        
        System.out.println("\nThe client choose the ecologic option");
        Client.setSendsBehavior(new EcologicSend());
        Client.send();
        
        System.out.println("\nThe client choose the express option");
        Client.setSendsBehavior(new ExpressSend());
        Client.send();
    }
    
}