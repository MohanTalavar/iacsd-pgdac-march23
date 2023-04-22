#!/bin/bash

read -p "Enter number of rows in your series: " num

#formula is used os that rows are not skipped
let "mun= (( (num*2)-1 ))"
let "num= (( 2*(num*2)-1 ))"
for (( i=1; i<=num; i++ ))
do
        echo ""
        for (( k=num; k>=0; k-- ))
        do
                echo -n " "
	done

	((num--))

	for (( j=1; j<=i; j++ ))
        do
        if (( $num % 2 != 1))
        then
                echo -n "* "
        fi
	done
done
for  (( i=mun-2; i>=1; i-- ))
do
	echo ""
	for (( k=-4; k<=mun; k++ ))
	do
		echo -n " "
	done
	((mun++))
	for (( j=i; j>=1; j-- ))
	do
	if (( $mun % 2 != 1 ))
	then
		echo -n "* "
	fi
	done
done
echo ""
echo ''
