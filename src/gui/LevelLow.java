package gui;

public class LevelLow extends Level{

    private static LevelLow theInstance = new LevelLow();
	public static LevelLow getInstance() {return theInstance;}	
	private LevelLow() {
		super(2,5.0f,0.06f);
	}
	
	

}