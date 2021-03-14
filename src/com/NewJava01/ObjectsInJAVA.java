package com.NewJava01;

public class ObjectsInJAVA {

	

		public static void main(String[] args) {
			
			MobilePhone iPhone= new MobilePhone();
			iPhone.model="IPhone 12";
			iPhone.price=1200;
			iPhone.size=6.4;
			iPhone.make="Apple";
			iPhone.color="Black";
			
			MobilePhone SumsungS21  = new MobilePhone();
			
			
			iPhone.model="S 21";
			iPhone.price=800;
			iPhone.size=6.8;
			iPhone.make="Sumsang";
			iPhone.color="Black";
			
			DogClass dogHusky = new DogClass();
			
			dogHusky.breed="Husky";
			dogHusky.size="large";
			dogHusky.color="light gray";
			dogHusky.behavior="Smart";
			dogHusky.age=3;		
			
			DogClass dogBulldog = new DogClass();
			
			dogBulldog.breed="Bulldog";
			dogBulldog.size="large";
			dogBulldog.color="gray and white";
			dogBulldog.behavior="Aggressive";
			dogBulldog.age=5;		
			dogBulldog.age();
			dogBulldog.size();
			dogBulldog.look();
			
			
			DogClass dogLabrador   = new DogClass();
			
			dogLabrador.breed="Labrador";
			dogLabrador.size="large";
			dogLabrador.color="Black";
			dogLabrador.behavior="quiet and sedate";
			dogLabrador.age=6;		
			dogLabrador.bark();
			dogLabrador.age();
			dogLabrador.size();
			dogLabrador.look();
		}
	
}
