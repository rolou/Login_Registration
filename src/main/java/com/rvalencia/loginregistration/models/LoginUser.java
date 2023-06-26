package com.rvalencia.loginregistration.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;



public class LoginUser {

	@Email(message = "Debes ingresar un email válido")
	@NotBlank(message = "Ingresa el email, por favor")
	private String email;

	@NotBlank(message = "La contraseña no es correcta")
	private String password;
	
	public LoginUser() {
		
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
