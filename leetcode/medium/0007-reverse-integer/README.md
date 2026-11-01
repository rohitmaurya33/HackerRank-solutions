# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer `x`, return `x` *with its digits reversed*. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

 **Assume the environment does not allow you to store 64-bit integers (signed or unsigned).** 

 

 **Example 1:** 

```
Input: x = 123
Output: 321

```

 **Example 2:** 

```
Input: x = -123
Output: -321

```

 **Example 3:** 

```
Input: x = 120
Output: 21

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 18.59%)  
**Memory:** 42.5 MB (beats 64.43%)  
**Submitted:** 2026-11-01T13:29:27.722Z  

```java
class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean temp=false;
       
        while(x!=0){
             int rem=x%10;
             rev=rev*10+rem;
             x=x/10;

        }
    
     if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
       return (int)rev;

    };
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)