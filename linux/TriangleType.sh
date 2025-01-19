#!/bin/sh

read x
read y
read z

if [ $x -eq $y ]; then
    if [ $x -eq $z ]; then
        echo "EQUILATERAL"
    fi
elif [ $x -eq $y || $y -eq $z || $z -eq $x ]; then
    echo "ISOSCELES"
else 
    echo "SCALENE"
fi
        
