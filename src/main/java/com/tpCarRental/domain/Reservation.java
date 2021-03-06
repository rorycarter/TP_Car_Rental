package com.tpCarRental.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

    @Id
    private String id;
    private String receiveDate;
    private String returnDate;
    private double paymentAmountDue;
    private int rentDays;

    private Reservation()
    {

    }

    //@OneToOne
    //@JoinColumn(name="idOfCar")
    //private Car car


    public String getId() {
        return id;
    }

    public double getPaymentAmountDue() {
        return paymentAmountDue;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getRentDays() {
        return rentDays;
    }

    public Reservation (Builder build)
    {
        this.id=build.id;
        this.returnDate=build.returnDate;
        this.receiveDate=build.receiveDate;
        this.paymentAmountDue=build.paymentAmountDue;
        this.rentDays=build.rentDays;

    }
    public static class Builder
    {

        private String id;
        private String receiveDate;
        private String returnDate;
        private double paymentAmountDue;
        private int rentDays;

        public Builder id(String value)
        {
            this.id=value;
            return this;


        }

        public Builder receiveDate(String value)
        {

            this.receiveDate=value;
            return this;

        }
        public Builder returnDate(String value)
        {

            this.returnDate=value;
            return this;

        }
        public Builder paymentAmountDue(double value)
        {

            this.paymentAmountDue=value;
            return this;

        }
        public Builder rentDays(int value)
        {
            this.rentDays=value;
            return this;

        }
       /* public Builder car(Car value)
        {

            this.car=value;
            return this;

        }*/


       public Reservation build()
       {
           return new Reservation(this);


       }
    }
}
