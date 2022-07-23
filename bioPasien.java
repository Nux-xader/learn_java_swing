import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class bioPasien extends JFrame implements ActionListener {
    Font heading = new Font("Times New Roman", Font.BOLD, 22);
    Font paragraph = new Font("Times New Roman", Font.PLAIN, 14);

	JLabel title = new JLabel();
	JLabel no_rm = new JLabel();
	JLabel name = new JLabel();
	JLabel address = new JLabel();
	JLabel gender = new JLabel();
	JLabel spesialyst = new JLabel();
	JLabel blood = new JLabel();

	JScrollPane scroll;
	JRadioButton radio_btn_male, radio_btn_female;
	JComboBox < String > jc_spesialyst, jc_blood;
	String options_spesialyst[] = {"-PILIH-", "Penyakit Dalam", "THT", "Anak", "Kandungan"};
	String options_blood[] = {"-PILIH-", "A", "B", "AB", "O"};
	JTextField txt_no_rm = new JTextField();
	JTextField txt_name = new JTextField();
	JTextArea txt_address = new JTextArea();

    JButton save = new JButton();
    JButton read = new JButton();
    JButton exit = new JButton();

	public bioPasien() {
		title.setFont(heading);
		title.setText("Bio Data Pasien");
		title.setBounds(115, 20, 200, 50);
		add(title);

		no_rm.setFont(paragraph);
		no_rm.setText("NoRM");
		no_rm.setBounds(20, 80, 100, 25);
		add(no_rm);
        txt_no_rm.setBounds(150, 80, 200, 25);
        add(txt_no_rm);

		name.setFont(paragraph);
		name.setText("Nama Pasien");
		name.setBounds(20, 115, 100, 25);
		add(name);
        txt_name.setBounds(150, 115, 200, 25);
        add(txt_name);

		address.setFont(paragraph);
		address.setText("Alamat");
		address.setBounds(20, 150, 100, 25);
		add(address);
		txt_address.setBounds(150, 150, 200, 50);
		scroll = new JScrollPane(txt_address);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(150, 150, 200, 50);
        add(scroll);

		gender.setFont(paragraph);
		gender.setText("Jenis kelamin");
		gender.setBounds(20, 220, 100, 25);
		add(gender);
        radio_btn_male = new JRadioButton("Pria");
        radio_btn_male.setBounds(150, 220, 80, 25);
        add(radio_btn_male);
        radio_btn_female = new JRadioButton("Wanita");
        radio_btn_female.setBounds(250, 220, 80, 25);
        add(radio_btn_female);

		spesialyst.setFont(paragraph);
		spesialyst.setText("Poli Spesialis");
		spesialyst.setBounds(20, 255, 100, 25);
		add(spesialyst);
		jc_spesialyst = new JComboBox < > (options_spesialyst);
		jc_spesialyst.setBounds(150, 255, 170, 25);
		add(jc_spesialyst);

		blood.setFont(paragraph);
		blood.setText("Golongan Darah");
		blood.setBounds(20, 290, 100, 25);
		add(blood);
		jc_blood = new JComboBox < > (options_blood);
		jc_blood.setBounds(150, 290, 170, 25);
		add(jc_blood);

		save.setFont(paragraph);
		save.setText("Simpan");
		save.setBounds(30, 345, 100, 25);
		save.addActionListener(this);
		add(save);

		read.setFont(paragraph);
		read.setText("Baca");
		read.setBounds(140, 345, 100, 25);
		read.addActionListener(this);
		add(read);

		exit.setFont(paragraph);
		exit.setText("Keluar");
		exit.setBounds(250, 345, 100, 25);
		exit.addActionListener(this);
		add(exit);

		setLayout(null);
		setTitle("Bio Data Pasien");
		setSize(400, 450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}

    public static void main(String[] args) {
        bioPasien mhs = new bioPasien();
    }

	@Override
	public void actionPerformed(ActionEvent e) {}
}

