<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DSA with Java - HashSet</title>
</head>
<body>

<h1>HashSet in Java</h1>

<p>The <code>HashSet</code> class in Java is part of the <code>java.util</code> package and implements the <code>Set</code> interface. It is a collection that does not allow duplicate elements and is backed by a hash table, providing constant-time performance for basic operations like adding, removing, and checking if an element is present (in average cases).</p>

<h2>Key Characteristics of HashSet</h2>
<ul>
    <li><strong>No Duplicate Elements:</strong> HashSet does not allow duplicate values. If you try to add a duplicate, it will ignore it.</li>
    <li><strong>Unordered Collection:</strong> HashSet does not guarantee the order of elements as it uses hash codes for storing and accessing elements.</li>
    <li><strong>Allows Null Value:</strong> HashSet can store a single <code>null</code> element.</li>
</ul>

<h2>Commonly Used HashSet Methods</h2>

<p>Here are some essential methods of <code>HashSet</code>:</p>

<ul>
    <li><code>add(E e)</code> - Adds the specified element to the set if it is not already present.</li>
    <li><code>remove(Object o)</code> - Removes the specified element from this set if it is present.</li>
    <li><code>clear()</code> - Removes all elements from the set.</li>
    <li><code>contains(Object o)</code> - Returns <code>true</code> if this set contains the specified element.</li>
    <li><code>isEmpty()</code> - Returns <code>true</code> if the set is empty.</li>
    <li><code>size()</code> - Returns the number of elements in the set.</li>
    <li><code>iterator()</code> - Returns an iterator to iterate over the elements in the set.</li>
    <li><code>clone()</code> - Returns a shallow copy of the <code>HashSet</code> instance.</li>
</ul>

<h3>Example of Using HashSet</h3>
<pre><code>
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Checking if an element exists
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the set.");
        }

        // Removing an element
        fruits.remove("Banana");

        // Iterating through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking the size
        System.out.println("Total elements: " + fruits.size());
    }
}
</code></pre>

<h2>Performance of HashSet</h2>
<p>HashSet offers constant time complexity, <strong>O(1)</strong>, for <code>add</code>, <code>remove</code>, <code>contains</code>, and <code>size</code> operations under ideal conditions. However, the performance may degrade to <strong>O(n)</strong> in the worst case if there are many hash collisions. Hash collisions can occur if multiple elements produce the same hash code, which leads to a chaining mechanism internally within the HashSet.</p>

<h2>When to Use HashSet?</h2>
<p>Use <code>HashSet</code> when:</p>
<ul>
    <li>You need a collection with unique elements.</li>
    <li>The order of elements is not essential.</li>
    <li>Frequent operations involve checking the presence or absence of elements.</li>
</ul>

<h2>Limitations of HashSet</h2>
<ul>
    <li><strong>Unordered:</strong> It does not maintain the order of elements.</li>
    <li><strong>Single Null Allowed:</strong> Only one null value is permitted.</li>
    <li><strong>Not Thread-Safe:</strong> HashSet is not synchronized; use <code>Collections.synchronizedSet</code> to synchronize it.</li>
</ul>

<hr>

<h2>LeetCode Problems Solved Using Brute-Force Method</h2>
<p>This section lists some LeetCode problems solved using the brute-force approach. In each problem, a brute-force method is used to explore all possible solutions, ensuring that the correct answer is found, albeit sometimes with higher time complexity.</p>

<ul>
    <li><a href="https://leetcode.com/problems/distribute-candies/" target="_blank">575. Distribute Candies</a></li>
    <li><a href="https://leetcode.com/problems/single-number/" target="_blank">136. Single Number</a></li>
    <li><a href="https://leetcode.com/problems/find-the-difference/" target="_blank">389. Find the Difference</a></li>
    <li><a href="https://leetcode.com/problems/contains-duplicate/" target="_blank">217. Contains Duplicate</a></li>
   
</ul>

</body>
</html>
