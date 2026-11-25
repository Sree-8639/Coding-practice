# Oneful Pairs Practice Problem in Python

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Python3 ​ |
| Difficulty | Easy |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/python/PPY03/problems/ONEFULPAIRS) |
| Synced | 2026-11-25T09:41:09.209Z |

## Problem Statement

### Oneful Pairs

Chef defines a pair of positive integers (a,b) to be a Oneful Pair, if

a+b+(a⋅b)=111

For example, (1,55) is a Oneful Pair, since 1+55+(1⋅55)=56+55=111.

But (1,56) is not a Oneful Pair, since 1+56+(1⋅56)=57+56=113≠111.

Given two positive integers a and b, output `Yes` if they are a Oneful Pair. And `No` otherwise.

### Input Format

The only line of input contains two space-separated integers a and b.

### Output Format

Output `Yes`, if (a,b) form a Oneful Pair. Output `No` if they do not.

You may print each character of `Yes` and `No` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints

- 1≤a,b≤1000

### Sample 1:

```
1 55
```

```
Yes
```

### Explanation:

(1,55) is a Oneful Pair, since 1+55+(1⋅55)=56+55=111.

### Sample 2:

```
1 56
```

```
No
```

### Explanation:

(1,56) is not a Oneful Pair, since 1+56+(1⋅56)=57+56=113≠111

## Solution Approach

This solution was accepted on CodeChef using Python3 ​. See the source code file for implementation details.

## Source Code

The accepted Python3 ​ solution is stored in `solution.txt`.
