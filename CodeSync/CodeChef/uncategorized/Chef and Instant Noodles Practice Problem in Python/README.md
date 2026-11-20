# Chef and Instant Noodles Practice Problem in Python

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Python3 ​ |
| Difficulty | Easy |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/python/PPY01/problems/INSTNOODLE) |
| Synced | 2026-11-20T18:27:31.625Z |

## Problem Statement

### Chef and Instant Noodles

Chef has invented 1-minute Instant Noodles. As the name suggests, each packet takes exactly 1 minute to cook.

Chef's restaurant has X stoves and only 1 packet can be cooked in a single stove at any minute.

How many customers can Chef serve in Y minutes if each customer orders exactly 1 packet of noodles?

### Input Format

- The first and only line of input contains two space-separated integers X and Y — the number of stoves and the number of minutes, respectively.

### Output Format

- Print a single integer, the **maximum** number of customers Chef can serve in Y minutes

### Constraints

- 1≤X,Y≤1000

### Sample 1:

```
3 7
```

```
21
```

### Explanation:

Chef cooks for Y=7 minutes and can cook X=3 packets per minute, one on each stove.

So, the total number of packets that can be cooked is X⋅Y=3⋅7=21.

Each person orders one packet, so the maximum number of customers that can be served is 21.

### Sample 2:

```
7 8
```

```
56
```

### Explanation:

Chef cooks for Y=8 minutes and can cook X=7 packets per minute, one on each stove.

So, the total number of packets that can be cooked is X⋅Y=7⋅8=56.

Each person orders one packet, so the maximum number of customers that can be served is 56.

## Solution Approach

This solution was accepted on CodeChef using Python3 ​. See the source code file for implementation details.

## Source Code

The accepted Python3 ​ solution is stored in `solution.txt`.
