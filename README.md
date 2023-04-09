# Assignment1 Documentation
In this file description the solution of all tasks in Laboratory 1

## Main.java file [src](src/Main.java)
** This is the starting class that connects the CLI to the modules of the tasks being solved.**
** All the functions that were used to solve problems will be described below.**

## :heavy_plus_sign: Task 1 [file src](src/task1.java)
**Description**: *Return the minimum value of an array*

**Explanation**: 
Declaring a new value `int minNum` and starting with first index because of minNum value is started from 0. Loop compare array elementsб checkung for minimum.


**Solution**:
```java
public static int findMin(int n, int[] arr) {
        int minNum = arr[0]; // declaring a new value
        for (int i = 1; i < n; i++) { // starting with 1st index because of minNum value is started from 0
            if (arr[i] < minNum) { // checking for minimum
                minNum = arr[i]; // updating value if new less
            }
        }
        return minNum; // returning minimum value
    }
```
