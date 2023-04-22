#!/bin/bash

read -p "Input number of terms: " num

for (( i=1; i<=num; i++ ))
do
	let "cube (( $i*$i*$i ))"
	echo "Number if $num and Cube of $num is: $cube"
done
