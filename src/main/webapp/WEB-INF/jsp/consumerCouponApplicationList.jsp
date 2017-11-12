<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Consumer Coupon Application List</title>
    <%@include file="common/dashboardhead.jsp" %>
</head>
<body>
<%@include file="common/nav.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="<%=request.getContextPath()%>/consumer/activity_list">优惠活动</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="<%=request.getContextPath()%>/consumer/coupon_list">优惠券</a></li>
                <li class="active"><a href="<%=request.getContextPath()%>/consumer/application_list">优惠券申请表</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">申请表列表</h1>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>消费者</th>
                        <th>商家</th>
                        <th>规则</th>
                        <th>申请时间</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="ca" items="${couponApplicationList }">
                        <tr>
                            <td>${ca.consumerId }</td>
                            <td>${ca.merchantId }</td>
                            <td>${ca.ruleId }</td>
                            <td>
                                <fmt:formatDate value="${ca.applicationTime }" pattern="yyyy-MM-dd HH:mm:ss" />
                            </td>
                            <td>${ca.status }</td>
                            <td>
                                <a class="btn btn-info" href="">详情</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
<%@include file="common/tail.jsp" %>
</html>
