#!/bin/bash

read -p "Enter number of rows in your series: " num

let "num= (( (num*4)-2 ))"
for (( i=0; i<=num; i++ ))
do
        echo ""
        for (( k=num; k>=0; k-- ))
        do
                echo -n " "
        done
        ((num--))
        for (( j=1; j<=i; j++ ))
        do
								if (( i%2 != 0 ))
								then
                echo -n "* "
								fi
        done
done
echo ""
echo ""
