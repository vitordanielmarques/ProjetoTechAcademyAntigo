import FakeDB.AlunoFakeDB;
import FakeDB.ColaboradorFakeDB;
import FakeDB.ProfessorEfetivoFakeDB;
import FakeDB.ProfessorFakeDB;

import Dominio.Aluno;
import Dominio.Colaborador;
import Dominio.Professor;
import Dominio.ProfessorEfetivo;

public class App {
    public static void main(String[] args) throws Exception {
        ColaboradorFakeDB colaboradorDB = new ColaboradorFakeDB();
        for (Colaborador item : colaboradorDB.getDados()) {
            item.exibir();
            System.out.println();
        }

        AlunoFakeDB alunoDB = new AlunoFakeDB();
        for (Aluno item : alunoDB.getDados()) {
            item.exibir();
            System.out.println();
        }

        ProfessorFakeDB professorDB = new ProfessorFakeDB();
        for (Professor item : professorDB.getDados()) {
            item.exibir();
            System.out.println();
        }

        ProfessorEfetivoFakeDB professorEfetivoDB = new ProfessorEfetivoFakeDB();
        for (ProfessorEfetivo item : professorEfetivoDB.getDados()) {
            item.exibir();
            System.out.println();
        }
    }
}