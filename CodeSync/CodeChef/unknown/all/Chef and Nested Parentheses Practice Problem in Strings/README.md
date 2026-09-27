# Chef and Nested Parentheses Practice Problem in Strings

## Problem Information

| Field | Details |
|---|---|
| Platform | CodeChef |
| Language | Java ​ |
| Difficulty | Unknown |
| Topics | Uncategorized |
| Runtime | . |
| Memory | N/A |
| Problem URL | [Link](https://www.codechef.com/practice/course/strings/STRINGSPRO/problems/NESTEDPARAN) |
| Synced | 2026-09-27T16:00:39.949Z |

## Problem Statement

### Chef and Nested Parentheses

Chef is playing with a string **sss** that contains digits, arithmetic operators, and parentheses. He wants to find the **maximum nesting depth** of parentheses in the string.

The nesting depth is the maximum number of parentheses that are open at the same time. Chef wants you to help him calculate this value.

---

### Function Declaration

- **Function Name:** - **maxNestingDepthmaxNestingDepthmaxNestingDepth**

- **Parameters:** - **sss** (`string`) A string that may contain digits, arithmetic operators **`+`**, **`-`**, **`*`**, **`/`**, and parentheses **`(`**, **`)`**.

- **Return Value:** - Returns an `int` representing the **maximum nesting depth** of parentheses in the string.

---

## Constraints

- 1≤T≤1001 \le T \le 1001≤T≤100

- 1≤∣s∣≤1001 \le |s| \le 1001≤∣s∣≤100

- **sss** consists of digits **000–999**, arithmetic operators **`+`**, **`-`**, **`*`**, **`/`**, and parentheses **`(`**, **`)`**

- **sss** is guaranteed to be a valid parentheses string (**VPS**)

---

### Input Format

- The first line contains an integer TTT — the number of test cases.

- Each of the next TTT lines contains a string sss — a valid parentheses string (VPS).

---

### Output Format

- For each test case, print a single integer — the maximum nesting depth of parentheses in the string.

---

### Sample 1:

InputOutput
```
4
((1+2)+3)
(5+(6*7))
(1+(2*(3+4)))
()()()
```

```
2
2
3
1
```

### Explanation:

**Test case 1**: Maximum nesting depth is 2.

**Test case 2**: Maximum nesting depth is 2.

**Test case 3**: Maximum nesting depth is 3 (inside `2*(3+4)`).

**Test case 4**: Maximum nesting depth is 1 (no nested parentheses).

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
