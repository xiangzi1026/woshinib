/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.M1
 * Generated at: 2018-03-13 02:43:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.syspermission;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  

      out.write("  \r\n");
      out.write("<!DOCTYPE html>  \r\n");
      out.write("<html>  \r\n");
      out.write("<head>  \r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">  \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">  \r\n");
      out.write("</head>  \r\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/material/easyui.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"easyui/themes/icon.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<body> \r\n");
      out.write("  <table id=\"userTable\"  title=\"Permission List\"\r\n");
      out.write("        data-options=\"url:'permission/list',fitColumns:true,striped:true,iconCls:'icon-search'\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th data-options=\"field:'text',width:100,sortable:true\">name</th>\r\n");
      out.write("            <th data-options=\"field:'available',width:100,sortable:true\">Availabl\r\n");
      out.write("            <th data-options=\"field:'url',width:100\">url</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"tb\">\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"add_fu();\" data-options=\"iconCls:'icon-add',plain:true\">添加父级</a>\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"add_zi();\" data-options=\"iconCls:'icon-add',plain:true\">添加子级</a>\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"edit();\" data-options=\"iconCls:'icon-edit',plain:true\">修改</a>\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"delete_permission();\" data-options=\"iconCls:'icon-remove',plain:true\">删除</a>\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-undo',plain:true\">导出</a>\r\n");
      out.write("<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-sum',plain:true\">批量导入</a>\r\n");
      out.write("</div>\r\n");
      out.write("</body>  \r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#userTable\").treegrid({\r\n");
      out.write("\t\t\ttoolbar : \"#tb\",\r\n");
      out.write("\t\t\tidField : \"id\",\r\n");
      out.write("\t\t\ttreeField:\"text\",\r\n");
      out.write("\t\t\tanimate:true,\r\n");
      out.write("\t\t\tonLoadSuccess : function(){\r\n");
      out.write("\t\t\t\t$(this).treegrid(\"collapseAll\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tloadFilter : function(data){\r\n");
      out.write("\t\t\t\treturn data;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\tfunction add_fu(){\r\n");
      out.write("\t\tvar d = $(\"<div></div>\").appendTo(\"body\");\r\n");
      out.write("\t\td.dialog({\r\n");
      out.write("\t\t\ttitle : \"添加父级\",\r\n");
      out.write("\t\t\ticonCls : \"icon-add\",\r\n");
      out.write("\t\t\twidth:300,\r\n");
      out.write("\t\t\theight:200,\r\n");
      out.write("\t\t\tmodal:true,\r\n");
      out.write("\t\t\thref : \"permission/fufrom\",\r\n");
      out.write("\t\t\tonClose:function(){$(this).dialog(\"destroy\"); },\r\n");
      out.write("\t\t\tbuttons:[{\r\n");
      out.write("\t\t\t\ticonCls:\"icon-ok\",\r\n");
      out.write("\t\t\t\ttext:\"确定\",\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t$(\"#fuForm\").form(\"submit\",{\r\n");
      out.write("\t\t\t\t\t\turl : \"permission/addfu\",\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#userTable\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\ticonCls:\"icon-cancel\",\r\n");
      out.write("\t\t\t\ttext:\"取消\",\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction add_zi(){\r\n");
      out.write("\t\tvar d = $(\"<div></div>\").appendTo(\"body\");\r\n");
      out.write("\t\td.dialog({\r\n");
      out.write("\t\t\ttitle : \"添加子级\",\r\n");
      out.write("\t\t\ticonCls : \"icon-add\",\r\n");
      out.write("\t\t\twidth:300,\r\n");
      out.write("\t\t\theight:300,\r\n");
      out.write("\t\t\tmodal:true,\r\n");
      out.write("\t\t\thref : \"permission/zifrom\",\r\n");
      out.write("\t\t\tonClose:function(){$(this).dialog(\"destroy\"); },\r\n");
      out.write("\t\t\tbuttons:[{\r\n");
      out.write("\t\t\t\ticonCls:\"icon-ok\",\r\n");
      out.write("\t\t\t\ttext:\"确定\",\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t$(\"#ziForm\").form(\"submit\",{\r\n");
      out.write("\t\t\t\t\t\turl : \"permission/addzi\",\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#userTable\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},{\r\n");
      out.write("\t\t\t\ticonCls:\"icon-cancel\",\r\n");
      out.write("\t\t\t\ttext:\"取消\",\r\n");
      out.write("\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction delete_permission(){\r\n");
      out.write("\t\t//1. 获取选中的数据，如果没有选中，则提示必须选中数据\r\n");
      out.write("\t\tvar selRows = $(\"#userTable\").datagrid(\"getSelections\");\r\n");
      out.write("\t\tif(selRows.length == 0){\r\n");
      out.write("\t\t\t$.messager.alert(\"提示\",\"请选择要删除的数据行！\",\"warning\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//2. 提示是否删除？是\r\n");
      out.write("\t\t$.messager.confirm(\"提示\",\"确定要删除选中的数据吗？\",function(r){\r\n");
      out.write("\t\t\tif(r){\r\n");
      out.write("\t\t\t\t//3. 发送异步请求，带选中行的编号\r\n");
      out.write("\t\t\t\t//拼接删除条件\r\n");
      out.write("\t\t\t\tvar postData = \"\";\r\n");
      out.write("\t\t\t\t$.each(selRows,function(i){\r\n");
      out.write("\t\t\t\t\tpostData += \"ids=\"+this.id;\r\n");
      out.write("\t\t\t\t\tif(i < selRows.length - 1){\r\n");
      out.write("\t\t\t\t\t\tpostData += \"&\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$.post(\"permission/getById\",postData,function(data){\r\n");
      out.write("\t\t\t\t\tif(data.children.length == 0){\r\n");
      out.write("\t\t\t\t\t\t//4. 删除成功后，刷新表格 reload\r\n");
      out.write("\t\t\t\t\t\t$.post(\"permission/batchDelete\",postData,function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data.result == true){\r\n");
      out.write("\t\t\t\t\t\t\t\t//4. 删除成功后，刷新表格 reload\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#userTable\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert(\"提示\",\"该行不可删除，有子类，请先删除子类！\",\"warning\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction edit(){\r\n");
      out.write("\t\tvar row = $(\"#userTable\").treegrid(\"getSelected\");\r\n");
      out.write("\t\tif(row == null){\r\n");
      out.write("\t\t\t$.messager.alert(\"提示\",\"请选择要修改的数据行！\",\"warning\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t//如果选中了多个，只保留row这个\r\n");
      out.write("\t\t$(\"#userTable\").datagrid(\"clearSelections\");\r\n");
      out.write("\t\t$(\"#userTable\").datagrid(\"selectRecord\",row.id);\r\n");
      out.write("\t\t$.post(\"permission/getById\",{ids:row.id},function(data){\r\n");
      out.write("\t\t\tif(data.children.length == 0){\r\n");
      out.write("\t\t\t\t//进入子类\r\n");
      out.write("\t\t\t\tvar d = $(\"<div></div>\").appendTo(\"body\");\r\n");
      out.write("\t\t\t\td.dialog({\r\n");
      out.write("\t\t\t\ttitle : \"编辑\",\r\n");
      out.write("\t\t\t\ticonCls : \"icon-edit\",\r\n");
      out.write("\t\t\t\twidth:300,\r\n");
      out.write("\t\t\t\theight:400,\r\n");
      out.write("\t\t\t\tmodal:true,\r\n");
      out.write("\t\t\t\thref : \"permission/zifrom\",\r\n");
      out.write("\t\t\t\tonClose:function(){$(this).dialog(\"destroy\"); },\r\n");
      out.write("\t\t\t\tonLoad:function(){\r\n");
      out.write("\t\t\t\t\t//发送异步请求，查询数据\r\n");
      out.write("\t\t\t\t\t$.post(\"permission/getById\",{ids:row.id},function(data){\r\n");
      out.write("\t\t\t\t\t\t$(\"#ziForm\").form(\"load\",data);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tbuttons:[{\r\n");
      out.write("\t\t\t\t\ticonCls:\"icon-ok\",\r\n");
      out.write("\t\t\t\t\ttext:\"确定\",\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$(\"#ziForm\").form(\"submit\",{\r\n");
      out.write("\t\t\t\t\t\t\turl : \"permission/editZi\",\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#userTable\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ticonCls:\"icon-cancel\",\r\n");
      out.write("\t\t\t\t\ttext:\"取消\",\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t//进入父类\r\n");
      out.write("\t\t\t\tvar d = $(\"<div></div>\").appendTo(\"body\");\r\n");
      out.write("\t\t\t\td.dialog({\r\n");
      out.write("\t\t\t\ttitle : \"编辑\",\r\n");
      out.write("\t\t\t\ticonCls : \"icon-edit\",\r\n");
      out.write("\t\t\t\twidth:300,\r\n");
      out.write("\t\t\t\theight:400,\r\n");
      out.write("\t\t\t\tmodal:true,\r\n");
      out.write("\t\t\t\thref : \"permission/fufrom\",\r\n");
      out.write("\t\t\t\tonClose:function(){$(this).dialog(\"destroy\"); },\r\n");
      out.write("\t\t\t\tonLoad:function(){\r\n");
      out.write("\t\t\t\t\t//发送异步请求，查询数据\r\n");
      out.write("\t\t\t\t\t$.post(\"permission/getById\",{ids:row.id},function(data){\r\n");
      out.write("\t\t\t\t\t\t$(\"#fuForm\").form(\"load\",data);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tbuttons:[{\r\n");
      out.write("\t\t\t\t\ticonCls:\"icon-ok\",\r\n");
      out.write("\t\t\t\t\ttext:\"确定\",\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\t$(\"#fuForm\").form(\"submit\",{\r\n");
      out.write("\t\t\t\t\t\t\turl : \"permission/editFu\",\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#userTable\").treegrid(\"reload\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},{\r\n");
      out.write("\t\t\t\t\ticonCls:\"icon-cancel\",\r\n");
      out.write("\t\t\t\t\ttext:\"取消\",\r\n");
      out.write("\t\t\t\t\thandler:function(){\r\n");
      out.write("\t\t\t\t\t\td.dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>  \r\n");
      out.write("</html> ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
