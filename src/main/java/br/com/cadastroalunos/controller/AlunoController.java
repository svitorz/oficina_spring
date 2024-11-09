package br.com.cadastroalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cadastroalunos.entity.Aluno;
import br.com.cadastroalunos.service.AlunoService;




@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping("/")
    public List<Aluno> getAll() {
        return alunoService.getAll(); 
    }
    
    @PostMapping("/")
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoService.createAluno(aluno);
    }
    @DeleteMapping
    public ResponseEntity<?> deleteAluno(@PathVariable Long matricula){
        var aluno = alunoService.findById(matricula);

        if(aluno.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("O aluno não foi encontrado.");
        }
        alunoService.deleteAluno(aluno.get());
        return ResponseEntity.status(HttpStatus.OK).body("Aluno excluído com sucesso!");
    }
}