class Tamagotchi{
	private int hunger,happiness,discipline,age;
	private String name;
	private boolean dead=false;
	public Tamagotchi(String name){
		this.name=name;
		hunger=50;
		happiness=50;
		discipline=50;
		age=0;
	}
	public void age(){
		hunger+=1;
		if (hunger>=100){
			hunger=100;
		}
		happiness-=1;
		if (happiness<=0){
			happiness=0;
		}
		discipline-=1;
		if (discipline<=0){
			discipline=0;
		}
		if (dead==false){
			age+=1;
			if(hunger>=100 || happiness<=0 || discipline<=0){
				dead=true;
				hunger=100;
				happiness=0;
				discipline=0;
			}
		}
	}
	public void feed(){
		if (dead==false){
			hunger-=10;
			if (hunger<=0){
				hunger=0;
			}
		}
	}
	public void play(){
		if (dead==false){
			happiness+=10;
			if (happiness>=100){
				happiness=100;
			}
		}
	}
	public void scold(){
		if (dead==false){
			discipline+=10;
			if (discipline>=100){
				discipline=100;
			}
		}
	}
	public String toString(){
		return String.format("Your pet %s is %d minutes old.\n Hunger: %d\n Happiness: %d\n Discipline: %d",name,age,hunger,happiness,discipline);
	}
}