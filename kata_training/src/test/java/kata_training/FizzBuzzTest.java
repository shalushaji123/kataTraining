package kata_training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	static FizzBuzz fizzBuzz = null;

	@BeforeAll
	public static void init() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testFizz() {
		String response = fizzBuzz.play(3);
		assertEquals("Fizz", response);
	}

	@Test
	public void testFizzNot3() {
		String response = fizzBuzz.play(6);
		assertEquals("Fizz", response);
	}

	@Test
	public void testFizzBuzzZero() {
		String response = fizzBuzz.play(0);
		assertEquals("Fizz", response);
	}
	@Test
	public void testBuzz() {
		String response = fizzBuzz.play(5);
		assertEquals("Buzz", response);
	}

	@Test
	public void testBuzz10() {
		String response = fizzBuzz.play(10);
		assertEquals("Buzz", response);
	}

	@Test
	public void testBuzz44() {
		String response = fizzBuzz.play(44);
		assertEquals("44", response);
	}

}
