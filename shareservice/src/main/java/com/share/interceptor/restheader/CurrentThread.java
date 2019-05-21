package com.share.interceptor.restheader;

public class CurrentThread {
	
	private static ThreadLocal<RestHeader>  currentThreadHeader = new ThreadLocal<RestHeader>();

	public static RestHeader getRestHeader () {
		return currentThreadHeader.get();
	}
	
	public static String getRequetUrl () {
		RestHeader restheader = currentThreadHeader.get();
		return restheader.getRequestUrl();
	}
	
	public static String getUsername () {
		RestHeader restheader = currentThreadHeader.get();
		return restheader.getUsername();
	}
	
	public static String getClientIp () {
		RestHeader restheader = currentThreadHeader.get();
		return restheader.getClientIp();
	}
	
	public static String getPassword () {
		RestHeader restheader = currentThreadHeader.get();
		return restheader.getPassword();
	}
	
	
}
