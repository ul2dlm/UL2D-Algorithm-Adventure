<?php
/*
알람 시계
https://www.acmicpc.net/problem/2884
*/
fscanf(STDIN,"%d %d",$h, $m);
if($m < 45){
    $ThreeQuartersM = $m+60-45;
    $h = $h -1;
}else{
    $ThreeQuartersM = $m-45;
}

if($h == -1){
    $h = 23;
}
echo "$h $ThreeQuartersM";