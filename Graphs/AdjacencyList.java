package Graphs;

import java.util.*;

public class AdjacencyList {
    static class Edge {
        int source,destination,weight;
        public Edge(int s,int d,int w){
            this.destination=d;
            this.source=s;
            this.weight=w;
        }
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            int v=5;
            ArrayList<Edge>[] graph=new ArrayList[v]; //an array of type arraylist to store the adjacency list

            //now at this stage my graph array has null at all of its indices
            //so we put an empty arrayList at every indices

            for (int i = 0; i < graph.length; i++) {
                graph[i]=new ArrayList<Edge>();

                
            }

            //0-vertex
            graph[0].add(new Edge(0, 1, 5));
            //1-vertex
            graph[1].add(new Edge(1, 0 , 5));
            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 3));
            //2-vertex
            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 2));
            //3-vertex
            graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));
            //4-vertex
            graph[4].add(new Edge(4, 2, 2));


            //to calculate the neighbours of vertex-2 vertices
            for (int i = 0; i < graph[2].size(); i++) {
                Edge e=graph[2].get(i);
                System.out.println(e.destination);//destination will give the neighbours of every vertex
                
            }

        }
    
        
    }
}
