<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://kwonnam.pe.kr/jsp/template-inheritance" prefix="layout" %>


<layout:extends name="Login">
	
	<layout:put block="header" type="REPLACE">
			<p>This is header Dashboard !</p>							
	</layout:put>

    <layout:put block="contents" type="REPLACE">
        <div class="row">
        	Dashboard
        </div>
    </layout:put>
    
    
</layout:extends>