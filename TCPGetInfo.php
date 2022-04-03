<?php

function getTCPInfo(){
    $ip = "127.0.0.1:161";


    $tcpConnLocalAddress = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.6.13.1.2");
    $tcpConnLocalPort = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.6.13.1.3");
    $tcpConnRemAddress = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.6.13.1.4");
    $tcpConnRemPort	 = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.6.13.1.5");

    $arrLen = count($tcpConnLocalAddress)-1 ;
    $returnText ="";
    for($i = 0; $i < $arrLen ; $i++ )
        $returnText= $returnText . substr($tcpConnLocalAddress[$i],10) . "," . substr($tcpConnLocalPort[$i],9) . "," 
        . substr($tcpConnRemAddress[$i],10) . "," . substr($tcpConnRemPort[$i],9) . "|&&&|";

    $returnText = $returnText . substr($tcpConnLocalAddress[$arrLen],10) . "," . substr($tcpConnLocalPort[$arrLen],9) . "," 
    . substr($tcpConnRemAddress[$arrLen],10) . "," . substr($tcpConnRemPort[$arrLen],9) ;

    return $returnText;

}
