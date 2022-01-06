package com.UjianMinggu9.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UjianMinggu9.model.bensin;
import com.UjianMinggu9.repository.bensinRepository;

@RestController
@RequestMapping("/bensin")
public class bensinController {

	@Autowired
	bensinRepository bensinRepo;
	
	@PostMapping("/insert")
	public String postData(@RequestBody bensin bensin) {
		bensinRepo.save(bensin);
		return "Produk bensin berhasil ditambahkan";
	}
	@GetMapping("/index")
	public List<bensin> getAllData()	{
		return bensinRepo.findAll();
	}
	@GetMapping("/getById/{id}")
    public List<bensin> getAllDataById(@PathVariable(value="id") Long id) {
		return bensinRepo.findByid(id);
     }
	@GetMapping("/getByPerusahaan/{perusahaan}")
    public List<bensin> getAllDataByPerusahaan(@PathVariable(value="perusahaan") String perusahaan) {
		return bensinRepo.findByPerusahaan(perusahaan);
     }
	@GetMapping("/getByOktan/{oktan}")
    public List<bensin> getAllDataByOktan(@PathVariable(value="oktan") int oktan) {
		return bensinRepo.findByOktan(oktan);
     }
	@GetMapping("/getByNama-Perusahaan")
    public List<bensin> getAllDataByNamaPerusahaan(@RequestParam(value = "nama") String nama, @RequestParam(value = "perusahaan") String perusahaan) {
		return bensinRepo.findByNamaAndPerusahaan(nama,perusahaan);
     }
	@PostMapping("/update")
	public String updateId(@RequestBody bensin bensin) 	{
		bensinRepo.save(bensin);
		return "Data bensin berhasil diubah";
	}
	@Transactional
	@DeleteMapping("/deleteByNama-Perusahaan")
	  public String deleteByNamaAndPerusahaan(@RequestParam(value = "nama") String nama, @RequestParam(value = "perusahaan") String perusahaan)	{
		bensinRepo.deleteByNamaAndPerusahaan(nama,perusahaan);
		return "Produk bensin "+perusahaan+""+nama+" berhasil dihapus";
	}
}