package models;

import exceptions.AiExceptionForward;
import exceptions.AiExceptionBackward;

abstract public class IModel {

	abstract public double[] forward(double[] input) throws AiExceptionForward ;
	abstract  public double backward(double[] output, double[] predicted) throws AiExceptionBackward ;
	abstract  public void learn() ;
	
}
