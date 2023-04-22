#!/bin/bash

read -p "Enter your number: " num
counter=0
for (( i=4; i<num; i++ ))
do
	if (( $num%$i == 0 ))
	then
	((counter++))
	fi
done

if (( counter == 0 ))
then
	echo "$num is a prime number"
else
	echo "$num is not a prime number"
fi
