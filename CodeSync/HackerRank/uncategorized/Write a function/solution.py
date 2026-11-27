# Platform: HackerRank
# Problem: Write a function
# URL: https://www.hackerrank.com/challenges/write-a-function/problem
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-11-27T08:28:10.292Z

def is_leap(year):
    leap = False
    if((year % 4 ==0 and year %100!=0) or (year%400==0)):
        leap = True
        
    # Write your logic here
    
    return leap

year = int(input())
print(is_leap(year))
