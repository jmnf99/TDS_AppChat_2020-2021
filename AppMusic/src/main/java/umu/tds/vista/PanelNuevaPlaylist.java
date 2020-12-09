package umu.tds.vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelNuevaPlaylist extends JPanel {
	private JTextField textNombrePlaylist;

	/**
	 * Create the panel.
	 */
	public PanelNuevaPlaylist() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		add(panelNorte, BorderLayout.NORTH);
		GridBagLayout gbl_panelNorte = new GridBagLayout();
		gbl_panelNorte.columnWidths = new int[]{145, 96, 0, 120, 0};
		gbl_panelNorte.rowHeights = new int[]{10, 21, 0};
		gbl_panelNorte.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelNorte.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelNorte.setLayout(gbl_panelNorte);
		
		textNombrePlaylist = new JTextField();
		GridBagConstraints gbc_textNombrePlaylist = new GridBagConstraints();
		gbc_textNombrePlaylist.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombrePlaylist.insets = new Insets(0, 0, 0, 5);
		gbc_textNombrePlaylist.gridx = 1;
		gbc_textNombrePlaylist.gridy = 1;
		panelNorte.add(textNombrePlaylist, gbc_textNombrePlaylist);
		textNombrePlaylist.setColumns(10);
		
		final JButton btnCrearPlaylist = new JButton("Crear");
		btnCrearPlaylist.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Object[] options = {"Si", "No"};
				JOptionPane.showOptionDialog(btnCrearPlaylist, "¿Deseas crear una nueva playlist?", "Crear nueva playlist", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			}
		});
		GridBagConstraints gbc_btnCrearPlaylist = new GridBagConstraints();
		gbc_btnCrearPlaylist.insets = new Insets(0, 0, 0, 5);
		gbc_btnCrearPlaylist.gridx = 2;
		gbc_btnCrearPlaylist.gridy = 1;
		panelNorte.add(btnCrearPlaylist, gbc_btnCrearPlaylist);
		

	}

}
