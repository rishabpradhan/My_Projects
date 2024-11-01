<?php
@include 'connection.php';
session_start();

$error=$perr="";
if(isset($_POST['submit'])){
    $name= mysqli_real_escape_string($conn,$_POST['name']);
    $email= mysqli_real_escape_string($conn,$_POST['email']);
   
  
    

    $sql="SELECT * FROM user_info WHERE name='$name' AND email='$email'";
    $result=mysqli_query($conn,$sql);
    if(mysqli_num_rows($result)>0){
        $row=mysqli_fetch_array($result);
        $_SESSION['name']=$row['name'];
        $_SESSION['email']=$row['email'];
        header('location:welcome.php');
    }

else{
    $error="incorrect name or email";
}
      
    }
    session_destroy();


?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link rel="stylesheet" href="style5.css">

</head>
<body>
   <div class="wrapper">

   <form  action="" method="post">
   <h1>login now</h1>
   <span style="color:red;font-size:medium">
    <?php
    echo $error;
    ?>
</span>

   <input type="text" name="name" placeholder="enter your name"><br>
   <input type="email" name="email" placeholder="enter your email"><br>
   <input type="submit" value="login" name="submit" class="btn">
   <p>don't have account <a href="register.php">register now</a></p>

</form>


</div>


    
</body>
</html>