package com.dlizarra.ideahub.user;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(final Integer id) {
		super("Could not find User with id: " + id);
	}
}