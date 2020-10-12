#!/bin/bash
#for i in $( ls ./.. ); do
#    echo $i
#done 

contents=`cat ./ACME.yuml | sed -ne 'H;${g;s/\n//g;p;}'`
contents="[test4]"
# --data "dsl_text=$contents"
#curl --include
curl --trace curlData.txt --include --data "dsl_text=$contents" --data "button=Draw Diagram!" http://yuml.me/diagram/class/
wget --quiet -O - "http://yuml.me/diagram/scruffy;/class/short_url/$contents"

# /diagram/scruffy;/class/short_url/[Customer]<>-orders*>[Order], [Order]++-0..*>[LineItem], [Ordedr]-[note:Aggregate root.]