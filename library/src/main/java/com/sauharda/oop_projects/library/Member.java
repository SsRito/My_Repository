package com.sauharda.oop_projects.library;

import java.time.LocalDate;

public class Member {
    private String memberName;
    private int memberID, totalBorrowedBooks;
    private LocalDate borrowingDate;

    public Member() {
    }

    public Member(String memberName, int memberID) {
        this.memberName = memberName;
        this.memberID = memberID;
    }

    public Member(String memberName, String title, int memberID, int totalBorrowedBooks, LocalDate borrowingDate) {
        this.memberName = memberName;
        this.memberID = memberID;
        this.totalBorrowedBooks = totalBorrowedBooks;
        this.borrowingDate = borrowingDate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getTotalBorrowedBooks() {
        return totalBorrowedBooks;
    }

    public void setTotalBorrowedBooks(int totalBorrowedBooks) {
        this.totalBorrowedBooks = totalBorrowedBooks;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberID=" + memberID +
                ", totalBorrowedBooks=" + totalBorrowedBooks +
                ", borrowingDate=" + borrowingDate +
                '}';
    }
}
