package com.springCore.SpringCore.CICollection4;

import java.util.List;
import java.util.Map;

public class Book {
	private List<Integer> id;
	private  List<String> bookName;
	private Map<String,Integer> price;
	
	public Map<String, Integer> getPrice() {
		return price;
	}
	public void setPrice(Map<String, Integer> price) {
		this.price = price;
	}
	public List<Integer> getId() {
		return id;
	}
	public void setId(List<Integer> id) {
		this.id = id;
	}
	public List<String> getBookName() {
		return bookName;
	}
	public void setBookName(List<String> bookName) {
		this.bookName = bookName;
	}
	 @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("----------Book Store----------\n");
	        sb.append("Book ID  |  Book Name  |  Author  |  Price\n");

	        if (id.size() == bookName.size()) {
	            for (int i = 0; i < id.size(); i++) {
	                String book = bookName.get(i);
	                Integer bookId = id.get(i);
	                String author = "Unknown Author";
	                Integer bookPrice = 0;

	                // Find the entry in the price map that matches the book name
	                for (Map.Entry<String, Integer> entry : price.entrySet()) {
	                    if (entry.getKey().startsWith(book)) {
	                    	author = entry.getKey().substring(entry.getKey().indexOf("by"));
	                        bookPrice = entry.getValue();
	                        break;
	                    }
	                }

	                sb.append(bookId).append("  |  ").append(book).append("  |  ")
	                  .append(author).append("  |  ").append(bookPrice).append("\n");
	            }
	        } else {
	            sb.append("Mismatch in the size of ID and book name lists.");
	        }

	        return sb.toString();
	    }
	
	

}
