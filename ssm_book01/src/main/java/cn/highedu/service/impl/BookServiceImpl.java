package cn.highedu.service.impl;

import cn.highedu.dao.BookDao;
import cn.highedu.entity.Book;
import cn.highedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;

    }

    @Override
    public boolean update(Book book) {

        return  bookDao.update(book) >0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public List<Book> getByName(String name) {
        return bookDao.getByName(name);
    }
}
