import java.security.KeyStore.Entry;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.io.*;


class Node{
	int data;
	Node lc,rc;
	String c;
	
	public Node (int d,String ch)//parameterized constructor
	{
		lc=null;
		rc=null;
		data=d;
		c=ch;
	}
	
	public boolean isLeaf() {
        return (lc == null && rc == null);
    }
}


class arrobj
{
	int key;
	int value;
	String code;
	public arrobj(int k, int v, String code) 
	{
		key=k;
		value=v;
		code = null;
	}
	
	public arrobj(int v) 
	{
		value=v;
	}
}

class Tree{
//	private Node root;
	static Node root,prev_root;
	//static huffman obj = null;
	Stack<Node> stk=new Stack<Node>();
	
	static Path path = Paths.get("output4.txt");
	
	static File myObj = new File("output4.txt");
	
	void create()
	{
		ArrayList<arrobj> duplicate = new ArrayList<>(huffman.characs);
	
		System.out.println("Tree creation in progress");
		//System.out.println("class tree1");
		int len = duplicate.size()-1;
		for(int i=0;i<len;i++) 
		{
			
			Node left=null;
			Node right=null;
			
			if(i==0)
			{
				
				left =new Node(duplicate.get(0).value,Character.toString(duplicate.get(0).key));
				right  =new Node(duplicate.get(1).value,Character.toString(duplicate.get(1).key));
				Node newnode =new Node(duplicate.get(0).value+duplicate.get(1).value,left.c+right.c);
				root=newnode;
				root.lc = left;
				root.rc = right;
				//System.out.println(newnode.data+ " "+left.data +" "+right.data+" "+characs.size());
				
			}
			else
			{
				//Node prev_root_temp = root;
				prev_root = root;
				Node newnode =new Node(duplicate.get(0).value+duplicate.get(1).value,prev_root.c);
				root = newnode;
				
				if(prev_root.data>duplicate.get(1).value)
				{
					root.rc = prev_root;
					left = new Node(duplicate.get(1).value,Character.toString(duplicate.get(1).key));
					root.lc = left;
				}
				else
				{
					root.lc = prev_root;
					right  =new Node(duplicate.get(1).value,Character.toString(duplicate.get(1).key));
					root.rc = right;
				}
				
				if(root.rc!=null && root.lc!=null)
				{
					root.c = root.rc.c+root.lc.c;
				}
				else if(root.rc!=null)
				{
					root.c = root.rc.c;
				}
				else
				{
					root.c = root.lc.c;
				}
				//System.out.println(newnode.data+ " "+root.lc.data +" "+root.rc.data+" "+characs.size());
				
			}
			arrobj newobj = new arrobj(duplicate.get(0).value+duplicate.get(1).value);
			//System.out.println("At 0 "+characs.get(0).value);
			duplicate.remove(0);
			//System.out.println(characs.size()); 
			if(duplicate.size()!=0) 
			{ 
				//System.out.println("At 1 "+characs.get(0).value);
				duplicate.remove(0);
			}
			
			//System.out.println("value "+newobj.value);
			duplicate.add(0,newobj);
			sort(huffman.characs);
			//System.out.println(obj.characs.get(0).value+" "+obj.characs.get(1).value);
	}
		if(root==null)
			return;
		Node ptr=root;
	
		while(ptr!=null||!stk.isEmpty()) 
		{
			while(ptr!=null) 
			{
				stk.push(ptr);
				ptr=ptr.lc;
			}
			ptr=stk.pop();
			//System.out.println(ptr.data+" "+ptr.c);
			ptr=ptr.rc;
		}
	System.out.println("Tree created successfully");
}
	public static void displayTable()
	{
		System.out.println("Character\t\t\tFrequency\t\t\tCode");
		for(int i=0;i<huffman.characs.size();i++)
		{
			System.out.println((char)huffman.characs.get(i).key + "\t\t\t"+huffman.characs.get(i).value+"\t\t\t"+huffman.characs.get(i).code);
		}
	}
	
	public static void createCodes()					//encodes 128 walla array list
	{
		System.out.println("Inside createCode");
		for(int i=0;i<huffman.characs.size();i++)
		{
			huffman.characs.get(i).code = encode((char)huffman.characs.get(i).key);			
		}
	}

	public static String encode(char symbol) {			//encodes str passed to it
		 
	    String encodedMessage ="";
	   
	        Node node = root;
	        
	        while (!node.isLeaf()) {
	            if (node.lc.c.contains(Character.toString(symbol))) {
	                node = node.lc;
	                encodedMessage+="0";
	                
	            } else if (node.rc.c.contains(Character.toString(symbol))) {
	                node = node.rc;
	                encodedMessage+="1";
	            } else {
	            	System.out.println(symbol);
	                throw new IllegalArgumentException("Symbol not found in tree");
	            	//return "";
	                
	            }
	           
	    }
	       
	    return encodedMessage;
	    
}
	public static void final_encoding(String data) throws 
IOException
	{
		System.out.println("Inside final_encoding");
		//String output = "";
		createFile();
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			for(int j=0;j<huffman.characs.size();j++)
			{
				if((int)ch==huffman.characs.get(j).key)
				{
					//output+= huffman.characs.get(j).code;
					FileOutputStream fileOutputStream = new FileOutputStream("filename.txt", true);
		            FileOutputStream dataOutputStream = new FileOutputStream("output4.txt", true);
		            //BitOutputStream bitOutputStream = new BitOutputStream(dataOutputStream);
					for(int k=0;k<huffman.characs.get(j).code.length();k++) 
					{		
						//dataOutputStream.writeBoolean(true);
						//bitOutputStream.writeBit(Integer.parseInt(huffman.characs.get(j).code.charAt(k) + ""));	
					}
					break;
				}
			}
		}	
		
	}
	
	public static void createFile()
	
	{
		//System.out.println(output);
		System.out.println("Inside File");
		

	    System.out.println("File creation in progress");
	    try
	    {
	    	
	    	if (myObj.createNewFile()) 
	    	{
	    		System.out.println("File created: " + myObj.getName());
	    		FileWriter writer = new FileWriter(myObj);
	    	
	    		writer.flush();
	    		writer.close();
	    	} 
	    	else 
	    	{
	    		System.out.println("File already exists.");
	    	}
	    } 
	    catch (IOException e) 
	    {
	    	System.out.println("An error occurred.");
	    	e.printStackTrace();
	    }
	}
	public static void sort(ArrayList<arrobj> characs) 
	{
		int temp1=0;
		int temp2=0;
		for(int i=0;i<characs.size();i++)
		{
			for(int j=1;j<characs.size()-i;j++)
			{
				if(characs.get(j-1).value>characs.get(j).value)
				{
					// swapping the elements
					temp1=characs.get(j-1).value;
					characs.get(j-1).value=characs.get(j).value;
					characs.get(j).value=temp1;
					temp2=characs.get(j-1).key;
					characs.get(j-1).key=characs.get(j).key;
					characs.get(j).key=temp2;
					
				}
			}
		}
	}

}
public class huffman {

	static ArrayList<arrobj> characs=new ArrayList<>();
	
	
	public static void main(String args[]) throws IOException
	{
		String data="";
//		try 
//		{
//		      File myObj = new File("C:\\Users\\Vidhi Bhamare\\Downloads\\filename.txt");
//		      
//		      System.out.println("hi");
//		      Scanner myReader = new Scanner(myObj);
//		      while (myReader.hasNextLine()) 
//		      {
//		    	  System.out.println("while loop ");
//		    	  data += myReader.nextLine();
//		    	  System.out.println(data);
//		      }
//		      myReader.close();
//		 } 
//		 catch (FileNotFoundException e) 
//			{
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
		data ="KDUFGKUDGFKUDJUDRKUDHFMKUBKDURUHRKGUHDKFJHGSKDFJG";
		//data=data.substring(3);
		System.out.println(data);
		int[] arr=new int[128];

		for(int i=0;i<data.length();i++)
		{
			char ch=data.charAt(i);
			arr[ch]++;
		}

		for (int i=0;i<128;i++)
		{
			if(arr[i]!=0)
			{
				arrobj ob=new arrobj(i,arr[i],"");
				characs.add(ob);
			}
		}
		
		Tree ob=new Tree();
		ob.sort(characs);
		ob.create();
		ob.createCodes();
		ob.displayTable();
		ob.final_encoding(data);
		
	} 
}