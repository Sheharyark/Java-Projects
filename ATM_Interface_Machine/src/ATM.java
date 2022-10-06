import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OptionMenu optionMenu = new OptionMenu();
        introduction();
        optionMenu.mainMenu();

	}
	public static void introduction(){
        System.out.println("WELCOME TO THE ATM PROJECT! ");
    }

}
