package weightedgraph;
import java.util.*;



public class firstgraph {
      
	private Map<Integer,Node> nodes = new HashMap<>();
	public class Node
	{
		 private String label;
		 boolean avail=true; 

	        public boolean isAvail() {
			return avail;
		}

		public void setAvail(boolean avail) {
			this.avail = avail;
		}

			public Node(String label) {
	            this.label = label;
	        }

	        @Override
	        public String toString() {
	            return label;
	        }

	}
	
	
	public Map<Integer, Node> getNodes() {
		return nodes;
	}

	public void setNodes(Map<Integer, Node> nodes) {
		this.nodes = nodes;
	}


	public class Edge
	{
		private Node from;
        private Node to;
        private int weight;

        public Edge(Node from, Node to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
        
        public int getWeight() {
        	return weight;
        }

        public Node getTo() {
			return to;
		}

		public void setTo(Node to) {
			this.to = to;
		}

    }

    public void addNode(Integer index,String label) {
        var node = new Node(label);

        nodes.putIfAbsent(index,node);
        //adjacencylist.putIfAbsent(node,new ArrayList<>());
    }

    public void addEdge(Integer from, Integer to, int weight) {
        var fromNode = nodes.get(from);
        if (fromNode == null) throw new IllegalArgumentException();

        var toNode = nodes.get(to);
        if (toNode == null) throw new IllegalArgumentException();

    }
      


}

