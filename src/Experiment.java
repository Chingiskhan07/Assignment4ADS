public class Experiment {

    public void runTraversals(Graph graph) {

        long bfsStart = System.nanoTime();
        graph.bfs(0);
        long bfsEnd = System.nanoTime();

        long dfsStart = System.nanoTime();
        graph.dfs(0);
        long dfsEnd = System.nanoTime();

        System.out.println("BFS Time: " + (bfsEnd - bfsStart) + " ns");
        System.out.println("DFS Time: " + (dfsEnd - dfsStart) + " ns");
    }

    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println("\n========================");
            System.out.println("Graph with " + size + " vertices");
            System.out.println("========================");

            Graph graph = createGraph(size);

            if (size == 10) {
                graph.printGraph();
            }

            runTraversals(graph);
        }
    }

    private Graph createGraph(int size) {

        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {

            graph.addEdge(i, i + 1);

            if (i + 2 < size) {
                graph.addEdge(i, i + 2);
            }
        }

        return graph;
    }

    public void printResults() {

        System.out.println("\nExperiments completed successfully.");
    }
}
