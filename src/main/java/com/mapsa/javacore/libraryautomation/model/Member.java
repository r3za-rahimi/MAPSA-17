package com.mapsa.javacore.libraryautomation.model;

import java.util.List;

public class Member extends  BasicModel{


    private String family;
    private Integer age;

    private MemberDetails memberDetails;
    private List<Book> takenBook;

    public Member() {
    }

    public Member(Long id, String name, String family, Integer age, MemberDetails memberDetails, List<Book> takenBook) {
        super(id, name);
        this.family = family;
        this.age = age;
        this.memberDetails = memberDetails;
        this.takenBook = takenBook;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MemberDetails getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetails memberDetails) {
        this.memberDetails = memberDetails;
    }

    public List<Book> getTakenBook() {
        return takenBook;
    }

    public void setTakenBook(List<Book> takenBook) {
        this.takenBook = takenBook;
    }
}
