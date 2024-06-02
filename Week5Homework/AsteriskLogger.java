package Week5Homework;

class AsteriskLogger implements Logger {

	public void log(String message) {
		System.out.println("***"+ message + "***");

	}

	@Override
	public void error(String message) {
		String border = "*".repeat(message.length()+13);
			System.out.println(border);
			System.out.println("***Error: "+message+"***");
			System.out.println(border);
		
	}

}
