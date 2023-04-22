#!/bin/bash

read -p "Enter the number of terms in you series: " terms

sum=0
num=0

for (( i=0; i<terms; i++ ))
do
	let "num (( ($num*10)+9 ))"
	echo -n "$num, "
	let "sum= (( $sum+$num ))"
done

echo ""
echo "The sum of the series is :
