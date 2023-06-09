package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Pojo;
import com.example.demo.Repository.Repo;

@Service
public class Serve {
	@Autowired
	Repo movie_repo;
	public String addmovie(Pojo movie_model)
	{
		movie_repo.save(movie_model);
		return "Added!";
	}
	public List<Pojo> getmovie()
	{
		return movie_repo.findAll();
	}
	public Optional<Pojo> getmovieById(int id)
	{
		return movie_repo.findById(id);
	}
	public String updatemovie(Pojo movie_model)
	{
		movie_repo.save(movie_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int id)
	{
		movie_repo.deleteById(id);
		return "Deleted";
	}
}

