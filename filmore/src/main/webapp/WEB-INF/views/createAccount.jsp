

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/general.css">
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Creation de compte</title>



</head>
<body>




<h1><center>Création de compte</center></h1>

<div id="formulaire">
<form action="submitCreateAccount" method="POST">
Nom :
<input type="text" name="lastname"/><br><br/>
Prénom :
<input type="text" name="firstname"/><br/><br/>
Adresse : 
<input type="text" name="address"/><br/><br/>
Code Postal : 
<input type="text" name="zipCode"/><br/><br/>
Ville :
<input type="text" size="5" name="city"/><br/><br/>
Pays : 
<input type="text" name="country"/>
<br/><br/>
Adresse Email : 
<input type="text" name="emailAddress"/>
<br/><br/>
Mot de passe :
<input type="password" name="password"/><br/><br/>
<input type="submit" value="Valider">


</form>
</div>


</body>
</html>