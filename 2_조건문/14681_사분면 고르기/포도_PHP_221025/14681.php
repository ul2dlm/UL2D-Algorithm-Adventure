<?php
/*
사분면 고르기
https://www.acmicpc.net/problem/14681
*/
fscanf(STDIN,"%d",$x);
fscanf(STDIN,"%d",$y);

if($x > 0 && $y > 0){
    echo 1;
}else if($x < 0 && $y > 0){
    echo 2;
}else if($x < 0 && $y < 0){
    echo 3;
}else if($x > 0 && $y < 0){
    echo 4;
}