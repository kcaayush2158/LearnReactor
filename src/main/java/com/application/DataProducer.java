package com.application;


@FunctionalInterface
public interface DataProducer<T> {
    T produce();
}
