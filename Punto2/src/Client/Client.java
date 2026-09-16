
package Client;

import Client.ClientBehavior;
import Sends.PostalSend;

public class Client extends ClientBehavior{
    public Client(){
        sendsBehavior = new PostalSend();
    }
    
}
