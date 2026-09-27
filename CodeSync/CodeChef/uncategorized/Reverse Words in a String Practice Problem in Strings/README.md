# Reverse Words in a String Practice Problem in Strings

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Java ​ |
| Difficulty | Unknown |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/strings/STRINGSPRO/problems/REVERSEWORD) |
| Synced | 2026-09-27T17:25:48.132Z |

## Problem Statement

### Reverse Words in a String

You are given a string s consisting of English letters, digits, and spaces `' '`.

Your task is to **reverse the order of the words** in the string.

A word is defined as a sequence of non-space characters.

The words in s are separated by one or more spaces.

You must:

- Return the words in **reverse order**, separated by a **single space**.

- Remove any **leading**, **trailing**, or **multiple spaces** between words.

### Function Declaration

### Function Name

reverseWords – This function reverses the order of words in a given string while removing extra spaces.

### Parameters

- s : A reference to a string consisting of English letters (uppercase and lowercase), digits, and spaces.

### Return Value

- Returns a string where: - The order of words is reversed. - Words are separated by a single space. - Leading, trailing, and multiple spaces are removed.

## Constraints

- 1≤T≤100

- 1≤∣s∣≤104

- The string contains English letters (uppercase and lowercase), digits, and spaces.

- There is at least one word in the string.

### Input Format

- The first line contains a single integer T — the number of test cases.

- Each of the next T lines contains a string s.

### Output Format

- For each test case, print a single line containing the string with words in reverse order, separated by a single space.

### Sample 1:

```
4
codechef is awesome
java and python
123 test case
learn data structures
```

```
awesome is codechef
python and java
case test 123
structures data learn
```

### Sample 2:

```
1
Roses are red
```

```
red are Roses
```

## Solution Approach

This solution was accepted on CodeChef using Java ​. See the source code file for implementation details.

## Source Code

The accepted Java ​ solution is stored in `solution.txt`.
