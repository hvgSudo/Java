import java.util.Scanner;

public class DVRA {
    private static int graph[][];
    private static int routingTable[][];
    private static int vertices; 
    private static int edges;

    static void display_tables() {
        for (int i = 0; i < vertices; ++i) {
            for (int j = vertices - 1; j >= 0; j--) {
                System.out.print("\t"+ graph[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        vertices = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        edges = sc.nextInt();

        graph = new int[vertices][vertices];
        routingTable = new int[vertices][vertices];
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                if (i == j) {
                    graph[i][j] = 0;
                    routingTable[i][j] = 0;
                } else { 
                    graph[i][j] = 9999;
                    routingTable[i][j] = 9999;
                }
            }
        }

        int source, destination, cost;
        for (int i = 0; i < edges; ++i) {
            System.out.println("Enter the details for edge "+ (i+1));
            System.out.print("Source: ");
            source = sc.nextInt();
            System.out.print("Destination: ");
            destination = sc.nextInt();
            System.out.print("Cost: ");
            cost = sc.nextInt();
            graph[source - 1][destination - 1] = cost;
            graph[destination - 1][source - 1] = cost;
        }

        // for (int i = 0; i < vertices; ++i) {
        //     for (int j = 0; j < vertices; ++j) {
        //         System.out.print("\t"+ graph[i][j]);
        //     }
        //     System.out.println();
        // }

        display_tables();
    }
}
