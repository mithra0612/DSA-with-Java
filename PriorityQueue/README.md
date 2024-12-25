<h1>PriorityQueue in Java</h1>

<h2>1. Introduction to PriorityQueue</h2>
<p>A <b>PriorityQueue</b> in Java is a special type of queue where elements are ordered based on their natural ordering or by a custom comparator. It is part of the <code>java.util</code> package and implements the <code>Queue</code> interface. The head of the queue is the least element, according to the specified ordering.</p>

<h3>Syntax:</h3>
<pre><code>
// Creating a PriorityQueue
PriorityQueue<Integer> pq = new PriorityQueue<>();
</code></pre>

<h2>2. Key Characteristics of PriorityQueue</h2>
<ul>
  <li><b>Ordering:</b> The elements are ordered either by their natural ordering (if they implement <code>Comparable</code>) or by a custom <code>Comparator</code>.</li>
  <li><b>Heap-Based:</b> Internally, it uses a binary heap for efficient access to the minimum or maximum element.</li>
  <li><b>Dynamic Sizing:</b> The size of the PriorityQueue adjusts dynamically as elements are added or removed.</li>
  <li><b>Non-Synchronized:</b> PriorityQueue is not thread-safe, but can be synchronized externally if needed.</li>
</ul>

<h2>3. Common Operations on PriorityQueue</h2>
<ul>
  <li><b>Add Elements:</b> Use the <code>add()</code> or <code>offer()</code> methods to insert elements.</li>
  <li><b>Retrieve Head:</b> The <code>peek()</code> method retrieves, but does not remove, the head of the queue.</li>
  <li><b>Remove Head:</b> The <code>poll()</code> method retrieves and removes the head of the queue.</li>
  <li><b>Check Size:</b> The <code>size()</code> method returns the number of elements in the queue.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Creating a PriorityQueue
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Adding elements
pq.add(10);
pq.offer(20);
pq.add(15);

// Retrieving the head
int head = pq.peek(); // 10

// Removing the head
int removedHead = pq.poll(); // 10

// Checking size
int size = pq.size(); // 2
</code></pre>

<h2>4. Custom Ordering</h2>
<p>You can define a custom ordering by providing a <code>Comparator</code> during the creation of the PriorityQueue. This is useful when you need a max-heap or a custom priority logic.</p>

<h3>Example of Custom Comparator:</h3>
<pre><code>
PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

// Adding elements
maxHeap.add(10);
maxHeap.add(20);
maxHeap.add(15);

// Retrieving the head
int maxHead = maxHeap.peek(); // 20
</code></pre>

<h2>5. Limitations of PriorityQueue</h2>
<ul>
  <li>It does not allow <code>null</code> elements.</li>
  <li>It is not thread-safe.</li>
  <li>Insertion and removal operations have a time complexity of <code>O(log n)</code>, while access to the head is <code>O(1)</code>.</li>
  <li>Iteration over the queue does not guarantee any specific order.</li>
</ul>

<h2>6. Applications of PriorityQueue</h2>
<ul>
  <li>Scheduling tasks based on priority.</li>
  <li>Finding the smallest or largest elements efficiently.</li>
  <li>Implementing algorithms like Dijkstra's shortest path or Prim's minimum spanning tree.</li>
</ul>

<h2>7. Common Mistakes</h2>
<ul>
  <li>Expecting the queue to maintain a sorted order during iteration. The PriorityQueue only guarantees the head element's priority.</li>
  <li>Modifying elements after they are added to the PriorityQueue can lead to inconsistent behavior.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Incorrect assumption of sorted order
PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(10, 20, 15));
for (int num : pq) {
    System.out.println(num); // Order is not guaranteed
}
</code></pre>

<h2>8. Conclusion</h2>
<p>The <code>PriorityQueue</code> is a versatile and efficient data structure for handling prioritized elements in Java. Its use of a heap structure makes it ideal for scenarios requiring frequent access to the smallest or largest elements. However, it should be used carefully, keeping its limitations and characteristics in mind.</p>

<h2>9. LeetCode Problems Solved Related to PriorityQueue</h2>
<ol>
  <li><a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/">1636. Sort Array by Increasing Frequency</a></li>
  <li><a href="https://leetcode.com/problems/sort-characters-by-frequency/">451. Sort Characters By Frequency</a></li>
</ol>
