package com.example.demo;

public class LoginEntity {


        private long ID;
        private String email;
        private String password;
		public long getID() {
			return ID;
		}
		public void setID(long iD) {
			ID = iD;
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
		@Override
		public String toString() {
			return "Feedbackentity [ID=" + ID + ", email=" + email + ", password=" + password + "]";
		}
        
        
        
}