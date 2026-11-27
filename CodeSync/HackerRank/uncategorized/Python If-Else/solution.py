# Platform: HackerRank
# Problem: Python If-Else
# URL: https://www.hackerrank.com/challenges/py-if-else/problem
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-11-27T07:42:52.107Z

#!/bin/python3

n=int(input())
if (n%2==0):
    if n in range(2,5):
        print("Not Weird")
    elif n in range(6,21):
        print("Weird")
    else:
        print("Not Weird")      
else:
    print("Weird")
