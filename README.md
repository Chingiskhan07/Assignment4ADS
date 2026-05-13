# Assignment 4 — Graph Traversal and Representation System

## Project Overview

This project demonstrates graph traversal algorithms in Java using an adjacency list representation.

The program includes:

- Vertex creation
- Edge creation
- Breadth-First Search (BFS)
- Depth-First Search (DFS)
- Performance testing for different graph sizes

Graphs with 10, 30, and 100 vertices were tested.

---

# Project Structure

```text
assignment4-graphs/
├── src/
│   ├── Vertex.java
│   ├── Edge.java
│   ├── Graph.java
│   ├── Experiment.java
│   └── Main.java
├── README.md
└── .gitignore
```

---

# Graph Explanation

A graph is a data structure made of:

- Vertices (nodes)
- Edges (connections)

This project uses an adjacency list because it is simple, fast, and memory efficient.

Example:

```text
0 -> 1 2
1 -> 0 2 3
2 -> 0 1 3 4
```

---

# Class Description

## Vertex Class

The `Vertex` class represents one node in the graph.

Field:

- `id` — unique vertex identifier

Methods:

- Constructor
- Getter
- `toString()`

---

## Edge Class

The `Edge` class represents a connection between two vertices.

Fields:

- `source`
- `destination`

Methods:

- Constructor
- Getters
- `toString()`

---

## Graph Class

The `Graph` class stores graph data using an adjacency list.

Main methods:

- `addVertex()`
- `addEdge()`
- `printGraph()`
- `bfs()`
- `dfs()`

---

## Experiment Class

The `Experiment` class runs traversal algorithms and measures execution time using:

```java
System.nanoTime();
```

---

# BFS Algorithm

Breadth-First Search (BFS) visits vertices level by level.

Steps:

1. Start from a vertex
2. Add it to queue
3. Visit neighbors
4. Continue until queue becomes empty

Time Complexity:

```text
O(V + E)
```

Use cases:

- Shortest path search
- GPS navigation
- Social networks

---

# DFS Algorithm

Depth-First Search (DFS) explores vertices deeply before backtracking.

Steps:

1. Start from a vertex
2. Visit one neighbor deeply
3. Continue recursively
4. Return back when needed

Time Complexity:

```text
O(V + E)
```

Use cases:

- Maze solving
- Path finding
- Cycle detection

---

# Experimental Results

The program was tested on graphs with 10, 30, and 100 vertices.

Execution time was measured in nanoseconds.

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|---|---|---|
| 10 Vertices | 1384700 | 528900 |
| 30 Vertices | 1144900 | 990600 |
| 100 Vertices | 5032000 | 2889100 |

---

# Console Output

## Graph with 10 Vertices

```text
Graph structure:
0 -> 1 2 
1 -> 0 2 3 
2 -> 0 1 3 4 
3 -> 1 2 4 5 
4 -> 2 3 5 6 
5 -> 3 4 6 7 
6 -> 4 5 7 8 
7 -> 5 6 8 9 
8 -> 6 7 9 
9 -> 7 8 

BFS Traversal:
0 1 2 3 4 5 6 7 8 9

DFS Traversal:
0 1 2 3 4 5 6 7 8 9
```

---

# Analysis

As graph size increased, execution time also increased because the algorithms visited more vertices and edges.

DFS was faster than BFS in all experiments.

The results matched the expected complexity:

```text
O(V + E)
```

The traversal order depended on graph structure and edge connections.

BFS is more useful for shortest path problems, while DFS is useful for deep searching and recursive traversal.

One limitation of DFS is that recursion depth can become large in bigger graphs.

---

# Reflection

This assignment helped me understand graph traversal algorithms and adjacency list representation in Java.

I learned the difference between BFS and DFS and how graph size affects algorithm performance.

The most difficult part was implementing DFS recursion correctly and organizing the project using clean Object-Oriented Programming principles.

---

# Screenshots

The repository includes screenshots of:

- Graph structure output
- BFS traversal output
- DFS traversal output
- Performance results

---

# Conclusion

This project successfully implemented graph representation, BFS traversal, DFS traversal, and performance analysis in Java.

The assignment improved my understanding of graph algorithms and Object-Oriented Programming.
