package com.yami.trading.admin.task.future.consumer;

import java.util.HashSet;
import java.util.Set;

public class FuturesRecomLockFilter {
	
	private static final Set<String> filter = new HashSet<String>();

	public static boolean add(String target) {
		if (!filter.add(target)) {
			return false;
		} else {
			return true;
		}
	}

	public static void remove(String target) {
		filter.remove(target);
	}

}
