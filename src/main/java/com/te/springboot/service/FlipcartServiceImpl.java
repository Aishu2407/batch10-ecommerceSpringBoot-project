package com.te.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springboot.bean.Admin;
import com.te.springboot.bean.Item;
import com.te.springboot.dao.FlipcartDaoImpl;

@Service
public class FlipcartServiceImpl implements FlipcartService{

	@Autowired
	FlipcartDaoImpl amazonDao;
	
	@Override
	public Admin authenticate(Integer id, String password) {
		
		Admin admin = amazonDao.authenticate(id, password);
		return admin;
	}

	@Override
	public boolean addItem(Item item) {
		boolean result = amazonDao.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = amazonDao.removeItem(id);
		return result;
	}

	@Override
	public Item searchItem(Integer id) {
		Item item = amazonDao.searchItem(id);
		return item;
	}

	@Override
	public List<Item> getAllItems() {
		List<Item> list = amazonDao.getAllItems();
		return list;
	}

	@Override
	public boolean updateItem(Item item) {
		boolean result = amazonDao.updateItem(item);
		return result;
	}

}