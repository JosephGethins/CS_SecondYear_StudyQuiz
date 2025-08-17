import java.util.*;
// Maybe make a way to import them by file or smth 

public class PopulateArrayList {
    public void populateAlgo1(ArrayList<String[]> list) {

        list.clear(); // making sure its emptied so no old questions from diff topics

        list.add(new String[]{"What is the time complexity of binary search on a sorted array?", "O(log n)"});
        list.add(new String[]{"Which data structure uses LIFO ordering?", "Stack"});
        list.add(new String[]{"Which data structure uses FIFO ordering?", "Queue"});
        list.add(new String[]{"Which structure offers average O(1) key lookup?", "Hash table"});
        list.add(new String[]{"Which algorithm finds the shortest path in a graph with nonnegative edge weights?", "Dijkstra"});
        list.add(new String[]{"Which traversal of a BST outputs the keys in ascending order?", "Inorder"});
        list.add(new String[]{"What do you call a binary tree where every node has either 0 or 2 children?", "Full binary tree"});
        list.add(new String[]{"What do you call a binary tree where all levels are filled except possibly the last, which is filled left to right?", "Complete binary tree"});
        list.add(new String[]{"Which structure is used to implement recursion?", "Stack"});
        list.add(new String[]{"Which graph representation uses O(V²) space?", "Adjacency matrix"});
        list.add(new String[]{"What do you call a heap where the smallest element is always at the root?", "Min-heap"});
        list.add(new String[]{"Which self-balancing binary search tree uses balance-factor rotations?", "AVL tree"});
        list.add(new String[]{"Which hash-collision strategy probes the next slot sequentially?", "Linear probing"});
        list.add(new String[]{"Which cycle-detection method uses two pointers moving at different speeds?", "Floyd’s algorithm"});
        list.add(new String[]{"Which data structure is used by breadth-first search (BFS)?", "Queue"});
        list.add(new String[]{"What is the time complexity to build a heap from n items using the bottom-up method?", "O(n)"});
        list.add(new String[]{"Which data structure enforces the rule 'left < root < right'?", "Binary search tree"});
        list.add(new String[]{"Which data structure supports get-max in O(1) and insert in O(log n)?", "Max-heap"});
        list.add(new String[]{"What is the worst-case time complexity of QuickSort?", "O(n^2)"});
        list.add(new String[]{"Which asymptotic notation represents linear time complexity?", "O(n)"});

        Collections.shuffle(list); // random order everytime otherwise its just bluriting out the exact same order 
    }
    public void populateAlgo2(ArrayList<String[]> list) {

        list.clear();

        list.add(new String[]{"Which divide-and-conquer sort uses in-place partitioning?", "Quicksort"});
        list.add(new String[]{"Which stable O(n log n) sort guarantees worst-case performance?", "Merge sort"});
        list.add(new String[]{"Which priority queue is commonly used in Dijkstra’s algorithm?", "Min-heap"});
        list.add(new String[]{"Which algorithm finds all-pairs shortest paths using dynamic programming?", "Floyd–Warshall"});
        list.add(new String[]{"Which substring search algorithm uses a prefix function?", "KMP"});
        list.add(new String[]{"Which self-balancing BST uses color properties?", "Red-black tree"});
        list.add(new String[]{"Which set-merging data structure uses path compression?", "Disjoint set union"});
        list.add(new String[]{"Which MST algorithm sorts edges and unions sets?", "Kruskal"});
        list.add(new String[]{"Which MST algorithm grows from a start vertex by adding cheapest edges?", "Prim"});
        list.add(new String[]{"What top-down DP technique caches results of recursive calls?", "Memoization"});
        list.add(new String[]{"Which tree supports range-sum queries with point updates in O(log n)?", "Fenwick tree"});
        list.add(new String[]{"Which precomputed array allows O(1) range-sum queries?", "Prefix sum"});
        list.add(new String[]{"Which topological sorting algorithm uses indegree counts?", "Kahn’s algorithm"});
        list.add(new String[]{"Which tree structure stores strings character by character for fast lookup?", "Trie"});
        list.add(new String[]{"Which algorithm handles negative edge weights but no negative cycles?", "Bellman–Ford"});
        list.add(new String[]{"Which algorithm finds strongly connected components using low-link values?", "Tarjan"});
        list.add(new String[]{"What is the amortized time complexity to append to a dynamic array?", "O(1)"});
        list.add(new String[]{"Using the Master Theorem, what is the complexity of T(n) = 2T(n/2) + n?", "O(n log n)"});
        list.add(new String[]{"Which randomized BST is built using heap priorities and BST keys?", "Treap"});
        list.add(new String[]{"Which pivot-selection strategy in QuickSort improves performance on sorted inputs?", "Median-of-three"});

        Collections.shuffle(list);
    }

    public void populateDb(ArrayList<String[]> list) {
    list.clear();

        list.add(new String[]{"Which language is used to query relational databases?", "SQL"});
        list.add(new String[]{"Which database model organizes data as tables with rows and columns?", "Relational"});
        list.add(new String[]{"Which database ensures ACID properties?", "Relational"});
        list.add(new String[]{"Which database system is document-oriented and stores JSON-like documents?", "MongoDB"});
        list.add(new String[]{"Which SQL command adds new rows to a table?", "INSERT"});
        list.add(new String[]{"Which SQL command retrieves data from a table?", "SELECT"});
        list.add(new String[]{"Which SQL command modifies existing data in a table?", "UPDATE"});
        list.add(new String[]{"Which SQL command removes rows from a table?", "DELETE"});
        list.add(new String[]{"Which key uniquely identifies each row in a table?", "Primary key"});
        list.add(new String[]{"Which key establishes a relationship between two tables?", "Foreign key"});
        list.add(new String[]{"Which database operation combines rows from two tables based on a related column?", "JOIN"});
        list.add(new String[]{"Which type of JOIN returns all rows from the left table and matched rows from the right?", "LEFT JOIN"});
        list.add(new String[]{"Which type of JOIN returns only rows with matching keys in both tables?", "INNER JOIN"});
        list.add(new String[]{"Which index type is best for exact-match queries?", "Hash index"});
        list.add(new String[]{"Which index type supports range queries efficiently?", "B-tree index"});
        list.add(new String[]{"Which normal form eliminates repeating groups?", "1NF"});
        list.add(new String[]{"Which normal form removes partial dependency?", "2NF"});
        list.add(new String[]{"Which normal form removes transitive dependency?", "3NF"});
        list.add(new String[]{"Which SQL clause specifies the sorting order of query results?", "ORDER BY"});
        list.add(new String[]{"Which SQL clause filters rows based on a condition?", "WHERE"});

        Collections.shuffle(list);
    }


}
