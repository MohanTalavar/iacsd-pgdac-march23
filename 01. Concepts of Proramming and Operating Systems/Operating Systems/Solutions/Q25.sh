#!/bin/bash

echo ""
read -p "Enter your number: " n

sum=0
echo ""
echo -n "The Squares of $n Natural numbers are: 1"
for (( i=1; i<=n; i++ ))
do
	let "num= (( $i*$i ))"	
	echo "$num"
	let "sum=(( sum+i*i ))"
done
((sum++))
echo "Sum of Squares of 1st $n Natural Numbers is: $sum"
echo ""
