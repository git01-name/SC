<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/head.jsp"%>

<div class="right">
 <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
 <script type="text/javascript">
 $(function(){
	 $.ajax({
		 type:"GET",
		 url:"${pageContext.request.contextPath}/djy03",
		 data:"id="+21,
		 dataType:"json",
		 success:function(data){
			 $(".s").val(data.productName);
			 $(".f").val(data.creationDate)
		 }
	 })
 })
 	function hh(qq,jj) {
		$.post("delete1.do","id="+jj,function(data){
			alert(data.delResult)
			if(data.delResult=="true"){
				qq.parent("tr").remove();
			}
		},"json")
	}
 </script>
        <a href="${pageContext.request.contextPath }/bill.do?pag=1">第一页</a> <a href="${pageContext.request.contextPath }/bill.do?pag=${pag-1}">上一页</a> <a href="${pageContext.request.contextPath }/bill.do?pag=${pag+1}">下一页</a> <a href="#">尾页</a>
                商品名称 :<input type="text" class="s" >
                 时间:<input type="text" class="f">
       <div class="location">
           <strong>你现在所在的位置是:</strong>
           <span>订单管理页面</span>
       </div>
       <div class="search">
       <form method="get" action="${pageContext.request.contextPath }/bill.do">
			<input name="method" value="query" class="input-text" type="hidden">
			<span>商品名称：</span>
			<input name="queryProductName" type="text" value="${queryProductName }">
			 
			<span>供应商：</span>
			<select name="queryProviderId">
				<c:if test="${providerList != null }">
				   <option value="0">--请选择--</option>
				   <c:forEach var="provider" items="${providerList}">
				   		<option <c:if test="${provider.id == queryProviderId }">selected="selected"</c:if>
				   		value="${provider.id}">${provider.proName}</option>
				   </c:forEach>
				</c:if>
       		</select>
			 
			<span>是否付款：</span>
			<select name="queryIsPayment">
				<option value="0">--请选择--</option>
				<option value="1" ${queryIsPayment == 1 ? "selected=\"selected\"":"" }>未付款</option>
				<option value="2" ${queryIsPayment == 2 ? "selected=\"selected\"":"" }>已付款</option>
       		</select>
			
			 <input	value="查 询" type="submit" id="searchbutton">
			 <a href="${pageContext.request.contextPath }/billadd">添加订单</a>
		</form>
       </div>
       <!--账单表格 样式和供应商公用-->
      <table class="providerTable" cellpadding="0" cellspacing="0">
          <tr class="firstTr">
              <th width="10%">订单编码</th>
              <th width="20%">商品名称</th>
              <th width="10%">供应商</th>
              <th width="10%">订单金额</th>
              <th width="10%">是否付款</th>
              <th width="10%">创建时间</th>
              <th width="30%">操作</th>
          </tr>
          <c:forEach var="bill" items="${billList }" varStatus="status">
				<tr>
					<td>
					<span>${bill.billCode }</span>
					</td>
					<td>
					<span>${bill.productName }</span>
					</td>
					<td>
					<span>${bill.providerName}</span>
					</td>
					<td>
					<span>${bill.totalPrice}</span>
					</td>
					<td>
					<span>
						<c:if test="${bill.isPayment == 1}">未付款</c:if>
						<c:if test="${bill.isPayment == 2}">已付款</c:if>
					</span>
					</td>
					<td>
					<span>
					<fmt:formatDate value="${bill.creationDate}" pattern="yyyy-MM-dd"/>
					</span>
					</td>
					<td>
					<span><a href="${pageContext.request.contextPath }/djy?id=${bill.id}"><img src="${pageContext.request.contextPath }/images/read.png" alt="查看" title="查看"/></a></span>
					<span><a href="${pageContext.request.contextPath }/djy02?id=${bill.id}"><img src="${pageContext.request.contextPath }/images/xiugai.png" alt="修改" title="修改"/></a></span>
					<span><a class="delete" href="javascript:void(0)" onclick="hh(this,${bill.id})"><img src="${pageContext.request.contextPath }/images/schu.png" alt="删除" title="删除"/></a></span>
				</tr>
			</c:forEach>
      </table>
  </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该订单吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

<%@include file="common/head.jsp"%>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/billlist.js"></script>