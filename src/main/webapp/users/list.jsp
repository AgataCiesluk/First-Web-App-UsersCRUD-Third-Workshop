<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 19.02.2022
  Time: 12:06
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
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
        <a href="<c:url value="/user/add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Add new user</a>
    </div>

        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Users list</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table">
                        <tr>
                            <th>Id</th>
                            <th>Username</th>
                            <th>Email</th>
                            <th>Actions</th>
                        </tr>
                        <c:forEach items="${allUsers}" var="user">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.userName}</td>
                                <td>${user.email}</td>
                                <td>
                                    <form action="/user/delete" method="post">
                                        <input type="hidden" name="userIdToDelete" value="${user.id}">
                                        <button type="submit" class="btn btn-link">Delete</button>
                                    </form>
                                    <a href="/user/edit?id=${user.id}">Edit</a>
                                    <a href="/user/show?id=${user.id}">Show</a></td>
                            </tr>
                        </c:forEach>
                    </table>

                </div>
            </div>
            <!-- /.container-fluid -->
        </div>
    </div>

<!-- End of Main Content -->

<!-- Footer -->
<%@ include file="/footer.jsp" %>