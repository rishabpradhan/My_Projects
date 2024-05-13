<?php
$server="localhost";
$username="root";
$password="";
$dbname="projects";

$conn= new mysqli($server,$username,$password,$dbname);
if($conn->connect_error){
    die("error has occures".$conn->connect_error());
}




?>