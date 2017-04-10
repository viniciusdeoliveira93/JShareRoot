package br.univel.jshare.gui.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txfFolder;
	private JTextField textField_2;
	private JSplitPane splitPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			// Set cross-platform Java L&F (also called "Metal")
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\readicon.png"));
		setTitle("MofoShare");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerSize(10);
		contentPane.add(splitPane, BorderLayout.CENTER);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		splitPane.setLeftComponent(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Conexão", new ImageIcon("src\\icon_connect.gif"), panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLACK);
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridheight = 3;
		gbc_panel_5.insets = new Insets(5, 5, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 0;
		panel.add(panel_5, gbc_panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("src\\fileshare.png"));
		panel_5.add(lblNewLabel, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Funcionamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(5, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JRadioButton rdbtnServidor = new JRadioButton("Servidor e Cliente");
		rdbtnServidor.setSelected(true);
		GridBagConstraints gbc_rdbtnServidor = new GridBagConstraints();
		gbc_rdbtnServidor.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnServidor.gridx = 0;
		gbc_rdbtnServidor.gridy = 0;
		panel_3.add(rdbtnServidor, gbc_rdbtnServidor);

		JRadioButton rdbtnCliente = new JRadioButton("Apenas Cliente");
		GridBagConstraints gbc_rdbtnCliente = new GridBagConstraints();
		gbc_rdbtnCliente.anchor = GridBagConstraints.WEST;
		gbc_rdbtnCliente.gridx = 1;
		gbc_rdbtnCliente.gridy = 0;
		panel_3.add(rdbtnCliente, gbc_rdbtnCliente);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnServidor);
		bg.add(rdbtnCliente);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(
				new TitledBorder(null, "Par\u00E2metros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 1;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel_4.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_4.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_4.setLayout(gbl_panel_4);

		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		panel_4.add(lblNome, gbc_lblNome);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 0;
		panel_4.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JLabel lblEndereo = new JLabel("Endereço");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.anchor = GridBagConstraints.EAST;
		gbc_lblEndereo.gridx = 0;
		gbc_lblEndereo.gridy = 1;
		panel_4.add(lblEndereo, gbc_lblEndereo);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel_4.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblPorta = new JLabel("Porta");
		GridBagConstraints gbc_lblPorta = new GridBagConstraints();
		gbc_lblPorta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPorta.anchor = GridBagConstraints.EAST;
		gbc_lblPorta.gridx = 2;
		gbc_lblPorta.gridy = 1;
		panel_4.add(lblPorta, gbc_lblPorta);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		panel_4.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblPasta = new JLabel("Pasta");
		GridBagConstraints gbc_lblPasta = new GridBagConstraints();
		gbc_lblPasta.anchor = GridBagConstraints.EAST;
		gbc_lblPasta.insets = new Insets(0, 0, 0, 5);
		gbc_lblPasta.gridx = 0;
		gbc_lblPasta.gridy = 2;
		panel_4.add(lblPasta, gbc_lblPasta);

		txfFolder = new JTextField();
		GridBagConstraints gbc_txfFolder = new GridBagConstraints();
		gbc_txfFolder.gridwidth = 3;
		gbc_txfFolder.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfFolder.gridx = 1;
		gbc_txfFolder.gridy = 2;
		panel_4.add(txfFolder, gbc_txfFolder);
		txfFolder.setColumns(10);

		JButton btnFolder = new JButton("");
		btnFolder.setFocusable(false);
		btnFolder.setBorder(null);
		btnFolder.setMargin(new Insets(0, 0, 0, 0));
		btnFolder.setIconTextGap(0);
		btnFolder.setIcon(new ImageIcon("src\\dir.png"));

		txfFolder.setLayout(new BorderLayout());
		txfFolder.add(btnFolder, BorderLayout.EAST);

		JButton btnNewButton = new JButton("Conectar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		panel.add(btnNewButton, gbc_btnNewButton);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Busca", new ImageIcon("src\\search.png"), panel_1, null);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Transferências", new ImageIcon("src\\download.png"), panel_2, null);

		JScrollPane scrollPane = new JScrollPane();
		splitPane.setRightComponent(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(50, 205, 50));
		textArea.setBackground(Color.BLACK);
		scrollPane.setViewportView(textArea);
		splitPane.setDividerLocation(200);

		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent evt) {
				relocatedivider();
			}
		});

	}

	protected void relocatedivider() {
		splitPane.setDividerLocation(this.getHeight() - 150);
	}

}
