<?php
include 'Systeminfo.php';
include 'UDPGetinfo.php';
include 'TCPGetInfo.php';

if( isset($_REQUEST['data']))
{
  if ( $_REQUEST['data'] == 'systeminfo')
    echo getSysInfo();
  elseif ($_REQUEST['data'] == 'TCP')
    echo getTCPInfo();
  elseif ($_REQUEST['data'] == 'UDP')
    echo getUDPInfo();
}


if ( isset($_REQUEST['contact']) ){
  echo setContact();
}
