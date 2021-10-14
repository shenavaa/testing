package testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
	private static Logger logger = LogManager.getLogger(MyClass.class);

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.printHelloWorld();
	}

	public void printHelloWorld() {
		logger.info("Genetation output.");
		System.out.println("Hello World!");
	}
}
