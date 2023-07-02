package com.mmkarami.patterns.collectional.iterator;

public interface Iterator<E> {

	boolean hasNext();
	
	E next();
}