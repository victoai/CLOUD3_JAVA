package day17;
import java.util.ArrayList;

class Node {
    int to, weight;

    public Node(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Node [to=" + to + ", weight=" + weight + "]";
    }
}

public class 다익스트라 {
    public static void main(String[] args) {
        int V = 4;  // Update this to match the actual number of vertices
        ArrayList<ArrayList<Node>> list = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }

        list.get(0).add(new Node(1, 2));
        list.get(1).add(new Node(3, 2));
        list.get(1).add(new Node(2, 2));
        list.get(2).add(new Node(3, 6));

        boolean[] visit = new boolean[V];
        int[] distance = new int[V];

        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[0] = 0;

        for (int i = 0; i < V - 1; i++) {
            // Find the vertex with the smallest distance that hasn't been visited
            int u = getMin(visit, distance);

            // If no valid vertex is found, break the loop
            if (u == -1) break;

            // Mark the vertex as visited
            visit[u] = true;

            // Update the distances to the neighboring vertices
            for (Node node : list.get(u)) {
                if (!visit[node.to] && distance[u] != Integer.MAX_VALUE
                        && distance[u] + node.weight < distance[node.to]) {
                    distance[node.to] = distance[u] + node.weight;
                }
            }
        }

        // Output the shortest distances
        for (int i = 0; i < distance.length; i++) {
            System.out.println("Distance from node 0 to node " + i + " is " + distance[i]);
        }
    }

    static int getMin(boolean[] visit, int[] distance) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < visit.length; i++) {
            if (!visit[i] && distance[i] < min) {
                min = distance[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
