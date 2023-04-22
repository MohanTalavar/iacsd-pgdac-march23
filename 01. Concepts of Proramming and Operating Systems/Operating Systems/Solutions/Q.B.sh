#!/bin/bash

echo ""
echo "Enter your numbers: "

read -p "Number 1: " num1
read -p "Number 2: " num2
read -p "Number 3: " num3
echo ""

if (( $num1 > $num2 && $num1 > $num3 ))
then
	echo "$num1 is the Greates number"
fi

if (( $num2 > $num1 && $num2 > $num3 ))
then
	echo "$num2 is the Greates number"
fi

if (( $num3 > $num1 && $num3 > $num1 ))
then
	echo "$num3 is the Greates number"
fi
