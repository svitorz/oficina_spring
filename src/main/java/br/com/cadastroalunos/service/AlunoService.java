/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.cadastroalunos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastroalunos.entity.Aluno;
import br.com.cadastroalunos.repository.AlunoRepository;

/**
 *
 * @author vitor
 */
@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> getAll(){
        return alunoRepository.findAll();
    }

    public Aluno createAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    } 

    public Optional<Aluno> findById(Long matricula){
        return alunoRepository.findById(matricula);
    }

    public void deleteAluno(Aluno aluno){
        alunoRepository.delete(aluno);
    }
}
