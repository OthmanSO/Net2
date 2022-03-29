<?php




function getSysInfo(){
    $ip = '127.0.0.1';

    $name = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.5.0"),7);
    $desc = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.1.0"),7);
    $oid = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.2.0"),4);
    $uptime =substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.3.0"),10);

    return $name . "|&|" . $desc . "|&|"  .$uptime . "|&|" . $oid ;
}


function setContact(){
    $ip = '127.0.0.1';

    $tmp = snmp2_set(
            $ip,
            "snmp",
            ".1.3.6.1.2.1.1.4.0",
            "s",
            $_GET['contact'],
            );
        
    if( $tmp )
        echo "Updated";
    else
        echo $substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.4.0"),8); // return contact already in
}