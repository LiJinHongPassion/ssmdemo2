<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>register</title>
</head>
<body>
<form id="register_form">
    username：<input type="text" name="userName" id="username" />
    password：<input type="password" name="userPwd" id="pwd" />
    <button type="button" id="btn_register" onclick="register()">register</button>
</form>



<script type="text/javascript" src="js/jquery.js"></script>
<script>
    function register() {
        $.ajax({
            type:'POST',
            dataType:"json",/* 返回的字符串用text，返回的json对象用json */
            url:'register',
            data:$("#register_form").serialize(),
            crossDomain:true,
            async:false,
            cache:false,
            success:function(data){
                alert("username：" + data.userName);
            },
            error:function(data){
            }
        })
    }
</script>
</body>

</html>
