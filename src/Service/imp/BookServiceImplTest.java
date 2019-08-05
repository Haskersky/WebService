package Service.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import entity.Book;

public class BookServiceImplTest {

	@Test
	public void testGetList() {
		BookServiceImpl bb = new BookServiceImpl();
		List<Book> bk = bb.getList();
		for(Book i : bk){
			System.out.println(i.getName()+"价格:"+i.getPrice());
		}
	}

}
