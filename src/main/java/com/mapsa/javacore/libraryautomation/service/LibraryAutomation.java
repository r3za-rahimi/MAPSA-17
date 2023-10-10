package com.mapsa.javacore.libraryautomation.service;

import com.mapsa.javacore.libraryautomation.model.Book;
import com.mapsa.javacore.libraryautomation.model.Member;
import com.mapsa.javacore.libraryautomation.service.dao.BookDAO;
import com.mapsa.javacore.libraryautomation.service.dao.MemberDAO;
import com.mapsa.javacore.libraryautomation.service.dao.MemberDetailsDAO;

import java.sql.SQLException;
import java.util.List;

public class LibraryAutomation {
    private static LibraryAutomation libraryAutomation;

    MemberDAO memberDAO = new MemberDAO();
    MemberDetailsDAO memberDetailsDAO = new MemberDetailsDAO();
    BookDAO bookDAO = new BookDAO();


    private LibraryAutomation(){

    }

    public static LibraryAutomation getInstance(){

        if (libraryAutomation == null){
            libraryAutomation = new LibraryAutomation();

        }
        return libraryAutomation;
    }


    public void addMember(Member member) throws SQLException {

        memberDAO.insert(member);

    }

    public void addBook(Book book) throws SQLException {

        bookDAO.insert(book);

    }


    public void borrowBook(Book book) throws Exception {
        bookDAO.borrowBook(book);

    }

    public void returnBook(Book book) throws SQLException {
        bookDAO.returnBook(book);

    }

    public List<Book> getListOfBorrowBookByMemberId(Long memberId) throws SQLException {

        return bookDAO.findListOfBorrowBookByMemberId(memberId);

    }

    public void getAllInfoByPhoneNumber(String phoneNumber) throws SQLException {

        memberDAO.findAllInfoByPhoneNumber(phoneNumber);
    }

    public Member getMemberWhoBorrowBook(String name) throws Exception {

        Book book = bookDAO.findByName(name);

        if (book.getMember() == null){

            throw new Exception("this book is not borrow .....");
        }
        return memberDAO.select(book.getMember());

    }


}
