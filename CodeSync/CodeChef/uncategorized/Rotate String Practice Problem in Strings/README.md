# Rotate String Practice Problem in Strings

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Java ​ |
| Difficulty | Unknown |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/strings/STRINGSPRO/problems/ROTATESTRING) |
| Synced | 2026-09-27T17:22:43.914Z |

## Problem Statement

### Rotate String

You are given two strings s and goal of equal length. Determine whether string s can be transformed into string goal by performing a series of **left-shifts**.

A **left-shift** operation moves the first character of a string to the end of the string. For example, a left-shift on `"abcde"` results in `"bcdea"`.

If it is possible to transform s into goal using zero or more left-shifts, print `"Yes"`.

Otherwise, print `"No"`.

## Function Declaration

### Function Name

canRotate – This function checks whether a string can be rotated using left-shift operations to match a target string.

### Parameters

- s : A string representing the original string.

- goal : A string representing the target string after rotations.

### Return Value

- Returns true if string s can be transformed into string goal using zero or more left-shift operations.

- Returns false otherwise.

## Constraints

- 1≤∣s∣=∣goal∣≤100

- Strings s and goal consist of lowercase English letters.

### Input Format

- The first line contains the string s.

- The second line contains the string goal.

### Output Format

- Print `"Yes"` if s can be rotated to become goal.

- Print `"No"` otherwise.

### Sample 1:

```
hello
ohell
```

```
Yes
```

### Explanation:

`"hello"` left-shifted 4 times becomes `"ohell"`, so the answer is `"Yes"`.

### Sample 2:

```
world
dlrow
```

```
No
```

### Explanation:

No sequence of left-shifts can transform `"world"` into `"dlrow"`, so the answer is `"No"`.

## Solution Approach

This solution was accepted on CodeChef using Java ​. See the source code file for implementation details.

## Source Code

The accepted Java ​ solution is stored in `solution.txt`.
