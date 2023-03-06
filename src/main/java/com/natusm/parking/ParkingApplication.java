package com.natusm.parking;

import com.natusm.parking.classes.Estacionamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);



		Estacionamento estacionamento = Estacionamento.getInstancia();
		//Inicializar o estacionamento. Via DB ou via MOCK. neste caso vamos de MOCK.
		estacionamento.inicializar();
		estacionamento.showStatus();
		estacionamento.entraVeiculo();
		estacionamento.showStatus();
		estacionamento.entraVeiculo();
		estacionamento.showStatus();
		estacionamento.saiVeiculo();
		estacionamento.showStatus();
		estacionamento.entraVeiculo();
		estacionamento.showStatus();





	}

}
