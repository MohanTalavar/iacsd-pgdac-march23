#!/bin/bash
read -p "Enter thr number of rows : " n
lettr=65
for (( i=1; i<=n; i++ ))
Do
for (( j=n; j>=i; j-- ))
Do
echo -n " "
Done
for (( k=1; k<=i; k++ ))
do
		echo -n "$(printf \\$(printf '%03o' "$lettr"))"
	lettr=$((lettr+1))
done

lettr=$((lettr-1))

for (( m=1; m<i; m++ ))
Do
	lettr=$((lettr-1))
	echo -n "$(printf \\$(printf '%03o' "$lettr"))"
done

echo ""
lettr=65

Done
