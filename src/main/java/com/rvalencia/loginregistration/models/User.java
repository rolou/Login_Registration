package com.rvalencia.loginregistration.models;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotBlank(message="Debes ingresar tu nombre de usuario")
		@Size(min = 5, max = 30, message = "El nombre debe contener entre 5 y 30 caracteres")
		private String nombre;
		
		@Email(message = "Debes ingresar un email válido")
		@NotBlank(message = "Ingresa tu email")
		private String email;
	

		@NotBlank(message = "Ingresa una contraseña")
		@Size(min = 8, max =64 , message = "La contraseña debe contener entre 8 a 20 caracteres")
		private String password;
		
		@Transient
		@NotBlank(message = "Confirma la contraseña por favor")
		private String passwordConfirmation;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
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

		public String getPasswordConfirmation() {
			return passwordConfirmation;
		}

		public void setPasswordConfirmation(String passwordConfirmation) {
			this.passwordConfirmation = passwordConfirmation;
		}
		

		public User() {
			
		}
		
		public User(Long id, String nombre, String email, String password, String passwordConfirmation) {
			this.id = id;
			this.nombre = nombre;
			this.email = email;
			this.password = password;
			this.passwordConfirmation = passwordConfirmation;
		}

		
	}
