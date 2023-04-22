#!/bin/bash

read -p "Enter number of rows in your series: " num
num=1
let "num= (( (num*2)-1 ))"
for (( i=0; i<=num; i++ ))
do
        echo ""
        
        for (( j=1; j<=i; j++ ))
        do
								echo -n "$n "
								if (( $n==1 ))
								then
                n=0
								else
								n=1
								fi
        done
done
echo ""
echo ""
