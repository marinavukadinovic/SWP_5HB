package Refactoring;
	
/*
 * class InvalidAccessException public machen da sie überall genutzt wird*/

public class IdException extends Exception {

		private static final long serialVersionUID = 1L;

		public IdException(String message) {
			super(message);
		}
	}


