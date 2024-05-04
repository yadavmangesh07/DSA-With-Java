package Graphs;

import java.util.ArrayList;

public class hasPath {
    public static class Edge{
        int src,dst,wt;
        public Edge(int s,int d,int w){
            this.dst=d;
            this.src=s;
            this.wt=w;

        }
    }
    public static boolean hasPathFunction(ArrayList<Edge>[] graph,boolean visited[],int source  ,int destination){
        if(source==destination){
            return true;
        }
        visited[source]=true;
        //check for neighbours
        for (int i = 0; i < graph[source].size(); i++) {
            Edge e= graph[source].get(i);
            
            if(!visited[e.dst] && hasPathFunction(graph, visited, e.dst, destination)){
                //if neighbour has the path then return true because i can reach to the neighbour
                return true;
                
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> [] graph=new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        boolean visited[]=new boolean[graph.length];
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
        System.out.println(hasPathFunction(graph, visited, 0, 6));
    }
    
}
