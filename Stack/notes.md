<h1>Stack Data Structure</h1>

<h2>1. Introduction</h2>
<p>A stack is a linear data structure that follows the Last In First Out (LIFO) principle. In a stack, the last element added is the first one to be removed.</p>

<h2>2. Characteristics of Stack</h2>
<ul>
    <li>Dynamic size: Stacks can grow and shrink as needed.</li>
    <li>Last In First Out (LIFO): The last element added is the first to be removed.</li>
    <li>Operations: The main operations of a stack are <strong>push</strong> (to add an element), <strong>pop</strong> (to remove the top element), and <strong>peek</strong> (to view the top element without removing it).</li>
</ul>

<h2>3. Stack Operations</h2>
<h3>3.1 Push</h3>
<p>The push operation adds an element to the top of the stack.</p>
<pre><code>public void push(int value) {
    // Add value to the top of the stack
}</code></pre>

<h3>3.2 Pop</h3>
<p>The pop operation removes the top element from the stack and returns it.</p>
<pre><code>public int pop() {
    // Remove and return the top element of the stack
}</code></pre>

<h3>3.3 Peek</h3>
<p>The peek operation returns the top element of the stack without removing it.</p>
<pre><code>public int peek() {
    // Return the top element without removing it
}</code></pre>

<h2>4. Stack Implementation in Java</h2>
<pre><code>import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}</code></pre>

<h2>5. Applications of Stack</h2>
<ul>
    <li>Expression evaluation and parsing (infix, postfix, prefix).</li>
    <li>Backtracking algorithms.</li>
    <li>Memory management (function call management).</li>
    <li>Undo mechanisms in applications.</li>
</ul>

<h2>6. LeetCode Problems Solved Using Stack</h2>
<ul>
    <li><a href="https://leetcode.com/problems/valid-parentheses/" target="_blank">20. Valid Parentheses</a>
    <li><a href="https://leetcode.com/problems/simplify-path/" target="_blank">71. Simplify Path</a>
    <li><a href="https://leetcode.com/problems/remove-outermost-parentheses/" target="_blank">1021. Remove Outermost Parentheses</a>
    <li><a href="https://leetcode.com/problems/basic-calculator-ii/" target="_blank">227. Basic Calculator II</a>
</ul>

<h2>7. Time Complexity</h2>
<ul>
    <li><strong>Push:</strong> O(1)</li>
    <li><strong>Pop:</strong> O(1)</li>
    <li><strong>Peek:</strong> O(1)</li>
</ul>

<h2>8. Conclusion</h2>
<p>Stacks are a fundamental data structure with various applications in programming. Understanding how to implement and utilize stacks is crucial for problem-solving in computer science.</p>
