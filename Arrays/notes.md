<h1>Arrays in Java</h1>

<h2>1. Introduction to Arrays</h2>
<p>An <b>Array</b> is a data structure in Java that can hold a fixed number of elements of the same type. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.</p>

<h3>Syntax:</h3>
<pre><code>
int[] arr; // Declares an array of integers
arr = new int[5]; // Allocates memory for 5 integers
</code></pre>

<p>Or alternatively:</p>
<pre><code>
int[] arr = new int[5]; // Combined declaration and allocation
</code></pre>

<h3>Example:</h3>
<pre><code>
int[] arr = {1, 2, 3, 4, 5}; // An array with predefined elements
</code></pre>

<h2>2. Key Characteristics</h2>
<ul>
  <li><b>Fixed Size:</b> Once an array is created, its size cannot be changed.</li>
  <li><b>Indexed:</b> Each element in the array is associated with an index starting from 0.</li>
  <li><b>Homogeneous:</b> Arrays can store only one type of data (e.g., int, float, String).</li>
  <li><b>Contiguous Memory:</b> Elements are stored in contiguous memory locations, making array access very fast.</li>
</ul>

<h2>3. Types of Arrays</h2>
<ul>
  <li><b>Single-Dimensional Array:</b> A linear array where data is stored in a sequence.</li>
  <li><b>Multi-Dimensional Array:</b> An array of arrays (e.g., 2D arrays).</li>
</ul>

<h3>Example of 2D Array:</h3>
<pre><code>
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
</code></pre>

<h2>4. Operations on Arrays</h2>
<ul>
  <li><b>Accessing Elements:</b> Array elements are accessed using their index.</li>
  <li><b>Modifying Elements:</b> You can update elements by specifying the index.</li>
  <li><b>Length of Array:</b> Use <code>array.length</code> to find the length of the array.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Accessing elements
int firstElement = arr[0]; // Access the first element

// Modifying elements
arr[2] = 10; // Change the third element to 10

// Getting array length
int length = arr.length; // Returns the number of elements in the array
</code></pre>

<h2>5. Advantages of Arrays</h2>
<ul>
  <li><b>Direct Access:</b> Elements can be accessed directly using their index, offering constant time access O(1).</li>
  <li><b>Efficient Memory:</b> Arrays are allocated memory in a continuous block, making it easier to manage.</li>
</ul>

<h2>6. Disadvantages of Arrays</h2>
<ul>
  <li><b>Fixed Size:</b> You must know the size of the array in advance.</li>
  <li><b>Homogeneous Data:</b> Arrays can store only one type of data.</li>
  <li><b>Memory Wastage:</b> If you allocate a large array and don’t use all the elements, memory is wasted.</li>
</ul>

<h2>7. Common Mistakes</h2>
<ul>
  <li>Trying to access an index that is out of bounds will result in a <code>ArrayIndexOutOfBoundsException</code>.</li>
  <li>Forgetting that array indices start from 0 in Java.</li>
</ul>

<h2>8. Conclusion</h2>
<p>Arrays are one of the simplest and most useful data structures in Java, but their fixed size and homogeneous nature can be limiting in certain cases. For more flexible and dynamic data structures, collections such as ArrayList or LinkedList can be used.</p>

