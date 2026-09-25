/*
 * Platform: CodeChef
 * Problem: World Chess Championship
 * URL: https://www.codechef.com/viewsolution/1363098260
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-25T09:38:39.983Z
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
    int n=sc.nextInt();
    String s=sc.next();
    int CarlsenScore=0;
    int ChefScore=0;
    char a[]=s.toCharArray();
    for(char ch:a){
    if(ch=='C'){
        CarlsenScore+=2;
    }
    else if(ch=='N'){
        ChefScore+=2;
    }
    else{
        CarlsenScore++;
        ChefScore++;
    }
    }
    int prize =0;
    if(CarlsenScore>ChefScore){
        prize=60*n;
    }
    else if(CarlsenScore==ChefScore){
        prize=55*n;
    }
    else {
        prize=40*n;
    }
    System.out.println(prize);
    }
    }
}
