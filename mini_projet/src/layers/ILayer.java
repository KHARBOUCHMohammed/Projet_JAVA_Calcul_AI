package layers;


//import java.util.ArrayList;
import java.util.List;
import exceptions.AiExceptionForward;
import exceptions.AiExceptionBackward;


abstract   public class ILayer<INeuron> implements List<INeuron> {
	
	abstract public double [] forward(double []input) throws AiExceptionForward ;
	
	
	abstract  public double [] backward(double []dy) throws AiExceptionBackward ;
}
