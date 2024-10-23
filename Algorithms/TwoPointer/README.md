<h1>Two Pointer Approach</h1>

<p>The <strong>two-pointer technique</strong> is an efficient approach to solving problems related to arrays and linked lists. This technique involves using two pointers to iterate through a data structure in tandem, typically one pointer starting at the beginning and another at the end. It is particularly useful for problems involving searching, sorting, and partitioning.</p>

<h2>When to Use the Two Pointer Approach</h2>
<ul>
  <li>Finding pairs in a sorted array that add up to a given sum</li>
  <li>Reversing an array or string</li>
  <li>Partitioning arrays in certain order (e.g., sorting zeros, ones, and twos)</li>
  <li>Detecting palindromes</li>
</ul>

<h2>Common Scenarios</h2>
<p>The two-pointer approach works best in these scenarios:</p>
<ul>
  <li><strong>Opposite Ends:</strong> One pointer starts from the beginning and the other from the end, and they move towards each other.</li>
  <li><strong>Same Direction:</strong> Both pointers start from the same point but move in the same direction at different speeds.</li>
</ul>

<h2>How It Works</h2>
<ol>
  <li>Initialize two pointers (e.g., <code>left</code> at the beginning and <code>right</code> at the end).</li>
  <li>Use conditions to decide when and how to move the pointers.</li>
  <li>Move one or both pointers closer based on the problem logic until they meet or overlap.</li>
</ol>

<h2>Advantages of Two Pointer Approach</h2>
<ul>
  <li>Reduces the time complexity from <code>O(n^2)</code> to <code>O(n)</code> in problems like finding a pair with a target sum in a sorted array.</li>
  <li>Simple to implement and intuitive to understand.</li>
  <li>Works efficiently for many problems where using nested loops would be inefficient.</li>
</ul>

<h2>LeetCode Problems Solved</h2>
<ul>
  <li><a href="https://leetcode.com/problems/container-with-most-water/" target="_blank">LeetCode 11: Container With Most Water</a></li>
</ul>

<p>For more problem-solving techniques and implementations, check out the other sections in this repository!</p>
