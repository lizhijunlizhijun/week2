package com.lizhijun.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lizhijun.bean.Meet;
import com.lizhijun.bean.Type;
import com.lizhijun.mapper.MeetMapper;

@Service
public class MeetServiceImpl implements MeetService {

	@Resource
	private MeetMapper meetMapper;
	
	public List<Meet> queryMeet(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return meetMapper.queryMeet(map);
	}

	public void addMeet(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.addMeet(meet);
	}

	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return meetMapper.queryType();
	}

	public void updateMeet(Meet meet) {
		// TODO Auto-generated method stub
		meetMapper.updateMeet(meet);
	}

	public Meet huiMeet(Integer mid) {
		// TODO Auto-generated method stub
		return meetMapper.huiMeet(mid);
	}

	

	

}
