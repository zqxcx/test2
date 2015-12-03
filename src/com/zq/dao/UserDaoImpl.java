package com.zq.dao;

import org.springframework.stereotype.Repository;

//尼玛，为什么一定要实现Dao，加@Repository注解？？？，不加就错误，我草！！！
@Repository
public class UserDaoImpl implements IUserDao {

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	@Override
	public int insert(User record) {
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		return null;
	}

	@Override
	public User selectByNameAndPassword(String name, String password) {
		return selectByNameAndPassword(name,password);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return 0;
	}

}
