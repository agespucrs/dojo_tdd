package com.test.telefones;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.controller.telefones.Telefone;

public class TesteDojoTDD {

	Telefone tel;

	@Before
	public void inicialize() {
		tel = new Telefone();
	}

	@Test
	public void testaABC() {
		try {
			String numero = tel.getNumero("A");
			Assert.assertEquals(numero, "2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testaDEF() {
		try {
			String numero = tel.getNumero("E");
			Assert.assertEquals(numero, "3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testaCASSIO() {
		try {
			String numero = tel.getNumero("CASSIO");
			Assert.assertEquals(numero, "227746");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testaHifenE1CASHifenSIO1() {
		try {
			String numero = tel.getNumero("CAS-SIO1");
			Assert.assertEquals(numero, "227-7461");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testaMinuscula() {
		try {
			String numero = tel.getNumero("afz");
			Assert.assertEquals(numero, "239");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(expected = Exception.class)
	public void tamanhoInvalido() throws Exception {
		String numero = "";
		try {
			numero = tel.getNumero("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		} catch (Exception e) {
			throw e;
		}

	}

	@Test(expected = Exception.class)
	public void testaHome2Home() throws Exception {
		String numero = "";
		try {
			numero = tel.getNumero("HOME2HOME");
		} catch (Exception e) {
			throw e;
		}

	}
	
	@Test(expected = Exception.class)
	public void testa1CASSIO666() throws Exception {
		String numero = "";
		try {
			numero = tel.getNumero("1CASSIO666");
		} catch (Exception e) {
			throw e;
		}
	}
	@Test(expected = Exception.class)
	public void testaCaracterEspecial() throws Exception {
		String numero = "";
		try {
			numero = tel.getNumero("@ALOALO @JAISJ");
		} catch (Exception e) {
			throw e;
		}

	}
}
