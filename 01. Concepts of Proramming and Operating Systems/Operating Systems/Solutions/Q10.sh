#!/bin/bash

read -p "Enter the size of your pyramid: " n

for (( i=0; i<=n; i++ ))
do
	echo ""
	for (( j=1; j<=i; j++ ))
	do
		echo -n "$j"
	done
done
echo ""
echo ""
