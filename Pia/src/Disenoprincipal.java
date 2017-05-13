
import java.awt.Toolkit;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Disenoprincipal {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco=new MarcoCentrado();
		mimarco.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.getContentPane().setLayout(null);
		
		JTextPane txtpnJfrjrfjrf = new JTextPane();
		txtpnJfrjrfjrf.setEditable(false);
		txtpnJfrjrfjrf.setBackground(Color.LIGHT_GRAY);
		txtpnJfrjrfjrf.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtpnJfrjrfjrf.setText("Selecciona el archivo de texto a comprimir:");
		txtpnJfrjrfjrf.setBounds(10, 11, 247, 21);
		mimarco.getContentPane().add(txtpnJfrjrfjrf);
		
		JButton btnNewButton = new JButton("Seleccionar archivo.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(20, 43, 188, 23);
		mimarco.getContentPane().add(btnNewButton);
		
		JTextPane txtpnAContinuacionSe = new JTextPane();
		txtpnAContinuacionSe.setText("A continuacion se muestran las frecuencias:");
		txtpnAContinuacionSe.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtpnAContinuacionSe.setEditable(false);
		txtpnAContinuacionSe.setBackground(Color.LIGHT_GRAY);
		txtpnAContinuacionSe.setBounds(10, 97, 247, 21);
		mimarco.getContentPane().add(txtpnAContinuacionSe);
		
		textField = new JTextField();
		textField.setBounds(20, 129, 237, 243);
		mimarco.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnRadioDeCompresion = new JTextPane();
		txtpnRadioDeCompresion.setText("Radio de compresion:");
		txtpnRadioDeCompresion.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		txtpnRadioDeCompresion.setEditable(false);
		txtpnRadioDeCompresion.setBackground(Color.LIGHT_GRAY);
		txtpnRadioDeCompresion.setBounds(461, 351, 136, 21);
		mimarco.getContentPane().add(txtpnRadioDeCompresion);
		
		JEditorPane dtrpnR = new JEditorPane();
		dtrpnR.setText("r");
		dtrpnR.setBounds(589, 352, 106, 20);
		mimarco.getContentPane().add(dtrpnR);

		mimarco.setVisible(true);		
		
		
	}
}

class MarcoCentrado extends JFrame 
{
	public MarcoCentrado()
	{
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Compresion");
		Image miIcono=mipantalla.getImage("icono3.png");
		setIconImage(miIcono);
	}
}