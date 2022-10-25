<?php
/*
윤년
https://www.acmicpc.net/problem/2753
*/
fscanf(STDIN,"%d",$yun);
if($yun%4 == 0){
    if($yun%100 != 0){
       echo 1;
    }else if($yun%400 == 0){
        echo 1;
    }else{
        echo 0;
    }
}else{
    echo 0;
}