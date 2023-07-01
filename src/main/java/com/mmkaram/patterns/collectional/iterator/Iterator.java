package com.mmkaram.patterns.collectional.iterator;

public interface Iterator<E> {

	boolean hasNext();
	
	E next();
}