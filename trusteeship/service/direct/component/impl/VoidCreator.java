package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

class VoidCreator {
	 
	static Void  createVoid(){
		Void  result=null;
		try {
			return  result=Void.TYPE.newInstance();
		} catch (InstantiationException e) {
			
		} catch (IllegalAccessException e) {
			
		}
		return result;
	}
	
}
