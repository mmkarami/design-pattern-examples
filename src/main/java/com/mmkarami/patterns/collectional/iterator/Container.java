package com.mmkarami.patterns.collectional.iterator;

public interface Container<E> {

	Iterator<E> iterator();
	
	public void add(E element);
	
	public Integer size();
}
