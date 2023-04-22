#!/bin/bash

read -p "Input your number upto which you want to generate tables: " num

for (( j=1; j<=10; j++ ))
do
	let "m= (( $num*$j ))"
	echo "$num X $j = $m, "
done
echo ""
