package com.skyding.learn.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * created at 2018/11/8
 *
 * @author weichunhe
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        System.out.println(((ClassPathXmlApplicationContext) context).getBeanFactoryPostProcessors());
        System.out.println(((ClassPathXmlApplicationContext) context).getBeanFactory().getBeanPostProcessorCount());
    }
}
