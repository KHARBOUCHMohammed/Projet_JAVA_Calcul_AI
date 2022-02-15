package test;

import losses.ILoss;
import losses.LossDifference;
import models.MLP;
import transfertFunctions.ITransfertFunction;
import transfertFunctions.TransfertFunctionSigmoid;
import utils.IInitialiseBias;
import utils.IInitialiseWeights;
import utils.InitialiseBiasNormal;
import utils.InitialiseWeightsNormal;

public class Test {
	
	public static void main(String[] args) {
		int outputSize = 21;
		double lr = 0.39;
		int nbLayers = 2;
		int inputSize = 2;
		
		IInitialiseBias initBias = new InitialiseBiasNormal();
		
		ITransfertFunction tf = new TransfertFunctionSigmoid();
		
		IInitialiseWeights initWeights = new InitialiseWeightsNormal();
		
		IInitialiseBias initBias = new InitialiseBiasNormal();
		
		ITransfertFunction tf = new TransfertFunctionSigmoid();
		
		ILoss lf = new LossDifference();
		
		MLP mlp = new MLP( nbLayers, inputSize, outputSize, lr, initWeights, initBias, tf, lf);
		
		double[] entrer1= new double[] {1.0,2.0};
		
		double[] sortie1 = mlp.forward(entrer1);
		
		
		double[][] xEnt = new double[][] {{1.0,1.0},{2.0,3.0},{6.0,8.0},};
		System.out.println(mlp.getMaxIndice(sortie1));
		
		int x = 0;
		double loss = 0;
		while (x<1000000) {
			for(int i=0;i< xEnt.length;i++) {
				loss = mlp.learn();
			}
			
			x++;
			if (x%10000==0) {
				System.out.println("loss: "+loss);
				System.out.println(x/100000*100);
			}
		}
		double[] entrer2= new double[] {2.0,4.0};
		double[] pd = mlp.forward(entrer2);

		
		for (double y : pd) {
			System.out.print(y + "|");
		}
		
		System.out.println();
		
		System.out.println(mlp.getMaxIndice(pd));
		
	}

}
