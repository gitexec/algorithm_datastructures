//
//

public class Graph{
 private Map<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

 public  static class Node{
  private int id;
  List<Node> adjacent = new LinkedList<Node>();
  private Node(int id){
   this.id = id;
  }

 } 

 private Node getNode(int id){
  if(!nodeLookup.containsKey(id)){
   nodeLookup.put(id, new Node());   
  }
  return nodeLookup.get(id);
 } 

 private void addEdge(int source, int destination){
  Node s = getNode(source);
  Node d = getNode(destination);
  
  s.adjacent.add(d);
 }
 
 public boolean hasPathDFS(int source, int destination){
    Node s = getNode(source);
    Node d = getNode(destination);
    Set<Integer> visited = new HashSet<Integer>();
    return hasPathDFS(s,d,visited);
 }
 
 //Goes deep first (to children) then goes broad(to neighbors)
 private boolean hasPathDFS(Node source, Node destination, Set<Integer> visited){
   //There is not path
   if(visited.contains(source)){
     return false;
   }
   visited.add(source.id);
   //TODO compare Ids or object addresses??????????????????
   if(source == destination){
    return true;
   }
   for(Node child : source.adjcent){
     return hashPathDFS(child, destination, visited);
   }
   return false;

 }
 
 private boolean hasPathBFS(int source, int destination){
  Node s = getNode(source);
  Node d = getNode(destination);
  
  Set<Integer> visited = new HashSet<Integer>();

  return hasPathBFS(s,d,visited);
 }

 private boolean hasPathBFS(Node source, Node destination, Set<Integer> visited){
  
  Queue<Integer> q = new Queue<Integer>();
  q.add(source);
  while(!q.empty()){
   Node s = q.deque();
   if(q.contains(s)){
    continue;
   }
   if(s == destination){
    return true;
   }
   for(Node child : s.adjecent){
    q.enqueue(child);
   }    
  }
  return false;
 }

 public static void main(String[] args){
 

 }


 }



