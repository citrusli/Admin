package com.zhongruan.controller;

import com.zhongruan.bean.*;
import com.zhongruan.pojo.AddBookResponse;
import com.zhongruan.pojo.GetOrderResponse;
import com.zhongruan.pojo.Marked;
import com.zhongruan.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;

    //书籍上架涉及的

    @RequestMapping("addBook.do")
    @ResponseBody
    public AddBookResponse addBook(String isbn, String title, String author, String pubName, String version, String publishDate, String introduction, String type1, String type2, String pictureUrl,int quantity,double price,String address){
        try {
            AddBookResponse response = new AddBookResponse();
            int pubId = adminService.findPubByName(pubName);
            int type2Id = adminService.findType2ByName(type2);
            int type1Id = adminService.findType1ByName(type1);
            //获取要添加的书籍
            //System.out.println(publishDate);
            Date date = new Date();
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            date = format1.parse(publishDate);
            Book book = new Book(isbn, title, author, pubId, version, date, introduction, type2Id, 0, 0, pictureUrl);
            Stock stock = new Stock(quantity,price,address);
            //System.out.println(book.toString());
            //添加书籍
            response.setBook(book);
            response.setFlag(adminService.addBook(book,stock));


            if (response.getFlag() == 2) {
                response.setDescription("ISBN重复:" + response.getBook().getIsbn());
                return response;
            } else if (response.getFlag() == 3) {
                response.setDescription("该书已存在:" + response.getBook().getTitle());
                return response;
            } else if (response.getFlag() == 5) {
                response.setDescription("该图片路径错误");
                return response;
            } else if (pubId == -1) {
                response.setDescription("该出版社不存在:" + pubName);
                return response;
            } else if (type1Id == -1) {
                response.setDescription("该大类不存在:" + type1);
                return response;
            } else if (type2Id == -1) {
                response.setDescription("该小类不存在:" + type2);
                return response;
            } else if (response.getFlag() == 1) {
                response.setDescription("成功添加图书:" + response.getBook().getTitle());
                return response;
            }
        }catch (Exception e){
            return null;
        }
        return null;
    }

    @RequestMapping("addPublish.do")
    @ResponseBody
    public int addPublish(String pubName, String pubPhone, String add){
        Publish publish = new Publish(pubName,pubPhone,add);
        adminService.addPublish(publish);
        return 1;
    }

    @RequestMapping("addType1.do")
    @ResponseBody
    public int addType1(String type1Name){
        BookType1 type1 = new BookType1(type1Name);
        adminService.addType1(type1);
        return 1;
    }

    @RequestMapping("addType2.do")
    @ResponseBody
    public int addType2(String type2Name,String type1Name){
        int type1Id = adminService.findType1ByName(type1Name);
        BookType2 type2 = new BookType2(type2Name,type1Id);
        adminService.addType2(type2);
        return 1;
    }

    @RequestMapping("findAllPublish.do")
    @ResponseBody
    public List<Publish> findAllPublish(){
        List<Publish> pubList = adminService.findAllPublish();
        return pubList;
    }

    @RequestMapping("findAllType1.do")
    @ResponseBody
    public List<BookType1> findAllType1(){
        List<BookType1> type1List = adminService.findAllType1();
        return type1List;
    }

    @RequestMapping("findType2ByType1.do")
    @ResponseBody
    public List<BookType2> findType2ByType1(String type1Name){
        List<BookType2> type2List = adminService.findType2ByType1(type1Name);
        return type2List;
    }

    //添加减少库存
    @RequestMapping("findStockByTitle.do")
    @ResponseBody
    public Stock findStockByTitle(String title){
        int id = adminService.findBookIdByName(title);
        if(id == -1)
            return null;
        List<Stock> stockList = adminService.findStockById(id);
        if(stockList != null){
            for (Stock stock:
                 stockList) {
                return stock;
            }
        }
        return null;
    }

    @RequestMapping("addStock.do")
    @ResponseBody
    public int addStock(int id,int increment){
        adminService.addStock(id,increment);
        return 1;
    }

    @RequestMapping("delStock.do")
    @ResponseBody
    public int delStock(int id,int increment){
        adminService.delStock(id,increment);
        return 1;
    }

    @RequestMapping("changePrice.do")
    @ResponseBody
    public int changePrice(int id,double price){
        adminService.changePrice(id,price);
        return 1;
    }

    //改变订单状态
    @RequestMapping("getAllOrder.do")
    @ResponseBody
    public List<GetOrderResponse> getAllOrder(){
        return adminService.getAllOrder();
    }

    @RequestMapping("getOrderStatus.do")
    @ResponseBody
    public List<Status> getStatus(){
        return adminService.getAllStatus();
    }

    @RequestMapping("changeOrderStatus.do")
    @ResponseBody
    public int changeOrderStatus(String orderId,String orderStatusName){
        int orderStatusId = adminService.getIdByStatusName(orderStatusName);
        if(orderStatusId == -1)
            return -1;
        adminService.changeOrderStatus(orderId,orderStatusId);
        return 1;
    }
}
