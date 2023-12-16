package Util;

import org.apache.commons.lang3.RandomStringUtils;

public class Helper {
	
	public static String generateRandomText() {
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(10);
		System.out.println(randomAlphabetic);
		return randomAlphabetic;
	}
	
	public static void generateRandomNumbers() {
		double random = Math.random();
		System.out.println(random);
	}
	
	public static String generateRandomAlphaNumeric() {
		String alphanumeric = RandomStringUtils.randomAlphanumeric(10);
		return alphanumeric;
	}
	
	
	public static void main(String[] args) {
		Helper.generateRandomText();
		Helper.generateRandomNumbers();
	}

}
