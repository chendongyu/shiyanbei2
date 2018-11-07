<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>PokeMon Web Game</title>
<script type="text/javaScript" src="lib/jquery-3.3.1.js"></script>
<script>
$(document).ready(function(){
	
	//Login
	$("#login").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/Login",
		data:{'user':$("#user").val(),'pass':$("#pass").val()},
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
			if(data.status == 'success'){
				$("#loginPre").hide();
				$("#logout").show();
				$("#callAPI").show();
			}
		}
		});
	
	});
	
	//logout
	$("#logout").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/Logout",
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
			if(data.status == 'success'){
				$("#loginPre").show();
				$("#logout").hide();
				$("#callAPI").hide();
			}
		}
		});
	
	});
	
	//register
	$("#register").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/Register",
		data:{'user':$("#user").val(),'pass':$("#pass").val()},
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
		}
		});
	});
	
	//listChallenges
	$("#listChallenges").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/ListChallenges",
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
		}
		});
	});
	
	//challengePlayer
	$("#challengePlayer").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/ChallengePlayer",
		data:{'challengeeID':$("#challengeeID").val()},
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
		}
		});
	});
	
	//listPlayers
	$("#listPlayers").click(function(){
	var htmlobj=$.ajax({
		url:"http://localhost:8080/poke/ListPlayers",
		dataType: "json",
		async:false,
		success: function(data ,textStatus, jqXHR){
			$("#showInf").text(JSON.stringify(data));
		}
		});
	});
});

</script>
</head>
<body>
	<pre id="loginPre">
		UserName : <input type = "text" id = "user">
		PassWord : <input type = "text" id = "pass">
		<input id="login" type = "button" value = "Login">
		<input id="register" type="button" value = "Register">
	</pre>
	<input id="logout" type="button" value = "logout" style="display:none">
	USERID:<p id="userInf" style="display:none"></p>
	<div id="showInf">
	</div>
	<div id="callAPI" style="display:none;padding: 30px 0px 0px 0px">
	    <ul>
	    	<li>
	    	<input id="listPlayers" type = "button" value = "ListPlayers">
	    	</li>
	    	<li>
	    	<input id="listChallenges" type = "button" value = "listChallenges">
	    	</li>
	    	<li>
			<input id="challengeeID" type = "text">
			<input id="challengePlayer" type = "button" value = "ChallengePlayer">
	    	</li>
	    </ul>
	</div>
</body>
</html>