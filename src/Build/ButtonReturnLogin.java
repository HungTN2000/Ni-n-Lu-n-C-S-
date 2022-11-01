package Build;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ButtonReturnLogin extends JButton {

    private boolean hoverText;
    private Color color;
    private Color colorText; //màu chữ
    private Color colorClick; //màu chọn

    public ButtonReturnLogin() {
        //  Init Color

        colorText = new Color(249, 82, 82); //màu chữ
        colorClick = new Color(204, 216, 224); //màu chọn
        setContentAreaFilled(false);
        //  Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setForeground(colorText);
                hoverText = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setForeground(color);
                hoverText = false;
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                    setBackground(color);
            }
        });
    }
}
