<?php
/*
구구단
https://www.acmicpc.net/problem/2739
*/
fscanf(STDIN,"%d",$n);
for($i = 1 ; $i <10 ; $i++){
    fprintf(STDOUT,"%d"." * "."%d". " = "."%d\n",$n, $i, $n*$i);
}