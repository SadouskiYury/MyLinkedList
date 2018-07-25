package by.htp.collection.linked_list.entity;

public class Node extends User {

	public Node next;
	public Node prev;

	public Node(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public void show() {
		System.out.println(Node.this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}

}
