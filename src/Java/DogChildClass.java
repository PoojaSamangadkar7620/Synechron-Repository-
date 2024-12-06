package Java;


class DogChildClass extends AnimalClass {
   String color = "black";
   void printcolor() {
	  System.out.println(color);     //prints color of DogChildClass
	  System.out.println(super.color);    //prints color of AnimalClass
	
}
	
}
