<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath}/resources/css/signin.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <%@include file="common/nav.jsp" %>

    <div class="container">

        <form class="form-signin" action="loginCheck" method="post">
            <h2 class="form-signin-heading">请登录</h2>
            <label for="inputAccount" class="sr-only">Cellphone Number</label>
            <input type="tel" name="account" id="inputAccount" class="form-control" placeholder="手机号" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" name="password" id="inputPassword" class="form-control" placeholder="密码" required>
            <!--
            <label for="consumer">消费者</label>
            <input type="radio"  name="role" id="consumer" value="consumer">
            <label for="merchant">商家</label>
            <input type="radio"  name="role" id="merchant" value="merchant">
            -->
            <!--
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            -->
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>

    </div> <!-- /container -->

</body>
<%@include file="common/tail.jsp" %>
</html>
