package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import generics.Graph;
import generics.Node;

public class GraphTest {
	
	private Graph<Integer> g; 

	
	
	public void setUpStage1() {
		g = new Graph<Integer>();
	
		g.insertANode(1);
		
		
	}
	
	public void setUpStage2() {
		g = new Graph<Integer>();
		
		for(int i = 0;i<1000;i++) {
			g.insertANode(i+1);
		}
	}
	
	public void setUpStage3() {
		g = new Graph<Integer>();
		
		g.insertANode(1);
		g.insertANode(2);
		g.insertANode(3);
		g.insertANode(4);
		g.insertANode(5);
		
		g.insertAEdge(15, 1, 2);
		g.insertAEdge(1, 2, 5);
		g.insertAEdge(2, 5, 4);
		g.insertAEdge(14, 4, 2);
		g.insertAEdge(3, 4, 3);
		g.insertAEdge(12, 3, 2);
		g.insertAEdge(11, 3, 1);
	
	}
	
	@Test
	public void testSearchANode() {
		setUpStage1();
		
		assertSame(1,g.searchANode(1).getElement());
		
		
	}
	
	@Test
	public void testInsertANode() {
		
		setUpStage1();
		
		
		Node<Integer> expected = new Node<Integer>(1);
		
		assertSame(expected.getElement(),g.searchANode(1).getElement());
	}
	
	@Test
	public void testDeleteANode() {
		
		setUpStage2();
		
		g.deleteANode(5);
		
		assertNull(g.searchANode(5));
	}
	
	@Test
	public void testInsertAEdge() {
		
		setUpStage2();

		g.insertANode(5);
		g.insertANode(6);
		g.insertANode(7);
		g.insertANode(8);
		g.insertANode(9);
		
		
		assertTrue(g.insertAEdge(20,5,500));
		
		
	}
	
	@Test
	public void testFloydWarshallAlgorithm() {
		setUpStage3();
		
		int [][] expected = {
				{0,15,11,14,16},
				{15,0,6,3,1},
				{11,6,0,3,5},
				{14,3,3,0,2},
				{16,1,5,2,0}
		};
		
		assertArrayEquals(expected,g.floyd_Warshall_Algorithm());
	}
}
