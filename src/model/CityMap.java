package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import generics.Graph;
import generics.Node;


public class CityMap {

	// Graph city
	private Graph<City> mapC;

	// CSV
	private final String SEPARATOR = ";";

	private final String FILE = "data/map_citys.csv";

	private ArrayList<City> citysArrayList;

	public CityMap(Graph<City> mapC) throws IOException {
		this.mapC = new Graph<>();
		// Import

		citysArrayList = new ArrayList<>();
		importMap();

	}

	private void addCity(City city) {
		// adds a new city as a node in the network
		mapC.insertANode(city);

	}

	public void importMap() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(FILE));
		String line;

		while ((line = br.readLine()) != null) {
			insertCityAdjacent(line);

		}
	}

	private void insertCityAdjacent(String adjacent) {
		String[] adjacentCitys = adjacent.split(SEPARATOR);

		City city = new City(adjacentCitys[0]);

		// looks for if that city exists, if not, then the method returns null and then
		// we proceed to enter the city to the network.

		if (mapC.searchANode(city) == null) {
			addCity(city);
			if (searchCity(city) == null) {
				citysArrayList.add(city);
			}
		}

		for (int i = 1; i < adjacentCitys.length; i = (i + 2)) {
			// Nueva ciudad adyacente
			City cityAdjacent = new City(adjacentCitys[i + 1]);

			// Tiempo que se demora- Peso de la arista
			int time = Integer.parseInt(adjacentCitys[i]);

			// looks for if that city exists, if not, then the method returns null and then
			// we proceed to enter the city to the network.
			if (mapC.searchANode(cityAdjacent) == null) {
				addCity(cityAdjacent);
				if (searchCity(cityAdjacent) == null) {
					citysArrayList.add(cityAdjacent);
				}

			}
			//
			if (mapC.searchANode(city).searchEdge(mapC.searchANode(cityAdjacent)) == null) {
				mapC.insertAEdge(time, city, cityAdjacent);
			}
		}
	}

	private City searchCity(City city) {
		if (!citysArrayList.isEmpty()) {

			for (int i = 0; i < citysArrayList.size(); i++) {

				if (city.equals(citysArrayList.get(i))) {
					return citysArrayList.get(i);
				}

			}
		}

		return null;

	}
	
	
	
	public City searchCityByName(String name){
		for(int i=0;i<citysArrayList.size();i++) {
			if(name.equals(citysArrayList.get(i).getName())) {
				return citysArrayList.get(i);
			}
		}
		
		return null;
	}

	/*
	 * private ArrayList<String> minimumWeightDijkstra(City initialC, City finalC) {
	 * 
	 * ArrayList<String> out = new ArrayList<>();
	 * 
	 * //Buscar ciudad inicial NodeV<City> initial =mapC.searchANode(initialC);
	 * //Buscar ciudad final NodeV<City> finall= mapC.searchANode(finalC);
	 * 
	 * Stack<NodeV<City>> minimumWeight =mapC.dijkstraMethod(initial,finall);
	 * 
	 * 
	 * return out;
	 * 
	 * }
	 */

}
