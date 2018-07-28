package br.com.itecbrazil.application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.com.itecbrazil.mapper.ClienteMapper;

@SpringBootApplication
@MapperScan("br.com.itecbrazil.mapper")
@ComponentScan(basePackages="br.com.itecbrazil.controller")
public class Application implements CommandLineRunner {
   
	@Autowired
	private ClienteMapper cm;
	
	public Application(ClienteMapper cm) {
		this.cm = cm;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cm.readClientes());
	}
	
}
