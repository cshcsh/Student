<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CSS下拉菜单</title>
<style type="text/css">
		ul{
            list-style: none;
        }
        .nav>li{
            float: left;
        }
        ul a{
            display: block;
            text-decoration: none;
            width: 100px;
            height: 50px;
            text-align: center;
            line-height: 50px;
            color: white;
            background-color: #2f3e45;
        }
        .nav>li:first-child a{
            border-radius: 10px 0 0 10px;
        }
        .nav>li:last-child a{
            border-radius: 0 10px 10px 0;
        }
        .drop-down{
            position: relative;
        }
        .drop-down-content{
            padding: 0;
            position: absolute;
            left: -999px;
        }
    
        .drop-down-content li:hover a{
            background-color:red;
        }
        .nav .drop-down:hover .drop-down-content{
            left: 0;
        }
</style>
</head>
<body>
	<ul class="nav">
		<li><a href="#">下拉菜单</a></li>
		<li class="drop-down"><a href="#">下拉菜单</a>
			<ul class="drop-down-content">
				<li><a href="#">我是1</a></li>
				<li><a href="#">我是2</a></li>
				<li><a href="#">我是3</a></li>
			</ul>
		</li>
		<li><a href="#">下拉菜单</a></li>
		<li><a href="#">下拉菜单</a></li>
		<li><a href="#">下拉菜单</a></li>
	</ul>
</body>
</html>