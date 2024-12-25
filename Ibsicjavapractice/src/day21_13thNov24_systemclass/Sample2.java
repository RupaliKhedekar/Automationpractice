package day21_13thNov24_systemclass;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//String userHomeLocation=System.getProperty("user.home");
			//or
		System.out.println("User Home location: "+System.getProperty("user.home"));
		System.out.println("Current working dir: "+System.getProperty("user.dir"));//F:\Workplaces\CoreJava_Workspace\26thSeptCoreJavaSession
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.version"));
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		System.clearProperty("user.home");
		System.out.println("User Home location: "+System.getProperty("user.home"));
		System.setProperty("user.home", "F:\\userhome");
		System.out.println("User Home location: "+System.getProperty("user.home"));
		System.exit(0);//this will terminate the program execution
		System.out.println("Program ends");
	}

}