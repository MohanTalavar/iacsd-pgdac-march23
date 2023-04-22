#!/bin/bash

echo "Sum of numbers"

for (( i=0; i<10; i++ ))
do

echo ""
read -p "Enter your numbers: " num
	let "sum = (( $sum+$num ))"
done

echo ""
echo "Sum of your numbers is: $sum"
