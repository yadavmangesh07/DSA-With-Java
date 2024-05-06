package Graphs.DisjointGraphTraversal;

import java.util.ArrayList;

public class DFS {
    public static class Edge {
        int src,dst,wt;
        public Edge(int s,int d,int w){
            this.dst=d;
            this.src=s;
            this.wt=w;
        }
    
        
    }
    public static void dfs(ArrayList<Edge>[] graph){
        boolean visited[]=new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            DFSUtil(graph, i, visited);
        }
    }
    public static void DFSUtil(ArrayList<Edge>[] graph,int curr,boolean visited[] ){
        if(!visited[curr]){
            System.out.print( curr +" ");
        }
        visited[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(!visited[e.dst]){

                DFSUtil(graph, e.dst, visited);
            }
            
        }

    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=7;
      
        ArrayList<Edge>[] graph=new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
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
        
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
        dfs(graph);
        
        
    }
    
}
