package chatting.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends JFrame implements ActionListener {

    JPanel p1;
    JTextField t1;
    JButton b1;
    static JTextArea a1;
    static ServerSocket skt;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;

    public void actionPerformed(ActionListener ae) {

    }

    Server() {

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 128, 128));
        p1.setBounds(0, 0, 450, 50);
        add(p1);

        //The below imageIcone contain arrow symbol.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/b.png"));
        Image i2 = i1.getImage().getScaledInstance(30, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        setLayout(null);
        l1.setBounds(0, 0, 40, 50);
        p1.add(l1);

        l1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               // super.mouseClicked(e);
                System.exit(0);
            }
        });

        //This image contain display picture.
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/ram.png"));
        Image i5 = i4.getImage().getScaledInstance(40, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        setLayout(null);
        l2.setBounds(35, 0, 40, 50);
        p1.add(l2);

        //right three icons
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 40, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l3 = new JLabel(i9);
        setLayout(null);
        l3.setBounds(320, 0, 40, 50);
        p1.add(l3);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l4 = new JLabel(i12);
        setLayout(null);
        l4.setBounds(370, 0, 40, 50);
        p1.add(l4);

        ImageIcon i15 = new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3icon.png"));
        Image i16 = i15.getImage().getScaledInstance(20, 40, Image.SCALE_DEFAULT);
        ImageIcon i17 = new ImageIcon(i16);
        JLabel l5 = new JLabel(i17);
        setLayout(null);
        l5.setBounds(400, 0, 40, 50);
        p1.add(l5);

        //This label contain display name;
        JLabel l31 = new JLabel("Ram");
        l31.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        l31.setForeground(Color.black);
        l31.setBounds(100, 0, 100, 30);
        p1.add(l31);

        JLabel l41 = new JLabel("Active Now");
        l41.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));
        l41.setForeground(Color.black);
        l41.setBounds(100, 20, 100, 30);
        p1.add(l41);

        a1 = new JTextArea();
        a1.setBounds(8, 60, 430, 490);
        a1.setBackground(Color.WHITE);
        a1.setEditable(false);
        a1.setLineWrap(true);
        a1.setWrapStyleWord(true);
        add(a1);

        t1 = new JTextField();
        t1.setBounds(5, 560, 360, 30);
        t1.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(t1);

        b1 = new JButton("Send");
        b1.setBounds(380, 560, 60, 30);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN, 10));
        b1.setBackground(new Color(7, 94, 84));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        //The below code contains the layout and color of the chatting window;
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        setSize(450, 600);
       setLocation(200, 200);
       setUndecorated(true);
       setVisible(true);

    }

    public static void main(String[] args) {

        new Server().setVisible(true);

        String messageInput = "";

        try {
            skt = new ServerSocket(5001);
            s = skt.accept();
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());

            messageInput = din.readUTF();
            a1.setText(a1.getText() + "\n" + messageInput);

            skt.close();
            s.close();

        }catch(Exception e) {

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String textField = t1.getText();
            a1.setText(a1.getText() + "\n\t\t\t" + textField);
            dout.writeUTF(textField);
            t1.setText("");
        }catch (Exception ex) {

        }
    }
}
