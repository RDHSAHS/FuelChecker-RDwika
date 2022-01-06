package com.UjianMinggu9.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bensin")

public class bensin /*(long id, String nama, String perusahaan, int oktan, int harga)*/{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String nama;
	String perusahaan;
	int oktan;
	int harga;
}
/*
 	public long getID()	{
	return id;
	}
	public String getNama()	{
	return nama;
	}
	public String getPerusahaan()	{
	return perusahaan;
	}
	public int getOktan()	{
	return oktan;
	}
	public int getHarga()	{
	return harga;
	}
	
	public void setId(long nomor)	{
	this.id = nomor;
	}
	public void setNama(String name)	{
	this.nama = name;
	}
	public void setPerusahaan(String perus)	{
	this.perusahaan = perus;
	}
	public void setOktan(int nooktan)	{
	this.oktan = nooktan;
	}
	public void setHarga(int rego)	{
	this.harga = rego;
	}
*/

