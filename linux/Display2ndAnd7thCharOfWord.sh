#!/bin/sh

while read line ;
do
x=$(echo "$line" | cut -c 2)
y=$(echo "$line" | cut -c 7)
echo "$x$y"
done
