<%@ page session="false" language="java"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="/WEB-INF/tld/pager-taglib.tld" prefix="pg" %>
<!-- 
角色授予权限设置：将角色的授予权限付给用户或者角色
	作者:yinbp
	版权:bboss
	版本:v1.0 
	日期:2016-12-15 17:06:09
 -->
<pg:pager scope="request"  data="roles" desc="false" isList="false" containerid=".select_cangrantedroles">
	 
	<pg:param name="roleAttr"/>
	<pg:param name="fromAuthmain"/>
	<pg:param name="cangrantedRole"/>
<table	class="table table-bordered table-striped table-condensed table-cangrantedroles" style="height:50px;">
	<thead >
		<tr>
			<th width="2%">
					<input type="checkbox" class="checkboxall" onClick="checkAll('.table-cangrantedroles .checkboxall','.table-cangrantedroles .checkone')"
					/></th>
			
			<th width="10%">名称</th>
			 
			<th width="10%">中文名</th>
			
		</tr>
	</thead>
	<tbody>
		<pg:list >
		  	 <tr>
		  	 	<td>
		  	 	
		  	 	<input
						name="roleId" type="checkbox" class="checkone" onClick="checkOne('.table-cangrantedroles .checkboxall','.table-cangrantedroles .checkone')" value="<pg:cell colName="roleId"/>" roleName="<pg:cell colName="roleName"/>" remark1="<pg:cell colName="remark1"/>" />
				</td>			
		  	 	
	            <td> <pg:cell colName="roleName"/> </td>
	            <td> <pg:cell colName="remark1"/> </td>
	            
	        </tr>
	    </pg:list>
		
	</tbody>
</table>
<div class="pages"><input type="hidden" value="<pg:querystring/>" /><pg:index tagnumber="10" sizescope="5,10,20,50,100"/></div>
</pg:pager>