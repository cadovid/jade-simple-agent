package es.uc3m.mas;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
public class AnotherAgent extends Agent {
    @Override
    protected void setup() {
        ACLMessage msg = receive();
        System.out.println(msg.getContent()+ " from: "+msg.getSender());
    }
}
