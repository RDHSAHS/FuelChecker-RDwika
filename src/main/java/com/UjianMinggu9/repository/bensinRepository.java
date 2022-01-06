package com.UjianMinggu9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UjianMinggu9.model.bensin;

public interface bensinRepository extends JpaRepository <bensin, Long>{
	List<bensin> findByid(Long id);
	List<bensin> findByPerusahaan(String perusahaan);
	List<bensin> findByOktan(int oktan);
	List<bensin> findByNamaAndPerusahaan(String nama, String perusahaan);
	String deleteByNamaAndPerusahaan(String nama, String perusahaan);
}
