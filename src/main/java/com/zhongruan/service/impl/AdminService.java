package com.zhongruan.service.impl;

import com.zhongruan.bean.*;
import com.zhongruan.dao.*;
import com.zhongruan.pojo.GetOrderResponse;
import com.zhongruan.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private IBook iBook;
    @Autowired
    private IPublish iPublish;
    @Autowired
    private IType2 iType2;
    @Autowired
    private IType1 iType1;
    @Autowired
    private IStock iStock;
    @Autowired
    private IStatus iStatus;
    @Autowired
    private IShopOrder iShopOrder;
    @Autowired
    private IUser iUser;

    @Override
    public int addBook(Book book,Stock stock) {
        //1:成功添加  2：isbn重复  3：title重复  4：url错误
        List<Book> findIsbn = iBook.findBookByIsbn(book.getIsbn());
        List<Book> findTitle = iBook.findBookByTitle(book.getTitle());
        if(findIsbn.size() != 0){
            System.out.println(findIsbn.toString());
            return 2;
        }
        else if(findTitle.size() != 0){
            return 3;
        }
        else{
            iBook.addBook(book);
            List<Book> books = iBook.findBookByIsbn(book.getIsbn());
            if(books.size() > 0){
                for(Book tem : books){
                    stock.setBookId(tem.getId());
                }
            }
            iStock.addStock(stock);
            return 1;
        }
    }

    @Override
    public int addType1(BookType1 type1) {
        iType1.addType1(type1);
        return 0;
    }

    @Override
    public int addType2(BookType2 type2) {
        iType2.addType2(type2);
        return 0;
    }

    @Override
    public int findPubByName(String pubName) {
        List<Publish> byName = iPublish.findByName(pubName);
        for (Publish pub :
          byName   ) {
            return pub.getId();
        }
        return -1;
    }

    @Override
    public int findType2ByName(String type2Name) {
        List<BookType2> byName = iType2.findType2ByName(type2Name);
        for (BookType2 type2 :
                byName   ) {
            return type2.getId();
        }
        return -1;
    }

    @Override
    public int findType1ByName(String type1Name) {
        List<BookType1> byName = iType1.findType1ByName(type1Name);
        for (BookType1 type1 :
                byName   ) {
            return type1.getId();
        }
        return -1;
    }

    @Override
    public int addPublish(Publish publish) {
        iPublish.addPublish(publish);
        return 0;
    }

    @Override
    public List<Publish> findAllPublish() {
        return iPublish.findAllPublish();
    }

    @Override
    public List<BookType1> findAllType1() {
        return iType1.findAllType1();
    }

    @Override
    public List<BookType2> findType2ByType1(String type1Name) {
        List<BookType1> byName = iType1.findType1ByName(type1Name);
        if(byName == null)
            return null;
        int type1Id = 0;
        for (BookType1 type1 :
                byName   ) {
            type1Id = type1.getId();
            break;
        }
        //System.out.println(type1Id);
        List<BookType2> type2ByType1 = iType2.findType2ByType1(type1Id);
        return type2ByType1;
    }

    @Override
    public int findBookIdByName(String title) {
        List<Book> books = iBook.findBookByTitle(title);
        if(books != null){
            for (Book book :
                    books   ) {
                return book.getId();
            }
        }
        return -1;
    }

    @Override
    public int addStock(int id, int num) {
        List<Stock> stocks = findStockById(id);
        for(Stock s : stocks){
            num = num + s.getQuantity();
            break;
        }
        iStock.changeStock(id,num);
        return 0;
    }

    @Override
    public int delStock(int id, int num) {
        List<Stock> stocks = findStockById(id);
        for(Stock s : stocks){
            num = num - s.getQuantity();
            break;
        }
        iStock.changeStock(id,num);
        return 0;
    }

    @Override
    public List<Stock> findStockById(int id) {
        return iStock.findStockById(id);
    }

    @Override
    public void changePrice(int id, double price) {
        iStock.changePrice(id,price);
    }

    @Override
    public List<Status> getAllStatus() {
        return iStatus.getAllStatus();
    }

    @Override
    public int getIdByStatusName(String name) {
        List<Status> statuses = iStatus.getIdByStatusName(name);
        for (Status s:
             statuses) {
            return s.getId();
        }
        return -1;
    }

    @Override
    public int changeOrderStatus(String id, int status) {
        iShopOrder.changeOrderStatus(id,status);
        return 0;
    }



    @Override
    public List<GetOrderResponse> getAllOrder() {
        List<GetOrderResponse> list = new ArrayList<GetOrderResponse>();
        List<ShopOrder> orderList = iShopOrder.findAllOrder();
        GetOrderResponse response;
        for (ShopOrder order : orderList){
            response = new GetOrderResponse(order);
            //书名
            response.setBookName(findBookNameById(order.getBookId()));
            //订单价格
            double price = order.getQuantity()*findPriceByBookId(order.getBookId());
            response.setPrice(price);
            //状态名
            response.setStatusName(findStatusNameById(order.getOrderStstus()));
            //用户名
            response.setUserName(findUserNameById(order.getUserId()));
            list.add(response);
        }
        return list;
    }

    @Override
    public String findBookNameById(int id) {
        List<Book> books = iBook.findBookById(id);
        for(Book book : books){
            return book.getTitle();
        }
        return null;
    }

    @Override
    public double findPriceByBookId(int id) {
        List<Stock> stocks = iStock.findStockById(id);
        for(Stock stock : stocks){
            return stock.getPrice();
        }
        return 0;
    }

    @Override
    public String findStatusNameById(int id) {
        List<Status> list = iStatus.getStatusById(id);
        for(Status status : list){
            return status.getStatusName();
        }
        return null;
    }

    @Override
    public String findUserNameById(int id) {
        List<User> users = iUser.findUserById(id);
        for(User user : users){
            return user.getUserName();
        }
        return null;
    }

}
