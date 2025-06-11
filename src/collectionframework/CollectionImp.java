package collectionframework;
import java.util.*;
import java.util.concurrent.*;
public class CollectionImp {
    public static void main(String[] args) {

        // 1. ArrayList

        /*
         * WHAT:
         *   ArrayList is a part of java.util package.
         *   It is a resizable (dynamic) array implementation of the List interface.
         *   Internally uses a dynamically growing Object[] array to store elements.
         *
         * WHY:
         *   - Maintains insertion order.
         *   - Allows duplicates and null elements.
         *   - Provides fast **random access** using index (O(1) time).
         *   - Good when frequent read/access is required and insert/delete is minimal.
         *
         * HOW:
         *   - Use add() to insert elements.
         *   - Grows by 50% when current capacity is exceeded (internally calls Arrays.copyOf()).
         *
         * INTERNALS:
         *   - Default initial capacity = 10.
         *   - On overflow: new capacity = old capacity + (old capacity / 2)
         *
         * TIME COMPLEXITY:
         *   - get(index) / set(index, value) => O(1)
         *   - add(E e) => Amortized O(1), but resizing is O(n)
         *   - add(index, E e) or remove(index) => O(n) (due to shifting)
         *   - contains() => O(n) linear search
         *
         * WHEN TO USE:
         *   - You need fast random access to elements by index.
         *   - You do not perform many insertions/removals in the middle.
         *   - Suitable for caching, lookup tables, and read-heavy operations.
         */
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicates allowed
        System.out.println("ArrayList: " + fruits);

        // 2. Vector

        /*
         * WHAT:
         *   Vector is a growable array-based List implementation that is **thread-safe**.
         *   Part of java.util package and implements List, RandomAccess, Cloneable, Serializable.
         *   Internally uses a synchronized Object[] array to store elements.
         *
         * WHY:
         *   - Designed for multi-threaded applications before Java 1.2 introduced Collections framework.
         *   - Ensures thread-safety by synchronizing all major methods.
         *   - Allows duplicates and null values.
         *   - Maintains insertion order.
         *
         * HOW:
         *   - Every method like add(), get(), remove() is synchronized.
         *   - Can be accessed safely across multiple threads without external synchronization.
         *   - Expands capacity when needed (doubling its size).
         *
         * INTERNALS:
         *   - Underlying array grows as: new capacity = old capacity * 2
         *   - Thread safety is ensured using synchronized methods (coarse-grained locking).
         *   - Inefficient in high-concurrency scenarios (due to lock contention).
         *   - Legacy class — replaced by `ArrayList` + `Collections.synchronizedList()` in modern apps.
         *
         * TIME COMPLEXITY:
         *   - get(index) / set(index, value) => O(1)
         *   - add(E e) => Amortized O(1), but resizing is O(n)
         *   - add(index, E e) or remove(index) => O(n)
         *   - contains() => O(n)
         *
         * WHEN TO USE:
         *   - When legacy code already uses Vector.
         *   - When thread-safety is required, but `CopyOnWriteArrayList` or synchronized wrappers aren't suitable.
         *   - NOT recommended for modern, high-performance code.
         */
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        vector.remove("Green");
        System.out.println("Vector: " + vector);

        // 3. HashSet

        /*
         * WHAT:
         *   HashSet is a Set implementation backed by a HashMap.
         *   It stores unique elements only (no duplicates allowed).
         *   It does NOT maintain insertion or sorted order.
         *
         * WHY:
         *   - Provides **constant time** performance for add, remove, contains (on average).
         *   - Ensures **uniqueness** of elements.
         *   - Ideal for lookup-heavy use cases where duplicates are not allowed.
         *
         * HOW:
         *   - Internally backed by a `HashMap<E, Object>`, where the value is a dummy object.
         *   - Uses `hashCode()` and `equals()` methods of objects to determine uniqueness.
         *   - Offers fast operations due to hashing.
         *   - Load factor and initial capacity can be tuned for performance.
         *
         * INTERNALS:
         *   - Initial capacity = 16 (by default).
         *   - Load factor = 0.75 (default): when 75% full, capacity doubles.
         *   - Collisions are handled using a **bucket system** (linked lists or red-black trees in Java 8+).
         *   - Insertion order is not preserved — for that, use `LinkedHashSet`.

         * TIME COMPLEXITY:
         *   - add(E e), remove(E e), contains(E e) => O(1) average case, O(n) worst case
         *   - iteration => O(n)

         * WHEN TO USE:
         *   - When you want to **store a set of unique elements**.
         *   - When order of insertion does not matter.
         *   - When fast lookups, additions, and deletions are required.
         *   - Examples: filtering duplicates, lookup tables, unique word sets, etc.
         */
        Set<String> fruitSet = new HashSet<>(fruits);
        fruitSet.add("Orange");
        System.out.println("HashSet: " + fruitSet);

       // 4. LinkedList (as Queue)

        /*
         * WHAT:
         *   LinkedList is a doubly-linked list implementation of both the List and Deque interfaces.
         *   It allows null elements, duplicates, and maintains insertion order.
         *   It can be used as a Queue, Deque, or even Stack depending on the method used.

         * WHY:
         *   - Offers **constant-time insertion and deletion** at both ends.
         *   - More efficient than ArrayList for frequent inserts/removals from the head or tail.
         *   - Ideal for **FIFO** (First-In-First-Out) queue operations.
         *
         * HOW:
         *   - Internally uses a chain of Node objects (each having `prev`, `next`, and `data`).
         *   - Supports methods like `add()`, `remove()`, `poll()`, `peek()` for queue behavior.
         *   - Can also be used for deque operations (`addFirst`, `addLast`, `removeFirst`, etc.).
         *
         * INTERNALS:
         *   - Each element is stored in a Node (with pointers to both previous and next nodes).
         *   - Not backed by an array — no resizing or shifting needed on insert/remove.
         *   - Maintains order, but slower random access (O(n) for get(index)).
         *
         * TIME COMPLEXITY:
         *   - addFirst()/addLast() => O(1)
         *   - removeFirst()/removeLast() => O(1)
         *   - add(E)/remove(E)/poll()/peek() => O(1)
         *   - get(index) or search => O(n)
         *
         * WHEN TO USE:
         *   - When you need a Queue or Deque.
         *   - When frequent **insertions/deletions at ends** are required.
         *   - Not suitable for index-based access; use ArrayList instead for that.
         *   - Common use: task queues, job scheduling, BFS traversal, undo/redo stack, etc.
         */
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.offer("Task 1");
        taskQueue.offer("Task 2");
        taskQueue.offer("Task 3");
        System.out.println("LinkedList Queue: " + taskQueue);
        System.out.println("Polled: " + taskQueue.poll());


        // 5. ArrayDeque (as Queue)

        /*
         * WHAT:
         *   ArrayDeque is a resizable array implementation of the Deque interface (double-ended queue).
         *   It can function as a **Queue (FIFO)** or a **Stack (LIFO)**.
         *   It is **not thread-safe** and does **not allow null elements**.

         * WHY:
         *   - Faster than LinkedList for queue and stack operations (no node object overhead).
         *   - Provides O(1) performance for insertion/removal at both ends.
         *   - Eliminates overhead of node pointers (unlike LinkedList).
         *   - More space and time efficient for use cases like task scheduling, buffer queues, etc.

         * HOW:
         *   - Internally backed by a circular array.
         *   - Automatically resizes when capacity is exceeded.
         *   - Use `offer()`, `poll()`, `peek()` for Queue operations.
         *   - Use `push()`, `pop()` for Stack operations.
         *
         * INTERNALS:
         *   - Head and tail indices are used to manage both ends of the deque in a circular buffer.
         *   - Capacity grows by 2x when full.
         *   - Nulls are **not allowed** (throws NullPointerException).
         *
         * TIME COMPLEXITY:
         *   - offer(), poll(), peek() => O(1)
         *   - addFirst(), addLast(), removeFirst(), removeLast() => O(1)
         *   - No random access (no get(index))

         * WHEN TO USE:
         *   - When you need **fast queue or stack** functionality.
         *   - When null elements are not required.
         *   - A better-performing replacement for both `Stack` and `LinkedList` (when used as queue).
         */
        Deque<String> dequeQueue = new ArrayDeque<>();
        dequeQueue.offer("Job A");
        dequeQueue.offer("Job B");
        dequeQueue.offer("Job C");
        System.out.println("ArrayDeque Queue: " + dequeQueue);
        System.out.println("Polled: " + dequeQueue.poll());

        // 6. HashMap

        /*
         * WHAT:
         *   HashMap is a Map implementation that stores **key-value pairs**.
         *   It does **not maintain any order** of the elements.
         *   Allows one `null` key and multiple `null` values.
         *
         * WHY:
         *   - Provides **constant-time performance** for most operations (get, put).
         *   - Best for **quick lookups** when **ordering is not important**.
         *   - Widely used in caching, storing configs, lookup tables, etc.

         * HOW:
         *   - Internally uses a **hash table**.
         *   - Each key is hashed to find the bucket index.
         *   - Collisions are resolved using a **linked list** or **balanced tree (since Java 8)**.
         *   - Load factor (default 0.75) determines when to resize.

         * INTERNALS:
         *   - Initial capacity = 16 (default), doubles on resize.
         *   - Bucket = array of linked nodes (or tree nodes if size > 8 in a bucket).
         *   - Keys must implement `hashCode()` and `equals()` properly.
         *   - Not thread-safe — use `ConcurrentHashMap` for thread safety.

         * TIME COMPLEXITY:
         *   - put(), get(), remove() => O(1) average, O(n) worst (if many collisions)
         *   - iteration => O(n)
         *   - containsKey(), containsValue() => O(1), O(n)

         * WHEN TO USE:
         *   - When you need **fast access via keys** and **order is not a concern**.
         *   - Not suitable for sorted or insertion-ordered maps.
         *   - Prefer `LinkedHashMap` if insertion order matters, or `TreeMap` if sorted order is needed.
         */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        System.out.println("HashMap: " + hashMap);

        // 7. TreeMap

        /*
         * WHAT:
         *   TreeMap is a **Map implementation** that keeps its keys **sorted** in natural order
         *   (or by a custom Comparator if provided).
         *   It implements the `NavigableMap` and `SortedMap` interfaces.

         * WHY:
         *   - Maintains **sorted order** of keys automatically.
         *   - Useful when you need to **iterate over keys in ascending or descending order**.
         *   - Allows efficient **range-based queries** (e.g., subMap, headMap, tailMap).

         * HOW:
         *   - Internally backed by a **Red-Black Tree**, a type of self-balancing binary search tree (BST).
         *   - Ensures O(log n) performance for insert, delete, search.
         *   - All keys must be **Comparable** or inserted using a **Comparator**.
         *
         * INTERNALS:
         *   - No `null` keys allowed (throws `NullPointerException`).
         *   - Values can be null.
         *   - Supports methods for floor, ceiling, lower, higher keys.
         *   - Ordering is always maintained based on key comparison logic.

         * TIME COMPLEXITY:
         *   - put(), get(), remove() => O(log n)
         *   - iteration (in order) => O(n)
         *   - floorKey(), ceilingKey(), subMap() => O(log n)

         * WHEN TO USE:
         *   - When **key sorting** is required (e.g., leaderboard, scheduler).
         *   - When you need fast **range queries** or navigation methods.
         *   - If you don't need sorted keys, use HashMap instead for better performance.

         */
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        System.out.println("TreeMap (sorted): " + treeMap);

        // 8. LinkedHashMap

        /*
         * WHAT:
         *   LinkedHashMap is a **HashMap** implementation that **maintains insertion order**.
         *   It stores **key-value pairs** just like HashMap but with a predictable iteration order.
         *
         * WHY:
         *   - Useful when you need **fast access** like HashMap **and** predictable iteration order.
         *   - Supports **access-order mode**, useful for LRU cache implementations.
         *
         * HOW:
         *   - Internally uses a combination of:
         *       1. A **hash table** for storing key-value entries.
         *       2. A **doubly-linked list** to maintain order of insertion or access.
         *   - Maintains a `before` and `after` pointer for each entry to preserve order.
         *   - Offers two ordering modes:
         *       - Insertion-order (default)
         *       - Access-order (via constructor)
         *
         * INTERNALS:
         *   - Slightly slower than `HashMap` due to extra overhead of maintaining the linked list.
         *   - One `null` key and multiple `null` values allowed.
         *   - Still offers O(1) performance for get/put.
         *   - Not thread-safe — use `Collections.synchronizedMap()` or `ConcurrentHashMap` if needed.

         * TIME COMPLEXITY:
         *   - put(), get(), remove() => O(1)
         *   - iteration => O(n) in insertion/access order

         * WHEN TO USE:
         *   - When you need fast lookups **and** predictable iteration order.
         *   - When implementing **LRU cache** (via access-order mode).
         *   - Prefer `HashMap` if you don’t care about order, and `TreeMap` if you want sorted keys.
         */
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // 9. PriorityQueue

        /*
         * WHAT:
         *   PriorityQueue is a **queue-based** implementation of a **Min-Heap** (by default).
         *   Elements are ordered based on their **natural ordering** or a provided **Comparator**.
         *   It does **not maintain insertion order** and does **not allow null elements**.
         *   It allows duplicates.

         * WHY:
         *   - Automatically keeps the **minimum (or maximum)** element at the head.
         *   - Useful for problems involving priority-based scheduling, Dijkstra’s algorithm, etc.
         *   - Great when you need **efficient retrieval of the smallest/largest** item.

         * HOW:
         *   - Internally implemented as a binary heap stored in an array.
         *   - On insertion, element "bubbles up" to maintain heap property.
         *   - On removal, root element is swapped with last and heapified down.
         *   - Default is **Min-Heap** (smallest at head); can use custom Comparator for Max-Heap.

         * INTERNALS:
         *   - Backed by a dynamic array (Object[] heap).
         *   - Grows automatically (default initial capacity = 11).
         *   - Not thread-safe.
         *   - Elements must implement `Comparable` or be inserted with a Comparator.

         * TIME COMPLEXITY:
         *   - offer(E) / add(E) => O(log n)
         *   - poll() => O(log n)
         *   - peek() => O(1)
         *   - remove(Object) => O(n)
         *   - contains() => O(n)

         * WHEN TO USE:
         *   - When you need **priority-based** ordering in a queue.
         *   - For scenarios like: task schedulers, pathfinding algorithms (Dijkstra/A*), or merging k sorted arrays.
         *   - Not suitable when strict ordering or duplicate handling is needed (e.g., TreeSet/TreeMap preferred for sets/maps).
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Polled from PriorityQueue: " + pq.poll());


        // 10. ConcurrentHashMap

        /*
        // WHAT: Thread-safe map allowing concurrent access
        // WHY: Use in multi-threaded environments
        // HOW: Divides map into segments to allow safe updates

        */
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Alice", 100);
        concurrentMap.put("Bob", 200);
        concurrentMap.put("Charlie", 300);
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        concurrentMap.putIfAbsent("Bob", 400); // won't overwrite
        concurrentMap.computeIfPresent("Alice", (k, v) -> v + 50); // 150
        System.out.println("ConcurrentHashMap after updates: " + concurrentMap);
    }

}
