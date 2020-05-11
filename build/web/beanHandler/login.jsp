        <jsp:useBean id= "login" scope= "request" class= "model.Loginbean"></jsp:useBean>;
            <jsp:setProperty name="login" property="txtUname" value='<%= request.getParameter("txtUname")%>'/>
            <jsp:setProperty name="login" property="txtPass" value='<%= request.getParameter("txtPass")%>'/>
        
    
        <jsp:forward page="/LoginServlet">
            <jsp:param name="txtUname" value="<%= login.getTxtUname()%>" />
            <jsp:param name="txtPass" value="<%= login.getTxtPass()%>" />
        </jsp:forward>
