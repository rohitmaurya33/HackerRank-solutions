# Java Static Initializer Block

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer $n$, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts $n$ into a string $s$ the code will print "*Good job*". Otherwise it will print "*Wrong answer*".

$n$ can range between $-100$ to $100$ inclusive.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T17:53:23.877Z  

```java


 static int B, H;
    static boolean flag = true;
  static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-int-to-string/problem)