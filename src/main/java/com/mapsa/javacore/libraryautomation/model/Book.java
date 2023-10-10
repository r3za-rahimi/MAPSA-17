package com.mapsa.javacore.libraryautomation.model;

import com.mapsa.javacore.libraryautomation.model.enums.BookType;

public class Book extends BasicModel{

    private String arthur;

    private BookType bookType;

    private  Long member;

    public Book() {
    }


    public Book(Long id, String name, String arthur, BookType bookType, Long memberId) {
        super(id, name);
        this.arthur = arthur;
        this.bookType = bookType;
        this.member = memberId;
    }

    public String getArthur() {
        return arthur;
    }

    public void setArthur(String arthur) {
        this.arthur = arthur;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Book{" +
                "arthur='" + arthur + '\'' +
                ", bookType=" + bookType +
                "} " + super.toString();
    }
}
