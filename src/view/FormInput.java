package view;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class FormInput extends JFrame {
	public FormInput() {
		initComponent();
	}

	private void initComponent() {
		setTitle("Form Input");
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 550);
		setLocationRelativeTo(null);
		setBackground(Color.LIGHT_GRAY);

		JPanel fieldInput = new JPanel();
		fieldInput.setLayout(null);
		fieldInput.setSize(450, 500);
		fieldInput.setBackground(Color.WHITE);
		fieldInput.setBounds(17, 17, 450, 425);

		JLabel nikLabel = new JLabel("NIK:");
		nikLabel.setBounds(17, -220, 30, 500);
		fieldInput.add(nikLabel);

		JTextField nikField = new JTextField();
		nikField.setFont(new Font("calibri", Font.PLAIN, 15));
		nikField.setBounds(180, 23, 250, 15);
		fieldInput.add(nikField);

		JLabel namaLabel = new JLabel("Nama:");
		namaLabel.setBounds(17, -200, 450, 500);
		fieldInput.add(namaLabel);

		JTextField namaField = new JTextField();
		namaField.setFont(new Font("calibri", Font.PLAIN, 15));
		namaField.setBounds(180, 43, 250, 15);
		fieldInput.add(namaField);

		JLabel tempatLahirLabel = new JLabel("Tempat Lahir:");
		tempatLahirLabel.setBounds(17, -180, 450, 500);
		fieldInput.add(tempatLahirLabel);

		JTextField tempatLahirField = new JTextField();
		tempatLahirField.setFont(new Font("calibri", Font.PLAIN, 15));
		tempatLahirField.setBounds(180, 63, 250, 15);
		fieldInput.add(tempatLahirField);

		JLabel tanggalLahirLabel = new JLabel("Tanggal Lahir:");
		tanggalLahirLabel.setBounds(17, -160, 450, 500);
		fieldInput.add(tanggalLahirLabel);

		JDateChooser tanggalLahirField = new JDateChooser();
		tanggalLahirField.setBounds(180, 83, 250, 15);
		fieldInput.add(tanggalLahirField);

		JLabel jenisKelaminLabel = new JLabel("Jenis kelamin:");
		jenisKelaminLabel.setBounds(17, -140, 450, 500);
		fieldInput.add(jenisKelaminLabel);

		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("Female");
		male.setBounds(180, 103, 110, 15);
		female.setBounds(300, 103, 110, 15);
		fieldInput.add(male);
		fieldInput.add(female);

		ButtonGroup jenisKelaminField = new ButtonGroup();
		jenisKelaminField.add(male);
		jenisKelaminField.add(female);

		JLabel golDarahLabel = new JLabel("Gol. Darah:");
		golDarahLabel.setBounds(17, -120, 450, 500);
		fieldInput.add(golDarahLabel);

		JRadioButton golDarahA = new JRadioButton("A");
		JRadioButton golDarahB = new JRadioButton("B");
		JRadioButton golDarahO = new JRadioButton("O");
		JRadioButton golDarahAB = new JRadioButton("AB");
		golDarahA.setBounds(180, 123, 50, 15);
		golDarahB.setBounds(240, 123, 50, 15);
		golDarahO.setBounds(300, 123, 50, 15);
		golDarahAB.setBounds(360, 123, 50, 15);
		fieldInput.add(golDarahA);
		fieldInput.add(golDarahB);
		fieldInput.add(golDarahO);
		fieldInput.add(golDarahAB);

		ButtonGroup golDarahField = new ButtonGroup();
		golDarahField.add(golDarahA);
		golDarahField.add(golDarahB);
		golDarahField.add(golDarahO);
		golDarahField.add(golDarahAB);

		JLabel alamatLabel = new JLabel("Alamat:");
		alamatLabel.setBounds(17, -100, 450, 500);
		fieldInput.add(alamatLabel);

		JTextField alamatField = new JTextField();
		alamatField.setFont(new Font("calibri", Font.PLAIN, 15));
		alamatField.setBounds(180, 143, 250, 15);
		fieldInput.add(alamatField);

		JLabel rtRWlabel = new JLabel("RT/RW:");
		rtRWlabel.setBounds(17, -80, 450, 500);
		fieldInput.add(rtRWlabel);

		JTextField rtRWfield = new JTextField();
		rtRWfield.setFont(new Font("calibri", Font.PLAIN, 15));
		rtRWfield.setBounds(180, 163, 250, 15);
		fieldInput.add(rtRWfield);

		JLabel kelDesaLabel = new JLabel("Kel/Desa:");
		kelDesaLabel.setBounds(17, -60, 450, 500);
		fieldInput.add(kelDesaLabel);

		JTextField kelDesaField = new JTextField();
		kelDesaField.setFont(new Font("calibri", Font.PLAIN, 15));
		kelDesaField.setBounds(180, 183, 250, 15);
		fieldInput.add(kelDesaField);

		JLabel kecamatanLabel = new JLabel("Kecamatan:");
		kecamatanLabel.setBounds(17, -40, 450, 500);
		fieldInput.add(kecamatanLabel);

		JTextField kecamatanField = new JTextField();
		kecamatanField.setFont(new Font("calibri", Font.PLAIN, 15));
		kecamatanField.setBounds(180, 203, 250, 15);
		fieldInput.add(kecamatanField);

		JLabel agamaLabel = new JLabel("Agama:");
		agamaLabel.setBounds(17, -20, 450, 500);
		fieldInput.add(agamaLabel);

		Object[] agama = {"Kristen", "Katolik", "Islam", "Budha", "Hindu", "Konghuchu", "Kepercayaan"};
		JComboBox agamaField = new JComboBox(agama);
		agamaField.setBounds(180, 223, 250, 15);
		fieldInput.add(agamaField);

		JLabel statusLabel = new JLabel("Status Perkawinan:");
		statusLabel.setBounds(17, 0, 450, 500);
		fieldInput.add(statusLabel);

		Object[] status = {"Belum Menikah", "Menikah", "Janda", "Duda"};
		JComboBox statusField = new JComboBox(status);
		statusField.setBounds(180, 243, 250, 15);
		fieldInput.add(statusField);

		JLabel pekerjaanLabel = new JLabel("Pekerjaan:");
		pekerjaanLabel.setBounds(17, 20, 450, 500);
		fieldInput.add(pekerjaanLabel);

		JTextField pekerjaanField = new JTextField();
		pekerjaanField.setFont(new Font("calibri", Font.PLAIN, 15));
		pekerjaanField.setBounds(180, 263, 250, 15);
		fieldInput.add(pekerjaanField);

		JLabel kewarganegaraanLabel = new JLabel("Kewarganegaraan:");
		kewarganegaraanLabel.setBounds(17, 40, 450, 500);
		fieldInput.add(kewarganegaraanLabel);

		JTextField kewarganegaraanField = new JTextField();
		kewarganegaraanField.setFont(new Font("calibri", Font.PLAIN, 15));
		kewarganegaraanField.setBounds(180, 283, 250, 15);
		fieldInput.add(kewarganegaraanField);

		JLabel fotoLabel = new JLabel("Foto:");
		fotoLabel.setBounds(17, 60, 450, 500);
		fieldInput.add(fotoLabel);

		JFileChooser fotoField = new JFileChooser();
		fotoField.setBounds(180, 303, 250, 50);
//		fieldInput.add(fotoField);

		JLabel tandaTanganLabel = new JLabel("Tanda Tangan:");
		tandaTanganLabel.setBounds(17, 80, 450, 500);
		fieldInput.add(tandaTanganLabel);

		JFileChooser tandaTanganField = new JFileChooser();
		tandaTanganField.setBounds(180, 323, 250, 15);
//		fieldInput.add(tandaTanganField);

		JLabel berlakuHinggaLabel = new JLabel("Berlaku Hingga:");
		berlakuHinggaLabel.setBounds(17, 100, 450, 500);
		fieldInput.add(berlakuHinggaLabel);

		JTextField berlakuField = new JTextField();
		berlakuField.setFont(new Font("calibri", Font.PLAIN, 15));
		berlakuField.setBounds(180, 343, 250, 15);
		fieldInput.add(berlakuField);

		JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan KTP:");
		kotaPembuatanLabel.setBounds(17, 120, 450, 500);
		fieldInput.add(kotaPembuatanLabel);

		JTextField kotaPembuatanField = new JTextField();
		kotaPembuatanField.setFont(new Font("calibri", Font.PLAIN, 15));
		kotaPembuatanField.setBounds(180, 363, 250, 15);
		fieldInput.add(kotaPembuatanField);

		JLabel tanggalPembuatanLabel = new JLabel("Tanggal Pembuatan KTP:");
		tanggalPembuatanLabel.setBounds(17, 140, 450, 500);
		fieldInput.add(tanggalPembuatanLabel);

		JDateChooser tanggalPembuatanField = new JDateChooser();
		tanggalPembuatanField.setBounds(180, 383, 250, 15);
		fieldInput.add(tanggalPembuatanField);

		JButton submit = new JButton("Submit!");
		submit.setBounds(185, 460, 100, 30);

		add(fieldInput);
		add(submit);
	}

	public static void main(String[] args) {
		new FormInput().setVisible(true);
	}
}