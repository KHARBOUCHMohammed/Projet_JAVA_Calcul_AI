package losses;

abstract public class ILoss {
	
	abstract public double[] loss(double []y, double[]yPredit);
	 }