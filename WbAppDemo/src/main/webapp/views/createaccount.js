function createvalidate(){
    let name = document.forms["createform"]["cauname"];
    let email = document.forms["createform"]["caemail"];
    let phone = document.forms["createform"]["caphone"];
    let pass = document.forms["createform"]["capass"];
    let cpass = document.forms["createform"]["cacfpass"];
    
    if(name.value == "")
    {
        window.alert("Username is required");
        return false;
    }
    if(email.value == "")
    {
        window.alert("Email is required");
        return false;
    }
    if(phone.value == "")
    {
        window.alert("Phone Number is required");
        return false;
    }
    if(pass.value == "")
    {
        window.alert("PassWord is required");
        return false;
    }
    if(cpass.value == "")
    {
        window.alert("Password does not matched");
        return false;
    }
    return true;
}
