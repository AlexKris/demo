package com.example.demo.y2019.m05.d13;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.log4j.MDC;

public class TestJsonObject {
    public static void main(String[] args) {
        String json = "{\"exception\":{\"@type\":\"org.apache.shiro.authc.IncorrectCredentialsException\",\"localizedMessage\":\"Submitted credentials for token [org.apache.shiro.authc.UsernamePasswordToken - admin, rememberMe=false] did not match the expected credentials.\",\"message\":\"Submitted credentials for token [org.apache.shiro.authc.UsernamePasswordToken - admin, rememberMe=false] did not match the expected credentials.\",\"stackTrace\":[{\"className\":\"org.apache.shiro.realm.AuthenticatingRealm\",\"fileName\":\"AuthenticatingRealm.java\",\"lineNumber\":603,\"methodName\":\"assertCredentialsMatch\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.realm.AuthenticatingRealm\",\"fileName\":\"AuthenticatingRealm.java\",\"lineNumber\":581,\"methodName\":\"getAuthenticationInfo\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.authc.pam.ModularRealmAuthenticator\",\"fileName\":\"ModularRealmAuthenticator.java\",\"lineNumber\":180,\"methodName\":\"doSingleRealmAuthentication\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.authc.pam.ModularRealmAuthenticator\",\"fileName\":\"ModularRealmAuthenticator.java\",\"lineNumber\":267,\"methodName\":\"doAuthenticate\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.authc.AbstractAuthenticator\",\"fileName\":\"AbstractAuthenticator.java\",\"lineNumber\":198,\"methodName\":\"authenticate\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.mgt.AuthenticatingSecurityManager\",\"fileName\":\"AuthenticatingSecurityManager.java\",\"lineNumber\":106,\"methodName\":\"authenticate\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.mgt.DefaultSecurityManager\",\"fileName\":\"DefaultSecurityManager.java\",\"lineNumber\":274,\"methodName\":\"login\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.subject.support.DelegatingSubject\",\"fileName\":\"DelegatingSubject.java\",\"lineNumber\":260,\"methodName\":\"login\",\"nativeMethod\":false},{\"className\":\"com.caxs.gpsmonitor.controller.LoginController\",\"fileName\":\"LoginController.java\",\"lineNumber\":59,\"methodName\":\"login\",\"nativeMethod\":false},{\"className\":\"sun.reflect.NativeMethodAccessorImpl\",\"fileName\":\"NativeMethodAccessorImpl.java\",\"lineNumber\":-2,\"methodName\":\"invoke0\",\"nativeMethod\":true},{\"className\":\"sun.reflect.NativeMethodAccessorImpl\",\"fileName\":\"NativeMethodAccessorImpl.java\",\"lineNumber\":62,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"sun.reflect.DelegatingMethodAccessorImpl\",\"fileName\":\"DelegatingMethodAccessorImpl.java\",\"lineNumber\":43,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"java.lang.reflect.Method\",\"fileName\":\"Method.java\",\"lineNumber\":498,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.method.support.InvocableHandlerMethod\",\"fileName\":\"InvocableHandlerMethod.java\",\"lineNumber\":189,\"methodName\":\"doInvoke\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.method.support.InvocableHandlerMethod\",\"fileName\":\"InvocableHandlerMethod.java\",\"lineNumber\":138,\"methodName\":\"invokeForRequest\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod\",\"fileName\":\"ServletInvocableHandlerMethod.java\",\"lineNumber\":102,\"methodName\":\"invokeAndHandle\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter\",\"fileName\":\"RequestMappingHandlerAdapter.java\",\"lineNumber\":895,\"methodName\":\"invokeHandlerMethod\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter\",\"fileName\":\"RequestMappingHandlerAdapter.java\",\"lineNumber\":800,\"methodName\":\"handleInternal\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter\",\"fileName\":\"AbstractHandlerMethodAdapter.java\",\"lineNumber\":87,\"methodName\":\"handle\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.DispatcherServlet\",\"fileName\":\"DispatcherServlet.java\",\"lineNumber\":1038,\"methodName\":\"doDispatch\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.DispatcherServlet\",\"fileName\":\"DispatcherServlet.java\",\"lineNumber\":942,\"methodName\":\"doService\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.FrameworkServlet\",\"fileName\":\"FrameworkServlet.java\",\"lineNumber\":1005,\"methodName\":\"processRequest\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.FrameworkServlet\",\"fileName\":\"FrameworkServlet.java\",\"lineNumber\":908,\"methodName\":\"doPost\",\"nativeMethod\":false},{\"className\":\"javax.servlet.http.HttpServlet\",\"fileName\":\"HttpServlet.java\",\"lineNumber\":660,\"methodName\":\"service\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.servlet.FrameworkServlet\",\"fileName\":\"FrameworkServlet.java\",\"lineNumber\":882,\"methodName\":\"service\",\"nativeMethod\":false},{\"className\":\"javax.servlet.http.HttpServlet\",\"fileName\":\"HttpServlet.java\",\"lineNumber\":741,\"methodName\":\"service\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":231,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.tomcat.websocket.server.WsFilter\",\"fileName\":\"WsFilter.java\",\"lineNumber\":53,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.web.servlet.AbstractShiroFilter\",\"fileName\":\"AbstractShiroFilter.java\",\"lineNumber\":449,\"methodName\":\"executeChain\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.web.servlet.AbstractShiroFilter$1\",\"fileName\":\"AbstractShiroFilter.java\",\"lineNumber\":365,\"methodName\":\"call\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.subject.support.SubjectCallable\",\"fileName\":\"SubjectCallable.java\",\"lineNumber\":90,\"methodName\":\"doCall\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.subject.support.SubjectCallable\",\"fileName\":\"SubjectCallable.java\",\"lineNumber\":83,\"methodName\":\"call\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.subject.support.DelegatingSubject\",\"fileName\":\"DelegatingSubject.java\",\"lineNumber\":387,\"methodName\":\"execute\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.web.servlet.AbstractShiroFilter\",\"fileName\":\"AbstractShiroFilter.java\",\"lineNumber\":362,\"methodName\":\"doFilterInternal\",\"nativeMethod\":false},{\"className\":\"org.apache.shiro.web.servlet.OncePerRequestFilter\",\"fileName\":\"OncePerRequestFilter.java\",\"lineNumber\":125,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.RequestContextFilter\",\"fileName\":\"RequestContextFilter.java\",\"lineNumber\":99,\"methodName\":\"doFilterInternal\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.OncePerRequestFilter\",\"fileName\":\"OncePerRequestFilter.java\",\"lineNumber\":107,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.FormContentFilter\",\"fileName\":\"FormContentFilter.java\",\"lineNumber\":92,\"methodName\":\"doFilterInternal\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.OncePerRequestFilter\",\"fileName\":\"OncePerRequestFilter.java\",\"lineNumber\":107,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.HiddenHttpMethodFilter\",\"fileName\":\"HiddenHttpMethodFilter.java\",\"lineNumber\":93,\"methodName\":\"doFilterInternal\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.OncePerRequestFilter\",\"fileName\":\"OncePerRequestFilter.java\",\"lineNumber\":107,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.CharacterEncodingFilter\",\"fileName\":\"CharacterEncodingFilter.java\",\"lineNumber\":200,\"methodName\":\"doFilterInternal\",\"nativeMethod\":false},{\"className\":\"org.springframework.web.filter.OncePerRequestFilter\",\"fileName\":\"OncePerRequestFilter.java\",\"lineNumber\":107,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":193,\"methodName\":\"internalDoFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.ApplicationFilterChain\",\"fileName\":\"ApplicationFilterChain.java\",\"lineNumber\":166,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.StandardWrapperValve\",\"fileName\":\"StandardWrapperValve.java\",\"lineNumber\":199,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.StandardContextValve\",\"fileName\":\"StandardContextValve.java\",\"lineNumber\":96,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.authenticator.AuthenticatorBase\",\"fileName\":\"AuthenticatorBase.java\",\"lineNumber\":490,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.StandardHostValve\",\"fileName\":\"StandardHostValve.java\",\"lineNumber\":139,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.valves.ErrorReportValve\",\"fileName\":\"ErrorReportValve.java\",\"lineNumber\":92,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.core.StandardEngineValve\",\"fileName\":\"StandardEngineValve.java\",\"lineNumber\":74,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"className\":\"org.apache.catalina.connector.CoyoteAdapter\",\"fileName\":\"CoyoteAdapter.java\",\"lineNumber\":343,\"methodName\":\"service\",\"nativeMethod\":false},{\"className\":\"org.apache.coyote.http11.Http11Processor\",\"fileName\":\"Http11Processor.java\",\"lineNumber\":408,\"methodName\":\"service\",\"nativeMethod\":false},{\"className\":\"org.apache.coyote.AbstractProcessorLight\",\"fileName\":\"AbstractProcessorLight.java\",\"lineNumber\":66,\"methodName\":\"process\",\"nativeMethod\":false},{\"className\":\"org.apache.coyote.AbstractProtocol$ConnectionHandler\",\"fileName\":\"AbstractProtocol.java\",\"lineNumber\":834,\"methodName\":\"process\",\"nativeMethod\":false},{\"className\":\"org.apache.tomcat.util.net.NioEndpoint$SocketProcessor\",\"fileName\":\"NioEndpoint.java\",\"lineNumber\":1417,\"methodName\":\"doRun\",\"nativeMethod\":false},{\"className\":\"org.apache.tomcat.util.net.SocketProcessorBase\",\"fileName\":\"SocketProcessorBase.java\",\"lineNumber\":49,\"methodName\":\"run\",\"nativeMethod\":false},{\"className\":\"java.util.concurrent.ThreadPoolExecutor\",\"fileName\":\"ThreadPoolExecutor.java\",\"lineNumber\":1149,\"methodName\":\"runWorker\",\"nativeMethod\":false},{\"className\":\"java.util.concurrent.ThreadPoolExecutor$Worker\",\"fileName\":\"ThreadPoolExecutor.java\",\"lineNumber\":624,\"methodName\":\"run\",\"nativeMethod\":false},{\"className\":\"org.apache.tomcat.util.threads.TaskThread$WrappingRunnable\",\"fileName\":\"TaskThread.java\",\"lineNumber\":61,\"methodName\":\"run\",\"nativeMethod\":false},{\"className\":\"java.lang.Thread\",\"fileName\":\"Thread.java\",\"lineNumber\":748,\"methodName\":\"run\",\"nativeMethod\":false}]},\"businessCode\":\"login\",\"businessName\":\"登录\",\"methodName\":\"login\",\"className\":\"com.caxs.gpsmonitor.controller.LoginController\",\"businessStatus\":\"false\",\"lineNumber\":61,\"businessContent\":\"用户名或密码错误\"}";
        JSONObject jsonObject1 = JSONObject.parseObject(json, Feature.DisableSpecialKeyDetect);
        System.out.println(jsonObject1);
        MDC.put("json", jsonObject1);
//        JSONObject jsonObject2 = JSONObject.parseObject(String.valueOf(MDC.get("json")));
//        System.out.println(jsonObject2);
        JSONObject jsonObject3 = (JSONObject) MDC.get("json");
        System.out.println(jsonObject3);
    }
}
