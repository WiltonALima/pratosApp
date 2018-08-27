package br.com.pratosapp.validators;

import org.junit.Test;
import static org.junit.Assert.*;

public class ManhaValidatorTest {
	
	@Test
	public void validaSucessoPossivel_test() {
		ManhaValidator manhaValidator = new ManhaValidator();
		assertTrue(manhaValidator.valida("1,2,3,3,3,3,3,3".split(",")));
	}
	
	@Test
	public void validaErroPossivel_test() {
		ManhaValidator manhaValidator = new ManhaValidator();
		assertFalse(manhaValidator.valida("1,2,3,3,3,3,3,3,4".split(",")));
	}
}
