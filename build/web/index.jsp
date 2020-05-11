<%@ include file="/includes/header.html" %>
<div class="container">
    <h2 class="text-center"> Login Form</h2>
    <div class="row justify-content-center">
        <div class="col-md-5 col-sm-6">
            <div class="loginForm">
                <form  method="post" action="beanHandler/login.jsp">
                    <div class="form-group">
                        <label>Username</label>
                        <input type="text" class="form-control" name="txtUname"/>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" class="form-control" name="txtPass"/>
                    </div>
                    <input type="submit" name="btnLogin" value="Login"/>
                </form>
            </div>
        </div>
    </div>  
</div>
<%@ include file="/includes/footer.html" %>



