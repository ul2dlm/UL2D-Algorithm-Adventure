<?php
/*
빠른 A+B
https://www.acmicpc.net/problem/15552
*/
fscanf(STDIN,"%d",$N);
ob_start();
for( $i=0; $i<$N; $i++ ) {
    fscanf(STDIN,"%d %d",$a,$b);
    echo ($a+$b) . "\n";
}
ob_flush();