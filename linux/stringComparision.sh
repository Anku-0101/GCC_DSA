#!/bin/sh

read x
y1="Y"
y2="y"

if [[ $x == $y1 || $x == $y2 ]]; then
    echo "YES"
else
    echo "NO"
fi
    
