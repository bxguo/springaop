package com.aop.service;

/**
 * 通用CURD接口
 */
public interface CurdService<T> {
	
	/**
	 * 保存操作
	 * @param record
	 * @return
	 */
	int save(T record);
}