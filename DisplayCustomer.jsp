<jsp:useBean id="model" class="model.Customer" scope="session"/> 
<HTML>
<BODY>
You entered<BR>
First Name: <%= model.getFname() %><BR>
Last Name: <%= model.getLname() %><BR>
Email: <%= model.getEmail() %><BR>
Address: <%= model.getAddress() %><BR>
Phone Number: <%= model.getPnum() %><BR>
<Button>Confirm</Button>

<A HREF="PlaceOrderController.jsp"><Button>Back to Form</Button></A>
<A HREF="Reset.jsp"><Button>Cancel</Button></A>
<%-- <script>
 function  myFunction() {
     <% request.getSession().invalidate(); %>
 }
</script> --%>
</BODY>
</HTML>