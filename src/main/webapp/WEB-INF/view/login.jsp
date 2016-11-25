<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="cn">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>四川巴中旅游后台管理</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/dist/css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/plugins/iCheck/square/blue.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition login-page">
	<div class="login-box">
	  <div class="login-logo">
	    <a href="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/index2.html"><b>后台登录</b></a>
	  </div>
	  <!-- /.login-logo -->
	  <div class="login-box-body">
	    <p class="login-box-msg">输入用户名、密码登录</p>
	
	    <form action="${pageContext.request.contextPath}/loginAction" method="post">
	      <div class="form-group has-feedback">
	        <input type="text" id="username" name="username" class="form-control" placeholder="用户名">
	        <span class="glyphicon glyphicon-user form-control-feedback"></span>
	      </div>
	      <div class="form-group has-feedback">
	        <input type="password" id="password" name="password" class="form-control" placeholder="密码">
	        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
	      </div>
	      <div class="row">
	        <div class="col-xs-8">
	          <div class="checkbox icheck">
	            <label>
	              <input type="checkbox"> 记住我
	            </label>
	          </div>
	        </div>
	        <!-- /.col -->
	        <div class="col-xs-4">
	          <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
	        </div>
	        <!-- /.col -->
	      </div>
	    </form>
	
	  </div>
	  <!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->
	
	<!-- jQuery 2.2.3 -->
	<script src="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<!-- Bootstrap 3.3.6 -->
	<script src="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/bootstrap/js/bootstrap.min.js"></script>
	<!-- iCheck -->
	<script src="${pageContext.request.contextPath}/scripts/AdminLTE-2.3.7/plugins/iCheck/icheck.min.js"></script>
	<script>
	  $(function () {
	    $('input').iCheck({
	      checkboxClass: 'icheckbox_square-blue',
	      radioClass: 'iradio_square-blue',
	      increaseArea: '20%' // optional
	    });
	  });
	  
	</script>
</body>
</html>
