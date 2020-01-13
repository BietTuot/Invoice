package com.invoice.exceptions;

import java.util.ArrayList;
import java.util.List;



public class BusinessExceptionsList {

	public static List<Class> exceptionsList = new ArrayList<Class>();
	
	static {
		exceptionsList.add(InvalidParameterException.class);
		exceptionsList.add(NotFoundInvoiceException.class);
		exceptionsList.add(NotFoundParameterException.class);
		exceptionsList.add(UnknownErrorException.class);
	}
	
	public static boolean contains(Class c) {

		return exceptionsList.contains(c);

	}
}
