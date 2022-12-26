package ejb;

import javax.ejb.Stateless;

import remote.LibrarySessionBeanRemote;

@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote {

	@Override
	public void addBook(String bookName) {
		System.out.println(bookName);
		
	}

}