[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=16758178)
# unit-3-assignment-2

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since the shape classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

Do each of the following in a single program.

## Problem 1
Write a program to test if a double input from the keyboard is equal to the double 12.345. If the input is equal to 12.345, print "YES" (without the quotes).

Sample run 1:
```
Please enter a double:
54.321
```
Sample run 2:
```
Please enter a double:
12.345
YES
```

## Problem 2
Write a program to test if an integer input from the keyboard is equal to 48. If it is, print "YES" (without the quotes).

Sample run 1:
```
Please enter an integer:
46
```
Sample run 2:
```
Please enter an integer:
48
YES
```

## Problem 3
Write a program that takes two integers from the keyboard and tests if the second integer is twice the first integer. If the second integer is twice the first integer, print "YES" (without the quotes).

Sample run 1:
```
Please enter two integers:
44
65
```
Sample run 2:
```
Please enter two integers:
20
40
YES
```

## Problem 4
Write a program to test if an integer input from the keyboard is divisible by two, or divisible by 3, or both!

Sample Run 1:
```
Please enter an integer:
7
```
Sample Run 2:
```
Please enter an integer:
4
Divisible by 2!
```
Sample Run 3: 
```
Please enter an integer:
9
Divisible by 3!
```
Sample Run 4: 
```
Please enter an integer:
18
Divisible by 2!
Divisible by 3!
```
(Hint: You will probably need to use the % operator for this one.)

## Problem 5
Write a program that takes the input of an integer number from the keyboard and prints "Even" if the integer is even , and prints “Odd" otherwise. You must use an else statement to gain full credit for this exercise.

Sample run 1
```
Please enter an integer
7
Odd
```
Sample run 2
```
Please enter an integer
-2
Even
```

## Problem 6
Write a program that takes input as a String letter grade from the keyboard and translates it to a grade range. For example, if a user enters “A”, the program should output “90-100”.

- “A” = “90-100”
- “B” = “80-90”
- “C” = “70-80”
- “D” = “60-70”
- “F” = “0-60”

The program should only accept the five strings outlined above. If the user enters any other strings, the program should print “Invalid letter grade”.

Sample run 1: 
```
Please enter a letter grade:
A
90-100
```
Sample run 2: 
```
Please enter a letter grade:
a
Invalid letter grade
```
Sample run 3:
```
Please enter a letter grade:
abc
Invalid letter grade
To gain full credit for this exercise you will need to use else if statements when checking the grade.
```

Hint: For comparing the strings, you should be using the `.equals()` method from the String class.

## Problem 7
Create a program to check if a user can do simple addition. The program will generate two random integers.
- The first should be between 0 and 50 (inclusive)
- The second should be between 51 and 100 (inclusive)

Then, user should input an integer as their answer to the sum of the two numbers. If they enter the correct sum print “Correct!” otherwise print “Wrong”. You must use an else statement in your code to receive full credit for this exercise.

Sample run 1:
```
4 + 47 = ?
> 12
Wrong
```
Sample run 2:
```
8 + 82 = ?
> 90
Correct!
```

## Problem 8
We are going to revisit a former coding activity on temperature, with a slight adjustment. 

You are running an experiment that involves tracking human body temperature. The "normal" body temperature can have a wide range from 97 to 99 degrees Fahrenheit.

Write the code for the sensor that will be tracking the temperature. If the temperature falls between 97 and 99 (inclusive) your code should print “Temperature is OK”. Otherwise, your code should print “NOT NORMAL”.

Sample Run 1:
```
What is the temperature?
101
NOT NORMAL
```
Sample Run 2:
```
What is the temperature?
98
Temperature is OK
```
