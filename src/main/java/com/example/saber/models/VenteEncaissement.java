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
@Table(name = "venteEncaissement")
public class VenteEncaissement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private int annee;
	@NotNull
	private int nums;
	@NotNull
	private String caisse;
	@NotNull
	private int nump;
	@NotNull
	private String montant;
	@NotNull
	private String modalite;
	@NotNull
	private String piece;
	@NotNull
	private Date echeance;
	@NotNull
	private String etat;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    private VenteEncaissement()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public String getCaisse() {
		return caisse;
	}
	public void setCaisse(String caisse) {
		this.caisse = caisse;
	}
	public int getNump() {
		return nump;
	}
	public void setNump(int nump) {
		this.nump = nump;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	public String getModalite() {
		return modalite;
	}
	public void setModalite(String modalite) {
		this.modalite = modalite;
	}
	public String getPiece() {
		return piece;
	}
	public void setPiece(String piece) {
		this.piece = piece;
	}
	public Date getEcheance() {
		return echeance;
	}
	public void setEcheance(Date echeance) {
		this.echeance = echeance;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
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
