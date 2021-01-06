package com.application;

import java.util.function.Supplier;

public class DivideIntegerSupplier implements Supplier<Integer> {
	  	private Integer integer1;
	    private Integer integer2;

	    public DivideIntegerSupplier(Integer integer1, Integer integer2) {
	        this.integer1 = integer1;
	        this.integer2 = integer2;
	    }

	    @Override
	    public Integer get() {
	        return integer1 / integer2;
	    }
}
