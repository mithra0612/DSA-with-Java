<h1>List in Java</h1>

<h2>1. Introduction to List</h2>
<p>The <b>List</b> interface in Java is a part of the <code>java.util</code> package and extends the <code>Collection</code> interface. It represents an ordered collection (also known as a sequence) that allows duplicate elements. The List interface is implemented by various classes, such as <code>ArrayList</code>, <code>LinkedList</code>, <code>Vector</code>, and <code>Stack</code>.</p>

<h3>Key Features:</h3>
<ul>
  <li><b>Ordered Collection:</b> Lists maintain the order of elements based on the sequence in which they were added.</li>
  <li><b>Index-Based Access:</b> Elements in a List can be accessed using zero-based index positions.</li>
  <li><b>Allows Duplicates:</b> Lists allow duplicate elements.</li>
  <li><b>Flexible Size:</b> The size of a List can grow or shrink dynamically as elements are added or removed.</li>
</ul>

<h2>2. Common Implementations of List</h2>
<p>Java provides several classes that implement the List interface:</p>
<ul>
  <li><b>ArrayList:</b> Provides a resizable array implementation of the List interface. It is not synchronized and offers fast random access.</li>
  <li><b>LinkedList:</b> Implements a doubly linked list. It allows for faster insertion and deletion at the beginning or end but slower random access.</li>
  <li><b>Vector:</b> Synchronized version of ArrayList, making it thread-safe. It is generally slower due to synchronization overhead.</li>
  <li><b>Stack:</b> A subclass of Vector that implements a Last-In-First-Out (LIFO) stack.</li>
</ul>

<h2>3. Syntax</h2>
<p>To declare and initialize a List in Java, you can use:</p>
<pre><code>
List&lt;DataType&gt; listName = new ArrayList&lt;&gt;();
</code></pre>

<h3>Example:</h3>
<pre><code>
// Creating a List of integers
List&lt;Integer&gt; numbers = new ArrayList&lt;&gt;();

// Adding elements to the List
numbers.add(1);
numbers.add(2);
numbers.add(3);

// Accessing an element
int firstNumber = numbers.get(0); // Returns 1

// Removing an element
numbers.remove(1); // Removes the element at index 1 (i.e., 2)
</code></pre>

<h2>4. Common Operations in List</h2>
<ul>
  <li><b>add():</b> Appends an element to the end of the List.</li>
  <li><b>add(index, element):</b> Inserts an element at the specified position.</li>
  <li><b>get():</b> Retrieves the element at the specified index.</li>
  <li><b>remove():</b> Removes the element at the specified position or a specified element.</li>
  <li><b>set():</b> Replaces the element at the specified position with a specified element.</li>
  <li><b>size():</b> Returns the number of elements in the List.</li>
  <li><b>contains():</b> Checks if the List contains a specified element.</li>
</ul>

<h2>5. Iterating Over a List</h2>
<p>There are several ways to iterate over a List in Java:</p>

<h3>For-Each Loop:</h3>
<pre><code>
for (Integer number : numbers) {
    System.out.println(number);
}
</code></pre>

<h3>Traditional For Loop:</h3>
<pre><code>
for (int i = 0; i &lt; numbers.size(); i++) {
    System.out.println(numbers.get(i));
}
</code></pre>

<h3>Using Iterator:</h3>
<pre><code>
Iterator&lt;Integer&gt; iterator = numbers.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
</code></pre>

<h2>6. List Interface Methods</h2>
<ul>
  <li><b>addAll():</b> Adds all elements from another collection to the List.</li>
  <li><b>clear():</b> Removes all elements from the List.</li>
  <li><b>indexOf():</b> Returns the index of the first occurrence of the specified element.</li>
  <li><b>lastIndexOf():</b> Returns the index of the last occurrence of the specified element.</li>
  <li><b>isEmpty():</b> Checks if the List is empty.</li>
  <li><b>toArray():</b> Converts the List to an array.</li>
</ul>

<h2>7. ArrayList vs LinkedList</h2>
<table>
  <thead>
    <tr>
      <th>Aspect</th>
      <th>ArrayList</th>
      <th>LinkedList</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Data Structure</td>
      <td>Resizable Array</td>
      <td>Doubly Linked List</td>
    </tr>
    <tr>
      <td>Random Access</td>
      <td>Fast</td>
      <td>Slow</td>
    </tr>
    <tr>
      <td>Insertion/Deletion</td>
      <td>Slower for large lists</td>
      <td>Faster for large lists</td>
    </tr>
    <tr>
      <td>Memory Overhead</td>
      <td>Less overhead</td>
      <td>More overhead</td>
    </tr>
  </tbody>
</table>

<h2>8. Advantages of List</h2>
<ul>
  <li><b>Flexibility:</b> Lists are dynamic in size, so elements can be easily added or removed.</li>
  <li><b>Convenience:</b> Lists provide useful methods for manipulating and accessing data.</li>
  <li><b>Index-Based:</b> Lists offer random access to elements through indices, making them easy to work with.</li>
</ul>

<h2>9. Disadvantages of List</h2>
<ul>
  <li><b>Performance:</b> LinkedList can have higher memory usage due to node pointers, and random access is slower.</li>
  <li><b>Synchronization:</b> List implementations like ArrayList and LinkedList are not synchronized by default, so they are not thread-safe.</li>
</ul>

<h2>10. LeetCode Problems Solved Related to List</h2>
<ul>
  <li><a href="https://leetcode.com/problems/count-items-matching-a-rule/">1773. Count Items Matching a Rule</a></li>
</ul>
