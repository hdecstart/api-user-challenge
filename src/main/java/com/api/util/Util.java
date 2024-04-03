package com.api.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
	public static boolean validateEmailFormat(String email) {
		String regex = "^(.+)@(.+)cl";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
