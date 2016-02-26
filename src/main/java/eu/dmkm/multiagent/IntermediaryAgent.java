package eu.dmkm.multiagent;
import jade.core.Agent;

public class IntermediaryAgent extends Agent{
	
	private Object sparkMaster;
	private Object sparkHome;
	
	protected void setup() 
    { 
		Object[] args = getArguments();
		sparkMaster=args[0];
		sparkHome=args[1];	
    }

}
