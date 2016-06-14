<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<script type="text/javascript">
      $(document).ready(function() {
            <%    HttpSession sessionb = request.getSession(false);
            if (sessionb != null){%>
           
            <%} %>
      });
</script>
<%    HttpSession sessiona = request.getSession(false);
      if (sessiona != null){%>
<c:redirect url="/index.action"/>
<%} else {%>
      <div id="sessionNotice">
      <div class="non-printable overlay">
      </div>
</div>
      <%} %>