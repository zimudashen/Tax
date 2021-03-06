package core.dao;

import java.io.Serializable;
import java.util.List;

import core.page.PageResult;
import core.util.QueryHelper;

public interface BaseDao<T> {
	public void save(T t);
	public void update(T t);
	public void delete(Serializable id);
	public T findById(Serializable id);
	public List<T> getAll();
	public List<T> getObjects(String hql, List<Object> paramters);
	public List<T> getObjects(QueryHelper queryHelper);
	public PageResult getObjects(QueryHelper queryHelper, int pageSize,
			int currentPage);
}
