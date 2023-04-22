#!/bin/bash

x=0
while [ $x -ne 5 ]
do
echo ""
echo "Input your number to perform the following actions"
echo "1. Addition"
echo "2. Substraction"
echo "3. Multiplication"
echo "4. Division"
echo ""

read -p "Enter your selection: " x
echo ""
case $x in
	1)
		read -p "Enter 1st number: "num1
		read -p "Enter 2nd number: "num2
		let "ans = $(( num1 + $num2 ))"
		echo "Sum of your numbers is: $ans"
	;;

	2)
		read -p "Enter 1st number: "num1
		read -p "Enter 2nd number: "num2
		if [ $num1 -gt $num2 ]
		then
			let "ans = $(( num1 - $num2 ))"
			echo "Difference of your numbers is: $ans"

		else
			let "ans = $(( num2 - $num1 ))"
			echo "Difference of your numbers is: $ans"
	;;

	3)
		read -p "Enter 1st number: "num1
		read -p "Enter 2nd number: "num2
		let "ans = $(( num1 * $num2 ))"
		echo "Product of your numbers is: $ans"
	;;

	4)
		read -p "Enter 1st number: "num1
		read -p "Enter 2nd number: "num2
		if [ $num1 -gt $num2 ]
		then
			let "ans = $(( num1 / $num2 ))"
			echo "Division of your numbers is: $ans"

		else
			let "ans = $(( num2 / $num1 ))"
			echo "Division of your numbers is: $ans"
	;;

5)
		echo "----------Exit----------"
		break;
	;;

*)
		echo "Invalid Input"

esac
done
