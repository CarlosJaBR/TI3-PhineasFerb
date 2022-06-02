package model;

import application.Main;
import controller.DijkstraWindowController;
import controller.FloydWindowController;
import generics.Graph;
import generics.Node;

import model.City;

public class Controller {
	public Controller() {
		main = new Main();

		dijkstra = new DijkstraWindowController();

	}

	public String[] citys = { "Danville", "Buenos Aires", "Berlín", "Bruselas", "Brasília", "La Habana", "Quito",
			"Bogotá", "Moscú", "Varsovia", "Lisboa", "Londres", "Bucarest", "Belgrado", "Manila", "París", "Bangkok",
			"Ankara", "Pekín", "Santiago de Chile", "Panamá", "Lima", "Asunción", "Tokio", "Helsinki", "Ámsterdam",
			"Doha", "Praia", "Ottawa", "Viena", "Kuala Lumpur", "Ciudad de México", "Roma", "Washington D.C",
			"Estocolmo", "Berna", "Ciudad de Guatemala", "Atenas", "Puerto Principe", "Kiev", "Nueva Delhi", "Yakarta",
			"Nairobi", "San José", "Séul", "Oslo", "Madrid", "Budapest", "Wellington", "Caracas" };

	private Graph g;

	private Main main;

	private DijkstraWindowController dijkstra;

	private CityMap cityMap;
	
	private FloydWindowController floyd;

	
	//Retornar ciudad para cb end en dijkstra
	public City returnCityDInitial() {
		City cityCurrent = null;
		Node<City> node = null;
		String cbInitial = dijkstra.getCityStartCB().getValue();
		if (cbInitial.equals(citys[0])) {
			cityCurrent = cityMap.searchCityByName(citys[0]);
		} else if (cbInitial.equals(citys[1])) {
			cityCurrent = cityMap.searchCityByName(citys[1]);
		} else if (cbInitial.equals(citys[2])) {
			cityCurrent = cityMap.searchCityByName(citys[2]);
		} else if (cbInitial.equals(citys[3])) {
			cityCurrent = cityMap.searchCityByName(citys[3]);
		} else if (cbInitial.equals(citys[4])) {
			cityCurrent = cityMap.searchCityByName(citys[4]);
		} else if (cbInitial.equals(citys[5])) {
			cityCurrent = cityMap.searchCityByName(citys[5]);
		} else if (cbInitial.equals(citys[6])) {
			cityCurrent = cityMap.searchCityByName(citys[6]);
		} else if (cbInitial.equals(citys[7])) {
			cityCurrent = cityMap.searchCityByName(citys[7]);
		} else if (cbInitial.equals(citys[8])) {
			cityCurrent = cityMap.searchCityByName(citys[8]);
		} else if (cbInitial.equals(citys[9])) {
			cityCurrent = cityMap.searchCityByName(citys[9]);
		} else if (cbInitial.equals(citys[10])) {
			cityCurrent = cityMap.searchCityByName(citys[10]);
		} else if (cbInitial.equals(citys[11])) {
			cityCurrent = cityMap.searchCityByName(citys[11]);
		} else if (cbInitial.equals(citys[12])) {
			cityCurrent = cityMap.searchCityByName(citys[12]);
		} else if (cbInitial.equals(citys[13])) {
			cityCurrent = cityMap.searchCityByName(citys[13]);
		} else if (cbInitial.equals(citys[14])) {
			cityCurrent = cityMap.searchCityByName(citys[14]);
		} else if (cbInitial.equals(citys[15])) {
			cityCurrent = cityMap.searchCityByName(citys[15]);
		} else if (cbInitial.equals(citys[16])) {
			cityCurrent = cityMap.searchCityByName(citys[16]);
		} else if (cbInitial.equals(citys[17])) {
			cityCurrent = cityMap.searchCityByName(citys[17]);
		} else if (cbInitial.equals(citys[18])) {
			cityCurrent = cityMap.searchCityByName(citys[18]);
		} else if (cbInitial.equals(citys[19])) {
			cityCurrent = cityMap.searchCityByName(citys[19]);
		} else if (cbInitial.equals(citys[20])) {
			cityCurrent = cityMap.searchCityByName(citys[20]);
		} else if (cbInitial.equals(citys[21])) {
			cityCurrent = cityMap.searchCityByName(citys[21]);
		} else if (cbInitial.equals(citys[22])) {
			cityCurrent = cityMap.searchCityByName(citys[22]);
		} else if (cbInitial.equals(citys[23])) {
			cityCurrent = cityMap.searchCityByName(citys[23]);
		} else if (cbInitial.equals(citys[24])) {
			cityCurrent = cityMap.searchCityByName(citys[24]);
		} else if (cbInitial.equals(citys[25])) {
			cityCurrent = cityMap.searchCityByName(citys[25]);
		} else if (cbInitial.equals(citys[26])) {
			cityCurrent = cityMap.searchCityByName(citys[26]);
		} else if (cbInitial.equals(citys[27])) {
			cityCurrent = cityMap.searchCityByName(citys[27]);
		} else if (cbInitial.equals(citys[28])) {
			cityCurrent = cityMap.searchCityByName(citys[28]);
		} else if (cbInitial.equals(citys[29])) {
			cityCurrent = cityMap.searchCityByName(citys[29]);
		} else if (cbInitial.equals(citys[30])) {
			cityCurrent = cityMap.searchCityByName(citys[30]);
		} else if (cbInitial.equals(citys[31])) {
			cityCurrent = cityMap.searchCityByName(citys[31]);
		} else if (cbInitial.equals(citys[32])) {
			cityCurrent = cityMap.searchCityByName(citys[32]);
		} else if (cbInitial.equals(citys[33])) {
			cityCurrent = cityMap.searchCityByName(citys[33]);
		} else if (cbInitial.equals(citys[34])) {
			cityCurrent = cityMap.searchCityByName(citys[34]);
		} else if (cbInitial.equals(citys[35])) {
			cityCurrent = cityMap.searchCityByName(citys[35]);
		} else if (cbInitial.equals(citys[36])) {
			cityCurrent = cityMap.searchCityByName(citys[36]);
		} else if (cbInitial.equals(citys[37])) {
			cityCurrent = cityMap.searchCityByName(citys[37]);
		} else if (cbInitial.equals(citys[38])) {
			cityCurrent = cityMap.searchCityByName(citys[38]);
		} else if (cbInitial.equals(citys[39])) {
			cityCurrent = cityMap.searchCityByName(citys[39]);
		} else if (cbInitial.equals(citys[40])) {
			cityCurrent = cityMap.searchCityByName(citys[40]);
		} else if (cbInitial.equals(citys[41])) {
			cityCurrent = cityMap.searchCityByName(citys[41]);
		} else if (cbInitial.equals(citys[42])) {
			cityCurrent = cityMap.searchCityByName(citys[42]);
		} else if (cbInitial.equals(citys[43])) {
			cityCurrent = cityMap.searchCityByName(citys[43]);
		} else if (cbInitial.equals(citys[44])) {
			cityCurrent = cityMap.searchCityByName(citys[44]);
		} else if (cbInitial.equals(citys[45])) {
			cityCurrent = cityMap.searchCityByName(citys[45]);
		} else if (cbInitial.equals(citys[46])) {
			cityCurrent = cityMap.searchCityByName(citys[46]);
		} else if (cbInitial.equals(citys[47])) {
			cityCurrent = cityMap.searchCityByName(citys[47]);
		} else if (cbInitial.equals(citys[48])) {
			cityCurrent = cityMap.searchCityByName(citys[48]);
		} else if (cbInitial.equals(citys[49])) {
			cityCurrent = cityMap.searchCityByName(citys[49]);
		}
		return cityCurrent;
	}

	
	//Retornar ciudad para cb end en dijkstra
	public City returnCityDEnd() {
		City cityCurrent = null;
		Node<City> node = null;
		String cbEnd = dijkstra.getCityEndCB().getValue();
		if (cbEnd.equals(citys[0])) {
			cityCurrent = cityMap.searchCityByName(citys[0]);
		} else if (cbEnd.equals(citys[1])) {
			cityCurrent = cityMap.searchCityByName(citys[1]);
		} else if (cbEnd.equals(citys[2])) {
			cityCurrent = cityMap.searchCityByName(citys[2]);
		} else if (cbEnd.equals(citys[3])) {
			cityCurrent = cityMap.searchCityByName(citys[3]);
		} else if (cbEnd.equals(citys[4])) {
			cityCurrent = cityMap.searchCityByName(citys[4]);
		} else if (cbEnd.equals(citys[5])) {
			cityCurrent = cityMap.searchCityByName(citys[5]);
		} else if (cbEnd.equals(citys[6])) {
			cityCurrent = cityMap.searchCityByName(citys[6]);
		} else if (cbEnd.equals(citys[7])) {
			cityCurrent = cityMap.searchCityByName(citys[7]);
		} else if (cbEnd.equals(citys[8])) {
			cityCurrent = cityMap.searchCityByName(citys[8]);
		} else if (cbEnd.equals(citys[9])) {
			cityCurrent = cityMap.searchCityByName(citys[9]);
		} else if (cbEnd.equals(citys[10])) {
			cityCurrent = cityMap.searchCityByName(citys[10]);
		} else if (cbEnd.equals(citys[11])) {
			cityCurrent = cityMap.searchCityByName(citys[11]);
		} else if (cbEnd.equals(citys[12])) {
			cityCurrent = cityMap.searchCityByName(citys[12]);
		} else if (cbEnd.equals(citys[13])) {
			cityCurrent = cityMap.searchCityByName(citys[13]);
		} else if (cbEnd.equals(citys[14])) {
			cityCurrent = cityMap.searchCityByName(citys[14]);
		} else if (cbEnd.equals(citys[15])) {
			cityCurrent = cityMap.searchCityByName(citys[15]);
		} else if (cbEnd.equals(citys[16])) {
			cityCurrent = cityMap.searchCityByName(citys[16]);
		} else if (cbEnd.equals(citys[17])) {
			cityCurrent = cityMap.searchCityByName(citys[17]);
		} else if (cbEnd.equals(citys[18])) {
			cityCurrent = cityMap.searchCityByName(citys[18]);
		} else if (cbEnd.equals(citys[19])) {
			cityCurrent = cityMap.searchCityByName(citys[19]);
		} else if (cbEnd.equals(citys[20])) {
			cityCurrent = cityMap.searchCityByName(citys[20]);
		} else if (cbEnd.equals(citys[21])) {
			cityCurrent = cityMap.searchCityByName(citys[21]);
		} else if (cbEnd.equals(citys[22])) {
			cityCurrent = cityMap.searchCityByName(citys[22]);
		} else if (cbEnd.equals(citys[23])) {
			cityCurrent = cityMap.searchCityByName(citys[23]);
		} else if (cbEnd.equals(citys[24])) {
			cityCurrent = cityMap.searchCityByName(citys[24]);
		} else if (cbEnd.equals(citys[25])) {
			cityCurrent = cityMap.searchCityByName(citys[25]);
		} else if (cbEnd.equals(citys[26])) {
			cityCurrent = cityMap.searchCityByName(citys[26]);
		} else if (cbEnd.equals(citys[27])) {
			cityCurrent = cityMap.searchCityByName(citys[27]);
		} else if (cbEnd.equals(citys[28])) {
			cityCurrent = cityMap.searchCityByName(citys[28]);
		} else if (cbEnd.equals(citys[29])) {
			cityCurrent = cityMap.searchCityByName(citys[29]);
		} else if (cbEnd.equals(citys[30])) {
			cityCurrent = cityMap.searchCityByName(citys[30]);
		} else if (cbEnd.equals(citys[31])) {
			cityCurrent = cityMap.searchCityByName(citys[31]);
		} else if (cbEnd.equals(citys[32])) {
			cityCurrent = cityMap.searchCityByName(citys[32]);
		} else if (cbEnd.equals(citys[33])) {
			cityCurrent = cityMap.searchCityByName(citys[33]);
		} else if (cbEnd.equals(citys[34])) {
			cityCurrent = cityMap.searchCityByName(citys[34]);
		} else if (cbEnd.equals(citys[35])) {
			cityCurrent = cityMap.searchCityByName(citys[35]);
		} else if (cbEnd.equals(citys[36])) {
			cityCurrent = cityMap.searchCityByName(citys[36]);
		} else if (cbEnd.equals(citys[37])) {
			cityCurrent = cityMap.searchCityByName(citys[37]);
		} else if (cbEnd.equals(citys[38])) {
			cityCurrent = cityMap.searchCityByName(citys[38]);
		} else if (cbEnd.equals(citys[39])) {
			cityCurrent = cityMap.searchCityByName(citys[39]);
		} else if (cbEnd.equals(citys[40])) {
			cityCurrent = cityMap.searchCityByName(citys[40]);
		} else if (cbEnd.equals(citys[41])) {
			cityCurrent = cityMap.searchCityByName(citys[41]);
		} else if (cbEnd.equals(citys[42])) {
			cityCurrent = cityMap.searchCityByName(citys[42]);
		} else if (cbEnd.equals(citys[43])) {
			cityCurrent = cityMap.searchCityByName(citys[43]);
		} else if (cbEnd.equals(citys[44])) {
			cityCurrent = cityMap.searchCityByName(citys[44]);
		} else if (cbEnd.equals(citys[45])) {
			cityCurrent = cityMap.searchCityByName(citys[45]);
		} else if (cbEnd.equals(citys[46])) {
			cityCurrent = cityMap.searchCityByName(citys[46]);
		} else if (cbEnd.equals(citys[47])) {
			cityCurrent = cityMap.searchCityByName(citys[47]);
		} else if (cbEnd.equals(citys[48])) {
			cityCurrent = cityMap.searchCityByName(citys[48]);
		} else if (cbEnd.equals(citys[49])) {
			cityCurrent = cityMap.searchCityByName(citys[49]);
		}
		return cityCurrent;

	}
	
	public City returnCityFInitial() {
		City cityCurrent = null;
		Node<City> node = null;
		String cbInitial = floyd.getCityStartCB().getValue();
		if (cbInitial.equals(citys[0])) {
			cityCurrent = cityMap.searchCityByName(citys[0]);
		} else if (cbInitial.equals(citys[1])) {
			cityCurrent = cityMap.searchCityByName(citys[1]);
		} else if (cbInitial.equals(citys[2])) {
			cityCurrent = cityMap.searchCityByName(citys[2]);
		} else if (cbInitial.equals(citys[3])) {
			cityCurrent = cityMap.searchCityByName(citys[3]);
		} else if (cbInitial.equals(citys[4])) {
			cityCurrent = cityMap.searchCityByName(citys[4]);
		} else if (cbInitial.equals(citys[5])) {
			cityCurrent = cityMap.searchCityByName(citys[5]);
		} else if (cbInitial.equals(citys[6])) {
			cityCurrent = cityMap.searchCityByName(citys[6]);
		} else if (cbInitial.equals(citys[7])) {
			cityCurrent = cityMap.searchCityByName(citys[7]);
		} else if (cbInitial.equals(citys[8])) {
			cityCurrent = cityMap.searchCityByName(citys[8]);
		} else if (cbInitial.equals(citys[9])) {
			cityCurrent = cityMap.searchCityByName(citys[9]);
		} else if (cbInitial.equals(citys[10])) {
			cityCurrent = cityMap.searchCityByName(citys[10]);
		} else if (cbInitial.equals(citys[11])) {
			cityCurrent = cityMap.searchCityByName(citys[11]);
		} else if (cbInitial.equals(citys[12])) {
			cityCurrent = cityMap.searchCityByName(citys[12]);
		} else if (cbInitial.equals(citys[13])) {
			cityCurrent = cityMap.searchCityByName(citys[13]);
		} else if (cbInitial.equals(citys[14])) {
			cityCurrent = cityMap.searchCityByName(citys[14]);
		} else if (cbInitial.equals(citys[15])) {
			cityCurrent = cityMap.searchCityByName(citys[15]);
		} else if (cbInitial.equals(citys[16])) {
			cityCurrent = cityMap.searchCityByName(citys[16]);
		} else if (cbInitial.equals(citys[17])) {
			cityCurrent = cityMap.searchCityByName(citys[17]);
		} else if (cbInitial.equals(citys[18])) {
			cityCurrent = cityMap.searchCityByName(citys[18]);
		} else if (cbInitial.equals(citys[19])) {
			cityCurrent = cityMap.searchCityByName(citys[19]);
		} else if (cbInitial.equals(citys[20])) {
			cityCurrent = cityMap.searchCityByName(citys[20]);
		} else if (cbInitial.equals(citys[21])) {
			cityCurrent = cityMap.searchCityByName(citys[21]);
		} else if (cbInitial.equals(citys[22])) {
			cityCurrent = cityMap.searchCityByName(citys[22]);
		} else if (cbInitial.equals(citys[23])) {
			cityCurrent = cityMap.searchCityByName(citys[23]);
		} else if (cbInitial.equals(citys[24])) {
			cityCurrent = cityMap.searchCityByName(citys[24]);
		} else if (cbInitial.equals(citys[25])) {
			cityCurrent = cityMap.searchCityByName(citys[25]);
		} else if (cbInitial.equals(citys[26])) {
			cityCurrent = cityMap.searchCityByName(citys[26]);
		} else if (cbInitial.equals(citys[27])) {
			cityCurrent = cityMap.searchCityByName(citys[27]);
		} else if (cbInitial.equals(citys[28])) {
			cityCurrent = cityMap.searchCityByName(citys[28]);
		} else if (cbInitial.equals(citys[29])) {
			cityCurrent = cityMap.searchCityByName(citys[29]);
		} else if (cbInitial.equals(citys[30])) {
			cityCurrent = cityMap.searchCityByName(citys[30]);
		} else if (cbInitial.equals(citys[31])) {
			cityCurrent = cityMap.searchCityByName(citys[31]);
		} else if (cbInitial.equals(citys[32])) {
			cityCurrent = cityMap.searchCityByName(citys[32]);
		} else if (cbInitial.equals(citys[33])) {
			cityCurrent = cityMap.searchCityByName(citys[33]);
		} else if (cbInitial.equals(citys[34])) {
			cityCurrent = cityMap.searchCityByName(citys[34]);
		} else if (cbInitial.equals(citys[35])) {
			cityCurrent = cityMap.searchCityByName(citys[35]);
		} else if (cbInitial.equals(citys[36])) {
			cityCurrent = cityMap.searchCityByName(citys[36]);
		} else if (cbInitial.equals(citys[37])) {
			cityCurrent = cityMap.searchCityByName(citys[37]);
		} else if (cbInitial.equals(citys[38])) {
			cityCurrent = cityMap.searchCityByName(citys[38]);
		} else if (cbInitial.equals(citys[39])) {
			cityCurrent = cityMap.searchCityByName(citys[39]);
		} else if (cbInitial.equals(citys[40])) {
			cityCurrent = cityMap.searchCityByName(citys[40]);
		} else if (cbInitial.equals(citys[41])) {
			cityCurrent = cityMap.searchCityByName(citys[41]);
		} else if (cbInitial.equals(citys[42])) {
			cityCurrent = cityMap.searchCityByName(citys[42]);
		} else if (cbInitial.equals(citys[43])) {
			cityCurrent = cityMap.searchCityByName(citys[43]);
		} else if (cbInitial.equals(citys[44])) {
			cityCurrent = cityMap.searchCityByName(citys[44]);
		} else if (cbInitial.equals(citys[45])) {
			cityCurrent = cityMap.searchCityByName(citys[45]);
		} else if (cbInitial.equals(citys[46])) {
			cityCurrent = cityMap.searchCityByName(citys[46]);
		} else if (cbInitial.equals(citys[47])) {
			cityCurrent = cityMap.searchCityByName(citys[47]);
		} else if (cbInitial.equals(citys[48])) {
			cityCurrent = cityMap.searchCityByName(citys[48]);
		} else if (cbInitial.equals(citys[49])) {
			cityCurrent = cityMap.searchCityByName(citys[49]);
		}
		return cityCurrent;
	}

	
	//Retornar ciudad para cb end en Floyd
	public City returnCityFEnd() {
		City cityCurrent = null;
		Node<City> node = null;
		String cbEnd = floyd.getCityEndCB().getValue();
		if (cbEnd.equals(citys[0])) {
			cityCurrent = cityMap.searchCityByName(citys[0]);
		} else if (cbEnd.equals(citys[1])) {
			cityCurrent = cityMap.searchCityByName(citys[1]);
		} else if (cbEnd.equals(citys[2])) {
			cityCurrent = cityMap.searchCityByName(citys[2]);
		} else if (cbEnd.equals(citys[3])) {
			cityCurrent = cityMap.searchCityByName(citys[3]);
		} else if (cbEnd.equals(citys[4])) {
			cityCurrent = cityMap.searchCityByName(citys[4]);
		} else if (cbEnd.equals(citys[5])) {
			cityCurrent = cityMap.searchCityByName(citys[5]);
		} else if (cbEnd.equals(citys[6])) {
			cityCurrent = cityMap.searchCityByName(citys[6]);
		} else if (cbEnd.equals(citys[7])) {
			cityCurrent = cityMap.searchCityByName(citys[7]);
		} else if (cbEnd.equals(citys[8])) {
			cityCurrent = cityMap.searchCityByName(citys[8]);
		} else if (cbEnd.equals(citys[9])) {
			cityCurrent = cityMap.searchCityByName(citys[9]);
		} else if (cbEnd.equals(citys[10])) {
			cityCurrent = cityMap.searchCityByName(citys[10]);
		} else if (cbEnd.equals(citys[11])) {
			cityCurrent = cityMap.searchCityByName(citys[11]);
		} else if (cbEnd.equals(citys[12])) {
			cityCurrent = cityMap.searchCityByName(citys[12]);
		} else if (cbEnd.equals(citys[13])) {
			cityCurrent = cityMap.searchCityByName(citys[13]);
		} else if (cbEnd.equals(citys[14])) {
			cityCurrent = cityMap.searchCityByName(citys[14]);
		} else if (cbEnd.equals(citys[15])) {
			cityCurrent = cityMap.searchCityByName(citys[15]);
		} else if (cbEnd.equals(citys[16])) {
			cityCurrent = cityMap.searchCityByName(citys[16]);
		} else if (cbEnd.equals(citys[17])) {
			cityCurrent = cityMap.searchCityByName(citys[17]);
		} else if (cbEnd.equals(citys[18])) {
			cityCurrent = cityMap.searchCityByName(citys[18]);
		} else if (cbEnd.equals(citys[19])) {
			cityCurrent = cityMap.searchCityByName(citys[19]);
		} else if (cbEnd.equals(citys[20])) {
			cityCurrent = cityMap.searchCityByName(citys[20]);
		} else if (cbEnd.equals(citys[21])) {
			cityCurrent = cityMap.searchCityByName(citys[21]);
		} else if (cbEnd.equals(citys[22])) {
			cityCurrent = cityMap.searchCityByName(citys[22]);
		} else if (cbEnd.equals(citys[23])) {
			cityCurrent = cityMap.searchCityByName(citys[23]);
		} else if (cbEnd.equals(citys[24])) {
			cityCurrent = cityMap.searchCityByName(citys[24]);
		} else if (cbEnd.equals(citys[25])) {
			cityCurrent = cityMap.searchCityByName(citys[25]);
		} else if (cbEnd.equals(citys[26])) {
			cityCurrent = cityMap.searchCityByName(citys[26]);
		} else if (cbEnd.equals(citys[27])) {
			cityCurrent = cityMap.searchCityByName(citys[27]);
		} else if (cbEnd.equals(citys[28])) {
			cityCurrent = cityMap.searchCityByName(citys[28]);
		} else if (cbEnd.equals(citys[29])) {
			cityCurrent = cityMap.searchCityByName(citys[29]);
		} else if (cbEnd.equals(citys[30])) {
			cityCurrent = cityMap.searchCityByName(citys[30]);
		} else if (cbEnd.equals(citys[31])) {
			cityCurrent = cityMap.searchCityByName(citys[31]);
		} else if (cbEnd.equals(citys[32])) {
			cityCurrent = cityMap.searchCityByName(citys[32]);
		} else if (cbEnd.equals(citys[33])) {
			cityCurrent = cityMap.searchCityByName(citys[33]);
		} else if (cbEnd.equals(citys[34])) {
			cityCurrent = cityMap.searchCityByName(citys[34]);
		} else if (cbEnd.equals(citys[35])) {
			cityCurrent = cityMap.searchCityByName(citys[35]);
		} else if (cbEnd.equals(citys[36])) {
			cityCurrent = cityMap.searchCityByName(citys[36]);
		} else if (cbEnd.equals(citys[37])) {
			cityCurrent = cityMap.searchCityByName(citys[37]);
		} else if (cbEnd.equals(citys[38])) {
			cityCurrent = cityMap.searchCityByName(citys[38]);
		} else if (cbEnd.equals(citys[39])) {
			cityCurrent = cityMap.searchCityByName(citys[39]);
		} else if (cbEnd.equals(citys[40])) {
			cityCurrent = cityMap.searchCityByName(citys[40]);
		} else if (cbEnd.equals(citys[41])) {
			cityCurrent = cityMap.searchCityByName(citys[41]);
		} else if (cbEnd.equals(citys[42])) {
			cityCurrent = cityMap.searchCityByName(citys[42]);
		} else if (cbEnd.equals(citys[43])) {
			cityCurrent = cityMap.searchCityByName(citys[43]);
		} else if (cbEnd.equals(citys[44])) {
			cityCurrent = cityMap.searchCityByName(citys[44]);
		} else if (cbEnd.equals(citys[45])) {
			cityCurrent = cityMap.searchCityByName(citys[45]);
		} else if (cbEnd.equals(citys[46])) {
			cityCurrent = cityMap.searchCityByName(citys[46]);
		} else if (cbEnd.equals(citys[47])) {
			cityCurrent = cityMap.searchCityByName(citys[47]);
		} else if (cbEnd.equals(citys[48])) {
			cityCurrent = cityMap.searchCityByName(citys[48]);
		} else if (cbEnd.equals(citys[49])) {
			cityCurrent = cityMap.searchCityByName(citys[49]);
		}
		return cityCurrent;

	}


}
