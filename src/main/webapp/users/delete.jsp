<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 20.02.2022
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-list fa-sm text-white-50"></i> Users list</a>
    </div>

    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Confirm user removal</h6>
        </div>
        <div class="card-body">
            <form method="post">
                <label>
                    <span>Are you sure that user with ID ${user.id} should be deleted?</span><br>
                    <input type="hidden" name="userId" value="${user.id}">
                <button type="submit" class="btn btn-primary">Confirm</button>
                </label>
            </form>
        </div>
    </div>
    <a href="/user/list">Back</a>
</div>

<%@ include file="/footer.jsp" %>
