package com.zzk.proxypattern2;
//抽象DocumentDAO：抽象主题角色
public interface AbstractDocumentDAO {
	public Boolean deleteDocumentById(String documentId);
}
