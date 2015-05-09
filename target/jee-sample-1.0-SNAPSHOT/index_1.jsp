<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example Servlet</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/sampleServlet1" method="post"/>  
        <input type="text" name="id" />
        <input type="text" name="name"/>
        <input type="submit" value="search"/>
      </form>
    </body>
</html>