package exceptions;

abstract public class AiException extends Exception  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 42690138219473825L;

	ErrorMethode errorMethode;
	
	ErrorLevel errorLevel;
	

	public AiException(String message, ErrorMethode errorMethode ,ErrorLevel errorLevel) {
			super(message);
		
			this.errorMethode = errorMethode;
			
			this.errorLevel = errorLevel;
		
			
		
	}

	public String getMessage() {
		ErrorMethode err1= this.errorMethode;
		ErrorLevel err2=this.errorLevel;
		
		return getMessage()+" meth : "+err1+" et  level  :"+err2;	
	}
}
	
	
	