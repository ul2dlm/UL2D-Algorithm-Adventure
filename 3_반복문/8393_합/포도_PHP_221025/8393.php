<?php
/*
합
https://www.acmicpc.net/problem/8393
*/
fscanf(STDIN,"%d",$n);
$num = 0;
for($i = 1; $i<=$n; $i++){
    $num = $num+$i;
}
echo $num;