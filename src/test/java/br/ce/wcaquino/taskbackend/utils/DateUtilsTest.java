package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {

	
	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		//Cenário para teste
		LocalDate date = LocalDate.of(2030, 01, 01);
		
		//execução
		boolean result = DateUtils.isEqualOrFutureDate(date);

		//verificação
		Assert.assertTrue(result);	
	
	}
	
	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		//Cenário para teste
		LocalDate date = LocalDate.of(2010, 01, 01);
		
		//execução
		boolean result = DateUtils.isEqualOrFutureDate(date);

		//verificação
		Assert.assertFalse(result);	
	}
	
	@Test
	public void deveRetornarTrueParaDataAtual() {
		//Cenário para teste
		LocalDate date = LocalDate.now();
		
		//execução
		boolean result = DateUtils.isEqualOrFutureDate(date);

		//verificação
		Assert.assertTrue(result);	
	}
	
	
}
