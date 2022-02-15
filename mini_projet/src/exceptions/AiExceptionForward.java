package exceptions;

public class AiExceptionForward extends AiException{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		ErrorLevel args1;
		
		public AiExceptionForward(String message, ErrorLevel errLevel) {
			super(message, ErrorMethode.FORWARD,errLevel);
			this.args1=errLevel;
	}
}
