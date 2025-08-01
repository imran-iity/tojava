import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame {
    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton copyJButton;

    public TextAreaFrame() {
        super("TextArea Demo");
        String demo = "This is a demo string to\nillustrate copying text\nfrom one textarea to \nanother textarea using an\nexternal event\n";

        Box box = Box.createHorizontalBox();
        textArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(textArea1));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                textArea2.setText(textArea1.getSelectedText());
            }
        });
        box.add(copyJButton);

        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));

        add(box);
    }
}