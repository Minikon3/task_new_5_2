import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
    int win_width = 500;
    int win_height = 500;
    String background_image_path;
    int method;

    Main() {
        super("Фигуры");
        setSize(win_width, win_height);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setBackground(Color.gray);
    }


    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, win_width, win_height, this);
        random_shapes_paint(20, g);

    }

    void random_shapes_paint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {

// Oval
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

// Rect
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

// Line
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * win_height)
                    );
                    break;

// Arc
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                    break;

// Rounded rect
                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                    break;

// Circle
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * win_width),
                            (int) (Math.random() * win_height),
                            100,
                            100
                    );
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}