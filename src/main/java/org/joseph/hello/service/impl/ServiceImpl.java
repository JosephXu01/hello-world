package org.joseph.hello.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.joseph.hello.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


public class ServiceImpl<M extends JpaRepository<T, Serializable>, T> implements IService<T> {
	
	@Autowired
    protected M baseRepository;

    @Override
    public M getBaseRepository() {
        return baseRepository;
    }
	
	@Override
	public <S extends T> S save(S entity) {
		return baseRepository.save(entity);
	}

	@Override
	public <S extends T> List<S> saveAll(Iterable<S> entities) {
		return baseRepository.saveAll(entities);
	}

	@Override
	public Optional<T> findById(Serializable id) {
		return baseRepository.findById(id);
	}

	@Override
	public boolean existsById(Serializable id) {
		return baseRepository.existsById(id);
	}

	@Override
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	@Override
	public List<T> findAllById(Iterable<Serializable> ids) {
		return baseRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return baseRepository.count();
	}

	@Override
	public void deleteById(Serializable id) {
		baseRepository.deleteById(id);
	}

	@Override
	public void delete(T entity) {
		baseRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends T> entities) {
		baseRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		baseRepository.deleteAll();
	}

	@Override
	public void flush() {
		baseRepository.flush();
	}

	@Override
	public <S extends T> S saveAndFlush(S entity) {
		return baseRepository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<T> entities) {
		baseRepository.deleteInBatch(entities);
	}

	@Override
	public void deleteAllInBatch() {
		baseRepository.deleteAllInBatch();
	}

	@Override
	public T getOne(Serializable id) {
		return baseRepository.getOne(id);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example) {
		return baseRepository.findAll(example);
	}

	@Override
	public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
		return baseRepository.findAll(example, sort);
	}

	@Override
	public List<T> findAll(Sort sort) {
		return baseRepository.findAll(sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return baseRepository.findAll(pageable);
	}

}
