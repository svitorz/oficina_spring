/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.cadastroalunos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vitor
 */
@Table
@Entity
@Data //gerador de getters e setters 
@AllArgsConstructor // gerar construtor com todos os argumentos
@NoArgsConstructor // gerar construtor com nenhum argumento
 public class Aluno {

    @Id // chave primária
    @GeneratedValue(strategy=GenerationType.AUTO)  // tipo de chave primária
    Long matricula;

    @Column(
        unique = true,
        nullable= false
    )
    String cpfAluno;

    String nomeAluno, telefoneAluno, emailAluno, dataNasc;
}
