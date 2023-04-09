# Assignment1 Documentation
In this file description the solution of all tasks in Laboratory 1

## Main.java file [src](src/Main.java)
**This is the starting class that connects the CLI to the modules of the tasks being solved.**
**All the functions that were used to solve problems will be described below.**

## :heavy_plus_sign: Task 1 [file src](src/first.java)
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



## :heavy_plus_sign: Task 2 [file src](src/second.java)
**Description**: *Return average value of array*

**Explanation**: Declaring a new value `double sum` and starting with first index because of minNum value is started from 0.  Loop adding each element of array and divide the sum by the number of array elements.


**Solution**:
```java
public static double findAverage(int n, int[] arr) {
        double sum = arr[0]; // declaring new value
        for (int i = 1; i < n; i++) { // starting with 1st index because of minNum value is started from 0
            sum += arr[i]; // adding each element of array to value sum
        }
        return sum / n; // returning average by dividing sum to n
    }
```


## :heavy_plus_sign: Task 3 [file src](src/third.java)
**Description**: *Check a number for a prime*

**Explanation**: Function `isPrime` check a number for a prime. Loop started from number 2. If number have any divisors the function return `false`, otherwise `true`.

**Solution**:
```java
 public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) { // choosing from 2 to n-1
            if (n % i == 0) { // if the number have any divisors
                return false;
            }
        }
        return true;
    }
