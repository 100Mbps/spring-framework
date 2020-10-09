package com.dgyt.debug.spi;

public class ChinaNetCDN implements UploadCDN{
	@Override
	public void uploadCDN(String url) {
		System.out.println("china net cdn");
	}
}
