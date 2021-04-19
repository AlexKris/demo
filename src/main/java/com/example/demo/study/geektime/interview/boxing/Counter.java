package com.example.demo.study.geektime.interview.boxing;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 线程安全计数器
 *
 * @author chris
 */
public class Counter {

    private final AtomicLong counter = new AtomicLong();

    public void increase() {
        counter.incrementAndGet();
    }
}
