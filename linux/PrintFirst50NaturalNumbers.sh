#!/bin/sh
x=1
while [ $x -lt 51 ]
do
echo $x
#x=`expr $x + 1`
x=$((x+1))
done
