package es.uc3m.mas;
import jade.core.AID;
import jade.core.behaviours.Behaviour;
import jade.lang.acl.ACLMessage;

public class SendMsgBehaviour extends Behaviour {
    public void action() {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.setContent("Hello!!!");
        msg.addReceiver(new AID("jesus", AID.ISLOCALNAME));
        myAgent.send(msg);
    }
    @Override
    public boolean done() {
        return false;
    }
}
