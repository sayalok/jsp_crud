<%
  session.invalidate();
  response.sendRedirect("/jsp_crud/index.jsp");
%>