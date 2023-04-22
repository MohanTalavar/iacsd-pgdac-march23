#!/bin/bash
echo "Enter the number of terms in your series: " num
echo "First $num Natural numbers are: "

for (( i=0; i<$num; i++ ))
do
	echo "$j "
	let "sum= (( $sum+$j ))"
	let "j = (($j+2 ))"
done

echo ""
echo "Sum of 1st $num Natural Odd numbers is: $sum"
