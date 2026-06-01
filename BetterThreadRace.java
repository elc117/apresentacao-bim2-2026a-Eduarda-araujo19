class AnimalRunner implements Runnable{
    protected String name;
	protected String velocity;

    public AnimalRunner(String name,String velocity){
        this.name = name;
		this.velocity = velocity;
    }

    protected void runLike(){
        System.out.println(name + " is running " + velocity);
    }
	
	public void run() {
		for (int pos = 4; pos > 0; pos--) {
			runLike();
			System.out.println(name + " is at position " + pos);
		}
	}
    
}

class Rabbit extends AnimalRunner {

	public Rabbit(String name,String velocity){
		super(name,velocity);
	}
	
	@Override
	public void run() {
		System.out.println(name + " rabbit is at the start of the race!");
		super.run();
		System.out.println(name + " rabbit finished the race!");
	}

}

class Turtle extends AnimalRunner {

	public Turtle(String name,String velocity){
		super(name,velocity);
	}
	
	@Override
	public void run() {
		System.out.println(name + " turtle is at the start of the race!");
		super.run();
		System.out.println(name + " turtle finished the race!");
	}

}

class Penguin extends AnimalRunner {

	public Penguin(String name,String velocity){
		super(name,velocity);
	}
	
	@Override
	public void run() {
		System.out.println(name + " penguin is at the start of the race!");
		super.run();
		System.out.println(name + " penguin finished the race!");
	}

}

class BetterThreadRace {
	public static void main(String[] args) {

		Thread r = new Thread(new Rabbit("Snowball","fast"));
		Thread t = new Thread(new Turtle("Donatello","slow"));
		Thread p = new Thread(new Penguin("Blue","fast"));

		r.start();
		t.start();
		p.start();
	}
}
