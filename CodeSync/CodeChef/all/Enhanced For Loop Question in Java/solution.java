/*
 * Platform: CodeChef
 * Problem: Enhanced For Loop Question in Java
 * URL: https://www.codechef.com/practice/course/java-interview-questions/JAVAPREP02/problems/JAVAMCQ15
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-28T02:07:04.319Z
 */

The enhanced for loop, also known as the for-each loop, is primarily used to iterate over arrays and collections in Java. It provides a simpler and more readable syntax for traversing elements. The syntax is:

```java
for (elementType element : arrayOrCollection) {
    // code to be executed
}
```

For example, to iterate over an array of integers:

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

This loop automatically iterates through each element in the array or collection, making it very convenient for scenarios where you need to process each element without needing the index.
