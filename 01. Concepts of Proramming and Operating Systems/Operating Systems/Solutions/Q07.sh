#!/bin/bash

read -p "Input your number upto which you want to generate tables: " num

for (( i=1; i<=num; i++ ))
do
	echo ""
	for (( j=1; j<=10; j++ ))
	do
		let "m= (( $i*$j ))"
		echo -n "$i X $j = $m, "
	done
done
echo ""
