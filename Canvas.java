import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Canvas extends JFrame implements KeyListener {


    private final mon mon1  = new mon();

    int x = 50;
    int y = 50;
    int q = 200;
    int e = 50;
    Canvas(){
        setSize(700,500);
        setLayout(null);
        addKeyListener(this);
        setVisible(true);


        Mk mk = new Mk();
        mk.setBounds(x, y, mk.getWidth(), mk.getHeight());
        add(mk);
        mon1.setBounds(q,e,200,200);
        add(mon1);



    }



    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {





            case KeyEvent.VK_C -> {mon1.attackAnim();
            if(x>=q&&x<q+200&&y>=e&&y<e+200){
                x=0;y=0;


            }}


        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent){
    }
}
