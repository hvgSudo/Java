import java.util.Scanner;

public class DVRA {
    private static int graph[][];
    private static int routingTable[][];
    private static int nextHop[][];
    private static int vertices; 
    private static int sharingTable[][][] = new int[50][50][50];
    private static int finalTable[][] = new int[50][50];
    private static char ch[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    private static void display_tables() {
        for (int i = 0; i < vertices; ++i) {
            System.out.println("\n"+ ch[i] +" Table");
            System.out.println("Node\tCost\tNext Hop");
            for (int j = 0; j < vertices; ++j) {
                System.out.println(ch[j] +"\t"+ 
                            graph[i][j] +"\t"+ nextHop[i][j]);
            }
            System.out.println();
        }
    }

    private static void displayFinalTable() {
        for (int i = 0; i < vertices; ++i) {
            System.out.println("\n\n"+ ch[i] +" Table");
            System.out.print("Node\tCost\tNext Hop");
            for (int j = 0; j < vertices; ++j) {
                System.out.print("\n"+ ch[j] +"\t"+ finalTable[i][j] +"\t");
                if (i == nextHop[i][j])
                    System.out.print("-");
                else
                    System.out.print(ch[nextHop[i][j]]);
            }
        }
        System.out.println();
    }

    private static void initializeGraph() {
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                if (i == j) {
                    graph[i][j] = 0;
                    routingTable[i][j] = 0;
                    nextHop[i][j] = 0;
                } else { 
                    graph[i][j] = -1;
                    routingTable[i][j] = -1;
                    nextHop[i][j] = -1;
                }
            }
        }
    }

    private static void updateSharingTable() {
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                for (int k = 0; k < vertices; ++k) {
                    if ((graph[i][j] > -1) && (graph[j][k] > -1)) {
                        sharingTable[i][j][k] = graph[j][k] + graph[i][j];
                    } else {
                        sharingTable[i][j][k] = -1;
                    }
                }
            }
        }
    }

    private static void finalTables() {
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                finalTable[i][j] = graph[i][j];
                nextHop[i][j] = i;

                for (int k = 0; k < vertices; ++k) {
                    if ((finalTable[i][j] > sharingTable[i][k][j]) ||
                            (finalTable[i][j] == -1)) {
                        if (sharingTable[i][k][j] > -1) {
                            finalTable[i][j] = sharingTable[i][k][j];
                            nextHop[i][j] = k;
                        }
                    }
                }

                if (finalTable[i][j] == -1) {
                    for (int k = 0; k < vertices; ++k) {
                        if ((finalTable[i][k] != -1) && (finalTable[k][j] != -1)) {
                            if ((finalTable[i][j] == -1) || ((finalTable[i][j] != -1)
                                && (finalTable[i][j] > finalTable[i][k] + finalTable[k][j]))) {
                                if (finalTable[i][k] + finalTable[k][j] > -1) {
                                    finalTable[i][j] = finalTable[i][k] + finalTable[k][j];
                                    nextHop[i][j] = k;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        vertices = sc.nextInt();

        graph = new int[vertices][vertices];
        routingTable = new int[vertices][vertices];
        nextHop = new int[vertices][vertices];
        initializeGraph();

        int cost;
        
        for (int i = 0; i < vertices; ++i) {
            for (int j = 0; j < vertices; ++j) {
                if (graph[i][j] == -1) {
                    System.out.print("Enter the Distance between "+
                            ch[i] +" and "+ ch[j] +": ");
                    cost = sc.nextInt();
                    graph[i][j] = graph[j][i] = cost;
                }
            }
        }

        System.out.println("\nInitial tables");
        display_tables();

        updateSharingTable();

        finalTables();

        System.out.println("Final Tables");
        displayFinalTable();

        sc.close();
    }
}
