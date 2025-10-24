#  Basic Calculator — README

##  Overview
This Java program implements a **Basic Calculator** that can evaluate arithmetic expressions containing  
`+`, `-`, `*`, and `/` operators with integer operands.

It uses a **stack-based approach** to handle operator precedence — multiplication and division are evaluated immediately, while addition and subtraction are deferred.

---

##  How It Works
1. Iterates through the input string `s`.  
2. Builds multi-digit numbers on the fly.  
3. When an operator is encountered:
   - Resolves the previous operator and pushes the result (or negated value) to the stack.  
4. After traversal, performs the last pending operation.  
5. Sums up all values in the stack to produce the final result.

---

##  Time Complexity
**O(n)** — Each character in the string is processed once.  
- Stack operations (`push` / `pop`) take **O(1)** time each.  
- There are no nested loops or repeated traversals.

---

##  Space Complexity
**O(n)** in the worst case.  
- The stack can store up to `n/2` numbers (in expressions like `1+2+3+...`).  
- Additional space for integer variables is **O(1)**.

---

## Example
**Input:**
```java
"3+2*2"
