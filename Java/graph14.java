import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

public class graph14 {
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

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];

            Edge e=new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int node;
        int cost;
        int stops;
        public Info(int n,int c,int s){
            this.node=n;
            this.cost=c;
            this.stops=s;
        }
    }

    public static int cheapestFlight(int flights[][], int n, int source,int destination, int k){
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flights, graph);

        //initialization
        int dist[]=new int[n];
        for(int i=0;i<dist.length;i++){
            if(i!=source){
                dist[i]=Integer.MAX_VALUE; //infinity
            }
        }

        Queue<Info> q=new LinkedList<>();
        q.add(new Info(source, 0, 0));
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }

            //neighbour
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(curr.cost + wt < dist[v] && curr.stops<=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }

        if(dist[destination]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[destination];
        }
    }
    public static void main(String[] args) {
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int source=0;
        int destination=3;
        int k=1;
        System.out.println(cheapestFlight(flights, n, source, destination, k));
    }
}
