#!/bin/bash

read -p "Enter your number: " n
sum=0

for (( i=$n; $n!=0; n=$n/10 ))
do
	let "a=(( n % 10 ))"
	let "sum=(( sum + ( a * a * a ) ))"
done
if (( sum == i ))
then 
	echo "$i is Armstrong Number"
else
	echo "$i is not Armstrong Number"
fi
