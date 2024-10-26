<h2>Brute Force Algorithm</h2>

<p>A <strong>brute force algorithm</strong> is a straightforward approach to solving a problem by trying all possible solutions and selecting the correct one based on the given conditions. Brute force methods do not involve shortcuts or optimizations; instead, they rely on a simple trial-and-error method to find the answer. While this approach is often easy to understand and implement, it can be inefficient and slow, especially for larger inputs.</p>

<h3>Key Characteristics of Brute Force</h3>
<ul>
    <li><strong>Exhaustive Search</strong>: A brute force algorithm will examine every possible solution in the problem space.</li>
    <li><strong>Simplicity</strong>: These algorithms are usually simple to design and understand, as they don’t involve complex logic or optimizations.</li>
    <li><strong>High Time Complexity</strong>: Brute force methods tend to have high time complexity (often exponential or factorial), making them less suitable for large input sizes.</li>
</ul>

<h3>When to Use Brute Force</h3>
<ul>
    <li><strong>Small Input Size</strong>: Brute force is often feasible when the input size is small enough that the increased time complexity doesn’t lead to significant delays.</li>
    <li><strong>As a Starting Point</strong>: Brute force can serve as a baseline for understanding a problem before optimizing it with more efficient algorithms.</li>
    <li><strong>Guaranteed Correctness</strong>: Since brute force explores all possible solutions, it guarantees a correct answer, if a solution exists.</li>
</ul>

<h3>Examples of Brute Force in Action</h3>
<p>Here are some common examples where brute force algorithms are used:</p>
<ol>
    <li><strong>Linear Search</strong>: To find a target value in an unsorted array, a brute force approach iterates over each element and checks if it matches the target.</li>
    <li><strong>String Matching</strong>: For substring matching, a brute force algorithm checks every possible starting position in the main string to see if the substring exists.</li>
    <li><strong>Combinatorial Problems</strong>: Problems like finding subsets, permutations, or combinations often start with a brute force approach that generates all possible combinations and checks for a solution.</li>
</ol>

<h3>Code Example: Subset Sum Problem</h3>
<p>This example demonstrates a brute force approach to solving the subset sum problem in Java. In this problem, we generate all subsets and check if their sum equals a given target.</p>

<pre>
<code>
// Brute Force Approach to the Subset Sum Problem in Java
public class SubsetSum {
    public static boolean hasSubsetWithSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {  // Loop through all subsets
            int subsetSum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {  // Check if the j-th element is in the subset
                    subsetSum += nums[j];
                }
            }
            if (subsetSum == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println(hasSubsetWithSum(nums, target));  // Output: true if subset with sum exists, false otherwise
    }
}
</code>
</pre>

<h3>Pros and Cons of Brute Force Algorithms</h3>
<p>Brute force algorithms come with both advantages and disadvantages:</p>
<table>
    <tr>
        <th>Pros</th>
        <th>Cons</th>
    </tr>
    <tr>
        <td>Simple to implement and understand</td>
        <td>Inefficient for large inputs</td>
    </tr>
    <tr>
        <td>Guarantees correct results if a solution exists</td>
        <td>High computational cost</td>
    </tr>
    <tr>
        <td>Works well for small input sizes</td>
        <td>Usually not suitable for time-sensitive applications</td>
    </tr>
</table>

<h3>Conclusion</h3>
<p>Brute force algorithms are often the starting point in problem-solving as they provide a guaranteed solution and are easy to understand. However, due to their high time complexity, they are usually optimized further with more efficient algorithms such as <em>divide-and-conquer</em>, <em>dynamic programming</em>, or <em>greedy algorithms</em> when dealing with larger data sizes.</p>
<h2>LeetCode Problems Solved Using Brute Force</h2>

<p>This section includes a list of LeetCode problems that have been solved using the brute force approach. Brute force solutions are often used as a starting point in problem-solving, providing guaranteed correctness by exhaustively exploring all possible solutions.</p>

<ul>
    <li><a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/" target="_blank">1365. How Many Numbers Are Smaller Than the Current Number
</a></li>
    <li><a href="https://leetcode.com/problems/two-sum/" target="_blank">1. Two Sum</a></li>
    <li><a href="https://leetcode.com/problems/3sum/" target="_blank">15. 3Sum</a></li>
    
</ul>

<p>These problems demonstrate the basic brute force approach, iterating over all potential solutions. While effective, these solutions can often be optimized for better time complexity.</p>
