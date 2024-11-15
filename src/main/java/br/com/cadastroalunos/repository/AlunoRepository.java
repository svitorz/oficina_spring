/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.cadastroalunos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cadastroalunos.entity.Aluno;

/**
 *
 * @author vitor
 */
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
