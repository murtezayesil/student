#!/usr/bin/python3.7

#  ___ _         _
# |  _|_|___ ___| |_ _ _ ___ ___
# |  _| |- _|- _| . | | |- _|- _|
# |_| |_|___|___|___|___|___|___|

# List numbers from 1 to 100
#   For multiples of 3 say fizz
#   and multiples of 5 say buzz.

print("fizzbuzz using if-else")
for number in range(1,101):
	output=''
	if (number % 3) == 0:
		output += "fizz"
	if (number % 5) == 0:
		output += "buzz"
	if output != '':
		print(output)
	else:
		print(number)

# print("Without if-else ")
