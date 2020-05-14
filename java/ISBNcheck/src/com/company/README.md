# Validate ISBN-10 code
An ISBN code is valid if, for a-bcd-efghi-j, 
( a\*10 + b\*9 + c\*8 + d\*7 + e\*6 + f\*5 + g\*4 + h\*3 + i\*2 + j\*1 ) mod 11 = 0

We can calculate last number if only first 9 numbers are known.
