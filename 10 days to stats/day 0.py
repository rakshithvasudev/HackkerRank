'''
Objective 
In this challenge, we practice calculating the mean, median, and mode. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given an array, , of  integers, calculate and print the respective mean, median, and mode on separate lines. If your array contains more than one modal value, choose the numerically smallest one.

Note: Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of  decimal place (i.e., ,  format).

Input Format

The first line contains an integer, , denoting the number of elements in the array. 
The second line contains  space-separated integers describing the array's elements.

Constraints

, where  is the  element of the array.
Output Format

Print  lines of output in the following order:

Print the mean on a new line, to a scale of  decimal place (i.e., , ).
Print the median on a new line, to a scale of  decimal place (i.e., , ).
Print the mode on a new line; if more than one such value exists, print the numerically smallest one.
Sample Input

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
Sample Output

43900.6
44627.5
4978
Explanation

Mean: 
We sum all  elements in the array, divide the sum by , and print our result on a new line.

Median: 
To calculate the median, we need the elements of the array to be sorted in either non-increasing or non-decreasing order. The sorted array . We then average the two middle elements:

and print our result on a new line.
Mode: 
We can find the number of occurrences of all the elements in the array:

 4978 : 1
11735 : 1
14216 : 1
14470 : 1
38120 : 1
51135 : 1
64630 : 1
67060 : 1
73429 : 1
99233 : 1
Every number occurs once, making  the maximum number of occurrences for any number in . Because we have multiple values to choose from, we want to select the smallest one, , and print it on a new line.
'''


num_ele = int(input().strip())
elements = input().strip().split()
elements = list(map(int,elements))
sum = 0
mode_map={}

for num in elements:
    sum += num
print(sum/num_ele)
elements = sorted(elements)

if num_ele % 2 != 0:
    mid_num = num_ele/2 + 0.5 
    print(elements[int(mid_num)])
    
if num_ele % 2 == 0:
    mid_num = num_ele/2
    mid_num1 = mid_num-0.5
    mid_num2 = mid_num+0.5
    print((int(elements[int(mid_num1)])+int(elements[int(mid_num2)]))/2)

max_number = 0
    
for current_number in elements:
    if elements.count(current_number) > max_number:
        max_number = current_number

print(max_number)