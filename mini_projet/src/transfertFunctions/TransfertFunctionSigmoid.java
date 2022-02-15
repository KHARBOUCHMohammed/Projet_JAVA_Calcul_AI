package transfertFunctions;

 public abstract class TransfertFunctionSigmoid extends ITransfertFunction {

	public double ft(double v) 
	{
		return (1 / (1 + Math.exp(-v))) ;
	}
	public double dft(double v)
	{
		return (v * ( 1 - v ) ) ;
	}
}
