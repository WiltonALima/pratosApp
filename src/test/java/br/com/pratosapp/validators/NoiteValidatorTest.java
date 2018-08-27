package br.com.pratosapp.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NoiteValidatorTest {

	@Test
	public void validaSucessoPossivel_test() {
		NoiteValidator manhaValidator = new NoiteValidator();
		assertTrue(manhaValidator.valida("1,2,3,3,4".split(",")));
	}
	
	@Test
	public void validaErroPossivel_test() {
		NoiteValidator manhaValidator = new NoiteValidator();
		assertFalse(manhaValidator.valida("1,2,3,4,5".split(",")));
	}
}
