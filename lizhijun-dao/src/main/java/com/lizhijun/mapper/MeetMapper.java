package com.lizhijun.mapper;

import java.util.List;
import java.util.Map;

import com.lizhijun.bean.Meet;
import com.lizhijun.bean.Type;

public interface MeetMapper {

	public List<Meet> queryMeet(Map<String,Object>map);
	
	public List<Type> queryType(); 
	
	public void addMeet(Meet meet);
	
	public void updateMeet(Meet meet);
	
	public Meet huiMeet(Integer mid);
}
