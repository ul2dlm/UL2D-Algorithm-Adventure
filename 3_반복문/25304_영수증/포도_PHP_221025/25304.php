<?php
/*
영수증
https://www.acmicpc.net/problem/25304
*/
fscanf(STDIN,"%d",$total);
fscanf(STDIN,"%d",$count);
$num = 0;
for($i =0; $i<$count; $i++){
    fscanf(STDIN,"%d %d",$a, $b);
    $num = $num + ($a*$b);
}
if($total == $num){
    echo "Yes";
}else{
    echo "No";
}