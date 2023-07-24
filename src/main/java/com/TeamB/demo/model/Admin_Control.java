package com.TeamB.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Admin_Control{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int Id;
    private  String bookingConfirm;
    private String Extend;

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getBooking(){
        return bookingConfirm;
    }
    public void setBooking(String bookingConfirm){
        this.bookingConfirm = bookingConfirm;
    }
    public String getExtend(){
        return Extend;
    }
    public void setExtend(String Extend){
        this.Extend = Extend;
    }

}
