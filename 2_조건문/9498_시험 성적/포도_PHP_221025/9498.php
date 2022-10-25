<?php
/*
시험성적
https://www.acmicpc.net/problem/9498
*/
fscanf(STDIN,"%d",$a);
if($a >= 90 && $a <= 100){
    echo "A";
}else if($a >= 80 && $a <= 89){
    echo "B";
}else if($a >= 70 && $a <= 79){
    echo "C";
}else if($a >= 60 && $a <= 69){
    echo "D";
}else {
    echo "F";
}