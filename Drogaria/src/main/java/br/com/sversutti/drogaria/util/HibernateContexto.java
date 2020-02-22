package br.com.sversutti.drogaria.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//diminuir a demora para iniciar o tomcat, deixando o site mais rapido

public class HibernateContexto implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
          HibernateUtil.getFabricaDeSessoes().close();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
           HibernateUtil.getFabricaDeSessoes();
	}

}
