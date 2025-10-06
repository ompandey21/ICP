# Simplify Path

## Problem
Given an **absolute Unix-style file path**, simplify it to its canonical form.  

**Rules:**
- `.` → current directory (ignore)  
- `..` → move up one directory  
- multiple `/` → treated as a single `/`  

## Approach
- Use a **stack** to keep track of valid directories.
- Split the path by `/`.
- Iterate through each segment:
  - Ignore `.` and empty strings.
  - Pop the stack for `..` if possible.
  - Push any valid directory onto the stack.
- Join the stack with `/` to form the simplified path.

## Example
```java
Solution sol = new Solution();
System.out.println(sol.simplifyPath("/a/./b/../../c/")); // Output: "/c"
```
Time Complexity (TC)

O(n), where n is the length of the path. Each segment is processed once.

Space Complexity (SC)

O(n), for the stack storing directory names.