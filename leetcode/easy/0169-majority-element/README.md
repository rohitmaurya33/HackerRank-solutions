# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 32.84%)  
**Memory:** 62.5 MB (beats 58.02%)  
**Submitted:** 2026-11-04T13:08:06.115Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
         int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
             count++;  
            }
            else{
                count=1;
            }
            if(count>nums.length/2){
                  return nums[i];
            }
        }
         return nums[0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)