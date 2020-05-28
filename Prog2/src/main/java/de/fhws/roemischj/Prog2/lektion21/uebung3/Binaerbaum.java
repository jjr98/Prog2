package de.fhws.roemischj.Prog2.lektion21.uebung3;

public class Binaerbaum<T> 
{
	Element<T> root;
	
	
	public void insert(T value)
	{
		insert(new Element<T>(value));
	}
	
	public void insert(Element<T> e) 
	{
		if(root == null)
			root = e;
		else
			insert(root, e);
	}
	
	private void insert(Element<T> temp, Element<T> neu) 
	{
		if(neu.compareTo(temp) < 0) 
		{
			if(temp.getLeft() == null)
				temp.addLeft(neu);
			else
				insert(temp.getLeft(), neu);
		}
		else
		{
			if(temp.getRight() == null)
				temp.addRight(neu);
			else
				insert(temp.getRight(), neu);
		}
	}
	
	public void print() 
	{
		if(root == null)
			System.out.println("Leerer Baum");
		else
			print(root);
	}
	
	public void print(Element<T> temp)
	{
		if(temp.getLeft() != null) print(temp.getLeft());
        temp.printElement();
        if(temp.right != null) print(temp.right);
	}

	public static class Element<T>
	{
		private T value;
		private Element<T> left, right;
		
		public Element(T obj)
		{
			this.value = obj;
		}
		
		public Element<T> getLeft() {
			return this.left;
		}
		
		public Element<T> getRight() {
			return this.right;
		}
		
		public T getValue() {
			return this.value;
		}
		
		public void addLeft(Element<T> left) {
			this.left= left;
		}
		
		public void addRight(Element<T> right) {
			this.right = right;
		}
		
		@Override
		public String toString()
		{
			return this.value.toString();
		}
		
		public void printElement() {
			System.out.println(this.toString());
		}
		
		public int compareTo(Element<T> other) {
			return this.toString().compareTo(other.toString());
		}
	}
}
