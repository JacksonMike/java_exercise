package com.heima.itcast1;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class UserRegister {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame1 myfra=new MyFrame1();
        myfra.setSize(350,350);
        myfra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myfra.setVisible(true);
	}
}
class MyFrame1 extends JFrame{//登录界面
	private Container c;
	private JLabel user,password,server,lb1;
    private JTextField jtf1,jtf2;
    private JPasswordField jtf3;
    private JButton jb1,jb2,jb3;
    public MyFrame1()
    {
        super("登录界面");
        c=getContentPane();
        c.setLayout(null);
        createFace();//创建按钮标签文本框
        Locate();//精确定位
        addFace();//添加标签按钮文本框
        landingHandle();//处理登陆按钮
        registerHandle();//处理注册按钮
        cancleHandle();
    }
    public void createFace()
    {
        lb1 = new JLabel("新用户请先注册");
        user = new JLabel("用户名");
        password = new JLabel("口令");
        server = new JLabel("服务器");

        jtf1 = new JTextField(20);
        jtf2 = new JTextField(20);
        jtf3 = new JPasswordField(20);
        
        jb1=new JButton("登录");
        jb2=new JButton("退出");
        jb3=new JButton("注册");
    }
    public void Locate()
    {
        jtf1.setEditable(true);
        jtf2.setEditable(true);
        jtf3.setEditable(true);
        lb1.setBounds(110, 170, 200, 20);
        
        server.setBounds(50, 30, 40, 40);
        jtf1.setBounds(90,40,150,20);
        
        user.setBounds(50, 60, 40, 40);
        jtf2.setBounds(90, 70, 150,20);
        
        password.setBounds(50, 90, 40, 40);
        jtf3.setBounds(90, 100, 150, 20);
        
        jb1.setBounds(50, 140, 60, 20);
        jb2.setBounds(180, 140, 60, 20);
        jb3.setBounds(115,140,60,20);
    }
    public void addFace()
    {
        c.add(server);
        c.add(jtf1);
        c.add(user);
        c.add(jtf2);
        c.add(password);
        c.add(jtf3);
        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        c.add(lb1);
    }
    public void landingHandle()
    {
        ButtonHandler1 bh=new ButtonHandler1();
        jb1.addActionListener(bh);
    }
    class ButtonHandler1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
            String str2=jtf2.getText();
            @SuppressWarnings("deprecation")
			String str3=jtf3.getText();
            if((str2.compareTo("hello123")==0 && str3.compareTo("123456")==0))
                System.out.println("登录成功");
            else
                System.out.println("用户名或密码不正确");
        }
    }
    public void registerHandle()
    {
        ButtonHandler2 bh=new ButtonHandler2();
        jb3.addActionListener(bh);
    }
    class ButtonHandler2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            MyFrame2 myfra=new MyFrame2();
            myfra.setBounds(500,200,350,350);
            myfra.setVisible(true);
            dispose();
        }
    }
    public void cancleHandle()
    {
        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
    }
}
class MyFrame2 extends JFrame{
	private Container c;
    private JLabel lb1,user,password1,password2,sex,birthday,residence;
    private JTextField jtf1,jtf4,jtf5,jtf6;
    private JPasswordField jtf2,jtf3;
    private JButton jb1,jb2;
    public MyFrame2()
    {
        super("注册界面");
        c=getContentPane();
        c.setLayout(null);
        createFace();//创建按钮标签文本框
        Locate();//精确定位
        addFace();//添加标签按钮文本框
        cancleHandle();//处理取消按钮
    }
    public void createFace()
    {
        lb1 = new JLabel("用户注册");
        user = new JLabel("昵称");
        password1= new JLabel("密码");
        password2 = new JLabel("确认密码");
        sex = new JLabel("性别");
        birthday = new JLabel("出生日期");
        residence = new JLabel("所在地");
        jtf1 = new JTextField(50);
        jtf2 = new JPasswordField(50);
        jtf3 = new JPasswordField(50);
        jtf4 = new JTextField(50);
        jtf5 = new JTextField(50);
        jtf6 = new JTextField(50);

        jb1=new JButton("注册");
        jb2=new JButton("取消");
    }
    public void Locate()
    {
        jtf1.setEditable(true);
        jtf2.setEditable(true);
        jtf3.setEditable(true);
        jtf4.setEditable(true);
        jtf5.setEditable(true);
        jtf6.setEditable(true);
        
        lb1.setBounds(140, 0, 120, 20);
        user.setBounds(70, 30, 120, 40);
        password1.setBounds(70, 60, 120, 40);
        password2.setBounds(70, 90, 120, 40);
        sex.setBounds(70, 120, 120, 40);
        birthday.setBounds(70, 150, 120, 40);
        residence.setBounds(70, 180, 120, 40);
        
        jtf1.setBounds(120, 40, 150, 20);
        jtf2.setBounds(120, 70, 150, 20);
        jtf3.setBounds(120, 100, 150, 20); 
        jtf4.setBounds(120, 130, 150, 20);
        jtf5.setBounds(120, 160, 150, 20);
        jtf6.setBounds(120, 190, 150, 20);
        
        jb1.setBounds(120, 220, 50, 20);
        jb2.setBounds(220, 220, 50, 20);
    }
    public void addFace()
    {
        c.add(lb1);
        c.add(user);
        c.add(jtf1);
        c.add(password1);
        c.add(password2);
        c.add(birthday);
        c.add(sex);
        c.add(residence);
        c.add(jtf2);
        c.add(jtf3);
        c.add(jb1);
        c.add(jb2);
        c.add(jtf4);
        c.add(jtf5);
        c.add(jtf6);
    }
    public void cancleHandle()
    {
        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
}
