#!/bin/bash

read -p "Enter the lower bound number: " n
read -p "Enter the upper bound number: " m

for (( i=$n; i<=$m; i++ ))
do
	sum=0
	for (( j=1; j<i; j++ ))
	do
		if (( i % j == 0))
		then
		let "sum=(( sum + j ))"
		fi
	done
	if (( sum == i ))
	then 
		echo "$i is Perfect Number"
	fi
done
