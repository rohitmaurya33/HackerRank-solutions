# Power of Four

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of four. Otherwise, return `false`*.

An integer `n` is a power of four, if there exists an integer `x` such that `n == 4x`.

 

Original
Java
 **Example 1:** 

```
Input: n = 16
Output: true

```

 **Example 2:** 

```
Input: n = 5
Output: false

```

 **Example 3:** 

```
Input: n = 1
Output: true

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 93.95%)  
**Memory:** 42.2 MB (beats 64.12%)  
**Submitted:** 2026-11-17T16:20:13.701Z  

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true  ;
        }
         if(n <= 0 || n % 4 != 0) {
            return false;
        }

        
        return isPowerOfFour(n/4);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-four/)