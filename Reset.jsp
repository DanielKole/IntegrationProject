<jsp:useBean id="model" class="model.Customer" scope="session"/> 
<%
model.reSet();

%>
<jsp:forward page="index.jsp"/>