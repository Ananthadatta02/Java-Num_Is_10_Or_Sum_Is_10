

# Integers_10_Or_Sum_Is_10

This is a simple Java program that checks two integers input by the user to determine if either of them is 10 or if their sum is 10. If any of these conditions is true, it calculates the sum and prints the square of that sum.

## 📌 Features

- Takes two integer inputs from the user.
- Checks if either number is 10 or if their sum is 10.
- If the condition is satisfied, it prints the square of the sum.

## 🧠 Logic Description

The program performs the following steps:

1. It prompts the user to enter two integers using a `Scanner`.
2. It checks the following conditions:
   - If the first number is equal to 10.
   - If the second number is equal to 10.
   - If the sum of both numbers is equal to 10.
3. If any of the above conditions are true:
   - It calculates the sum of the two numbers.
   - Then prints the square of the sum.

## 🧾 Example

### Input:
```
Enter the First number
5
Enter the Second number
5
```

### Output:
```
100
```
Explanation: Since 5 + 5 = 10, the condition is met, and the program prints 10 × 10 = 100.

## 🧑‍💻 Code

```java
package test_27_03_25;

import java.util.Scanner;

public class Integers_10_Or_Sum_Is_10 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = s.nextInt();
        System.out.println("Enter the Second number");
        int b = s.nextInt();
        int sum = 0;
        if(a==10 || b==10 || a+b==10)
        {
            sum = a + b;
            System.out.println(sum*sum);
        }
    }
}

```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Num_Is_10_Or_Sum_Is_10.git
```
