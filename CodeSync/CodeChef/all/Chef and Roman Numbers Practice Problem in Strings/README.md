# Chef and Roman Numbers Practice Problem in Strings

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Java ​ |
| Difficulty | Unknown |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/strings/STRINGSPRO/problems/CHEFROMAN) |
| Synced | 2026-09-27T16:22:00.774Z |

## Problem Statement

### Chef and Roman Numbers

Chef has found an ancient Roman numeral and wants to know its integer value.

Roman numerals use the following symbols:

| Symbol | Value |
| --- | --- |
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Normally, symbols are added from left to right.

For example:

**III = 3**, **VIII = 8**, **XII = 12**

However, if a smaller value comes before a larger one, it is subtracted:

- I before V (5) or X (10) → 4 or 9

- X before L (50) or C (100) → 40 or 90

- C before D (500) or M (1000) → 400 or 900

Your task is to help Chef convert the given Roman numeral string S into its integer value.

## Function Declaration

### Function Name

romanToIntromanToIntromanToInt – This function converts a given Roman numeral string into its corresponding integer value.

### Parameters

- sss : A string representing a valid Roman numeral. The string contains only the characters `I`, `V`, `X`, `L`, `C`, `D`, and `M`.

### Return Value

- Returns an integer representing the decimal (base-10) value of the given Roman numeral string.

## Constraints

- 1≤∣S∣≤151 \le |S| \le 151≤∣S∣≤15

- S contains only the characters I,V,X,L,C,D, and MS \text{ contains only the characters } I, V, X, L, C, D, \text{ and } MS contains only the characters I,V,X,L,C,D, and M.

- It is guaranteed that S is valid and represents a number between 1 and 3999\text{It is guaranteed that } S \text{ is valid and represents a number between } 1 \text{ and } 3999It is guaranteed that S is valid and represents a number between 1 and 3999.

### Input Format

- The input consists of a single line containing a string `S`, which represents a Roman numeral.

### Output Format

- Print a single integer — the decimal value of the Roman numeral.

### Sample 1:

InputOutput
```
XLII
```

```
42
```

### Sample 2:

InputOutput
```
CMXLIV
```

```
944
```

AI Tutor

English

Introducing multiple AI Chat Languages✨

Now Chat in your language! Select from the dropdown

# Welcome to the CodeChef AI Tutor

I am your problem-solving companion.

We will begin by understanding the problem together, then explore different ways to solve it.
Share any ideas you have — and I will help you refine and build on them.

**Ready to get started?**

Add my Code

## Solution Approach

This solution was accepted on CodeChef using Java ​. See the source code file for implementation details.

## Source Code

The accepted Java ​ solution is stored in `solution.txt`.
