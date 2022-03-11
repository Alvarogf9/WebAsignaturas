package com.nttdata.demoweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.demoweb.repository.AsignaturaRepoJPA;
import com.nttdata.demoweb.repository.entity.Asignaturas;
import com.nttdata.demoweb.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	
	@Autowired
	AsignaturaRepoJPA repoJPA;

	@Override
	public List<Asignaturas> listar() {
		return repoJPA.findAll();
	}

}
