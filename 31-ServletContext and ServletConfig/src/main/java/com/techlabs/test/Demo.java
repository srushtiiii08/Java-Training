//package com.techlabs.test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import java.util.Enumeration;
//import java.util.Map;
//import java.util.Set;
//import javax.servlet.Filter;
//import javax.servlet.FilterRegistration;
//import javax.servlet.FilterRegistration.Dynamic;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.Servlet;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import javax.servlet.ServletRegistration.Dynamic;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.SessionCookieConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.descriptor.JspConfigDescriptor;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/Democreation")
//public class Demo extends HttpServlet implements ServletConfig, ServletContext, RequestDispatcher {
//	private static final long serialVersionUID = 1L;
//       
//    
//    public Demo() {
//        
//    }
//
//
//
//	
//    public Set<javax.servlet.SessionTrackingMode> getEffectiveSessionTrackingModes()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public void forward(ServletRequest arg0, ServletResponse arg1) throws javax.servlet.ServletException, java.io.IOException { 
//         // TODO Auto-generated method stub
//    }
//
//	
//    public ServletContext getServletContext()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public void removeAttribute(String name)  { 
//         // TODO Auto-generated method stub
//    }
//
//	
//    public void setSessionTrackingModes(Set<javax.servlet.SessionTrackingMode> sessionTrackingModes)  { 
//         // TODO Auto-generated method stub
//    }
//
//	
//    public int getSessionTimeout()  { 
//         // TODO Auto-generated method stub
//			return 0;
//    }
//
//	
//    public int getMinorVersion()  { 
//         // TODO Auto-generated method stub
//			return 0;
//    }
//
//	
//    public RequestDispatcher getRequestDispatcher(String path)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//	
//    public String getMimeType(String file)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public Enumeration<java.lang.String> getAttributeNames()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public JspConfigDescriptor getJspConfigDescriptor()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public String getServletName()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	
//    public String getRealPath(String path)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getServletContextName()
//     */
//    public String getServletContextName()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getContextPath()
//     */
//    public String getContextPath()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getNamedDispatcher(String)
//     */
//    public RequestDispatcher getNamedDispatcher(String name)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#setAttribute(String, Object)
//     */
//    public void setAttribute(String name, Object object)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#addListener(Class<? extends java.util.EventListener>)
//     */
//    public void addListener(Class<? extends java.util.EventListener> listenerClass)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#addServlet(String, String)
//     */
//    public ServletRegistration.Dynamic addServlet(String servletName, String className)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#createServlet(Class<T>)
//     */
//    public T createServlet(Class<T> clazz) throws javax.servlet.ServletException { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getServerInfo()
//     */
//    public String getServerInfo()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#addFilter(String, String)
//     */
//    public FilterRegistration.Dynamic addFilter(String filterName, String className)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#log(Exception, String)
//     */
//    public void log(Exception exception, String msg)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#addServlet(String, Class<? extends javax.servlet.Servlet>)
//     */
//    public ServletRegistration.Dynamic addServlet(String servletName, Class<? extends javax.servlet.Servlet> servletClass)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getServletNames()
//     */
//    public Enumeration<java.lang.String> getServletNames()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#log(String)
//     */
//    public void log(String msg)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#getEffectiveMajorVersion()
//     */
//    public int getEffectiveMajorVersion()  { 
//         // TODO Auto-generated method stub
//			return 0;
//    }
//
//	/**
//     * @see ServletContext#setRequestCharacterEncoding(String)
//     */
//    public void setRequestCharacterEncoding(String encoding)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletConfig#getInitParameterNames()
//     */
//    public Enumeration<java.lang.String> getInitParameterNames()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getAttribute(String)
//     */
//    public Object getAttribute(String name)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#declareRoles(String[])
//     */
//    public void declareRoles(String[] roleNames)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#setResponseCharacterEncoding(String)
//     */
//    public void setResponseCharacterEncoding(String encoding)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#getRequestCharacterEncoding()
//     */
//    public String getRequestCharacterEncoding()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#setSessionTimeout(int)
//     */
//    public void setSessionTimeout(int sessionTimeout)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#addFilter(String, Class<? extends javax.servlet.Filter>)
//     */
//    public FilterRegistration.Dynamic addFilter(String filterName, Class<? extends javax.servlet.Filter> filterClass)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#createFilter(Class<T>)
//     */
//    public T createFilter(Class<T> clazz) throws javax.servlet.ServletException { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getMajorVersion()
//     */
//    public int getMajorVersion()  { 
//         // TODO Auto-generated method stub
//			return 0;
//    }
//
//	/**
//     * @see ServletContext#getServletRegistration(String)
//     */
//    public ServletRegistration getServletRegistration(String servletName)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getVirtualServerName()
//     */
//    public String getVirtualServerName()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getResource(String)
//     */
//    public URL getResource(String path) throws java.net.MalformedURLException { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#addListener(T)
//     */
//    public void addListener(T t)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#getResponseCharacterEncoding()
//     */
//    public String getResponseCharacterEncoding()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getDefaultSessionTrackingModes()
//     */
//    public Set<javax.servlet.SessionTrackingMode> getDefaultSessionTrackingModes()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see RequestDispatcher#include(ServletRequest, ServletResponse)
//     */
//    public void include(ServletRequest arg0, ServletResponse arg1) throws javax.servlet.ServletException, java.io.IOException { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#getFilterRegistrations()
//     */
//    public Map<java.lang.String,? extends javax.servlet.FilterRegistration> getFilterRegistrations()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getServlets()
//     */
//    public Enumeration<javax.servlet.Servlet> getServlets()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#setInitParameter(String, String)
//     */
//    public boolean setInitParameter(String name, String value)  { 
//         // TODO Auto-generated method stub
//			return false;
//    }
//
//	/**
//     * @see ServletContext#getServlet(String)
//     */
//    public Servlet getServlet(String name) throws javax.servlet.ServletException { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#addFilter(String, Filter)
//     */
//    public FilterRegistration.Dynamic addFilter(String filterName, Filter filter)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#log(String, Throwable)
//     */
//    public void log(String message, Throwable throwable)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//     * @see ServletContext#addServlet(String, Servlet)
//     */
//    public ServletRegistration.Dynamic addServlet(String servletName, Servlet servlet)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getClassLoader()
//     */
//    public ClassLoader getClassLoader()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getServletRegistrations()
//     */
//    public Map<java.lang.String,? extends javax.servlet.ServletRegistration> getServletRegistrations()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletConfig#getInitParameter(String)
//     */
//    public String getInitParameter(String arg0)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getSessionCookieConfig()
//     */
//    public SessionCookieConfig getSessionCookieConfig()  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#addJspFile(String, String)
//     */
//    public ServletRegistration.Dynamic addJspFile(String servletName, String jspFile)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getContext(String)
//     */
//    public ServletContext getContext(String uripath)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getResourcePaths(String)
//     */
//    public Set<java.lang.String> getResourcePaths(String path)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getResourceAsStream(String)
//     */
//    public InputStream getResourceAsStream(String path)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#getFilterRegistration(String)
//     */
//    public FilterRegistration getFilterRegistration(String filterName)  { 
//         // TODO Auto-generated method stub
//			return null;
//    }
//
//	/**
//     * @see ServletContext#addListener(String)
//     */
//    public void addListener(String className)  { 
//         // TODO Auto-generated method stub
//    }
//
//	/**
//	 * @see Servlet#init(ServletConfig)
//	 */
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//	}
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
