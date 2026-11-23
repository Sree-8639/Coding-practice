# 1. Email Duplicates

## Problem Information

| Field | Details |
|---|---|
| Platform | TakeUForward (Striver) |
| Language | Java |
| Difficulty | Medium |
| Topics | Uncategorized |
| Runtime | N/A |
| Memory | N/A |
| Problem URL | [Link](https://takeuforward.org/practice/sql/email-duplicates) |
| Synced | 2026-11-23T14:16:22.773Z |

## Problem Statement

In user account systems, duplicate email registrations can lead to confusion, security issues, or data corruption. Detecting these duplicates is essential for maintaining data integrity, ensuring unique logins, and preventing fraudulent registrations.

You are given a **Person** table:

```
╔═════════════╦══════════╗
║ Column Name ║ Type ║
╠═════════════╬══════════╣
║ id ║ int ║
║─────────────┼──────────║
║ email ║ varchar ║
╚═════════════╩══════════╝
```

- **id**: A unique identifier for the user.
- **email**: The email address registered. The emails will not contain uppercase letters.

Write a query to find all duplicate email addresses from the table. It is guaranteed that the email field is never NULL. The result can be returned in any order.

### Example 1:

**Example:**

**Input:**

Person Table:

```
╔════╦═════════╗
║ id ║ email ║
╠════╬═════════╣
║ 1 ║ a@b.com ║
║────┼─────────║
║ 2 ║ c@d.com ║
║────┼─────────║
║ 3 ║ a@b.com ║
╚════╩═════════╝
```

**Output:**

```
╔═════════╗
║ email ║
╠═════════╣
║ a@b.com ║
╚═════════╝
```

**Explanation:**

- **a@b.com** appears **twice**, which qualifies it as a duplicate.
- **c@d.com** appears only once, so it's excluded.

### Hints

```
###
```

## Solution Approach

This solution was accepted on TakeUForward (Striver) using Java. See the source code file for implementation details.

## Source Code

The accepted Java solution is stored in `solution.java`.
