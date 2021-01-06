package com.application;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.SignalType;

public class MySubscriber<T> extends BaseSubscriber<T>{
	
	
	@Override
	protected void hookOnSubscribe(Subscription subscription) {
		System.out.print("MySubsriber Subscribed");
		request(1);
	}
	
	@Override
	protected void hookOnNext(T value) {
		System.out.print("get value"+value);
		request(1);
		
	}
	
	@Override
	protected void hookOnComplete() {
		System.out.println("No error and complete");
	}
	
	@Override
	protected void hookOnError(Throwable throwable) {
		System.out.println("Error "+ throwable.getCause());
		super.hookOnError(throwable);
	}
	
	@Override
	protected void hookOnCancel( ) {
		System.out.println("Subscribed Canceled ");
	}
	
	@Override
	protected void hookFinally(SignalType type) {
		System.out.println("Finally Finished ");
	}

}
