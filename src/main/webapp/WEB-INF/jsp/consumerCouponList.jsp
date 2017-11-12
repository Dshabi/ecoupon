<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Consumer Coupon List</title>
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
                    <li class="active"><a href="<%=request.getContextPath()%>/consumer/coupon_list">优惠券</a></li>
                    <li><a href="<%=request.getContextPath()%>/consumer/application_list">优惠券申请表</a></li>
                </ul>
            </div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <h1 class="page-header">优惠券列表</h1>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>金额</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="coupon" items="${couponList }">
                            <c:if test="${coupon.rule.status==1}">
                            <tr>
                                <td>${coupon.rule.send }</td>
                                <td>
                                    <a class="btn btn-info" href="">详情</a>
                                    <a class="btn btn-info" href="">使用</a>
                                </td>
                            </tr>
                            </c:if>
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
