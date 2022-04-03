<?php
include 'Systeminfo.php';
include 'UDPGetinfo.php';
include 'TCPGetInfo.php';

if( isset($_GET['data']))
{
  if ( $_GET['data'] == 'systeminfo')
    echo getSysInfo();
  elseif ($_GET['data'] == 'TCP')
    echo getTCPInfo();
  elseif ($_GET['data'] == 'UDP')
    echo getUDPInfo();
}


if ( isset($_GET['contact']) ){
  setContact();
}