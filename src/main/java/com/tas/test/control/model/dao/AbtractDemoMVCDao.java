package com.tas.test.control.model.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Data;
@Data
public abstract class AbtractDemoMVCDao<T> implements DemoMVCDao<T> {
	protected JdbcTemplate jdbcTemplatel;
	
}
