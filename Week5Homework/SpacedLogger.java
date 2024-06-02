package Week5Homework;

class SpacedLogger implements Logger {

	public void log(String message) {
		System.out.println(message.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce((a, b) ->a+" "+b)
				.orElse(" "));

	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce((a, b) ->a+" "+b)
				.orElse(" "));
		
	}

}
