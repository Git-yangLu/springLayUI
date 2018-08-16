<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>登录</title>
        <link rel="icon" href="${ctx}/frame/layui/images/face/favicon.ico">
        <link rel="stylesheet" href="${ctx}/frame/layui/css/layui.css" media="all" />
        <link rel="stylesheet" href="${ctx}/static/css/login.css" media="all" />
    </head>
    <body>
        <div class="video_mask"></div>
        <div class="login">
            <h1>登录</h1>
            <form class="layui-form" id="form">
                <div class="layui-form-item">
                    <input class="layui-input" name="username" placeholder="用户名" value="admin" lay-verify="required" type="text" autocomplete="off">
                </div>
                <div class="layui-form-item">
                    <input class="layui-input" name="password" placeholder="密码" value="123456"  lay-verify="required" type="password" autocomplete="off">
                </div>
                <div class="layui-form-item form_code">
                    <input class="layui-input" style="width: 140px;" name="vcode" placeholder="验证码" lay-verify="required" type="text" autocomplete="off" maxlength="4">
                    <div class="code"><img id="captcha"  width="100" height="36"></div>
                </div>
                <button class="layui-btn login_btn">登录</button>
            </form>
        </div>
    </body>
</html>