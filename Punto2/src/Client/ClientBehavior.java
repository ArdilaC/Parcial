
package Client;

import Sends.SendsBehavior;

public abstract class ClientBehavior{
    public SendsBehavior sendsBehavior;
    
    public void send(){
        sendsBehavior.send();
    }
    public void setSendsBehavior(SendsBehavior sendsBehavior){
        this.sendsBehavior = sendsBehavior;
    }
}
