# Evaluate Reverse Polish Notation (RPN)

## Problem
Given an array of strings `tokens` representing an arithmetic expression in **Reverse Polish Notation**, evaluate the expression and return the result.

**Operators supported:** `+`, `-`, `*`, `/`  
**Operands:** Integers  

## Approach
- Use a **stack** to store operands.
- Iterate through each token:
  - If it's a number, push it onto the stack.
  - If it's an operator, pop two numbers, apply the operator, and push the result back.
- After processing all tokens, the stack contains the final result.

## Example
```java
String[] tokens = {"2", "1", "+", "3", "*"};
Solution sol = new Solution();
int result = sol.evalRPN(tokens);
System.out.println(result); // Output: 9


Explanation: ((2 + 1) * 3) = 9

Time Complexity (TC)

O(n), where n is the number of tokens. Each token is processed exactly once.

Space Complexity (SC)

O(n) in the worst case, for the stack storing operands.