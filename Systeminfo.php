<?php

function getSysInfo(){
    $res = setContact();
    $name = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.5.0"),7);
    $desc = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.1.0"),7);
    $oid = substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.2.0"),4);
    $uptime =substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.3.0"),10);
    $contact =substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.4.0"),8);
    $location =substr(snmp2_get($ip, "snmp", ".1.3.6.1.2.1.1.6.0"),8);

    return $name + "|&|" + $desc + "|&|" + $uptime + "|&|" + $oid + "|&|" + $res ;
}


function setContact(){
    if (isset( $_GET['contact'])){
        $tmp = snmp2_set(
                $ip,
                "snmp",
                ".1.3.6.1.2.1.1.4.0",
                "s",
                $_GET['contact'],
                );
        if( $tmp )
            return "Updated";
        else
            return "Something went wrong";
    }
    return " ";
}
