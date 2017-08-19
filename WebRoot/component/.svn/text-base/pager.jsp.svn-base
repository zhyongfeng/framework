<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="WebRoot" value="${pageContext.request.contextPath}"/>
<script language="javascript">
<c:if test="${empty RESULT.page.totalPage}">
var pageTotalSize=0;	
</c:if>
<c:if test="${not empty RESULT.page.totalPage}">
var pageTotalSize = <c:out value="${RESULT.page.totalPage}"/>;
</c:if>
function submitGoPage(currPageNum){
	
	if (isNaN(currPageNum)){
        return false;//currPageNum=1;
    }
    if (currPageNum > pageTotalSize){
        currPageNum = pageTotalSize;
    }
    if (currPageNum < 1){
        currPageNum=1;
    }
	document.all("currentPage").value = currPageNum;
	document.all("<c:out value='${param["formName"]}'/>").action = '<c:out value="${WebRoot}"/><c:out value="${param['action']}"/>?currentPage=' + currPageNum;
	
	document.all("<c:out value='${param["formName"]}'/>").target = "_self";
	//document.all("<c:out value='${param["formName"]}'/>").method = "post";
	document.all("<c:out value='${param["formName"]}'/>").submit();
	
}
function goNextPage(currPageNum){
	submitGoPage(currPageNum+1);
}

function goPrePage(currPageNum){
	submitGoPage(currPageNum-1);
}
</script>

<table id="pagination" width="auto" align="center" cellpadding="0" cellspacing="0" border="0">
<tr>
<td nowrap align="center">
<c:set var="isFilter" value="1"/>

		<c:choose>
		<c:when test="${RESULT.page.hasPrePage}">
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="首页"   class="first"     onclick="submitGoPage('1')"/> 
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="上一页" class="previous"  onclick="goPrePage(<c:out value="${RESULT.page.currentPage}"/>)"/>
		</c:when>
		<c:otherwise>
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="首页"   class="first_disabled"   /> 
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="上一页" class="previous_disabled"/>
		</c:otherwise>
		</c:choose>
</td><td>
			<input type = "hidden" name = "currentPage" id = "currentPage" value="<c:out value="${RESULT.page.currentPage}"/>">
			<p>&nbsp;共<c:out value="${RESULT.page.totalRecords}"/>条 <c:out value="${RESULT.page.totalPage}"/>页&nbsp; 当前第 <c:out value="${RESULT.page.currentPage}"/> 页<p>
</td><td>
		<c:choose>
		<c:when test="${RESULT.page.hasNextPage}">
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="下一页" class="next" onclick="goNextPage(<c:out value="${RESULT.page.currentPage}"/>)"/> 
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="末页"   class="last" onclick="submitGoPage('<c:out value="${RESULT.page.totalPage}"/>')"/>
		</c:when>
		<c:otherwise>
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="下一页" class="next_disabled"/> 
			<img src='<c:out value="${WebRoot}"/>/images/clear.cache.gif' alt="末页"   class="last_disabled"/>
		</c:otherwise>
		</c:choose>

</td>
</tr>
</table>