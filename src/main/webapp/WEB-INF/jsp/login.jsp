<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>login</title>
</head>
<body>
<form>
    username:<input type="text" name="username" id="username" />
    password:<input type="password" name="pwd" id="pwd" />
    <button type="button" id="btn_login" onclick="login()">login</button>
</form>



<%--<script type="text/javascript" src="js/jquery.js"></script>--%>
<script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
<script>
    function login() {
        var username1 = document.getElementById("username").value;
        var pwd1 = document.getElementById("pwd").value;
        $.ajax({
            type:'POST',
            dataType:"json",/* 返回的字符串用text，返回的json对象用json */
            url:'login',
            data:{
                username:username1,
                pwd:pwd1
            },
            crossDomain:true,
            async:false,
            cache:false,
            success:function(data){
                alert("username:" + data.userName);
            },
            error:function(data){
            }
        })
    }
</script>
</body>

</html>