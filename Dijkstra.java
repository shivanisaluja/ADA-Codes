package Lab;


public class Dijkstra {
	
public static void dijkstra(int a[][]) {
			int v = a.length;
			boolean visited[] = new boolean[v]; //shortest path array false-in  true
			int dist[] = new int[v];
			dist[0] = 0;//source
			for (int i=1;i<v;i++) {
			dist[i]=Integer.MAX_VALUE;
			}
			for (int i=0; i<v-1; i++) {
			int minVertex = findMinvertex(dist, visited); // min dist vertex
			visited[minVertex] = true;

			
				for (int j=0; j<v; j++) {				// find neighbors
					if (a[minVertex][j]!=0 && !visited[j]&&dist[minVertex]!=Integer.MAX_VALUE) {
					 if (dist[minVertex]+a[minVertex][j]<dist[j]) { 
						 dist[j]=dist[minVertex]+a[minVertex][j];
					 }

					}}}

					System.out.println("Vertex \t\t Distance from source"); 
					for (int i=0;i<v;i++)
					{ 
						System.out.println(i+ "\t\t " + dist[i]);
					}
					
					}
					public static int findMinvertex(int[] distance, boolean visited[]) {
				
			int min=-1;
				
				for (int i=0; i<distance.length; i++) 
				{ if (!visited[i] &&(min==-1 || distance[i]<distance[min])){
				
				min = i;
				}}
				
				return min;
					}
				
				public static void main(String[] args) {
				
				System.out.println("DIJKSTRA ALGO");
				int a[][] = {{0,1,4,0,0}, {0,0, 3,2,2}, {0,0,0,0,0}, {0,1,5,0,0},{0,0,0,3,0}};
				
				dijkstra(a);
							}
}
							