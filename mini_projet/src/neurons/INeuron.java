package neurons;

import exceptions.AiExceptionBackward;
import exceptions.AiExceptionForward;

public abstract class INeuron {

	
	   public abstract double  forward(double []input ) throws AiExceptionForward;

	   public abstract double [] backward(double dy,double []dxt) throws AiExceptionBackward;
	
	 public abstract int getWSize() ;
	
	
	
	
}
