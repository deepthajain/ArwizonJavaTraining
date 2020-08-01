package com.arwizon.util;

import com.arwizon.exception.MyException;

public class Utilities {

	public static void nameMatch(String name) throws MyException {
		String pattern = "[A-Za-z]+";
		if (!name.matches(pattern)) {
			throw new MyException("Name can only be alphabets");
		}
	}

	public static void urlMatch(String imgurl) throws MyException {
		String pattern = "[a-z:/]{3,}[.]{1}[a-z]{3,}(.com|.in)";
		// String pattern="[A-Z a-z]+[:]{1}[//] {2}[a-zA-Z.]+";
		if (!imgurl.matches(pattern)) {
			throw new MyException("Doesn't match the given pattern");
		}

	}

	public static void priceMatch(String price) throws MyException {
		String pattern = "[1-9]{1}[0-9]{2,}";
		if (!price.matches(pattern)) {
			throw new MyException("Price should be greater than 100");
		}

	}

	public static void discountMatch(String number) throws MyException {
		String pattern = "[1-9]{1}[0-9]*";
		if (!number.matches(pattern)) {
			throw new MyException("It can only be numeric values");
		}

	}

	public static void unitsMatch(String unit) throws MyException {
		String pattern = "[1-9]*";
		if (!unit.matches(pattern)) {
			throw new MyException("It can only be positive numeric values");
		}

	}

}
