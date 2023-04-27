function GenerateRegistration(){
	var txt = "ACA";
	var randomic = Math.floor(Math.random() * 1500);
	
	document.getElementById('registration').value = (txt + randomic);
}