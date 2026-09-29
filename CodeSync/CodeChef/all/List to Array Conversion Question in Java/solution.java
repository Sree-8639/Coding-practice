/*
 * Platform: CodeChef
 * Problem: List to Array Conversion Question in Java
 * URL: https://www.codechef.com/practice/course/java-interview-questions/JAVAPREP03/problems/JAVAMCQ30
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-29T06:15:43.267Z
 */

The method used to convert a List to an array in Java is List.toArray(). This method returns an array containing all of the elements in the list in proper sequence. There are two versions of this method:

1. Object[] toArray(): Returns an array of Objects.
2. <T> T[] toArray(T[] a): Returns an array of the runtime type of the specified array.

For example:
```java
List<String> list = new ArrayList<>();
list.add("Hello");
list.add("World");
String[] array = list.toArray(new String[0]);
```

Note that Arrays.asList() does the opposite - it converts an array to a List.
