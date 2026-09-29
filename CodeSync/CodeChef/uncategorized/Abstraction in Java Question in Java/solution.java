/*
 * Platform: CodeChef
 * Problem: Abstraction in Java Question in Java
 * URL: https://www.codechef.com/practice/course/java-interview-questions/JAVAPREP05/problems/JAVAMCQ44
 * Language: Java
 * Difficulty: Unknown
 * Topics: Uncategorized
 * Runtime: N/A
 * Memory: N/A
 * Synced: 2026-09-29T06:23:49.550Z
 */

An abstract method in Java cannot have a method body. Abstract methods are declared without an implementation and are meant to be overridden by subclasses. They are declared using the 'abstract' keyword and can only exist within an abstract class or an interface. For example:

```java
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
```

In this example, 'calculateArea()' is an abstract method in the Shape class, and it must be implemented by any non-abstract subclass like Circle.
