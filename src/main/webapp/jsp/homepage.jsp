<%--
  Created by IntelliJ IDEA.
  User: huawei
  Date: 2021/11/5
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>
    body{
        background-color:#F7F7F7;
        margin: 0px;
    }
    body div{
        float: left;
    }
    .navigation{
        background-color: #FFFFFF;
        width: 100%;
        height: 50px;
        margin: 0px;
        padding: 0px;
    }
    .word{
        width: 10%;
        float: left;
        margin-left: 50px;
    }
    .picture{
        margin-top: 5px;
    }
    .word1{
        font-size: 22px;
        font-style: oblique;.
    letter-spacing: 3px;
    }
    .word2{
        font-size: 15px;
        font-style: oblique;
        letter-spacing: 1px;
    }
    .search{
        margin-top: 10px;
        height: 50%;
        border-radius: 50px;
        background-color: #F7F7F7;
    }
    .user{
        float: right;
        margin-right: 300px;
        margin-top: 12px;
    }
    .sidebar{
        width: 18%;
        height: 700px;
        margin: 10px 0px 0px 100px;
        background-color: #FFFFFF;
    }
    .sidebar1{
        font-size: 25px;
        margin-left: 5px;
        margin-top: 15px;
    }
    .comment{
        width: 900px ;
        height: 1000px;
        /*background-color: #0bc5de;*/
        margin-top: 10px;
        margin-left: 30px;
    }
    .content{
        width: 100%;
    }
    .edit{
        background-color: #FFFFFF;
        width: 90%;
        height: 150px;
        margin-left: 45px;
        margin-top: 15px;
    }
    .edit1{
        width: 90%;
        height: 50%;
        margin-top: 10px;
        margin-left: 20px;
        background-color: #FFFFFF;
        color:#0bc5de;
        border-radius: 15px;
        border-color: darkorange;
    }
    .send{
        background-color: darkorange;
        color: #FFFFFF;
        float: right;
        border: 0px;
        width: 50px;
        height: 30px;
        border-radius: 10px;
        margin-top: 100px;
        cursor:pointer;
    }
    .right{
        float: right;
    }
    .friend{
        background-color: #FFFFFF;
        width: 90%;
        height: 50px;
        margin-left: 45px;
        margin-top: 20px;
    }
    .friend div{
        text-align: center;
        width: 10%;
        height: 30px;
        margin-left: 20px;
        margin-top: 15px;
        cursor:pointer;


    }
    .friend div:hover{
        border-radius: 10px;
        color: orange;
        background-color: rgba(246,240,48,0.27);

    }
    .article{
        background-color: #FFFFFF;
        width: 90%;
        margin-left: 45px;
        margin-top: 20px;
        margin-bottom: 20px;
    }
    .article1{
        margin-top: 15px;
        margin-left: 60px;
        margin-bottom: 20px;
        width: 80%;
        letter-spacing: 1px;

    }
    .wenzi{
        text-indent:2em;
    }
    .operation{
        margin-top: 30px;

        width: 80%;


    }
    .operation div{
        width: 80px;
        height: 30px;
        text-align: center;
        margin-left: 30px;
        margin-right: 60px;
        cursor:pointer;

    }
    .operation div:hover{
        border-radius: 10px;
        color: orange;
        background-color: rgba(246,240,48,0.27);
    }
    .remark{
        width: 500px;
        margin-top: 10px;
        height: 30px;
        border-radius: 10px;
        background-color: #F7F7F7;
    }
    .remark1{
        width: 100%;
    }
</style>

<body id=body   onscroll=SetCookie("scroll",body.scrollTop); onload="scrollback();">
<div class="all">
    <div class="navigation">
        <div class="word"><div class="picture"><img src="${pageContext.request.contextPath}/img/logo3.png"></div><div class="word1">星浪围脖<br><div class="word2">weibo.com</div></div></div>
        <form action="researchMoment">
            <input type="text" class="search" placeholder="搜索围脖" style=outline:none >
            <input type="submit" value="搜索">
        </form>


    </div>
    <div class="content">
        <div class="sidebar">
            <div class="sidebar1">首页
                <img src="${pageContext.request.contextPath}/img/picture1.png">
                EDG3:0击败DK获得S11冠军
                <img src="${pageContext.request.contextPath}/img/picture.png">
                LOLM绝活大赏&nbsp;&nbsp;包教包会
            </div>

        </div>
        <div class="comment">
            <div class="edit">
                <form action="insertMoment">
                    <span style="margin-left: 30px;padding-top: 20px">
                        欢迎你，
                        <input name="username" value="${sessionScope.user1.username}" style="border: 0;outline: none" readonly>
                        <a href="outLogin">退出登录</a>
                    </span>
                    <input type="text" placeholder="有什么新鲜事想分享给大家？" name="article" class="edit1" style=outline:none>

                    <div class="right"><input type="submit" value="发送" class="send"></div>
                </form>

            </div>
            <div class="friend">
                <div>全部</div>
                <div> 关注</div>
            </div>
            <div class="article">
                <c:forEach items="${momentList}" var="moment">
                    <div class="article1">
                        <b>${moment.user.username}</b>
                        <div class="right"><img src="${pageContext.request.contextPath}/img/delete.png"><a href="deleteMoment/${moment.mid}">删除</a></div><hr>
                        <div class="wenzi">
                                ${moment.article}
                        </div>
                        <div class="operation">

                            <div><img src="${pageContext.request.contextPath}/img/send.png">转发 </div>
                            <div><a href="lovemoment?id=${moment.mid}"><img src="${pageContext.request.contextPath}/img/zan.png">${moment.lovetimes}</a></div>
                            <div><img src="${pageContext.request.contextPath}/img/say.png">评论 </div>
                        </div>
                        <div>
                            <c:forEach items="${moment.commentList}" var="comment">
                                ${comment.user.username}:${comment.comment}<br>
                            </c:forEach>
                        </div>
                        <div class="remark1">
                            <form action="insertComment/${sessionScope.user1.username}">
                                <input type="text"  class="remark" name="comment" placeholder="发布你的评论" style=outline:none>
                                <input type="submit" value="提交">
                                <input type="text" value="${moment.mid}" name="mid" hidden>
                            </form>

                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

</body>
</html>
