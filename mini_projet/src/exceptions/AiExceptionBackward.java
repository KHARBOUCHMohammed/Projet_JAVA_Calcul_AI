package exceptions;

public class AiExceptionBackward extends AiException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ErrorLevel args1;
	
	public AiExceptionBackward(String message, ErrorLevel errLevel) {
		super(message, ErrorMethode.BACKWARD,errLevel);
		this.args1=errLevel;
}
}
