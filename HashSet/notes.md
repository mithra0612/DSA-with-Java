<h2>HashSet in Java</h2>

<p>
    A <strong>HashSet</strong> is a part of Java's <code>java.util</code> package and is an implementation of the <code>Set</code> interface that is backed by a hash table. It stores elements in a hash table, which makes it very efficient for adding, removing, and checking the existence of elements. 
</p>

<h3>Key Features of HashSet</h3>
<ul>
    <li>Does not allow duplicate elements. Each element is unique.</li>
    <li>Allows <code>null</code> values, but only one.</li>
    <li>HashSet does not maintain the insertion order of elements.</li>
    <li>It is not synchronized, meaning it is not thread-safe by default.</li>
    <li>Offers average constant time (O(1)) performance for basic operations such as <code>add()</code>, <code>remove()</code>, and <code>contains()</code>.</li>
</ul>

<h3>Constructor Methods of HashSet</h3>
<p>
    The <code>HashSet</code> class has several constructors:
</p>
<ul>
    <li><code>HashSet()</code>: Creates an empty HashSet with an initial capacity of 16 and a load factor of 0.75.</li>
    <li><code>HashSet(Collection&lt;? extends E&gt; c)</code>: Creates a HashSet containing the elements of the specified collection.</li>
    <li><code>HashSet(int initialCapacity)</code>: Creates a HashSet with a specified initial capacity.</li>
    <li><code>HashSet(int initialCapacity, float loadFactor)</code>: Creates a HashSet with specified initial capacity and load factor.</li>
</ul>

<h3>How HashSet Works</h3>
<p>
    HashSet internally uses a <code>HashMap</code> to store its elements. When an element is added to the HashSet, the <code>hashCode()</code> of the element is calculated to determine its position in the hash table. If another element has the same hash code (collision), the two elements are stored in a linked list or binary tree, depending on Java's implementation.
</p>

<h3>Basic Operations</h3>
<p>Here are some common operations performed on a <code>HashSet</code>:</p>

<h4>1. Adding Elements</h4>
<p>
    Use the <code>add()</code> method to add elements to the HashSet. If the element already exists, it will not be added again.
</p>
<pre><code>
HashSet&lt;String&gt; set = new HashSet&lt;&gt;();
set.add("Apple");
set.add("Banana");
set.add("Apple"); // Duplicate, will not be added
</code></pre>

<h4>2. Removing Elements</h4>
<p>
    The <code>remove()</code> method is used to remove an element from the HashSet.
</p>
<pre><code>
set.remove("Banana"); // Removes "Banana" from the set
</code></pre>

<h4>3. Checking if an Element Exists</h4>
<p>
    The <code>contains()</code> method checks whether an element exists in the HashSet or not.
</p>
<pre><code>
boolean exists = set.contains("Apple"); // Returns true if "Apple" exists in the set
</code></pre>

<h4>4. Iterating Through a HashSet</h4>
<p>
    A HashSet can be iterated using an enhanced for-loop or an iterator.
</p>
<pre><code>
// Using for-each loop
for (String item : set) {
    System.out.println(item);
}

// Using Iterator
Iterator&lt;String&gt; iterator = set.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
</code></pre>

<h3>Example Program</h3>
<p>Here is an example demonstrating how to use a HashSet:</p>
<pre><code>
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet&lt;String&gt; fruits = new HashSet&lt;&gt;();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate element, will not be added

        // Iterating over the HashSet
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking for an element
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}
</code></pre>

<h3>Performance Considerations</h3>
<p>
    The performance of <code>HashSet</code> largely depends on two factors:
</p>
<ol>
    <li>Initial Capacity: The number of buckets that are available at the time of the HashSet creation.</li>
    <li>Load Factor: A measure of how full the hash table is allowed to get before its capacity is automatically increased. A higher load factor decreases the space overhead but increases the likelihood of collisions, which might affect performance.</li>
</ol>

<p>In summary, <code>HashSet</code> is a very useful collection when you need to ensure uniqueness of elements and don't care about the order of elements.</p>
<h3>LeetCode Problems Solved</h3>
<ol>
    <li><a href="https://leetcode.com/problems/report-spam-message">3295. Report Spam Message</a></li>
    <li><a href="https://leetcode.com/problems/first-missing-positive/">41.First Missing Positive</a></li>
    
</ol>
