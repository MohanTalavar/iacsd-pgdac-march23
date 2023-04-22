#!/bin/bash

read -p "Enter your number: " num

if (( $num%2 == 0 ))
then
	echo "$num is Even number"

else
	echo "$num is Odd number"

fi
