package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Graph<T> {
	
	final static int INF = 9999;

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
	
	public int searchANodeReturnIndex(T element) {
		
		int out = -1;
		
		boolean stop = false;
	
	
		for(int i = 0;i<nodesList.size() && !stop;i++) {
			
			if(element.equals(nodesList.get(i).getElement())) {
				stop = true;
				out = i;
			}
			
			
		}
		
		return out;
	}
	
	
	
	
	public boolean insertAEdge(int weight,T element_1, T element_2) {
	
		boolean out = false;
		
		Node<T> temp_1 = searchANode(element_1);
		
		Node<T> temp_2 = searchANode(element_2);
		
		if(temp_1 == null && temp_2 == null) {
			out = false;
		}
		else if(temp_1 == temp_2) {
			
			Edge<T> edge = new Edge<T>(weight,temp_1,temp_2);
			
			edgesList.add(edge);
			
			
			temp_1.insertAEdge(edge);
			
			out = true;
			
		}
		else {
			
			Edge<T> edge_1 = new Edge<T>(weight,temp_1,temp_2);
			Edge<T> edge_2 = new Edge<T>(weight,temp_2,temp_1);
			
			temp_1.insertAEdge(edge_1);
			temp_2.insertAEdge(edge_2);
			
			edgesList.add(edge_1);
			
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
	
	

	public Stack<Node<T>> dijkstraAlgorithm(T start, T end){
		
		Node<T> startNode = searchANode(start);
		Node<T> endNode = searchANode(end);
		
		Stack<Node<T>> minimusRoute = new Stack<Node<T>>();
	
	
		PriorityQueue<Node<T>> setOfNodes = new PriorityQueue<Node<T>>(edgesList.size(), createComparator());

		startNode.setDistance(0);
		setOfNodes .add(startNode);
        startNode.setPrev(null);
        
      
        for(int i = 0;i<nodesList.size();i++) {
        	
        	if(nodesList.get(i) != startNode) {
        		nodesList.get(i).setDistance(INF);
        		nodesList.get(i).setPrev(null);
        		setOfNodes .add(nodesList.get(i));
        	}
        }
       
        boolean stop = false;
        
        while (stop == false) {
            Node<T> temp = setOfNodes .poll();
            
            ArrayList<Node<T>> list = temp.getneighbours();
            
            for(int i = 0;i<list.size();i++) {
            	
            	int cost = temp.getDistance() + distanceBetweenTwoNodes(temp,list.get(i));
            	
            	if(cost < list.get(i).getDistance()) {
            		list.get(i).setDistance(cost);
            		list.get(i).setPrev(temp);
            		
            		setOfNodes.remove(list.get(i));
            		setOfNodes.add(list.get(i));
            	}
            }
            
            
            if(setOfNodes.isEmpty() == true) {
            	stop = true;
            }
        }

        
        Node<T> temp = endNode;
        if (temp .getPrev() != null || temp  == endNode) {
            while (temp != null) {
            	minimusRoute.push(temp);
            	temp  = temp.getPrev();
            }

        }

        return minimusRoute;
	}
	
	
	public  int [][]  floyd_Warshall_Algorithm() {
		
		
		int [][] distanceMatrix = distanceMatrix();
	
		
		for(int k = 0;k<nodesList.size();k++) {
			for(int i = 0;i<nodesList.size();i++) {
				for(int j = 0;j<nodesList.size();j++) {
		
					if(distanceMatrix[i][k] + distanceMatrix[k][j] < distanceMatrix[i][j]) {
				
						distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
					
					}
				
				}
			}
		}
		
		return distanceMatrix;
		

	}
	
	private int [][] distanceMatrix() {
		int distanceMatrix [][] = new int[nodesList.size()][nodesList.size()];
		
		for(int i = 0;i<distanceMatrix.length;i++) {
			for(int j = 0;j<distanceMatrix[0].length;j++) {
				
				Node<T> node_1 = nodesList.get(i);
				Node<T> node_2 = nodesList.get(j);
				
				if(node_1 == node_2) {
					distanceMatrix[i][j] = 0;
				}
				else {
					ArrayList<Edge<T>> edges_1 = node_1.getEdges();
					
					//To look for node_2 in the edges of node_1
					boolean find = false;
					for(int k = 0;k<edges_1.size();k++) {
			
						if(edges_1.get(k).getNode_2() == node_2) {
								
							distanceMatrix[i][j] = edges_1.get(k).getWeight();
							find = true;
						
						}
					}
					
					if(find == false) {
						distanceMatrix[i][j] = INF;
					}
				}
			}
		}
		
		return distanceMatrix;
		
	}
	
	
	public int weightEdge(Node<T> n1, Node<T> n2) {
	
		return n1.searchEdgeInList(n2).getWeight();
		
	}

	public ArrayList<Node<T>> getNodesList(){
		return nodesList;
	}
	private Comparator<Node<T>> createComparator(){
        Comparator<Node<T>> comparator = new Comparator<Node<T>>() {

            @Override
            public int compare(Node<T> o1, Node<T> o2) {

                return o1.getDistance()-o2.getDistance();
            }

        };

        return comparator;
    }
	
	private int distanceBetweenTwoNodes(Node<T> o1, Node<T> o2) {
		int out = o1.searchEdge(o2).getWeight();
        return out;
    }
}
