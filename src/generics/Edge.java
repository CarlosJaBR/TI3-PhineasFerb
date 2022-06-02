package generics;

public class Edge<T> {
	
	@SuppressWarnings("unused")
	private int weight;
	@SuppressWarnings("unused")
	private Node<T> node_1;
	@SuppressWarnings("unused")
	private Node <T> node_2;
	
	/**
	 * This is the constructor method to create a Edge of the Graph
	 * @param weight, it represents the weight of the edge from Vertex 1 and
	 * Vertex 2.
	 * @param v1, it represents the Vertex 1 that is joined to the vertex 2 by the
	 * Edge.
	 * @param v2 it represents the Vertex 2 that is joined to the vertex 1 by the
	 * Edge.
	 */
	
	//
	// GETTERS AND SETTERS
	//
	
	public Edge(int weight, Node <T> node1,Node <T> node2) {
		this.weight = weight;
		this.node_1 = node1;
		this.node_2 = node2;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Node<T> getNode_1() {
		return node_1;
	}

	public void setNode_1(Node<T> node_1) {
		this.node_1 = node_1;
	}

	public Node<T> getNode_2() {
		return node_2;
	}

	public void setNode_2(Node<T> node_2) {
		this.node_2 = node_2;
	}
	
	public String toString() {
		return node_1.toString()+" -- "+weight+" --> "+node_2.toString();
	}
	
	
	

	
	
	


	

	
	

}
