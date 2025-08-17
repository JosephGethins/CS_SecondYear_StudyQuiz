import java.util.*;
// Maybe make a way to import them by file or smth 

public class PopulateArrayList {
    public void populateAlgo1(ArrayList<String[]> list) {

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

    public void populateCompArch(ArrayList<String[]> list) {

        list.add(new String[]{"What does CPU stand for?", "Central Processing Unit"});
        list.add(new String[]{"Which component performs arithmetic and logic operations?", "ALU"});
        list.add(new String[]{"Which CPU component directs operations and manages execution?", "Control unit"});
        list.add(new String[]{"Which memory is fastest and located inside the CPU?", "Cache"});
        list.add(new String[]{"Which type of cache is closest to the CPU core?", "L1 cache"});
        list.add(new String[]{"Which CPU register stores the address of the next instruction?", "Program counter"});
        list.add(new String[]{"Which CPU register holds temporary data and intermediate results?", "General-purpose register"});
        list.add(new String[]{"Which type of memory is non-volatile and used to store firmware?", "ROM"});
        list.add(new String[]{"Which memory is volatile and used for running programs?", "RAM"});
        list.add(new String[]{"Which component connects CPU, memory, and peripherals?", "Bus"});
        list.add(new String[]{"Which instruction type causes the CPU to jump to a different memory location?", "Branch instruction"});
        list.add(new String[]{"Which instruction type performs arithmetic operations?", "ALU instruction"});
        list.add(new String[]{"What is the purpose of a pipeline in a CPU?", "Increase instruction throughput"});
        list.add(new String[]{"Which CPU architecture executes one instruction per clock cycle ideally?", "RISC"});
        list.add(new String[]{"Which CPU architecture has complex instructions that can take multiple cycles?", "CISC"});
        list.add(new String[]{"Which unit in the CPU predicts the outcome of branches?", "Branch predictor"});
        list.add(new String[]{"Which CPU component handles floating-point calculations?", "FPU"});
        list.add(new String[]{"Which term describes simultaneous execution of multiple instructions?", "Instruction-level parallelism"});
        list.add(new String[]{"Which type of memory is used to store recently accessed instructions and data?", "Cache memory"});
        list.add(new String[]{"Which CPU component manages data transfers between memory and registers?", "Load/store unit"});

        Collections.shuffle(list);
    }

    public void populateWebInfoProcessing(ArrayList<String[]> list) {

        list.add(new String[]{"What does HTML stand for?", "HyperText Markup Language"});
        list.add(new String[]{"What does CSS stand for?", "Cascading Style Sheets"});
        list.add(new String[]{"Which protocol is used for secure web communication?", "HTTPS"});
        list.add(new String[]{"Which language runs natively in the browser for interactivity?", "JavaScript"});
        list.add(new String[]{"Which HTTP method is used to request data from a server?", "GET"});
        list.add(new String[]{"Which HTTP method is used to send new data to a server?", "POST"});
        list.add(new String[]{"Which HTTP response code means 'Not Found'?", "404"});
        list.add(new String[]{"Which HTTP response code means 'OK'?", "200"});
        list.add(new String[]{"Which HTTP response code means 'Internal Server Error'?", "500"});
        list.add(new String[]{"Which tag in HTML is used for creating a hyperlink?", "<a>"});
        list.add(new String[]{"Which tag in HTML is used to display an image?", "<img>"});
        list.add(new String[]{"Which CSS property changes the text color?", "color"});
        list.add(new String[]{"Which CSS property changes the background color?", "background-color"});
        list.add(new String[]{"Which CSS layout model is based on rows and columns?", "Grid"});
        list.add(new String[]{"Which CSS layout model arranges items in a flexible row or column?", "Flexbox"});
        list.add(new String[]{"Which JavaScript function is used to parse JSON text?", "JSON.parse"});
        list.add(new String[]{"Which JavaScript method is used to log messages to the console?", "console.log"});
        list.add(new String[]{"Which protocol is used for real-time communication in browsers?", "WebSocket"});
        list.add(new String[]{"Which attribute in the <script> tag loads scripts asynchronously?", "async"});
        list.add(new String[]{"Which tag in HTML defines the largest heading?", "<h1>"});

        Collections.shuffle(list);
    }

    public void populateOS(ArrayList<String[]> list) {

        list.add(new String[]{"Which OS component schedules processes for execution?", "Scheduler"});
        list.add(new String[]{"Which term describes running multiple processes at once?", "Multitasking"});
        list.add(new String[]{"Which term describes dividing CPU time among processes?", "Time sharing"});
        list.add(new String[]{"Which term describes processes running at the same time on multiple CPUs?", "Parallelism"});
        list.add(new String[]{"Which mechanism allows processes to wait for each other safely?", "Semaphore"});
        list.add(new String[]{"Which mechanism ensures only one process accesses a resource at a time?", "Mutex"});
        list.add(new String[]{"Which issue occurs when processes wait indefinitely for resources?", "Deadlock"});
        list.add(new String[]{"Which issue occurs when a process never gets CPU time due to scheduling?", "Starvation"});
        list.add(new String[]{"Which algorithm schedules the process with the shortest burst time?", "SJF"});
        list.add(new String[]{"Which scheduling algorithm uses a fixed time slice for each process?", "Round-robin"});
        list.add(new String[]{"Which scheduling algorithm always runs the highest priority process?", "Priority scheduling"});
        list.add(new String[]{"Which memory area stores process control information?", "PCB"});
        list.add(new String[]{"Which OS mechanism provides inter-process communication via pipes?", "Pipe"});
        list.add(new String[]{"Which OS mechanism allows processes to share memory directly?", "Shared memory"});
        list.add(new String[]{"Which OS mechanism sends signals between processes?", "Message passing"});
        list.add(new String[]{"Which concept ensures one thread’s changes are visible to others?", "Memory consistency"});
        list.add(new String[]{"Which lock-free synchronization primitive uses atomic operations?", "Spinlock"});
        list.add(new String[]{"Which system call creates a new process in Unix-like systems?", "fork"});
        list.add(new String[]{"Which system call replaces a process’s memory with a new program?", "exec"});
        list.add(new String[]{"Which system call waits for a child process to finish?", "wait"});

        Collections.shuffle(list);
    }

    public void populateSoftTest(ArrayList<String[]> list) {

        list.add(new String[]{"Which testing verifies individual functions or components?", "Unit testing"});
        list.add(new String[]{"Which testing checks how components work together?", "Integration testing"});
        list.add(new String[]{"Which testing verifies the system against requirements?", "System testing"});
        list.add(new String[]{"Which testing involves the end user validating the system?", "Acceptance testing"});
        list.add(new String[]{"Which testing checks how the system behaves under heavy load?", "Stress testing"});
        list.add(new String[]{"Which testing checks system performance under normal load?", "Load testing"});
        list.add(new String[]{"Which testing checks security vulnerabilities?", "Security testing"});
        list.add(new String[]{"Which testing checks the same functionality repeatedly after changes?", "Regression testing"});
        list.add(new String[]{"Which testing is performed without knowledge of internal code?", "Black-box testing"});
        list.add(new String[]{"Which testing is performed with full knowledge of the internal code?", "White-box testing"});
        list.add(new String[]{"Which testing simulates random inputs to detect crashes?", "Fuzz testing"});
        list.add(new String[]{"Which testing checks if all code statements are executed?", "Statement coverage"});
        list.add(new String[]{"Which testing checks if all decision branches are executed?", "Branch coverage"});
        list.add(new String[]{"Which testing is automated and runs every time code changes?", "Continuous testing"});
        list.add(new String[]{"Which testing checks how easy the software is to use?", "Usability testing"});
        list.add(new String[]{"Which testing checks that errors are handled properly?", "Negative testing"});
        list.add(new String[]{"Which testing checks the system with real-world data?", "Beta testing"});
        list.add(new String[]{"Which testing checks the system in-house before public release?", "Alpha testing"});
        list.add(new String[]{"Which testing checks non-functional requirements like speed?", "Performance testing"});
        list.add(new String[]{"Which testing checks data accuracy and consistency?", "Validation testing"});

        Collections.shuffle(list);
    }

    public void populateUXUI(ArrayList<String[]> list) {

        list.add(new String[]{"What does UI stand for?", "User Interface"});
        list.add(new String[]{"What does UX stand for?", "User Experience"});
        list.add(new String[]{"Which principle states 'Don’t make the user think'?", "Usability"});
        list.add(new String[]{"Which design principle focuses on consistent layouts?", "Consistency"});
        list.add(new String[]{"Which principle emphasizes showing only what’s necessary?", "Simplicity"});
        list.add(new String[]{"Which principle ensures users know where they are in the system?", "Feedback"});
        list.add(new String[]{"Which principle allows users to undo mistakes?", "Error recovery"});
        list.add(new String[]{"Which principle ensures interactive elements look clickable?", "Affordance"});
        list.add(new String[]{"Which principle relates to how users expect things to behave?", "Mental model"});
        list.add(new String[]{"Which principle suggests grouping related items together?", "Proximity"});
        list.add(new String[]{"Which principle suggests similar items should look alike?", "Similarity"});
        list.add(new String[]{"Which UX method tests design ideas with quick mockups?", "Prototyping"});
        list.add(new String[]{"Which UX method observes users interacting with a system?", "User testing"});
        list.add(new String[]{"Which type of wireframe shows only structure, not colors?", "Low-fidelity"});
        list.add(new String[]{"Which type of prototype closely resembles the final product?", "High-fidelity"});
        list.add(new String[]{"Which principle emphasizes designing for accessibility?", "Inclusive design"});
        list.add(new String[]{"Which principle suggests frequent elements should be easy to reach?", "Fitts’s law"});
        list.add(new String[]{"Which principle suggests users scan screens in 'F' or 'Z' patterns?", "Visual hierarchy"});
        list.add(new String[]{"Which principle ensures text is easy to read?", "Legibility"});
        list.add(new String[]{"Which principle focuses on emotional response from users?", "Aesthetic design"});

        Collections.shuffle(list);
    }

    public void populateSoftEngProcess(ArrayList<String[]> list) {

        list.add(new String[]{"Which process model follows sequential stages like requirements to maintenance?", "Waterfall"});
        list.add(new String[]{"Which process model uses short development cycles called sprints?", "Agile"});
        list.add(new String[]{"Which Agile framework uses Scrum masters and product owners?", "Scrum"});
        list.add(new String[]{"Which Agile method uses visual boards for tasks?", "Kanban"});
        list.add(new String[]{"Which document defines what the system should do?", "Requirements specification"});
        list.add(new String[]{"Which phase of software engineering focuses on system structure?", "Design"});
        list.add(new String[]{"Which phase of software engineering involves writing code?", "Implementation"});
        list.add(new String[]{"Which phase ensures the software meets requirements?", "Testing"});
        list.add(new String[]{"Which phase delivers the product to users?", "Deployment"});
        list.add(new String[]{"Which phase ensures the product continues to work after release?", "Maintenance"});
        list.add(new String[]{"Which software metric counts lines of source code?", "LOC"});
        list.add(new String[]{"Which software metric measures program complexity with graph theory?", "Cyclomatic complexity"});
        list.add(new String[]{"Which document tracks changes to requirements over time?", "Requirements traceability matrix"});
        list.add(new String[]{"Which role in Agile represents the customer’s interests?", "Product owner"});
        list.add(new String[]{"Which role in Agile removes obstacles for the team?", "Scrum master"});
        list.add(new String[]{"Which practice merges code into a shared repository frequently?", "Continuous integration"});
        list.add(new String[]{"Which practice automatically delivers code to production?", "Continuous deployment"});
        list.add(new String[]{"Which diagram shows use cases and actors?", "Use case diagram"});
        list.add(new String[]{"Which diagram shows system components and their interactions?", "Component diagram"});
        list.add(new String[]{"Which diagram shows object lifetimes and messages?", "Sequence diagram"});

        Collections.shuffle(list);
    }

    public void populateTheoryOfComp(ArrayList<String[]> list) {

        list.add(new String[]{"Which type of automaton recognizes regular languages?", "Finite automaton"});
        list.add(new String[]{"Which type of grammar generates regular languages?", "Regular grammar"});
        list.add(new String[]{"Which type of grammar generates context-free languages?", "Context-free grammar"});
        list.add(new String[]{"Which automaton uses a stack for memory?", "Pushdown automaton"});
        list.add(new String[]{"Which machine model defines what is computable?", "Turing machine"});
        list.add(new String[]{"Which class of languages can a Turing machine recognize?", "Recursively enumerable"});
        list.add(new String[]{"Which class of languages can a Turing machine decide?", "Decidable"});
        list.add(new String[]{"Which problem class has solutions verifiable in polynomial time?", "NP"});
        list.add(new String[]{"Which problem class can be solved in polynomial time?", "P"});
        list.add(new String[]{"Which famous open question asks whether P equals NP?", "P vs NP"});
        list.add(new String[]{"Which problem is complete for NP under polynomial reductions?", "SAT"});
        list.add(new String[]{"Which lemma is used to prove languages are not regular?", "Pumping lemma"});
        list.add(new String[]{"Which lemma is used to prove languages are not context-free?", "Pumping lemma for CFLs"});
        list.add(new String[]{"Which automaton accepts strings by entering a final state?", "DFA"});
        list.add(new String[]{"Which automaton can take multiple transitions for the same input?", "NFA"});
        list.add(new String[]{"Which machine model has infinite tape and head movement?", "Turing machine"});
        list.add(new String[]{"Which hierarchy classifies grammars into types 0–3?", "Chomsky hierarchy"});
        list.add(new String[]{"Which undecidable problem asks if a program stops?", "Halting problem"});
        list.add(new String[]{"Which theorem states some languages cannot be decided?", "Church-Turing thesis"});
        list.add(new String[]{"Which model represents computation using lambda expressions?", "Lambda calculus"});

        Collections.shuffle(list);
    }
}
