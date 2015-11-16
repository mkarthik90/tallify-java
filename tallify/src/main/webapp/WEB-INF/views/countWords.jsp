<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="POST" commandName="countWordsBean"
	action="${pageContext.servletContext.contextPath}/countWords">

<br/><br/>
<center> <b> Tallify</b></center>

	<center><br/><br/>
		
	
	<c:if test="${errors eq true }">
		<br/> <font size="3" color="red">Text field is mandatory</font><br/>
	</c:if>
	
	<p class="formfield">
    <label for="textarea">Enter the text</label>
    <form:textarea path="textValue" cols="44" rows="10" id="textValue"></form:textarea>
	</p>
	
	<br/><br/><br/>
	Stop Words<form:input path="stopWords"/> *seperate using commas
	<br/><br/>
	
	<input type="submit" value='countWords' /> 
	
	
	</center>
	
	
	
	
	
</form:form>