<%@ page import="java.util.List" %>
<html>
<head>
<title>Hello page</title>
</head>
<body>
<h2>Index Page</h2>
<%
    String name=(String)request.getAttribute("name");
    Integer age=(Integer)request.getAttribute("age"); 
    List<String> friends = (List<String>) request.getAttribute("f");
%>
<Label>Name</Label>
<p><%= name %></p>
<label>Age: </label><p><%= age %></p>

<h3>List of friends</h3>
<%
if(friends !=null){
for(String s: friends){
out.println("<li>"+s+"</li>");

}
}else{
	out.println("<li>No friends available</li> ");
}
%>

</body>
</html>
