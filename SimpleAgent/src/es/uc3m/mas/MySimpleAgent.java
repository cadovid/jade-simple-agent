package es.uc3m.mas;
import jade.core.Agent;
public class MySimpleAgent extends Agent {
    protected void setup() {
        System.out.println("Hello World! My name is " + getLocalName());
        // the addition of a generic behavior
        // the Behavior stops when random gets the value 7
        addBehaviour(new RandomBehaviour());
        addBehaviour(new SendMsgBehaviour());
        // Make this agent terminate
        doDelete();
    }
}