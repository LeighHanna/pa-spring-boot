package uk.ac.belfastmet.top10list.domain;

public class Animal {
	//instance variables
		private String name;
		private String type;
		private String speed;
		private String image;
		
		//constructors
		public Animal() {
			super();
		}
		
		public Animal(String name, String type, String speed, String image) {
			super();
			this.name = name;
			this.type = type;
			this.speed = speed;
			this.image = image;
		}

		//getters and setters
		public String getName() {
			return name;
		}

		public String getSpeed() {
			return speed;
		}

		public void setSpeed(String speed) {
			this.speed = speed;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}
		
		
		
		

}
