package com.zzk.behavior.Iterator;

import java.util.List;
//商品数据类：具体聚合类
public class ProductList extends AbstractObjectList {

	public ProductList(List objects) {
		super(objects);
	}

	//实现创建迭代器对象的具体工厂方法
	public AbstractIterator createIterator() {
		return new ProductIterator(this);
	}

}
