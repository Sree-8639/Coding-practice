# Parking Charges Practice Problem in Python

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Python3 ​ |
| Difficulty | Easy |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/python/PPY02/problems/PARKINGCHARG) |
| Synced | 2026-11-20T18:36:47.356Z |

## Problem Statement

### Parking Charges

Chef needs to park her car while she watches a movie. The parking charges at the theater are as follows:

- Rs. X for the first 1 hour

- Rs. Y for every extra hour after the first hour

If Chef parks her car for H hours, what is the total parking charges that she should pay?

### Input Format

The only line of the input will contain three space separated integers - X, Y, and H.

### Output Format

Output a single integer, which should be the total amount that Chef pays as parking charge.

### Constraints

- 1≤X≤100

- 1≤Y≤100

- 1≤H≤100

### Sample 1:

```
10 1 5
```

```
14
```

### Explanation:

X=10, which means that for the first hour, Chef has to pay Rs. 10.

Y=1, which means that for every extra hour, Chef has to pay Rs. 1.

Chef needs to park for H=5 hours.

So, for the first hour, she will pay Rs. 10. And for the 5−1=4 hours extra, she will pay 4∗1=Rs. 4. So in total, she has to pay 10+4= Rs. 14.

### Sample 2:

```
1 10 100
```

```
991
```

### Explanation:

X=1, which means that for the first hour, Chef has to pay Rs. 1.

Y=10, which means that for every extra hour, Chef has to pay Rs. 10.

Chef needs to park for H=100 hours.

So, for the first hour, she will pay Rs. 1. And for the 100−1=99 hours extra, she will pay 99∗10=Rs. 990. So in total, she has to pay 1+990= Rs. 991.

### Sample 3:

```
10 15 1
```

```
10
```

### Explanation:

X=10, which means that for the first hour, Chef has to pay Rs. 10.

Y=15, which means that for every extra hour, Chef has to pay Rs. 15.

Chef needs to park for H=1 hours.

So, for the first hour, she will pay Rs. 10. And she does not have to pay any more. So in total, she has to pay Rs. 10.

## Solution Approach

This solution was accepted on CodeChef using Python3 ​. See the source code file for implementation details.

## Source Code

The accepted Python3 ​ solution is stored in `solution.txt`.
