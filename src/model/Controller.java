package model;


import java.util.Stack;

import generics.Node;


public class Controller {
	
	private CityMap cityMap;
	
	
	public Controller() {
	

		cityMap = new CityMap();

	}
	
	public Stack<Node<String>> dijktraAlgorothm(String name1, String name2){
		return cityMap.dijkstraAlgotithm(name1, name2);
	}



}
