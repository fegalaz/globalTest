package com.test.globallogic.util;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class ValidatePassword {

	private final static Logger LOGGER = Logger.getLogger(ValidatePassword.class.getName());

	public Boolean isValid(String password) {

		String regex = "^(?=.*[0-9].*[0-9])(?=.*[a-zA-Z]+.*)[0-9a-zA-Z]{6}$";

		Pattern pattern = Pattern.compile(regex);
		Boolean rsp = null;
		if (!password.isEmpty()) {
			LOGGER.info("Metodo que valida si el password cumple con el formato.");
			Matcher matcher = pattern.matcher(password);
			rsp = matcher.matches();
		}
		return rsp;
	}
}
