#!/bin/bash
echo ""
read -p "Enter your number: " n
echo -n "Positive Divisiors of $n are: 1"
sum=0
for (( i=2; i<n; i++))
do
	if (( n % i == 0))
	then
		echo -n ", $i"
		let "sum=(( sum+i ))"
	fi
done
(sum++))
echo ""
echo "Sum of the factors of $n is: $sum"

if (( $sum !+ $n ))
then
	echo "Hence the number $n is not Perfect"
else
	echo "Hence the number $n is Perfect"
fi
