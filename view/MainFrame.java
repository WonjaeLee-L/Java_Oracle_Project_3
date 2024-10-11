package view;

import javax.swing.JFrame;

// is a 관점
// 콘솔로 나타내는 것 말고 view를 따로 분리하는 것.
// service단에 있는 화면에 관련된 것만 이곳으로 분리한다. 이를 위해 package를 분리하였다.
// 화면에 관련된 기능이 JFrame. JFrame을 상속받아서 이 프로그램의 view를 만든다.

public class MainFrame extends JFrame {

	public MainFrame() {
		super.setBounds(100, 100, 300, 500);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// super 대신 this 가능

	}
}
