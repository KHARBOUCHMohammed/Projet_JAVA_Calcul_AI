package models;

import exceptions.AiExceptionBackward;
import exceptions.AiExceptionForward;
import layers.LayerLinear;
import losses.ILoss;


 public class MLP extends IModel {
	private LayerLinear[] layers ;
	 private ILoss lossFunction ;
	 public double loss ;
	 public double[] input ;
	 public double[] output ;
	 public double[] predicted ;

	 public MLP(int i1, int i2, int i3) {
		// TODO Auto-generated constructor stub
	}


	public double getLoss(double[] dy) {
		 double loss = 0.0 ;
		 for (int i = 0; i < dy.length; i++)
		 loss += dy[i];
		 return loss /= dy.length ;
		 }
	 
	 public static int getMaxIndice(double[] t) {
		 int max = -1 ;
		 double maxValue = -Double.MIN_VALUE ;
		 for (int i = 0; i < t.length; i++) {
		 if ( t[i] > maxValue ) {
		 maxValue = t[i];
		 max = i ;
		 }
		 }
		 return max ;
		 }
	 
	
	 public double[] forward(double[] input) throws AiExceptionForward 
	{
		 for (int i = 0; i < layers.length; i++)
			 input = layers[i].forward(input);
			 return input ;
	}
	  public double backward(double[] output, double[] predicted) throws AiExceptionBackward 
	{
		  double[] loss = this.lossFunction.loss(output, predicted) ;
		  double[] dy = loss ;
		  for (int i = layers.length - 1 ; i >= 0; i -- )
		  dy = layers[i].backward(dy); 
		  return getLoss(loss) ;
	}
	  public void learn() {
		  try {
			predicted = forward(input);
		} catch (AiExceptionForward e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }

}
