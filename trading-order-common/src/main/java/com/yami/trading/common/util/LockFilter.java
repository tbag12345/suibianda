package com.yami.trading.common.util;

import java.util.HashSet;
import java.util.Set;

public class LockFilter {
	
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
