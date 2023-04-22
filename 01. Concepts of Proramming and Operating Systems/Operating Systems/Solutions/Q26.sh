#!/bin/bash

read -p "Enter the number of terms in your series: " terms

sum=0
num=1

echo -n "1 "

for (( i-1; i<terms; i++ ))

do
	let "num= (( ($num*10)+1 ))"
	echo -n "+ $num "
	let "sum= (( $sum+$num ))"
done

echo ""
echo "The sum of the seires is: $sum"
