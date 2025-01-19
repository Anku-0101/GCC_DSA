#!/bin/sh

read N
sum=0
count=0

while [ $count -ne $N ]
do
    read num
    sum=$((sum+num))
    count=$((count+1))
done

echo "$sum $N" | awk '{ printf "%.3f\n", $1 / $2 }'
