#!/bin/bash
for name in $( ls ./neaw); do
    contents=`cat ./neaw/$name | sed -ne 'H;${g;s/\n//g;p;}'`
	echo $( echo $name | sed s/'.yUML'//g ) $( wget -S "http://yuml.me/diagram/scruffy/class/$contents." -O "./neaw/$name.png" 2>&1 | grep filename | sed s/'Content-Disposition: inline; filename="'//g | sed s/'.png"'//g ) >> newShortId.txt
	echo $name
done 


#for name in $( ls ./.. ); do
#    contents=`cat ../$name | sed -ne 'H;${g;s/\n//g;p;}'`
#	echo $( echo $name | sed s/'.yUML'//g ) $( wget -S "http://yuml.me/diagram/scruffy/class/$contents." -O "../$name.png" 2>&1 | grep filename | sed s/'Content-Disposition: inline; filename="'//g | sed s/'.png"'//g ) >> shortId.txt
#	echo $name
#done 
