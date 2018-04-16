package com.db.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class DbTaskApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DbTaskApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DbTaskApplication.class);
	}

	@Scheduled(fixedRate = 2000)
	public void printTime() {
		System.out.println(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
	}

}
