package FakeDB;

import java.util.ArrayList;

import Dominio.Aluno;

public class AlunoFakeDB {
    private ArrayList<Aluno> dados;

    public ArrayList<Aluno> getDados(){
        return this.dados;
    }

    private void autoPreencher(){
        this.dados.add(new Aluno(201, "Ana Souza", "2231", "20260001"));
        this.dados.add(new Aluno(202, "Bruno Lima", "2232", "20260002"));
        this.dados.add(new Aluno(203, "Carla Dias", "2233", "20260003"));
        this.dados.add(new Aluno(204, "Diego Ramos", "2234", "20260004"));
        this.dados.add(new Aluno(205, "Elisa Mota", "2235", "20260005"));
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}
