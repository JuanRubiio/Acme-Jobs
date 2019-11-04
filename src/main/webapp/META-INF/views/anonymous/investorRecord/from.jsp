<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="anonymous.investorRecord.nameInvestor" path="nameInvestor"/>
	<acme:form-moment code="anonymous.investorRecord.sector" path="sector"/>
	<acme:form-moment code="anonymous.investorRecord.investingStatement" path="investingStatement"/>
	<acme:form-money code="anonymous.investorRecord.stars" path="stars"/>

<%-- 	<acme:form-submit code="anonymous.investorRecord.create" action="/authenticated/investorRecord/create"/>
		 --%>
  	<acme:form-return code="anonymous.investorRecord.return"/>
</acme:form>

