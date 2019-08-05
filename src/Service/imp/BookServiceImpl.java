package Service.imp;

import java.util.ArrayList;
import java.util.List;

import Service.BookService;

import com.caucho.hessian.server.HessianServlet; 

import entity.Book;

public class BookServiceImpl extends HessianServlet implements BookService {

	public List<Book> getList() { 
		
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book();
		
		b1.setName("《《书本1》》");
		b1.setPrice(14);
		
		Book b2 = new Book();
		
		b2.setName("《《书本2》》");
		b2.setPrice(18);
		
		list.add(b1);
		list.add(b2);
				
		return list; 
	} 

}
