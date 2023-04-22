#!/bin/bash

read -p "Enter the last digit in your Natural number series: " num
echo ""
echo "Natural numbers till $num are: ""

for (( i=1; i<= num; i++ ))
do
	echo -n "$i "
done

let "sum= (( ($num($num+1))/2 ))"

echo ""
echo "Sum of $n Natural numbers is: $sum"
