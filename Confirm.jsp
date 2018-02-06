<jsp:useBean id="model" class="model.Customer" scope="session"/> 
<jsp:useBean id="database" class="model.Database" scope="session"/> 
<% out.println(database.confirm(model.getFname(),model.getLname(),model.getEmail(),model.getAddress(),model.getPnum())); %>