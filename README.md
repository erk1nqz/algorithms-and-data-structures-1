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
```


## :heavy_plus_sign: Task 4 [file src](src/fourth.java)
**Description**: *Return factorial number*

**Explanation**: Base condition: `n=1`, then we `return 1` (the 1st element in the sequence). Otherwise: multiply the current number by the factorial of the number by one less

**Solution**:
```java
 public static int getFactorial(int n) {
        if (n == 1) { // base case
            return 1;
        }
        else {
            return n * getFactorial(n-1); // repeating statement
        }
    }
```

## :heavy_plus_sign: Task 5 [file src](src/fifth.java)
**Description**: *Return the number on n-th position of fibonacci sequence*

**Explanation**: Two basic conditions: `n=1` and `n=2`, then we return the corresponding values.
Otherwise: the sum of two recursions with arguments `n-1` and `n-2`

**Solution**:
```java
 public static int getFibonacci(int n) {
        if (n == 1 || n == 2) { // base case
            return 1;
        }
        else {
            return getFibonacci(n-1) + getFibonacci(n-2); // repeating statement
        }
    }
```


## :heavy_plus_sign: Task 6 [file src](src/sixth.java)
**Description**: *Return base in power n*

**Explanation**: Base case: `base=1`. 
- When `base=1` we just return base. 
- Otherwise, we return `a * getPower(a, n-1)` so that we loop n times.

**Solution**:
```java
 public static int getPower(int a, int n) {
        if (n == 1) { // base case
            return a;
        }
        else {
            return a * getPower(a, n-1); // repeating statement
        }
    }
```


## :heavy_plus_sign: Task 7 [file src](src/seventh.java)
**Description**: *Reverse an array*

**Explanation**: Base case: `n=1`. 
- When `n=1` we just return `Integer.toString(arr[0])`. 
- Otherwise, we return `Integer.toString(arr[n-1]) + " " + getReverse(n-1, arr))`.

**Solution**:
```java
public static String getReverse(int n, int[] arr) {
        if (n == 1) { // base case
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + getReverse(n-1, arr); // repeating statement
        }
    }
```


## :heavy_plus_sign: Task 8 [file src](src/eighth.java)
**Description**: *Check is provided string is integer*

**Explanation**: 
A function to check whether everything consists of digits. Base case: `text.lenth=1`. 


**Solution**:
```java
 public static boolean isAllDigits(String text) {
        if (text.length() == 1) return Character.isDigit(text.charAt(0)); // base case
        else return Character.isDigit(text.charAt(0)) && isAllDigits(text.substring(1)); // repeating statement
    }
```


## :heavy_plus_sign: Task 9 [file src](src/ninth.java)
**Description**: *Return binomial coefficient of `n` and `k` params*

**Explanation**: Base cases: 
- `k=0` and `k=n` we always return 1.
- Otherwise we return sum of functions recoursivly with (`n-1`, `k-1`) and (`n-1`, `k`) params;

**Solution**:
```java
public static int findBinom(int n, int k) {
        if (k == 0 || k == n) return 1; // base case
        else return findBinom(n-1, k-1) + findBinom(n-1, k); // repeating statement
    }
```

## :heavy_plus_sign: Task 10 [file src](src/tenth.java)
**Description**: *Return GCD of `a` and `b`*


**Explanation**: Base case: `b=0`, then we return a; Otherwise we call recursivly function with (`b`, `a % b`)
We made a loop of condition: `while b != 0` we replace `a` with `b` and `b` with `a % b` - common devisor

**Solution**:
```java
public static int findGCD(int a, int b) {
        if (b == 0) return a; // base case
        else return findGCD(b, a % b); // repeating statement
    }
```
