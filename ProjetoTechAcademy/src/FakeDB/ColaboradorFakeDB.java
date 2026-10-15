package FakeDB;

import java.util.ArrayList;

import Dominio.Colaborador;

public class ColaboradorFakeDB {
    private ArrayList<Colaborador> dados;

    public ArrayList<Colaborador> getDados(){
        return this.dados;
    }

    public ColaboradorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    private void autoPreencher(){
        this.dados.add(new Colaborador(101, "Mathues Souza", "3291789", "Estagiario"));
        this.dados.add(new Colaborador(102, "Joâo Silva", "3291780", "Bibliotecario")); 
        this.dados.add(new Colaborador(103, "Pedro Moreira", "3291781", "Faxineiro ")); 
        this.dados.add(new Colaborador(104, "Tiago Guimarães", "3291782", "Segurança")); 
        this.dados.add(new Colaborador(105, "Pedro Donato", "3291783", "Professor")); 
    }

}
