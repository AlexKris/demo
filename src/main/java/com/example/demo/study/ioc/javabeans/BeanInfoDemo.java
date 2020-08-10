package com.example.demo.study.ioc.javabeans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.util.stream.Stream;

/**
 * {@link com.example.demo.study.ioc.javabeans.BeanInfoDemo} 示例
 */
public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        /*
        getBeanInfo(beanClass,stopClass)
        stopClass 追溯方法截至的类
         */
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
        Stream.of(beanInfo.getMethodDescriptors()).forEach(methodDescriptor -> System.out.println(methodDescriptor.getName()));
        Stream.of(beanInfo.getMethodDescriptors()).forEach(System.out::println);
        Stream.of(beanInfo.getPropertyDescriptors()).forEach(System.out::println);
    }
}
