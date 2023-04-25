package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Pojo;
import com.example.demo.Service.Serve;

@RestController
@RequestMapping("/movie")
public class Control {
	@Autowired
	Serve movie_service;
	@PostMapping(" ")
	public String create(@RequestBody Pojo movie_pojo)
	{
		return movie_service.addmovie(movie_pojo);
	}
	@GetMapping(" ")
	public List<Pojo> read()
	{
		return movie_service.getmovie();
	}
	@GetMapping("/{seat_no}")
	public Optional<Pojo> readById(@PathVariable int seat_no)
	{
		return movie_service.getmovieById(seat_no);
	}
	@PutMapping("/update")
	public String update(@RequestBody Pojo movie_pojo) 
	{
		return movie_service.updatemovie(movie_pojo);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam ("s_num") int seat_no)
	{
		return movie_service.deleteByRequestParamId(seat_no);
	}
}

