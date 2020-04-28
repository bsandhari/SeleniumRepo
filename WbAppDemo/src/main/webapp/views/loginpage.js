function validate(){
let luname = document.forms["loginform"]["login-uname"];
let lpass = document.forms["loginform"]["login-pass"];

if(luname.value == "")
    {
        window.alert("Username is required");
        luname.focus();
        return false;
    }
else if(lpass.value == "")
    {
        window.alert("Password is required");
        lpass.focus();
        return false;
    }

    return true;

}