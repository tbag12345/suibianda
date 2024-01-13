package com.yami.trading.common.util;

import java.util.HashSet;
import java.util.Set;

public class C2cAdvertLock {
	
	private static final Set<String> filter = new HashSet<String>();

	public static boolean add(String order_no) {
		if (!filter.add(order_no)) {
			return false;
		} else {
			return true;
		}
	}

	public static void remove(String order_no) {
		filter.remove(order_no);
	}

}
