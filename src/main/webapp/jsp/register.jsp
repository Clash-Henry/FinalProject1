<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2021/11/3
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>星浪围脖</title>
</head>
<style>
    span {
        font-size: 50px;
        font-style: oblique;
        letter-spacing: 5px;
    }
    #register{
        background-color: darkorange;
        cursor:pointer;
        color: white;
        width: 180px;
        height: 40px;
        font-size: 15px;
        border: 0px;

    }
    #register:hover{
        cursor:pointer;
        background: orange;
    }
    .grey{
        color: darkgray;
    }
    .yanzheng{
        margin-bottom: 18px;
    }

</style>
<body bgcolor="#BEE1F5">
<table align="center" width="896" height="186">
    <tr>
        <td align="center">
            <img src="${pageContext.request.contextPath}/img/logo.png">
            <span>Weibo</span>

        </td>
    </tr>
</table>
<form action="${pageContext.request.contextPath}/insertUser">
    <table border="30" bordercolor="#FFFFFF" bgcolor="#FFFFFF" align="center">
        <tr>
            <td colspan="2">
                <font size="4" color="orange">
                    <b>个人注册  </b>
                </font>
                <%--<font size="4" >
                    <b>官方注册</b>
                </font>--%>
            </td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td colspan="2">
                <b>
                </b>
            </td>
            <td rowspan="7" width="28">
            </td>
            <td height="13">　
                <br>
                已有账号，
                <a href="toLogin" color="#0F8ED3">
                    直接登录>>
                </a>
                <br>
            </td>

        </tr>
        <tr>
            <td align="right">
                用户名：
            </td>
            <td>
                <font color="#ff0000">
                    <input type="text" required method="post" novalidate name="username"/>
                    <br>
                </font>
                <font color="#0F8ED3">
                </font></td>
            <td>
                <b><font size="4">微博注册帮助</font></b>
            </td>
        </tr>
        <tr>
            <td align="right">
                <font color="red">*</font>设置密码：
            </td>
            <td>
                <input type="password" required name="password"/>
            </td>
            <td>
                <font color="#0F8ED3">
                    <img src="${pageContext.request.contextPath}/img/1.png" />微博注册操作指南
                </font>
            </td>
        </tr>
        <tr>
            <td align="right">
                生日：
            </td>
            <td>
                <input type="date" required name="birthday">
                <!--                <select  name=“year”>-->
                <!--                    <option  selected=“selected”>请选择</option>-->
                <!--                </select>-->
                <!--                <select  name=“month”>-->
                <!--                    <option  selected=“selected”>&nbsp;&nbsp;&nbsp;</option>-->
                <!--                </select>-->
                <!--                <select  name=“day”>-->
                <!--                    <option  selected=“selected”>&nbsp;&nbsp;&nbsp;</option>-->
                <!--                </select>-->

            </td>
            <td>
                <font color="#0F8ED3"><img src="${pageContext.request.contextPath}/img/2.png" />注册时提示“你所使用的IP地址异常”该怎么办？</font>
            </td>
        </tr>
        <tr>
            <td align="right">
                性别：
            </td>
            <td>
                <select required  name="sex">
                    <option  selected="selected" value="男">男</option>
                    <option  value="女">女</option>
                </select>
            <td>
                <font color="#0F8ED3"><img src="${pageContext.request.contextPath}/img/3.png" />企业用户希望使用的微博昵称不能注册怎么办？</font>
            </td>
        </tr>
        <tr>
            <td align="right">
                <div  class="yanzheng">
                    验证码：
                </div>
            </td>
            <td>
                <input type="text" required name="inputcode"/>
                <br>
                <img id="img01" src="${pageContext.request.contextPath}/vccode" alt="验证码图片">
                <a color="#0F8ED3" href="javascript:change();">看不清，换一张</a>
            </td>
            <td>
                <font color="#0F8ED3"><img src="${pageContext.request.contextPath}/img/4.png" />注册后，是否可以找回被其他人占用的企业昵称？<br />　　<br>　更多帮助>></font>
            </td>
        </tr>
        <tr>
            <td></td>
            <td rowspan="2">
                <input type="submit" value="立即注册" id="register"><br />
                <font color="#0F8ED3">
                    微博服务使用协议<br>
                    微博个人信息保护政策<br>
                    全国人大常委会关于加强网络信息保护的决策
                </font>
            </td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
        </tr>
    </table>
</form>
<table align="center">
    <tr>
        <td></td>
        <td class="grey"><img src="${pageContext.request.contextPath}/img/logo2.png" />北京微梦创科网络技术有限公司&nbsp;&nbsp;京网文[2020]4754-886号&nbsp;京ICP备12002058号-2　　　　　　　　</td>
        <td class="grey">　　　　　Copyright©2009-2021&nbsp;WEIBO&nbsp;&nbsp;
            <select  name=“language”>
                <option  selected=“selected”>中文(简体)</option>
            </select>　　　　　　</td>
    </tr>
</table>
<script type="text/javascript">
    function change() {
        var img = document.getElementById("img01");
        img.src = "${pageContext.request.contextPath}/vccode?" + new Date().getTime();
    }
</script>
</body>
</html>
