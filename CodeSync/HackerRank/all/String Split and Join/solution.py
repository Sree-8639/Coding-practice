# Platform: HackerRank
# Problem: String Split and Join
# URL: https://www.hackerrank.com/challenges/python-string-split-and-join/problem
# Language: Python 3
# Difficulty: Unknown
# Topics: Uncategorized
# Runtime: N/A
# Memory: N/A
# Synced: 2026-11-27T10:46:56.651Z

def split_and_join(line):
    l1=line.split("-")

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    
    l2="-".join(l1)
    return l1
    print(result)
