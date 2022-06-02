package generics;

import java.util.ArrayList;

public class Node<T>{
	
	//Attributes
	private T element;
	private Node <T> prev;
	private ArrayList<Edge<T>> edges;
	
	
	public Node(T element) {
		
		this.element = element;
		
		//To initializa the arrayList of edges
		edges = new ArrayList<Edge<T>>();
		
	}
	
	
	
	
	public void insertAEdge(Edge<T> e) {
		edges.add(e);
	}
	
	
	
	public void delete() {
		for(int i = 0;i<edges.size();i++) {
			
			Node<T> temp = null;
			
			if(this != edges.get(i).getNode_1()) {
				temp = edges.get(i).getNode_1(); 
			}
			else if(this != edges.get(i).getNode_2()) {
				temp = edges.get(i).getNode_2();
			}
			
			if(temp != null) {
				delete(temp,edges.get(i)); 
			}
			
			
		}
	}
	
	private void delete(Node<T> node,Edge<T> edge) {
		node.getEdges().remove(edge);
	}
	
	//
	// GETTERS AND SETTERS
	//

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node <T> prev) {
		this.prev = prev;
	}

	public ArrayList<Edge<T>> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge<T>> edges) {
		this.edges = edges;
	}
	
	public String toString() {
		return element.toString();
	}
	
	public Edge<T> searchEdgeInList(Node<T> node){
		//We must comparate the node with node_2, because node_1 is the node the we are.
		for(Edge<T> e : edges) {
			if(e.getNode_2()==node) {
				return e;
			}
		}
		return null; 
	}
	
	
	

	
	
	
	
	
	
}
