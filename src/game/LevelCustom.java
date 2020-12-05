package game;

public class LevelCustom extends Level {
	// this is the custom level
	private static LevelCustom theInstance = new LevelCustom();
	
	public static LevelCustom getInstance() {
		return theInstance;
	}

	private LevelCustom() {
		super(2, 1.0f, 0.04f);
	}

}
