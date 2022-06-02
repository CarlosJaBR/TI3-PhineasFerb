package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import generics.Graph;
import generics.Node;



public class CityMap {

	// Graph city
	private Graph<String> graph;

	public CityMap() {
			
		graph = new Graph<String>();
	
		try {
			importData();
			addEdges();
			//importMap();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public void importData() throws IOException {
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data/JustCities.csv"));
		String line;
		
		while((line = br.readLine())!= null) {
			addACity(line.toUpperCase()); 
		}
		
	}

	public void addEdges() throws IOException{
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("data/DirectedModificed.csv"));
		String line;
		
		while((line = br.readLine())!= null) {
		
			
			String[] edge = line.split(",");
			
			
			
			
			//City c1 = new City(edge[0]);
			int width = Integer.parseInt(edge[1]);
			//City c2 = new City(edge[2]);
			
		
			
			graph.insertAEdge(width, edge[0].toUpperCase(), edge[2].toUpperCase());
		
			
		}
	}
	
	private void addACity(String name) {
		//City city = new City(name);
		graph.insertANode(name.toUpperCase());
	}
	
	public Stack<Node<String>> dijkstraAlgotithm(String name1, String name2){
		
		
		return graph.dijkstraAlgorithm(name1, name2);
	}
	
	public int floydWarshalll(String name1, String name2) {
		
		int [][] s = graph.floyd_Warshall_Algorithm();
		
		int index_1 = graph.searchANodeReturnIndex(name1);
		int index_2 = graph.searchANodeReturnIndex(name2);
		
		
		return s[index_1][index_2];
		
	}

}
