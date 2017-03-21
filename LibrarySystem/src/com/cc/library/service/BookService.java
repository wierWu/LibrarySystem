package com.cc.library.service;

import java.util.List;

import com.cc.library.domain.BookType;
import com.cc.library.domain.PageBean;

public interface BookService {

	public List<BookType> getAllBookTypes();

	public PageBean<BookType> findBookByPage(int pageCode, int pageSize);

}
