<jsp:useBean id="model" class="model.Customer" scope="session"/>
<jsp:setProperty name="model" property="*"/> 
<HTML>
<BODY>
Would you like to view your results?
<br>
<A HREF="DisplayCustomer.jsp"><Button>OK</Button></A>
</BODY>
</HTML>