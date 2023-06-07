package com.credibanco.dependency.Library.Http;


import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.credibanco.dependency.Library.Dto.UserDTOResponse;

public class HttpService {
	
	
		public static HttpEntity getHttpEntity(UserDTOResponse userDTO) {
			return new HttpEntity(userDTO, getHttpHeadersJson());
		}
		private static HttpHeaders getHttpHeadersJson() {

			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/json");
			headers.add("Accept", "application/json");

			return headers;
		}

}
