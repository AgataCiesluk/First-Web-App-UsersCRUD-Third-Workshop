<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 19.02.2022
  Time: 15:37
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
        <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Users list</a>
    </div>
    <!-- Content Row -->
    <div class="row">
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Add new user</h6>
            </div>
        <form action="/user/add" method="post">
            <div class="form-group">
                <label for="inputUsername">Username</label>
                <input type="text" name="username" class="form-control" id="inputUsername" placeholder="Username">
            </div>
            <div class="form-group">
                <label for="inputEmail">Email</label>
                <input type="email" name="email" class="form-control" id="inputEmail" aria-describedby="emailHelp"
                       placeholder="User email">
                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone
                    else.</small>
            </div>
            <div class="form-group">
                <label for="inputPassword">Password</label>
                <input type="password" name="password" class="form-control" id="inputPassword"
                       placeholder="User password">
            </div>
            <button type="submit" class="btn btn-primary">Save</button>
        </form>
        </div>

    </div>
    <!-- /.container-fluid -->

</div>
<%@ include file="/footer.jsp" %>
