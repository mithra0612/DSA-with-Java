<h1>Strings in Java</h1>

<h2>1. Introduction to Strings</h2>
<p>A <b>String</b> in Java is a sequence of characters. Strings are objects in Java, meaning they come with many built-in methods for handling text data. Strings are immutable, which means once a string is created, it cannot be changed.</p>

<h3>Syntax:</h3>
<pre><code>
// Creating a String
String str = "Hello, World!";
</code></pre>

<h2>2. Key Characteristics of Strings</h2>
<ul>
  <li><b>Immutability:</b> Once a string is created, it cannot be modified. Operations that alter strings return a new string.</li>
  <li><b>String Pool:</b> Java maintains a pool of strings for memory optimization. If a string with the same value already exists in the pool, Java will reference that string instead of creating a new one.</li>
  <li><b>Reference Type:</b> Strings are reference types, not primitive types, but Java provides special support to make them easier to work with.</li>
</ul>

<h2>3. Common Operations on Strings</h2>
<ul>
  <li><b>Length:</b> The <code>length()</code> method returns the length of the string.</li>
  <li><b>Concatenation:</b> The <code>concat()</code> method or the <code>+</code> operator can be used to concatenate two strings.</li>
  <li><b>Substring:</b> The <code>substring()</code> method extracts a portion of the string.</li>
  <li><b>Character Access:</b> The <code>charAt()</code> method returns the character at a specific index.</li>
  <li><b>Comparison:</b> The <code>equals()</code> and <code>compareTo()</code> methods are used to compare strings.</li>
  <li><b>Searching:</b> The <code>indexOf()</code> method searches for a character or substring.</li>
  <li><b>Conversion:</b> The <code>toUpperCase()</code> and <code>toLowerCase()</code> methods convert the string to uppercase or lowercase, respectively.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Length of a string
int length = str.length();

// Concatenating two strings
String greeting = "Hello, " + "World!";

// Extracting a substring
String sub = str.substring(0, 5); // "Hello"

// Accessing a character
char ch = str.charAt(1); // 'e'

// Comparing strings
boolean isEqual = str.equals("Hello, World!");

// Searching in a string
int index = str.indexOf('W'); // 7
</code></pre>

<h2>4. StringBuilder and StringBuffer</h2>
<p><b>StringBuilder</b> and <b>StringBuffer</b> are mutable alternatives to <code>String</code> in Java. They allow modifications without creating new objects, making them more efficient for intensive string operations.</p>

<h3>Differences between String, StringBuilder, and StringBuffer:</h3>
<ul>
  <li><b>String:</b> Immutable and stored in the String Pool.</li>
  <li><b>StringBuilder:</b> Mutable and not synchronized, which makes it faster but not thread-safe.</li>
  <li><b>StringBuffer:</b> Mutable and synchronized, making it thread-safe but slower than StringBuilder.</li>
</ul>

<h3>Example of StringBuilder:</h3>
<pre><code>
StringBuilder sb = new StringBuilder("Hello");
sb.append(", World!"); // Modifies the original object
String result = sb.toString(); // Converts StringBuilder to String
</code></pre>

<h2>5. Common Methods of Strings</h2>
<ul>
  <li><b>replace():</b> Replaces occurrences of a character or substring with another value.</li>
  <li><b>split():</b> Splits the string into an array of substrings based on a given delimiter.</li>
  <li><b>trim():</b> Removes leading and trailing whitespace.</li>
  <li><b>toCharArray():</b> Converts the string into an array of characters.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Replacing characters
String newStr = str.replace('o', 'a'); // "Hella, Warld!"

// Splitting a string
String[] words = str.split(","); // ["Hello", " World!"]

// Trimming whitespace
String trimmedStr = "   Hello, World!   ".trim(); // "Hello, World!"

// Converting to a character array
char[] charArray = str.toCharArray();
</code></pre>

<h2>6. String Comparison</h2>
<ul>
  <li><b>equals():</b> Compares two strings for value equality.</li>
  <li><b>compareTo():</b> Compares two strings lexicographically.</li>
  <li><b>equalsIgnoreCase():</b> Compares two strings ignoring case differences.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// String equality check
boolean isSame = str.equals("Hello, World!");

// Lexicographic comparison
int comparison = str.compareTo("Hello, World!"); // Returns 0 if equal

// Case-insensitive comparison
boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
</code></pre>

<h2>7. Common Mistakes</h2>
<ul>
  <li>Using <code>==</code> for string comparison instead of <code>equals()</code>.</li>
  <li>Not understanding that strings are immutable and expecting them to change in-place.</li>
</ul>

<h3>Examples:</h3>
<pre><code>
// Incorrect comparison
if (str == "Hello, World!") {
    // This may fail because '==' compares references, not values.
}

// Correct comparison
if (str.equals("Hello, World!")) {
    // This works because 'equals()' compares values.
}
</code></pre>

<h2>8. Conclusion</h2>
<p>Strings are a fundamental data structure in Java, offering both flexibility and efficiency for managing text. However, immutability can lead to performance issues in certain cases, where alternatives like StringBuilder or StringBuffer are more appropriate. Understanding how to manipulate strings efficiently is crucial for Java developers.</p>

<h2>9. LeetCode Problems Solved Related to Strings</h2>
<ul>
  <li><a href="https://leetcode.com/problems/sum-of-digits-of-string-after-convert/">LeetCode 1945: Sum of Digits of String After Convert</a></li>
</ul>
