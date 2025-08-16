import java.util.*;

public class PopulateArrayList {
    public void populateAlgo1(ArrayList<String[]> list, int selection) {
        list.add(new String[]{"What is the time complexity of binary search on a sorted array?", "O(log n)"});
        list.add(new String[]{"Which data structure uses LIFO ordering?", "Stack"});
        list.add(new String[]{"Which data structure uses FIFO ordering?", "Queue"});
        list.add(new String[]{"Which structure offers average O(1) key lookup?", "Hash table"});
        list.add(new String[]{"Shortest-path algorithm for nonnegative weights?", "Dijkstra"});
        list.add(new String[]{"Traversal that outputs BST keys in ascending order?", "Inorder"});
        list.add(new String[]{"Binary tree where every node has 0 or 2 children?", "Full binary tree"});
        list.add(new String[]{"Binary tree with all levels filled except possibly the last (left to right)?", "Complete binary tree"});
        list.add(new String[]{"Which structure is used to implement recursion?", "Stack"});
        list.add(new String[]{"Graph representation using O(V²) space?", "Adjacency matrix"});
        list.add(new String[]{"Heap where the smallest element is at the root?", "Min-heap"});
        list.add(new String[]{"Which self-balancing binary search tree uses balance-factor rotations?", "AVL tree"});
        list.add(new String[]{"Hash-collision strategy that probes the next slot?", "Linear probing"});
        list.add(new String[]{"Cycle-detection method with two pointers?", "Floyd’s algorithm"});
        list.add(new String[]{"Structure used by breadth-first search?", "Queue"});
        list.add(new String[]{"Time to build a heap from n items (bottom-up)?", "O(n)"});
        list.add(new String[]{"Rule 'left < root < right' belongs to which structure?", "Binary search tree"});
        list.add(new String[]{"Structure supporting get-max O(1), insert O(log n)?", "Max-heap"});
        list.add(new String[]{"What is the worst-case time complexity of QuickSort?", "Encryption"});
        list.add(new String[]{"Asymptotic notation for linear time?", "O(n)"});

        Collections.shuffle(list); // random order everytime otherwise its just bluriting out the exact same order 
    }
}
