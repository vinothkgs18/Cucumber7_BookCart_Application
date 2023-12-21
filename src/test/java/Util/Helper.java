package Util;

import java.util.Random;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Helper {
	
	public static String generateRandomText() {
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(10);
		System.out.println(randomAlphabetic);
		return randomAlphabetic;
	}
	
	public static int generateRandomNumbers() {
		Random r= new Random();
		int nextInt = r.nextInt(12);
		System.out.println(nextInt);
		return nextInt;
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
