<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Page d'accueil</title>
<script type="text/javascript" src="javascript/webcomponents-lite.js"></script>
<link rel="import" href="templates/hello.html">
<link rel="import" href="templates/homeLink.html">
<link rel="import" href="templates/siteTitle.html">


</head>
<body>
<h1>Ma web application</h1>
<site-title title="Filmore"></site-title>

<home-link link="bibliotheque.jsp" name="Parcourir la bibliothèque"></home-link><br/>
<home-link link="connexion.jsp" name="Se connecter"></home-link><br/>
<home-link link="createAccount" name="Créer un compte"></home-link><br/>
<home-link link="recherche.jsp" name="Faire une recherche"></home-link><br/>
<home-link link="bestSellers.jsp" name="Meilleures Ventes"></home-link><br/>
<home-link link="contact.jsp" name="Contacts"></home-link><br/>
<home-link link="faq.jsp" name="Besoin d'aide ?"></home-link><br/>
<home-link link="mentionLegales.jsp" name="Mentions Légales"></home-link><br/>


</body>
</html>