package garrage;
import java.util.*;


import java.util.function.*;
import java.util.stream.Collectors;

import weightedgraph.Maingraph;
import weightedgraph.firstgraph;;


public class dijkstra   
{  
	Scanner sc=new Scanner(System.in);
	 int whirl;
	 int source;
	 int two;
	static final int totalVertex = 8; 
	
	int minimumDistance(int distance[], Boolean spSet[])  
	{  
		int m = Integer.MAX_VALUE, m_index = -1;  
		  
		for (int vx = 0; vx < totalVertex; vx++)  
		{  
			if (spSet[vx] == false && distance[vx] <= m)   
			{  
				m = distance[vx];  
				m_index = vx;  
			}  
		}  
		return m_index;	  
	}
	void conditions(int source,int distance[], int n, firstgraph g,String a,String b)  
	{	
			this.source=source; 
			List<Integer> list=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				
			if(a.equalsIgnoreCase("E"))
			{
				if( j%2==0 && distance[j]!=0 && g.getNodes().get(j).isAvail()==true)
		    		
				   {
			    		list.add(distance[j]);			    		
			       }
			}
			else
			  {
				
				if(j%2!=0 && distance[j]!=0 && g.getNodes().get(j).isAvail()==true )
			    	
			    	   list.add(distance[j]);
		      
			  }
		
	       }
			
			if(b.equalsIgnoreCase("F"))
			{
				 Predicate<Integer> Fourwheeler = four->four%3==0;
				 List<Integer> Streamlist=list.stream().filter(Fourwheeler).collect(Collectors.toList());
				 spot(Streamlist, distance, g);
				 
			}
			else
		
		spot(list, distance, g);

	}
	
	public void dij(int s, int graph[][],firstgraph g,String a,String b)  
	{   
		this.source=s;
		int distance[] = new int[totalVertex]; 
	  
		Boolean spSet[] = new Boolean[totalVertex];  
		
		for (int j = 0; j < totalVertex; j++)   
		{  
			distance[j] = Integer.MAX_VALUE;  
			spSet[j] = false;  
		}  
		distance[s] = 0;  
		for (int cnt = 0; cnt < totalVertex - 1; cnt++)   
		{   
		int ux = minimumDistance(distance, spSet);  
		spSet[ux] = true;  		 
		for (int vx = 0; vx < totalVertex; vx++)  	  
			if (!spSet[vx] && graph[ux][vx] != -1 && distance[ux] != Integer.MAX_VALUE && distance[ux] + graph[ux][vx] < distance[vx])  
			{  
				distance[vx] = distance[ux] + graph[ux][vx]; 
				
			}  
		
		}  		
		
		
		 conditions(source,distance, totalVertex,g,a,b);  //call to function conditions		
	}  
	
	public void avail(int a,firstgraph g,int k)
	{   
		
		if(a==1)
		{
	     g.getNodes().get(k).setAvail(false);
	     displayavailability(g,k);
		}
	
	}
	
	void displayavailability(firstgraph g,int k)
	{
		if(g.getNodes().get(k).isAvail()==false)
		{
			System.out.println("This spot is filled now");
				
		}		
		
	}
	
	public void spot(List<Integer> list,int distance[],firstgraph g)
	{    
		int ch=0,nearestSpot=99;
		if(list.isEmpty())
		{
			System.out.println("Sorry!No spots are available right now");
			
		}
		else
			
	{	
		Collections.sort(list);
		
		do
		{  
		
			for(int i=0;i<list.size();i++)
			 {
				 for(int j=0;j<distance.length;j++)
				 {    
					 if(list.get(i)==distance[j])
					 {
						 System.out.println("\nYour Nearest Parking spot is " + g.getNodes().get(j) + " At a distance of " + distance[j] + "kms");
						 nearestSpot=j;
						 System.out.println("\nPress 1 to confirm your parking spot\nPress 2 for other parking spot\nPress 3 to exit the app");
						 ch=sc.nextInt();
						 
	                    }
				 }
				 
				 if(ch==1)
                 {
               	  avail(ch,g,nearestSpot);
               	 break;
               	
                 }
				 
				 else  if(ch==3)
	         {
	        	  exit(1);
	         }
			 
			
			 }
				
		}while(ch==2);
	}
}
	private void exit(int i)
	{

	        if(i==1)
		{
			System.out.println("\nTHANKYOU FOR USING OUR APP!");
			System.exit(i);
		}
	}
}
	