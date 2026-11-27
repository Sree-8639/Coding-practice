# Platform: HackerRank
# Problem: Write a function
# URL: https://www.hackerrank.com/challenges/write-a-function/problem
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-11-27T08:24:30.615Z

def is_leap(year):
    leap = False
    if((year % 4 ==0 & year %100!=0) or (year%400==0)):
    # Write your logic here
    
    return leap

        leap = True
        
year = int(input())
