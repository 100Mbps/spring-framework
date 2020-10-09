package com.dgyt.debug.spi;

import java.util.ServiceLoader;

public class MainSPI {
	public static void main(String[] args) {
		ServiceLoader<UploadCDN> cnds = ServiceLoader.load(UploadCDN.class);
		for(UploadCDN cds:cnds){
			cds.uploadCDN("filePath");
		}
	}
}
