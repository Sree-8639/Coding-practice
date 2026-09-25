# World Chess Championship

- Platform: CodeChef
- Language: Java
- Difficulty: Unknown
- Topics: Uncategorized
- Runtime: N/A
- Memory: N/A
- Problem URL: https://www.codechef.com/viewsolution/1363098260
- Synced: 2026-09-25T09:42:37.817Z

## Problem Description

Hello, KADALI ANYA SREE Courses Practice Compete Compiler Home » STRINGS » WCC » Submissions » 1363098260 World Chess Championship Status: Correct Answer Submission by: 1 u23a81a6193 Submitted: 6 minutes ago Problem: WCC Contest: STRINGS Code Enthusiast Badge 0 / 10 Explain 10 solutions to get Bronze Badge Language: Java 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 import java.util.*; import java.lang.*; import java.io.*; class Codechef { public static void main (String[] args) throws java.lang.Exception { Scanner sc=new Scanner(System.in); int t=sc.nextInt(); for(int i=0;i<t;i++){ int n=sc.nextInt(); String s=sc.next(); int CarlsenScore=0; int ChefScore=0; char a[]=s.toCharArray(); for(char ch:a){ if(ch=='C'){ CarlsenScore+=2; } else if(ch=='N'){ ChefScore+=2; } else{ CarlsenScore++; ChefScore++; } } int prize =0; if(CarlsenScore>ChefScore){ prize=60*n; } else if(CarlsenScore==ChefScore){ prize=55*n; } else { prize=40*n; } System.out.println(prize); } } } Help others understand your code better. Know More Explain your code with the help of annotations. Examples Explain your logic / approach to the problem. Explain why certain Data structures and algorithms have been used Call-out problem specific corner cases that your code has handled Popular explanations will be featured on the submissions tab of the problem Explain My Code Subtask Info Correct Answer Submission ID: 1363098260 Score: 100 Memory: 43.9M Sub-Task Task # Result (time) 1 1 Correct (0.07) Subtask Score: 50% Result - Correct 2 2 Correct (0.16) Subtask Score: 50% Result - Correct Total Score = 100%

## Explanation

This solution was accepted on CodeChef using Java. Review the synced source file for the implementation details.
