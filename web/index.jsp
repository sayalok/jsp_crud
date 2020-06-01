<%@ include file="/includes/header.jsp" %>
<div class="wrapper fadeInDown">
    <div id="formContent">
        <h2>Login Form</h2>
        <form method="post" action="beanHandler/login.jsp">
          <input type="text" class="form-control fadeIn second" name="txtUname" id="txtUname" placeholder="Username"/>
          <input type="password" class="form-control fadeIn third" name="txtPass" id="txtPass" placeholder="Password">
          <input type="submit" class="fadeIn fourth" value="Log In" name="btnLogin"/>
        </form>
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