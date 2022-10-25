<?php
/*
두 수 비교하기
https://www.acmicpc.net/problem/1330
*/
fscanf(STDIN,"%d %d",$a,$b);
if($a>$b){
    echo ">";
}else if($a<$b){
    echo "<";
}else{
    echo"==";
}