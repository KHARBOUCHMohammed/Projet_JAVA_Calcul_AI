package losses;

abstract public class LossDifference extends ILoss {
	
	 @SuppressWarnings("unused")
	 
	public double[] loss(double []y, double[]yPredit){
		 
		 int n =y.length;
		 double [] diff= new double[n];
		 
		 if(n == yPredit.length){
			
			for(int i=0; i<n;i++) {
				diff[i]=yPredit[i]-y[i]; 
			}
			}
		 return diff;
		
		 	
		}

}
