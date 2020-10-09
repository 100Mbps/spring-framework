package com.dgyt.debug.spi;

public class QiYiCDN implements UploadCDN{
	@Override
	public void uploadCDN(String url) {
		System.out.println("qiyi cdn");
	}
}
