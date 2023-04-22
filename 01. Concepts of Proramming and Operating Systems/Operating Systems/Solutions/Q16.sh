#!/bin/bash

read -p "Enter the number of terms in your series: " num
echo -n "First $num Natural even numbers are: 2"

for (( i=4; i<=2*num; i++ ))
do
	echo -n ", $i"
	let "sum= (( $sum+$i ))"
	((i++))

done
echo ""
echo "Sum of the 1st $num Natural even numbers is: $num"
