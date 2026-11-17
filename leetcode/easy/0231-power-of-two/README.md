# Power of Two

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, return  *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

 

Original
Java
 **Example 1:** 

```
Input: n = 1
Output: true
Explanation: 20 = 1

```

 **Example 2:** 

```
Input: n = 16
Output: true
Explanation: 24 = 16

```

 **Example 3:** 

```
Input: n = 3
Output: false

```

 

 **Constraints:** 

- -231 <= n <= 231 - 1

 

 **Follow up:**  Could you solve it without loops/recursion?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.28%)  
**Memory:** 41.9 MB (beats 88.79%)  
**Submitted:** 2026-11-17T16:11:46.654Z  

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true  ;
        }
         if(n <= 0 || n % 2 != 0) {
            return false;
        }

        
        return isPowerOfTwo(n/2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/power-of-two/)