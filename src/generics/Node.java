package generics;

import java.util.ArrayList;

public class Node<T>{
	
	//Attributes
	private T element;
	private Node <T> prev;
	private ArrayList<Edge<T>> edges;
	private int distance; 
	
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

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
		/*
		for(Edge<T> e : edges) {
			if(e.getNode_2()==node) {
				return e;
			}
		}
		return null; 
		*/
		Edge<T> out = null;
		
		boolean stop = false;
		
		for(int i = 0;i<edges.size() && !stop;i++) {
			if(node.equals(edges.get(i).getNode_1())) {
				stop = true;
				out = edges.get(i);
			}else if(node.equals(edges.get(i).getNode_2())) {
				stop=true;
				out=edges.get(i);
			}
		}
		
		return out;
	}
	
	public ArrayList<Node<T>> getneighbours() {
		 
		ArrayList<Node<T>> out = new ArrayList<Node<T>>();
		
		for(int i = 0;i<edges.size();i++) {
			Node<T> node = compareEdge(edges.get(i));
			
			if(node == null) {
				out.add(edges.get(i).getNode_1());
			}
			else {
				out.add(node);
			}
		}
	
	    return out;
	 }
	

	 private Node<T> compareEdge(Edge<T> edge) {

	        if (this != edge.getNode_1()) {
	            return edge.getNode_1();
	        } else if (this != edge.getNode_2()) {
	            return edge.getNode_2();
	        } else
	            return null;
	    }
	
	 public Edge<T> searchEdge(Node<T> vertex) {
	        for (Edge<T> edge : edges) {
	            if (edge.getNode_1() == vertex) {
	                return edge;
	            } else if (edge.getNode_2() == vertex) {
	                return edge;
	            }
	        }
	        return null;
	 }
	
	
	
	
}
