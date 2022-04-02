<?php



function getUDPInfo(){
    $ip = "127.0.0.1:161";

    $udpLocalAddress = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.7.5.1.1");
    $udpLocalPort = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.7.5.1.2");

    $arrLength = count($udpLocalAddress) - 1;
    $returnText ="";
    for($i = 0; $i < $arrLength ; $i++ ) 
        $returnText = $returnText . substr($udpLocalAddress[$i],10) . "," . substr($udpLocalPort[$i],9) . "|&&&|";

    $returnText = $returnText . substr($udpLocalAddress[$arrLength],10) . "," . substr($udpLocalPort[$arrLength],9);

    return $returnText;
}

