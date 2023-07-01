package com.mmkaram.patterns.collectional.iterator;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class ContainerImpl<E> implements Container<E> {

	private static final int DEFAULT_CAPACITY = 10;

	int size;

	private Object[] elementData;

	public ContainerImpl() {
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	public ContainerImpl(int initialCapacity) {
		if (initialCapacity > 0) {
			this.elementData = new Object[initialCapacity];
		} else if (initialCapacity == 0) {
			this.elementData = new Object[0];
		} else {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
	}

	public Iterator<E> iterator() {
		return new IteratorImpl();
	}

	public int getSize() {
		return size;
	}

	public void add(E element) {
		if (size == elementData.length)
			elementData = grow();
		elementData[size] = element;
	}

	private Object[] grow() {
		return elementData = Arrays.copyOf(elementData, size + DEFAULT_CAPACITY);
	}

	private class IteratorImpl implements Iterator<E> {

		int cursor;

		public boolean hasNext() {
			return cursor != getSize();
		}

		@SuppressWarnings("unchecked")
		public E next() {
			if (cursor >= size)
				throw new NoSuchElementException();
			if (cursor >= ContainerImpl.this.elementData.length)
				throw new ConcurrentModificationException();
			cursor = cursor + 1;
			return (E) elementData[cursor];
		}
	}
}