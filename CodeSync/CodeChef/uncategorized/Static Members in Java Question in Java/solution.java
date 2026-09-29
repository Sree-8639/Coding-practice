/*
 * Platform: CodeChef
 * Problem: Static Members in Java Question in Java
 * URL: https://www.codechef.com/practice/course/java-interview-questions/JAVAPREP05/problems/JAVAMCQ48
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-29T06:27:19.021Z
 */

Static members (variables and methods) in Java belong to the class rather than any specific instance of the class. They can be accessed using the class name, without creating an object of the class. Static variables are shared by all instances of the class and are initialized when the class is loaded, not when objects are created. Static methods cannot access non-static members directly because they don't have access to a specific instance. Static methods cannot be overridden, although they can be hidden in subclasses. For example:

```java
class Counter {
    static int count = 0;
    
    Counter() {
        count++;
    }
    
    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

Counter c1 = new Counter();
Counter c2 = new Counter();
Counter.displayCount(); // Outputs: Count: 2
```

In this example, 'count' is a static variable shared by all Counter objects, and 'displayCount()' is a static method that can be called using the class name.
