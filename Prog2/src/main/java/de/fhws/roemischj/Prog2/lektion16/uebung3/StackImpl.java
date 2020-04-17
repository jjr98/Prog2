package de.fhws.roemischj.Prog2.lektion16.uebung3;

public class StackImpl implements Stack {
	//ArrayList<Object> al = new ArrayList<Object>();
	
	@Override
	public void push(Object o) {
		al.add(o);
	}
	
	@Override
	public Object pop() {
		int index = al.size() - 1;
		Object ret = al.get(index);
		al.remove(index);
		return ret;
	}
}
