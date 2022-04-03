<?php

function getTCPInfo(){
    $ip = "127.0.0.1:161";


    $ipAddr = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.20.1.1");
    $ipIf = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.20.1.2");
    $ipNetMask = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.20.1.3");
    $ipAdEntBcastAddr = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.20.1.4");
    $ipMaxSize = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.20.1.5");

    $ipNetToMediaIfIndex = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.22.1.1");
    $ipNetToMediaPhysAddress = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.22.1.2");
    $ipNetToMediaNetAddress = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.22.1.3");
    $ipNetToMediaType = snmp2_walk($ip, "snmp", ".1.3.6.1.2.1.4.22.1.4");


    return ipAddressString( $ipAddr , $ipIf , $ipNetMask , $ipAdEntBcastAddr , $ipMaxSize ) . "|&&&|" 
    . ipNetToMediaTableString( $ipNetToMediaIfIndex , $ipNetToMediaPhysAddress , $ipNetToMediaNetAddress , $ipNetToMediaType );
}

function ipAddressString( $ipAddr , $ipIf , $ipNetMask , $ipAdEntBcastAddr , $ipMaxSize ){
    $ipAddrStr = "";
    $arrLen = count($ipAddr) ;
    for($i = 0; $i < $arrLen - 1 ;$i++ )  
        $ipAddrStr = $ipAddrStr . substr($ipAddr[$i],11) . "|&|"
                                . substr($ipIf[$i],9) . "|&|"
                                . substr($ipNetMask[$i],11) . "|&|"
                                . substr($ipAdEntBcastAddr[$i],9) . "|&|"
                                . substr($ipMaxSize[$i],9) . "|&&|";
        
    $ipAddrStr = $ipAddrStr . substr($ipAddr[$arrLen-1],11) . "|&|"
                            . substr($ipIf[$arrLen-1],9) . "|&|"
                            . substr($ipNetMask[$arrLen-1],11) . "|&|"
                            . substr($ipAdEntBcastAddr[$arrLen-1],9) . "|&|"
                            . substr($ipMaxSize[$arrLen-1],9);
    return $ipAddrStr;
}



function ipNetToMediaTableString( $ipNetToMediaIfIndex , $ipNetToMediaPhysAddress , $ipNetToMediaNetAddress , $ipNetToMediaType ){
    $ipToMedia ="";
    $lengthOfTheArr = count($ipNetToMediaIfIndex);
    for($i = 0; $i < $lengthOfTheArr - 1;$i++ )  
        $ipToMedia = $ipToMedia . substr($ipNetToMediaIfIndex[$i],9) . "|&|"
                                . substr($ipNetToMediaIfIndex[$i],9) . "|&|"
                                . substr($ipNetToMediaPhysAddress[$i],11) . "|&|"
                                . substr($ipNetToMediaNetAddress[$i],11) . "|&|"
                                . substr($ipNetToMediaType[$i],9) . "|&&|" ;

    $ipToMedia = $ipToMedia . substr($ipNetToMediaIfIndex[$lengthOfTheArr-1],9) . "|&|"
                            . substr($ipNetToMediaIfIndex[$lengthOfTheArr-1],9) . "|&|"
                            . substr($ipNetToMediaPhysAddress[$lengthOfTheArr-1],11) . "|&|"
                            . substr($ipNetToMediaNetAddress[$lengthOfTheArr-1],11) . "|&|"
                            . substr($ipNetToMediaType[$lengthOfTheArr-1],9) ;

    return $ipToMedia ;            
}