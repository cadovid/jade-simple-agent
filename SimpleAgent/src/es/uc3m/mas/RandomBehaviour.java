package es.uc3m.mas;
import jade.core.behaviours.Behaviour;
public class RandomBehaviour extends Behaviour {
    private int random;
    public void action() { random = (int) (Math.random() * 10); System.out.println("random =" + random);
    }
    public boolean done() { return random == 7;
    }
    public int onEnd() {
        myAgent.doDelete();
        return super.onEnd();
    }
}
