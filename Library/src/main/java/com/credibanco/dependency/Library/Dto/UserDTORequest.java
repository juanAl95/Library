package com.credibanco.dependency.Library.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTORequest {
	
	 @JsonProperty("id")
	    private Long id;

	    @JsonProperty("username")
	    private String userName;

	    @JsonProperty("password")
	    private String password;
	    
	    @JsonProperty("cardnumber")
	    private String cardNumber;
	    
	    

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public void setPassword(String password) {
	        this.password = password;
	    }

	    

}
