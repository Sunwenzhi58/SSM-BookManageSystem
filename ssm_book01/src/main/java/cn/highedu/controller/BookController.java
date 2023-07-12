package cn.highedu.controller;

import cn.highedu.entity.Book;
import cn.highedu.service.BookService;
import cn.highedu.util.Code;
import cn.highedu.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping
    public ResultUtil save(@RequestBody Book book){
        System.out.println(book);
        boolean flag = bookService.save(book);
        return new ResultUtil(flag ? Code.SAVE_OK:Code.SAVE_ERROR,flag);
    }
    @GetMapping("/{id}")
    public ResultUtil getById(@PathVariable Integer id){
        Book book = bookService.getById(id);
        Integer code = book !=null ? Code.GET_OK:Code.GET_ERROR;
        String message = book !=null ? "":"数据查询失败";
        return new ResultUtil(code,book,message);
    }
    @GetMapping
    public ResultUtil findAll(){
//        int x = 1 / 0;
        List<Book> bookList = bookService.findAll();
        Integer code = bookList !=null ? Code.GET_OK : Code.GET_ERROR;
        String message = bookList !=null ? "":"数据查询失败";
        return new ResultUtil(code,bookList,message);
    }
    @PutMapping
    public ResultUtil update(@RequestBody Book book){
        boolean flag = bookService.update(book);
        return new ResultUtil(flag ? Code.UPDATE_OK:Code.UPDATE_ERROR,flag);
    }
    @DeleteMapping("/{id}")
    public ResultUtil delete(@PathVariable Integer id){
        boolean flag = bookService.delete(id);
        return new ResultUtil(flag ? Code.DELETE_OK:Code.DELETE_ERROR,flag);
    }


}
