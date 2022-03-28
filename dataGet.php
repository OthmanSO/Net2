<?php

if( isset($_GET['data']))
  if ( $_GET['data'] == 'systeminfo')
    echo getSysInfo();
  else ($_GET['data'] == 'TCP')
    echo getTCPInfo();
  elseif ($_GET['data'] == 'UDP')
    echo getUDPInfo();
