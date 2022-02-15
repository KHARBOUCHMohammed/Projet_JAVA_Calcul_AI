package exceptions;

public class AiExceptionLoss extends AiException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ErrorLevel args1;
	
	public AiExceptionLoss(String message, ErrorLevel errLevel) {
		super(message, ErrorMethode.LOSS,errLevel);
		this.args1=errLevel;
}

	
		
}
