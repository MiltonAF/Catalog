function getLogin(){
    let username = document.querySelect("#username").value;
    let password = document.querySelect("#password").value;
    json = JSON.stringify({username,password});
    console.log(json);
}