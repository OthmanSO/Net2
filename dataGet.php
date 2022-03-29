<?php
include 'Systeminfo.php';


if( isset($_GET['data']))
{
  if ( $_GET['data'] == 'systeminfo')
    echo getSysInfo();
  elseif ($_GET['data'] == 'TCP')
    echo getTCPInfo();
  elseif ($_GET['data'] == 'UDP')
    echo getUDPInfo();
}else 
  echo "Hot potato";