package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pojo {
	@Id
	private int seat_no;
	private String movie;
	private String date;
	private int ticket;
	private String time;
	private String rated;
	private int price;
	private int GST;
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getGST() {
		return GST;
	}
	public void setGST(int gST) {
		GST = gST;
	}
	@Override
	public String toString() {
		return "Pojo [seat_no=" + seat_no + ", movie=" + movie + ", date=" + date + ", ticket=" + ticket + ", time="
				+ time + ", rated=" + rated + ", price=" + price + ", GST=" + GST + "]";
	}
	

}
