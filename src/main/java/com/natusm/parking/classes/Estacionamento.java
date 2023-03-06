package com.natusm.parking.classes;


/**
 * Este elemento deve ser um Singleton, pois, no nosso sistema, gerenciamos apenas 1 estacionamento;
 * numero total de vagas pode ser pego via DB, mas neste caso estamos setando como 20;
 * Os Getters & Setters serão substituidos gradualmente pela lógica do sistema
 */

public class Estacionamento {
    private int numeroTotalVagas;
    private int numeroVagasOcupadas;
    private int numeroVagasDisponiveis;
    private boolean haVagas;
    private static Estacionamento instancia;

    private Estacionamento(){
        super();

    }
    public static Estacionamento getInstancia(){
        if(instancia == null)
            instancia = new Estacionamento();
        return instancia;
    }

    public int getNumeroVagasDisponiveis() {
        return numeroVagasDisponiveis;
    }

    public void showStatus(){
        System.out.println("TOTAL DE VAGAS: " + this.numeroTotalVagas);
        System.out.println("VAGAS DISPONIVEIS: " + this.numeroVagasDisponiveis);
        System.out.println("VAGAS OCUPADAS: " + this.numeroVagasOcupadas);
        System.out.println("Há vagas disponiveis? -> " + this.haVagas);
    }

    public void inicializar(){
        this.numeroTotalVagas = 20; //TODO: Substituir estes MOCK por um acesso ao DB
        this.numeroVagasOcupadas = 0;
        this.numeroVagasDisponiveis = 20;
        this.temVagaDisponivel();
    }

    public void entraVeiculo(){

        if(!this.haVagas){
            System.out.println("ESTACIONAMENTO LOTADO ----- DISPENSAR VEICULO");
        }
        else {
            System.out.println("ENTRAR VEICULO");
            this.numeroVagasOcupadas += 1;
            this.numeroVagasDisponiveis = this.numeroTotalVagas - this.numeroVagasOcupadas;
            this.temVagaDisponivel();
        }

    }

    public void saiVeiculo() {
        if(this.numeroVagasOcupadas > 0) {
            System.out.println("VEICULO SAINDO.....");
            this.numeroVagasOcupadas -= 1;
            this.numeroVagasDisponiveis = this.numeroTotalVagas - this.numeroVagasOcupadas;
            this.temVagaDisponivel();
        }
        else
            System.out.println("Não é possível remover veículo... Estacionamento já está vazio");
    }

    public void temVagaDisponivel(){
        this.haVagas = this.numeroVagasOcupadas < this.numeroTotalVagas;
    }


}
