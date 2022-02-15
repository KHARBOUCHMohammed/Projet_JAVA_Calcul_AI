package layers;



import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//import exceptions.AiException;
import exceptions.AiExceptionForward;
import exceptions.AiExceptionBackward;
//import exceptions.ErrorLevel;
import transfertFunctions.ITransfertFunction;
import neurons.INeuron;
import utils.IInitialiseWeights;
import utils.IInitialiseBias;

import neurons.NeuronLinear;

 public class LayerLinear extends ILayer<INeuron> {
	
	 public LayerLinear(int inputSize, int outputSize, double lr, IInitialiseWeights initWeights, IInitialiseBias initBias, ITransfertFunction tf)
	 {
		 for(int i=0;i<outputSize;i++) {
	            this.add(new NeuronLinear(lr, inputSize, initWeights, initBias, tf));
	        
	        } 
	 } 
	
	
	
	public double [] forward(double []input) throws AiExceptionForward

	{
		double[] out = new double[this.size()];
		int pos = 0 ;
		for ( INeuron neuron : this) /* ------------------------------------- */
		out[pos++] = neuron.forward(input); 
		return out ;
	}
 @Override 
	  public double [] backward(double []dy) throws AiExceptionBackward
	{
		  int pos = 0 ;
		  double[] dxt = new double[this.get(0).getWSize()];
		  for( INeuron neuron : this ) /* ------------------------------------- */

			  dxt = neuron.backward(dy[pos++], dxt);
		  return dxt; 
	}



@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}



@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public Iterator<INeuron> iterator() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public <T> T[] toArray(T[] a) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public boolean add(INeuron e) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean containsAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean addAll(Collection<? extends INeuron> c) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean addAll(int index, Collection<? extends INeuron> c) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean removeAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public boolean retainAll(Collection<?> c) {
	// TODO Auto-generated method stub
	return false;
}



@Override
public void clear() {
	// TODO Auto-generated method stub
	
}



@Override
public INeuron get(int index) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public INeuron set(int index, INeuron element) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public void add(int index, INeuron element) {
	// TODO Auto-generated method stub
	
}



@Override
public INeuron remove(int index) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public int indexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}



@Override
public int lastIndexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}



@Override
public ListIterator<INeuron> listIterator() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public ListIterator<INeuron> listIterator(int index) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public List<INeuron> subList(int fromIndex, int toIndex) {
	// TODO Auto-generated method stub
	return null;
}

	  
	  
	  
}
