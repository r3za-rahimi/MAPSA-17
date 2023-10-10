package com.mapsa.javacore.libraryautomation;

import com.mapsa.javacore.libraryautomation.model.Book;
import com.mapsa.javacore.libraryautomation.model.MemberDetails;
import com.mapsa.javacore.libraryautomation.model.enums.BookType;
import com.mapsa.javacore.libraryautomation.service.LibraryAutomation;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Book javaInAction = new Book(5L , "sd" , "john doe" , BookType.CRIME , null);

        MemberDetails memberDetails1 = new MemberDetails.MemberDetailsBuilder(3L, "254231").setMemberId(50L).setAddress("vanak").build();

//        BookDAO bookDAO = new BookDAO();
//        bookDAO.insert(javaInAction);
//        javaInAction.setMember(1L);
//        bookDAO.borrowBook(javaInAction);
//        bookDAO.returnBook(javaInAction);

//        System.out.println(bookDAO.GetListOfBorrowBookByMemberId(1l));

//        System.out.println(bookDAO.select(2L));

//        Member member = new Member(1L,"fredric" , "gonzales" , 15 , new MemberDetails()
//                .setId(1L)
//                .setMemberId(1L)
//                .setPhoneNumber("09120896739").setAddress("tehran"), List.of(javaInAction));
//
//        MemberDAO memberDAO = new MemberDAO();
//        memberDAO.insert(member);

        LibraryAutomation.getInstance().getAllInfoByPhoneNumber("09120896739");
        System.out.println(LibraryAutomation.getInstance().getMemberWhoBorrowBook("javaInAction"));
        LibraryAutomation.getInstance().borrowBook(javaInAction);

    }
}
