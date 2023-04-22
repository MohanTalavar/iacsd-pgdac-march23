#!/bin/bash

read -p "Enter the number of rows in your Pascal's Triangle: " row
r=row
num=1

for (( i=0; i<row; i++ ))
do
	echo ""
	for (( k=r; k>=1; k-- ))
	do
		echo -n " "
	done
((r--))
	for (( j=0; j<=i; j++ ))
	do
		if ((j==0 || i==0))
		then
			num=1;
			echo "$num "
		else
			let "num= (( $num*($i-$j+1)/$j ))"
			echo "$num "
		fi
	echo ""
	done
done
echo ""
echo ""
