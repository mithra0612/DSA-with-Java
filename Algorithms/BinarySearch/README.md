<h2>Binary Search in Java</h2>

<p>
    <strong>Binary Search</strong> is an efficient algorithm for finding an item from a sorted list of items. It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, the search continues in the lower half, or if the value is greater, it continues in the upper half. This process continues until the value is found or the interval is empty.
</p>

<h3>Key Features of Binary Search</h3>
<ul>
    <li>Efficient for large datasets; time complexity is <code>O(log n)</code>.</li>
    <li>Requires the data to be sorted prior to performing the search.</li>
    <li>Can be implemented iteratively or recursively.</li>
</ul>

<h3>How Binary Search Works</h3>
<p>
    The algorithm compares the target value to the middle element of the array:
</p>
<ol>
    <li>If the target value equals the middle element, the search is complete.</li>
    <li>If the target value is less than the middle element, repeat the search on the left subarray.</li>
    <li>If the target value is greater than the middle element, repeat the search on the right subarray.</li>
</ol>

<h3>Binary Search Algorithm</h3>
<p>The binary search algorithm can be implemented in two ways: iteratively and recursively.</p>

<h4>1. Iterative Implementation</h4>
<pre><code>
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }
            // If target is smaller, ignore right half
            else if (arr[mid] > target) {
                right = mid - 1;
            }
            // If target is larger, ignore left half
            else {
                left = mid + 1;
            }
        }
        return -1; // Target not found
    }
}
</code></pre>

<h4>2. Recursive Implementation</h4>
<pre><code>
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int mid = left + (right - left) / 2;

        // Check if the target is present at mid
        if (arr[mid] == target) {
            return mid; // Target found
        }
        // If target is smaller, search in the left subarray
        else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
        // If target is larger, search in the right subarray
        else {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
    }
}
</code></pre>

<h3>Performance Considerations</h3>
<p>
    The efficiency of binary search lies in its logarithmic time complexity. The primary requirement is that the array must be sorted. In terms of space complexity, the iterative approach uses <code>O(1)</code> space, while the recursive approach uses <code>O(log n)</code> space due to the function call stack.
</p>

<h3>Common Use Cases</h3>
<ul>
    <li>Searching for an element in a sorted array.</li>
    <li>Finding the first or last occurrence of an element.</li>
    <li>Finding the square root of a number or solving optimization problems.</li>
</ul>

<h2>LeetCode Problems Solved Using Binary Search</h2>
<p>
    Below are some common LeetCode problems that can be solved using the Binary Search algorithm:
</p>

<ul>
    <li>
        <a href="https://leetcode.com/problems/binary-search/" target="_blank">704. Binary Search</a>
        <p>
            <strong>Description:</strong> Implement binary search to find the index of a target value in a sorted array. If the target is not found, return -1.
        </p>
    </li>
    <li>
        <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/" target="_blank">33. Search in Rotated Sorted Array</a>
        <p>
            <strong>Description:</strong> Given a rotated sorted array, search for a target value. This problem can be solved using a modified binary search approach.
        </p>
    </li>
    <li>
        <a href="https://leetcode.com/problems/find-peak-element/" target="_blank">162. Find Peak Element</a>
        <p>
            <strong>Description:</strong> A peak element is an element that is greater than its neighbors. This can be efficiently found using binary search.
        </p>
    </li>
    <li>
        <a href="https://leetcode.com/problems/binary-search/" target="_blank">704. Binary Search
        <a href="https://leetcode.com/problems/binary-search/" target="_blank">704. Binary Search
</a>
    </li>
    <li>
        <p>
            <strong>Description:</strong> Koko loves bananas and is trying to eat them at a certain speed. The task is to determine the minimum eating speed Koko needs to finish all the bananas in a given time, which can be solved using binary search.
        </p>
    </li>
</ul>

<p>These problems illustrate how binary search can be applied to various scenarios involving sorted data, helping to improve search efficiency.</p>
