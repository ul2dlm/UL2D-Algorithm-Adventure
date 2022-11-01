<?php
/*
A+B - 3
https://www.acmicpc.net/problem/10950
*/
fscanf(STDIN,"%d",$t);
ob_start();
for($i=0; $i<$t; $i++){
    fscanf(STDIN, "%d %d",$a, $b);
    fprintf(STDOUT,"%d\n", $a+$b);
}
ob_flush();