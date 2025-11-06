import javax.swing.*;
import java.awt.*;

public class SmileFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Плавно рисуване
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Фон
        setBackground(Color.white);

        // Лице (жълт кръг)
        g2.setColor(Color.YELLOW);
        g2.fillOval(100, 100, 300, 300); // x, y, width, height

        // Очите
        g2.setColor(Color.BLACK);
        g2.fillOval(175, 180, 30, 30); // Ляво око
        g2.fillOval(295, 180, 30, 30); // Дясно око

        // Усмивка (дъга)
        g2.setStroke(new BasicStroke(5));
        g2.drawArc(175, 220, 150, 100, 0, -180); // x, y, w, h, startAngle, arcAngle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Усмивка 😊");
        SmileFace panel = new SmileFace();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

    

