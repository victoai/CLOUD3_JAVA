package day17;

class Settings{
	
	
	private Settings() {}
	private static class SettingsHolder{		
		private final static Settings INSTANCE = new Settings();
	}
	
	
	public static Settings getInstance() {
		return  SettingsHolder.INSTANCE;
	}
}


public class SettingMain {

	public static void main(String[] args) {


		Settings  s  = Settings.getInstance();
		Settings s2 = Settings.getInstance();
		
		
		if( s== s2) {
		   System.out.println( true);
		}
		
		

	}

}
