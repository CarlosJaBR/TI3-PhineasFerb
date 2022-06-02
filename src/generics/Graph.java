package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Graph<T> {
	
	//Attributes
	private ArrayList<Node<T>> nodesList;
	private ArrayList<Edge<T>> edgesList;

	
	public Graph() {
		//To initialize the arraylist of vertex
		nodesList = new ArrayList<Node<T>>();
		
		//To initialize the arraylist of vertex
		edgesList = new ArrayList<Edge<T>>();
		
	}
	
	
	public void insertANode(T element) {
		Node<T> node = new Node<T>(element);
		nodesList.add(node);
	}
	
	public int get4() {
		return 4;
	}
	
	public Node<T> searchANode(T element) {
		
		Node<T> out = null;
		
		boolean stop = false;
		
		for(int i = 0;i<nodesList.size() && !stop;i++) {
			if(element.equals(nodesList.get(i).getElement())) {
				stop = true;
				out = nodesList.get(i);
			}
		}
		
		return out;
	}
	
	
	public boolean insertAEdge(int weight,T element_1, T element_2) {
		
		
		boolean out = false;
		
		Node<T> temp_1 =  searchANode(element_1);
		
		Node<T> temp_2 =  searchANode(element_2);
	
		if(temp_1 == null && temp_2 == null) {
			out = false;;
		}
		else if(temp_1 == temp_2) {
			
			Edge<T> edge = new Edge<T>(weight,temp_1,temp_2);
			
			edgesList.add(edge);
			
			temp_1.insertAEdge(edge);
			
			out = true;
			
		}
		else {
			
			
			Edge<T> edge = new Edge<T>(weight,temp_1,temp_2);
			
			temp_1.insertAEdge(edge);
			temp_2.insertAEdge(edge);
			
			edgesList.add(edge);
			
			out = true;
			
		}
		
		return out;
		
		
	}
	
	
	
	public boolean deleteANode(T element) {
		boolean out = false;
		
		Node<T> node = searchANode(element);
		
		if(node != null) {
			 removeANodeFromList(node);
			 node.delete();
			 out = true;		
		}
		
		return out;
	}
	
	
	private void removeANodeFromList(Node<T> n) {
		nodesList.remove(n);
	}
	
	public String showNodes() {
		String out = "[";
		System.out.println("G: "+nodesList.size());
		for(int i = 0; i<nodesList.size();i++) {
			if(i != nodesList.size()-1) {
				out += nodesList.get(i).toString()+",";
			}
			else {
				out += nodesList.get(i).toString()+"]";
			}
		}
		
		return out;
	}
	
	public String showEdges() {
		String out = "";
		
		for(int i = 0;i<edgesList.size();i++) {
			out += edgesList.get(i).toString()+"\n";
		}
		
		return out;
	}

	public Stack<Node<T>> dijkstraMethod(Node<T> node1, Node<T> node2){
		
		int[] distance = new int[nodesList.size()];
		Stack<Node<T>> out = new Stack<>();
		Node<T> stop = node2;
		PriorityQueue<Node<T>> setOfNodes = new PriorityQueue<>(nodesList.size(), new Comparator<Node<T>>() {
			@Override
			
			//This method calculate the priotiry between elements of queue.
			public int compare(Node<T> n1, Node<T> n2) {
				
				int indexN1 = nodesList.indexOf(n1);
				int indexN2 = nodesList.indexOf(n2);
				
				
				return distance[indexN1] - distance[indexN2];
			}
		});
		
		int indexNode1 = nodesList.indexOf(node1);
		
		distance[indexNode1] = 0; 
		
		//Configure the initial state. 
		
		for(int i = 0; i<nodesList.size();i++) {
			
			if(i!=indexNode1) {
				//In pseudocode is infinity
				distance[i] = Integer.MAX_VALUE;
			}
			nodesList.get(i).setPrev(null);
			setOfNodes.add(nodesList.get(i));
			
		}
		
		//Search minimum distance
		while(!setOfNodes.isEmpty()) {
			Node<T> aux = setOfNodes.poll();
			
			for(int i = 0; i<aux.getEdges().size();i++) {
				int cost = distance[i] + weightEdge(nodesList.get(i), aux);
				
				if(cost<distance[i]) {
					distance[i] = cost;
					nodesList.get(i).setPrev(aux);
					
					//Here we change the priority of node.
					setOfNodes.remove(nodesList.get(i));
					setOfNodes.add(nodesList.get(i));
				}
			}
		}
		
		//Here the answer of method is generated. 
		
		if(stop.getPrev()!=null) {
			while(stop!=null) {
				out.push(stop);
				stop.getPrev();
			}
		}
		
		
		return out; 
	}
	
	
	public int weightEdge(Node<T> n1, Node<T> n2) {
		//This method return the weight of edge. 
		return n1.searchEdgeInList(n2).getWeight();
	}

}
