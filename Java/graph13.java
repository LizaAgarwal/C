import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;

public class graph13 {
    //MST
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int n;
        int cost;
        public Pair(int node,int cost){
            this.n=node;
            this.cost=cost;
        }

        @Override
        public int compareTo(Pair p2){  //this compareTo func is for comparison based on cost
            return this.cost-p2.cost;
        }

    }

    public static void findMST(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int minCost=0;

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.n]){
                visited[curr.n]=true;
                minCost+=curr.cost;

                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println(minCost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        findMST(graph);
    }
}
