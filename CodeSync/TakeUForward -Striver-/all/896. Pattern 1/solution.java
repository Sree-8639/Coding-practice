/*
 * Platform: TakeUForward (Striver)
 * Problem: 896. Pattern 1
 * URL: https://takeuforward.org/practice/dsa/pattern-1
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: 0.860 ms
 * Memory: N/A
 * Synced: 2026-09-30T16:32:29.914Z
 */

class Solution {
    public void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
