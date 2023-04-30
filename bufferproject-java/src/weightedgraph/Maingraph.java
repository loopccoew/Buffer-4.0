package weightedgraph;

import java.util.Scanner;
import garrage.dijkstra;

public class Maingraph
{   
	Scanner sc=new Scanner(System.in);
public void NodeA() 
	{
     
    firstgraph g=new firstgraph();
	
	
	g.addNode(0,"Bavdhan");
	g.addNode(1,"P1");
	g.addNode(2,"P2");
	g.addNode(3,"P3");
	g.addNode(4,"P4");
	g.addNode(5,"P5");
	g.addNode(6,"P6");
	g.addNode(7,"P7");
	
	g.addEdge(0, 1, 2);
    g.addEdge(0,4, 5);
    g.addEdge(0, 3, 3);
    g.addEdge(1, 2, 4);
    g.addEdge(2, 3, 6);
    g.addEdge(3, 4, 2);
    g.addEdge(0, 7, 1);
    g.addEdge(4, 5, 7);
    g.addEdge(5, 6, 3);
    g.addEdge(6, 2, 8);
    g.addEdge(7, 4, 6);
    
    int grph[][] = new int[][] { 
	    {-1,2,-1,3,5,-1,-1,1},
		{2,-1,4,-1,-1,-1,-1,-1},
		{-1,4,-1,6,-1,-1,-1,-1},
		{3,-1,6,-1,2,-1,-1,-1},
		{5,-1,-1,2,-1,7,-1,6},
		{-1,-1,-1,-1,7,-1,3,-1},
		{-1,-1,8,-1,-1,3,-1,-1},
		{1,-1,-1,-1,6,-1,-1,-1}};
		
		
		
			
		ask(grph,g);	
	
		
	
	}

public void NodeB()
 {
	firstgraph g=new firstgraph();
	
	
	g.addNode(0,"Kothrud");
	g.addNode(1,"P1");
	g.addNode(2,"P2");
	g.addNode(3,"P3");
	g.addNode(4,"P4");
	g.addNode(5,"P5");
	g.addNode(6,"P6");
	g.addNode(7,"P7");
	
	g.addEdge(0, 1, 2);
    g.addEdge(0,4, 5);
    g.addEdge(0, 3, 3);
    g.addEdge(1, 2, 4);
    g.addEdge(2, 3, 6);
    g.addEdge(3, 4, 2);
    g.addEdge(0, 7, 1);
    g.addEdge(4, 5, 7);
    g.addEdge(5, 6, 3);
    g.addEdge(6, 2, 8);
    g.addEdge(7, 4, 6);
    
    
 
int grph[][] = new int[][] { 
    {-1,3,-1,4,5,-1,-1,2},
	{3,-1,2,-1,-1,-1,-1,-1},
	{-1,2,-1,5,-1,-1,4,-1},
	{4,-1,5,-1,6,-1,-1,-1},
	{5,-1,-1,6,-1,4,-1,6},
	{-1,-1,-1,-1,4,-1,3,-1},
	{-1,-1,4,-1,-1,3,-1,-1},
	{2,-1,-1,-1,6,-1,-1,-1}};
  
	ask(grph,g);

 }
 public void NodeC()
 {
	 firstgraph g=new firstgraph();
		
		g.addNode(0,"Karvenagar");
		g.addNode(1,"P1");
		g.addNode(2,"P2");
		g.addNode(3,"P3");
		g.addNode(4,"P4");
		g.addNode(5,"P5");
		g.addNode(6,"P6");
		g.addNode(7,"P7");
		
		g.addEdge(0, 1, 2);
	    g.addEdge(0,4, 5);
	    g.addEdge(0, 3, 3);
	    g.addEdge(1, 2, 4);
	    g.addEdge(2, 3, 6);
	    g.addEdge(3, 4, 2);
	    g.addEdge(0, 7, 1);
	    g.addEdge(4, 5, 7);
	    g.addEdge(5, 6, 3);
	    g.addEdge(6, 2, 8);
	    g.addEdge(7, 4, 6);
	    
	    int grph[][] = new int[][] { 
		    {-1,1,-1,1,3,-1,-1,7},
			{1,-1,2,-1,-1,-1,-1,-1},
			{-1,2,-1,5,-1,-1,3,-1},
			{1,-1,5,-1,2,-1,-1,-1},
			{3,-1,-1,2,-1,5,-1,6},
			{-1,-1,-1,-1,5,-1,4,-1},
			{-1,-1,3,-1,-1,4,-1,-1},
			{7,-1,-1,-1,6,-1,-1,-1}};
	    
			ask(grph,g);
	 
	 
 }
 
 public void NodeD()
 { 
	 firstgraph g=new firstgraph();
			
		g.addNode(0,"Warje");
		g.addNode(1,"P1");
		g.addNode(2,"P2");
		g.addNode(3,"P3");
		g.addNode(4,"P4");
		g.addNode(5,"P5");
		g.addNode(6,"P6");
		g.addNode(7,"P7");
		
		g.addEdge(0, 1, 2);
	    g.addEdge(0,4, 5);
	    g.addEdge(0, 3, 3);
	    g.addEdge(1, 2, 4);
	    g.addEdge(2, 3, 6);
	    g.addEdge(3, 4, 2);
	    g.addEdge(0, 7, 1);
	    g.addEdge(4, 5, 7);
	    g.addEdge(5, 6, 3);
	    g.addEdge(6, 2, 8);
	    g.addEdge(7, 4, 6);
	    
	   
	    
	    int grph[][] = new int[][] { 
		    {-1,3,-1,2,-1,-1,-1,4},
			{3,-1,1,-1,-1,-1,-1,-1},
			{-1,1,-1,5,-1,-1,6,-1},
			{2,-1,5,-1,-1,-1,4,3},
			{-1,-1,-1,-1,-1,1,-1,2},
			{-1,-1,-1,-1,1,-1,2,-1},
			{-1,-1,6,4,-1,2,-1,-1},
			{4,-1,-1,3,2,-1,-1,-1}};
	    
	    
	 
			ask(grph,g);
	 
	 
 }
 
 public void ask(int grph[][],firstgraph g)
 {  
	 System.out.println("\nWhat is today's date?\nPress E for Even and O for Odd(E/O):");
	 String a=sc.next();
	 System.out.println("\nWhat type is your vehicle?\nPress T for two-wheeler and F for four-wheeler(T/F) ");
	 String b=sc.next();
     dijkstra obj=new dijkstra();  
     obj.dij( 0,grph,g,a,b); 
    
 }

}

