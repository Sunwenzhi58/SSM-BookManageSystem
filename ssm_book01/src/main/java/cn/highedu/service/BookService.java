package cn.highedu.service;

import cn.highedu.entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 是否保存成功，插入
     * @param book 书籍
     * @return 成功与否
     */
    public boolean save(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);
    /**
     * 根据id去查询
     * @param id
     * @return
     */
    public Book getById(Integer id);
    /**
     * 查询全部
     * @return
     */
    public List<Book> findAll();


    public List<Book> getByName(String name);
}
