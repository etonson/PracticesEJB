package remote;

import javax.ejb.Remote;

@Remote
public interface LibrarySessionBeanRemote {
	void addBook(String bookName);
}