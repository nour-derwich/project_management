package com.example.saber.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "printBonProduction")
public class PrintBonProduction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int num;
	
	private String  piece;
	
	private Date  datep;
	
	private String desiglieu;
	
	private String desigunite;
	
	private String lot;
	
	private String article;
	
	private String desig;
	
	private String qte;
	
	private String valide;
	// This will not allow the createdAt column to be updated after creation
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	private PrintBonProduction()
	{
		
	}
	//
	 @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    // GETTER & SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPiece() {
		return piece;
	}
	public void setPiece(String piece) {
		this.piece = piece;
	}
	public Date getDatep() {
		return datep;
	}
	public void setDatep(Date datep) {
		this.datep = datep;
	}
	public String getDesiglieu() {
		return desiglieu;
	}
	public void setDesiglieu(String desiglieu) {
		this.desiglieu = desiglieu;
	}
	public String getDesigunite() {
		return desigunite;
	}
	public void setDesigunite(String desigunite) {
		this.desigunite = desigunite;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getQte() {
		return qte;
	}
	public void setQte(String qte) {
		this.qte = qte;
	}
	public String getValide() {
		return valide;
	}
	public void setValide(String valide) {
		this.valide = valide;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
}
