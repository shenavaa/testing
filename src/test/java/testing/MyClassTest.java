package testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MyClassTest {
	private static Logger logger = LogManager.getLogger(MyClassTest.class);
	MyClass obj=new MyClass();

	@BeforeEach
	void setUp() {
	}

	PrintStream getDownstream() { 
		return System.out;
	}

	@Test
	public void testprintHelloWorld() {
		logger.info("Testing testprintHelloWorld()");
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		PrintStream defStream = getDownstream();
		System.setOut(new PrintStream(myOut));
		this.obj.printHelloWorld();
		final String standardOutput = myOut.toString();
		System.setOut(defStream);
		assertEquals("Hello World!\n",standardOutput);
	}
}
