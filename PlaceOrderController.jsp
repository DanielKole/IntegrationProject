<HTML>
    <BODY>
    <jsp:useBean id="model" class="model.Customer" scope="session"/> 
    <FORM METHOD=POST ACTION="CustomerController.jsp">
    What's your first name? <INPUT TYPE=TEXT NAME=fname SIZE=20 Placeholder=<%= model.getFname() %>><BR>
    What's your last name? <INPUT TYPE=TEXT NAME=lname SIZE=20 Placeholder=<%= model.getLname() %>><BR>
    What's your e-mail address? <INPUT TYPE=TEXT NAME=email SIZE=20 Placeholder=<%= model.getEmail() %>><BR>
    What's your address? <INPUT TYPE=TEXT NAME=address SIZE=20 Placeholder=<%= model.getAddress() %>><BR>
    What's your Phone Number? <INPUT TYPE=TEXT NAME=pnum SIZE=20 Placeholder=<%= model.getPnum() %>>
    <P><INPUT TYPE=SUBMIT>
    </FORM>
    </BODY>
    </HTML>