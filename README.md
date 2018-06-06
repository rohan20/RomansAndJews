# RomansAndJews
Programming problem

Flavius Josephus was a famous Jewish historian of the first century, at the time of the destruction of the Second Temple. According to legend, during the Jewish-Roman war he was trapped in a cave with a group of soldiers surrounded by Romans. Preferring death to capture, the Jews decided to form a circle and, proceeding around it, to kill every ithperson remaining until no one was left. Josephus found the safe spot in the circle and thus stayed alive. 
Write a program that returns a list of n people, numbered from 0 to n-1, in the order in which they are executed.

Input:
Your program should read lines from standard input. Each line contains two comma-separated positive integers n and m, where n is the number of people and every mth person will be executed. (m is less than n).

Output:
Print out the list of n people (space delimited) in the order in which they will be executed.

Examples:

#1

Test Input 
10,3
Expected Output 
2 5 8 1 6 0 7 4 9 3

#2

Test Input 
5,2
Expected Output 
1 3 0 4 2
