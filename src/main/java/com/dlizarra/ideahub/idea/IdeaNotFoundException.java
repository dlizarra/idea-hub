package com.dlizarra.ideahub.idea;

@SuppressWarnings("serial")
public class IdeaNotFoundException extends RuntimeException {

	public IdeaNotFoundException(final Integer id) {
		super("Could not find Idea with id: " + id);
	}
}
