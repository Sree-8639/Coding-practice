# Platform: HackerRank
# Problem: Python If-Else
# URL: https://www.hackerrank.com/challenges/py-if-else/problem
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-11-27T07:41:54.877Z

#!/bin/python3

import math
import os
import random
import re
import sys

n=int(input())
if (n%2==0):
    if n in range(2,5):
        print("Not Weird")
else:
    elif n in range(6,20):
        print("Weird")
    else:
        print("Not Weird")      
    print("Weird")
