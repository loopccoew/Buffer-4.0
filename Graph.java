package Buffer;
import java.util.*;
public class Graph {
	private static ArrayList<SpecialNode> specialNodes;
	private static ArrayList<PropertyNode> propertyNodes;    

	public Graph() {
		this.specialNodes = new ArrayList<SpecialNode>();
		this.propertyNodes = new ArrayList<PropertyNode>();
	}

	public void addSpecialNode(SpecialNode node) {
		specialNodes.add(node);
	}

	public void addPropertyNode(PropertyNode node) {
		propertyNodes.add(node);
	}

	public ArrayList<SpecialNode> getSpecialNodes() {
		return specialNodes;
	}

	public ArrayList<PropertyNode> getPropertyNodes() {
		return propertyNodes;
	}
	public static void createAdjacencyList(SpecialNode searcharea) {
		ArrayList<PropertyNode> neighbors = new ArrayList<PropertyNode>();

		for (PropertyNode node : propertyNodes) {
			if(node.getArea().equals(searcharea)) {
				neighbors.add(node);
				for (PropertyNode otherNode : propertyNodes) {
					if (node != otherNode && node.getArea() == otherNode.getArea()) {
						neighbors.add(otherNode);
					}
				}
				break;
			}
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("Available properties in " +searcharea.getLabel() + ":");
		System.out.println("--------------------------------------------------------------");
		for (PropertyNode neighbor : neighbors) {
			if(neighbor.isAvailable()==true) {
				System.out.println("                  |");
				System.out.println("                  |");
				System.out.println("                  |");
				System.out.println("--------------------------------------------------------------");
				System.out.println("	|Name of the owner is: 	          |" +neighbor.getName());
				System.out.println("	|The amenities avaliable are:     |" +neighbor.getAmenities());
				System.out.println("	|Price of the property is:        |" +neighbor.getPrice());
				System.out.println("	|Size of the given property is:   |" +neighbor.getSize());
				System.out.println("	|Contact number of the owner is:  |" +neighbor.getPhoneNumber());
				System.out.println("	|The property ID is:              |" +neighbor.getId());
				System.out.println("--------------------------------------------------------------");
			}
		}
	} 

	public static void searchprop(String area) {
		SpecialNode searcharea = null;
		for (SpecialNode node : specialNodes) {
			if (node.getLabel().equals(area)) {	
				searcharea = node;
				createAdjacencyList(searcharea);
				return;
			}
		}
		System.out.println("Area not found.");
		return;
	}
}






