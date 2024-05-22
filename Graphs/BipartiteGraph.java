package Graphs;

import java.util.*;




public class BipartiteGraph {
    static class Edge{
        int src,dst,wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.wt=w;
            this.dst=d;
        }
        public static boolean isBipartite(ArrayList<Edge>[]graph){
            int col[]=new int[graph.length];
            for (int i = 0; i < col.length; i++) {
                col[i]=-1;//initializing each vertex with -1 i.e no color
            }
            Queue<Integer> q=new LinkedList<>();
            for (int i = 0; i < graph.length; i++) {
                if(col[i]==-1){
                    q.add(i);
                    col[i]=0;
                    //form here we will implement BFS logic
                    while (!q.isEmpty()) {
                        int curr=q.remove();
                        for (int j = 0; j < graph[curr].size(); j++) {
                            Edge e=graph[curr].get(j);
                            //now we will check the conditions for the neighbour
                            if(col[e.dst]==-1){
                                col[e.dst]=col[curr]==0?1:0 ;
                                q.add(e.dst);
                            }
                            else if(col[e.dst]==col[curr]){
                               return false;//not bipartite
                            }
                            
                            
                        }
                        
                    }
                }
                
            }
            return true;

        }
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            int v=5;
            ArrayList<Edge>[] graph=new ArrayList[v];
            for (int i = 0; i < graph.length; i++) {
                graph[i]=new ArrayList<Edge>();

                
            }
            graph[0].add(new Edge(0, 1, 1));
            // graph[0].add(new Edge(0, 2, 1));

            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));

            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 2, 1));

            graph[2].add(new Edge(2, 4, 1));
            // graph[2].add(new Edge(2, 0, 1));
            System.out.println(isBipartite(graph));
        }

    }
    
}
