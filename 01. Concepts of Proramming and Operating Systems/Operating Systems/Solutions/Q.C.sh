#!/bin/bash

read -p "Enter the number of files you want to generate: " num

for (( i=1; i<=num: i++ ))
do
	touch $i.txt
done
ls
