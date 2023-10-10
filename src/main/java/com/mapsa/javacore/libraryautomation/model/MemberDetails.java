package com.mapsa.javacore.libraryautomation.model;

public class MemberDetails {

    private Long id;
    private Long memberId;
    private String phoneNumber;
    private String address;


    public MemberDetails() {
    }

    private MemberDetails(MemberDetailsBuilder memberDetailsBuilder) {
        this.id = memberDetailsBuilder.id;
        this.memberId = memberDetailsBuilder.memberId;
        this.phoneNumber = memberDetailsBuilder.phoneNumber;
        this.address = memberDetailsBuilder.address;
    }

    public long getId() {
        return id;
    }

    public MemberDetails setId(long id) {
        this.id = id;
        return this;
    }

    public Long getMemberId() {
        return memberId;
    }

    public MemberDetails setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public MemberDetails setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public MemberDetails setAddress(String address) {
        this.address = address;
        return this;
    }


    public static class MemberDetailsBuilder{


        private Long id;
        private Long memberId;
        private String phoneNumber;
        private String address;

        public MemberDetailsBuilder(Long id, String phoneNumber) {
            this.id = id;
            this.phoneNumber = phoneNumber;
        }

        public MemberDetailsBuilder setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }

        public MemberDetailsBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public MemberDetails build(){

            return new MemberDetails(this);
        }
    }
}
