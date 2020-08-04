package com.test.globallogic.util;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class ValidateEmail {

	private final static Logger LOGGER = Logger.getLogger(ValidateEmail.class.getName());

	public Boolean isValid(String mail) {

		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

		Pattern pattern = Pattern.compile(regex);
		Boolean rsp = null;
		if (!mail.isEmpty()) {
			LOGGER.info("Metodo que valida si el email cumple con el formato.");
			Matcher matcher = pattern.matcher(mail);
			rsp = matcher.matches();
		}
		return rsp;
	}
}
