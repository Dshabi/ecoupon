<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Promotion Activities List</title>
    <%@include file="common/dashboardhead.jsp" %>
</head>
<body>
    <%@include file="common/nav.jsp" %>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading text-center">
                <h2>优惠活动列表</h2>
            </div>
            <div class="panel-body">
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>商户名称</th>
                        <th>满</th>
                        <th>送</th>
                        <th>是否累加</th>
                        <th>开始日期</th>
                        <th>结束日期</th>
                        <th>详情页</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="pa" items="${promotionActivities }">
                        <tr>
                            <td>${pa.name }</td>
                            <td>${pa.over }</td>
                            <td>${pa.send }</td>
                            <td>${pa.isAccumulation }</td>
                            <td>
                                <fmt:formatDate value="${pa.validStartTime }" pattern="yyyy-MM-dd HH:mm:ss" />
                            </td>
                            <td>
                                <fmt:formatDate value="${pa.validEndTime }" pattern="yyyy-MM-dd HH:mm:ss" />
                            </td>
                            <td>
                                <a class="btn btn-info" href="">link</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
<%@include file="common/tail.jsp" %>
</html>
