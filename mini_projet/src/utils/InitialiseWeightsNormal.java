package utils;

import java.lang.Math;


abstract public class InitialiseWeightsNormal extends IInitialiseWeights{
	
	public double[] initWeights(int size) {
		
		
		
	  double[] iniTgts  = new double[size];
	  
	  for (int i=0 ; i<iniTgts.length; i++ )
	  {	
		  double var= Math.random();
		  iniTgts[i]=var;
	  }
	  
		return iniTgts;

}
}