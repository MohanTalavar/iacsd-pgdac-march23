#!/bin/bash

read -p "Enter your number: " num

fact=1

echo -n "Factorial of $num is: "

for (( i=num; i>=1; i-- ))
do
	let "fact= fact*i"
echo "$fact"
