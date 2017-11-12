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
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-3 col-md-2 sidebar">
                <ul class="nav nav-sidebar">
                    <li class="active"><a href="<%=request.getContextPath()%>/consumer/activity_list">优惠活动</a></li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li><a href="<%=request.getContextPath()%>/consumer/coupon_list">优惠券</a></li>
                    <li><a href="<%=request.getContextPath()%>/consumer/application_list">优惠券申请表</a></li>
                </ul>
            </div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                <h1 class="page-header">优惠活动列表</h1>
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>商户名称</th>
                            <th>满</th>
                            <th>送</th>
                            <th>是否累加</th>
                            <th>开始日期</th>
                            <th>结束日期</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="pa" items="${promotionActivityList }">
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
                                    <a class="btn btn-info" href="">详情</a>
                                    <a class="btn btn-info" href="<%=request.getContextPath()%>/consumer/apply_coupon?merchantId=${pa.merchantId}&ruleId=${pa.couponRuleId}">申请</a>
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
