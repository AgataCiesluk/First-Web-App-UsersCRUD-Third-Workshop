<%--
  Created by IntelliJ IDEA.
  User: aga
  Date: 19.02.2022
  Time: 15:14
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
        <a href="<c:url value="/user/add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-plus fa-sm text-white-50"></i> Add new user</a>
    </div>

        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Users list</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable">
                        <tbody>
                        <tr>
                            <th>Id</th>
                            <td>${user.id}</td>
                        </tr>
                        <tr>
                            <th>Username</th>
                            <td>${user.userName}</td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td>${user.email}</td>
                        </tr>
                        </tbody>
                    </table>

                </div>
            </div>
            <!-- /.container-fluid -->
        </div>
    <a href="/user/list">Back</a>
    </div>



<!-- /.container-fluid -->
<%@ include file="/footer.jsp" %>
