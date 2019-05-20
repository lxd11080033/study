package com.luoxudong.common.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {

	public boolean notEmpty(Collection<?> coll){
		return coll!=null && !coll.isEmpty();
	    //实现代码
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<?,?> map){
	    //实现代码
		return map!=null && !map.isEmpty();
	}
}
