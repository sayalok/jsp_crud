<%@ include file="/includes/header.html" %>
<div class="container">
    <h2 class="text-center"> Login Form</h2>
    <div class="row justify-content-center">
        <div class="col-md-5 col-sm-6">
            <div class="loginForm">
                <form  method="post" action="beanHandler/login.jsp">
<!--                <form id="loginForm">-->
                    <div class="form-group">
                        <label>Username</label>
                        <input type="text" class="form-control" name="txtUname" id="txtUname"/>
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" class="form-control" name="txtPass" id="txtPass"/>
                    </div>
                    <input type="submit" name="btnLogin" value="Login"/>
                </form>
            </div>
        </div>
    </div>  
</div>
<script>
    document.getElementById("loginForm").addEventListener("submit", (e) => {
        e.preventDefault();
        
        txtUname = document.getElementById("txtUname").value;
        txtPass = document.getElementById("txtPass").value;
        console.log(txtPass,txtUname)
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "beanHandler/login.jsp");
        xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
        xhr.send("txtUname="+txtUname+"&txtPass="+txtPass)
        
    })
</script>
<%@ include file="/includes/footer.html" %>



