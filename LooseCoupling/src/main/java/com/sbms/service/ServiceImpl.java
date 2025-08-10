package com.sbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.dao.IEmpDao;
@Service
public class ServiceImpl implements IEmpService {
	@Autowired
	private IEmpDao dao;
	
	@Override
	public void checkLogic() {
		dao.save();
	}

}
