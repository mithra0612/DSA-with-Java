<h1>Hashtable in Java</h1>

<h2>1. Introduction to Hashtable</h2>
<p>The <b>Hashtable</b> class in Java is part of the <code>java.util</code> package and implements the <code>Map</code> interface. It stores key-value pairs, where each key is unique. A Hashtable is synchronized and thread-safe, making it useful in multi-threaded environments.</p>

<h3>Key Features:</h3>
<ul>
  <li><b>Synchronized:</b> Hashtable is synchronized, meaning multiple threads cannot access it simultaneously, ensuring thread safety.</li>
  <li><b>No Null Keys/Values:</b> Unlike <code>HashMap</code>, Hashtable does not allow <code>null</code> keys or values.</li>
  <li><b>Legacy Class:</b> It is considered a legacy class and is less commonly used compared to <code>HashMap</code> and <code>ConcurrentHashMap</code>.</li>
</ul>

<h2>2. Syntax</h2>
<p>You can declare and initialize a Hashtable like this:</p>
<pre><code>
Hashtable&lt;KeyType, ValueType&gt; ht = new Hashtable&lt;&gt;();
</code></pre>

<h2>3. Common Operations in Hashtable</h2>
<ul>
  <li><b>put():</b> Adds a key-value pair to the Hashtable.</li>
  <li><b>get():</b> Retrieves the value associated with a specified key.</li>
  <li><b>remove():</b> Removes a key-value pair based on the key.</li>
  <li><b>containsKey():</b> Checks if a specified key is present in the Hashtable.</li>
  <li><b>containsValue():</b> Checks if a specified value is present in the Hashtable.</li>
  <li><b>size():</b> Returns the number of key-value pairs in the Hashtable.</li>
</ul>

<h3>Example:</h3>
<pre><code>
// Creating a Hashtable
Hashtable&lt;String, Integer&gt; ht = new Hashtable&lt;&gt;();

// Adding key-value pairs
ht.put("Apple", 120);
ht.put("Banana", 80);

// Retrieving a value
int price = ht.get("Apple"); // Returns 120

// Checking for a key
boolean hasApple = ht.containsKey("Apple"); // true

// Checking for a value
boolean hasPrice80 = ht.containsValue(80); // true

// Removing a key-value pair
ht.remove("Banana");

// Getting the size of the Hashtable
int size = ht.size(); // 1
</code></pre>

<h2>4. Internal Working of Hashtable</h2>
<p>The internal structure of a Hashtable is based on an array of buckets. Each bucket is associated with a hash value calculated using the key's <code>hashCode()</code> method. When a collision occurs (i.e., two keys generate the same hash), a linked list is used to store multiple key-value pairs in the same bucket.</p>

<h3>Steps Involved:</h3>
<ol>
  <li>The key’s <code>hashCode()</code> is calculated to determine the index in the Hashtable array.</li>
  <li>If the index is empty, the key-value pair is stored directly. If not, the linked list at that index stores multiple pairs, handled by chaining.</li>
  <li>If the load factor threshold is reached, the Hashtable is resized, and rehashing occurs.</li>
</ol>

<h2>5. Hashtable vs HashMap</h2>
<table>
  <thead>
    <tr>
      <th>Aspect</th>
      <th>Hashtable</th>
      <th>HashMap</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Thread-Safety</td>
      <td>Synchronized (thread-safe)</td>
      <td>Not synchronized</td>
    </tr>
    <tr>
      <td>Null Keys/Values</td>
      <td>Does not allow <code>null</code> keys/values</td>
      <td>Allows one <code>null</code> key and multiple <code>null</code> values</td>
    </tr>
    <tr>
      <td>Performance</td>
      <td>Slower due to synchronization</td>
      <td>Faster (non-thread-safe)</td>
    </tr>
    <tr>
      <td>Use Case</td>
      <td>Multi-threaded environments</td>
      <td>Single-threaded environments or <code>ConcurrentHashMap</code> for multi-threaded cases</td>
    </tr>
  </tbody>
</table>

<h2>6. Hashtable Methods</h2>
<ul>
  <li><b>putIfAbsent():</b> Inserts a key-value pair only if the key is not already present in the Hashtable.</li>
  <li><b>replace():</b> Replaces the value for a given key if it exists.</li>
  <li><b>clear():</b> Removes all key-value pairs from the Hashtable.</li>
  <li><b>isEmpty():</b> Returns <code>true</code> if the Hashtable is empty, otherwise returns <code>false</code>.</li>
</ul>

<h3>Example:</h3>
<pre><code>
// Using putIfAbsent
ht.putIfAbsent("Orange", 150);

// Replacing a value
ht.replace("Apple", 130);

// Clearing the Hashtable
ht.clear();

// Checking if the Hashtable is empty
boolean isEmpty = ht.isEmpty(); // true
</code></pre>

<h2>7. Common Mistakes</h2>
<ul>
  <li><b>Using Null Keys or Values:</b> Hashtable does not allow <code>null</code> keys or values, which can lead to <code>NullPointerException</code>.</li>
  <li><b>Using Hashtable in Non-Thread-Safe Scenarios:</b> In single-threaded environments, <code>HashMap</code> should be preferred for better performance.</li>
</ul>

<h2>8. Advantages of Hashtable</h2>
<ul>
  <li><b>Thread-Safety:</b> Hashtable is synchronized, making it ideal for use in concurrent environments.</li>
  <li><b>Constant-Time Complexity:</b> Provides average O(1) time complexity for insertion, deletion, and access operations due to hashing.</li>
</ul>

<h2>9. Disadvantages of Hashtable</h2>
<ul>
  <li><b>Performance Overhead:</b> Synchronization introduces overhead, making it slower compared to non-thread-safe data structures like <code>HashMap</code>.</li>
  <li><b>No Support for Null Keys/Values:</b> Does not support <code>null</code> keys or values, limiting its flexibility.</li>
  <li><b>Legacy Class:</b> It is considered a legacy class, and alternatives like <code>ConcurrentHashMap</code> are preferred in modern applications.</li>
</ul>

<h2>10. LeetCode Problems Solved Related to Hashtable</h2>
<ul>
  <li><a href="https://leetcode.com/problems/rank-transform-of-an-array/">1331. Rank Transform of an Array
</a></li>

</ul>
