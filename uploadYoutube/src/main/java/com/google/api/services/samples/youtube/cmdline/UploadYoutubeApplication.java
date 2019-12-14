package com.google.api.services.samples.youtube.cmdline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.services.samples.youtube.cmdline.data.UploadVideo;

@RestController
@SpringBootApplication
public class UploadYoutubeApplication {

	@RequestMapping(value = "/youtubeUpload")
	public String home() {
		
		new UploadVideo().start();
		
		return "Upload Completed";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UploadYoutubeApplication.class, args);
	}

}
