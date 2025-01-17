import java.util.ArrayList;

public class graph5 {
    //cycle detection in undirected graph
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }
    public static boolean cycleDetect(ArrayList<Edge> graph[]){
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                if(cycleDetectUtil(graph,visited,i,-1)){
                    return true; //cycle exists in one of the parts
                }
            }
        }
        return false;
    }
    public static boolean cycleDetectUtil(ArrayList<Edge> graph[],boolean visited[],int curr,int parent){
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!visited[e.dest]){
                if(cycleDetectUtil(graph, visited, e.dest, curr)){
                    return true;
                }
            }else if(visited[e.dest] && e.dest!=parent){ //case 1
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*
            0 ----- 3
          / |       |
         /  |       |
        1   |       4
         \  |
          \ |
            2
        */
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(cycleDetect(graph));
    }
}
