<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:genericpage>
    <jsp:attribute name="header">
    </jsp:attribute>
    <jsp:attribute name="footer">
    </jsp:attribute>
    <jsp:body>
        <table class="table table-striped">
        <thead>
        <tr>
            <td>ID</td>
            <td>Beskrivelse</td>
            <td>Længde</td>
            <td>Antal</td>
            <td>Pris</td>
        </tr>
        </thead>

            <c:forEach var="material"  items="${sessionScope.billOfMaterials}">
                <tr>
                    <td>${material.id}</td>
                    <td>${material.description}</td>
                    <td>${material.length}</td>
                    <td>${material.quantity}</td>
                    <td>${material.price}</td>
                </tr>
            </c:forEach>
        </table>

        <table class="table table-striped">
            <thead>
            <tr>
                <td>Total Pris</td>
            </tr>
            </thead>
            <tr>
                <td>${sessionScope.totalpris}</td>
            </tr>
        </table>
        <form name="status" action="${pageContext.request.contextPath}/fc/statuspage" method="POST">
        <button class="btn btn-primary" type="submit" value="Godkendt" name="Godkend">Godkend</button>
        <button class="btn btn-primary" type="submit" value="Afvist" name="Afvis">Afvis</button>
        </form>

    </jsp:body>
</t:genericpage>