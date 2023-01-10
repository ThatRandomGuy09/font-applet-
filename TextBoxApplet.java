import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TextBoxApplet extends Applet implements ActionListener {
  private TextField textField;
  private Button button;

  public void init() {
    textField = new TextField(20);
    add(textField);

    button = new Button("Display Text");
    button.addActionListener(this);
    add(button);
  }

  public void actionPerformed(ActionEvent e) {
    String text = textField.getText();
    int fontSize = 20;
    int y = 20;

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      drawChar(c, fontSize, 20, y);
      y += fontSize;
      fontSize--;
    }
  }

  private void drawChar(char c, int fontSize, int x, int y) {
    Graphics g = getGraphics();
    g.setFont(new Font("SansSerif", Font.PLAIN, fontSize));
    g.drawString(String.valueOf(c), x, y);
  }
}