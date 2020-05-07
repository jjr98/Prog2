package de.fhws.roemischj.Prog2.lektion19.uebung2;

import java.util.ArrayList;

public class StackImpl<E> implements GenericStack<E> {
	ArrayList<E> al = new ArrayList<E>();
	
	@Override
	public void push(E element) {
		al.add(element);
	}
	
	@Override
	public E pop() {
		int index = al.size() - 1;
		E ret = al.get(index);
		al.remove(index);
		return ret;
	}
}
