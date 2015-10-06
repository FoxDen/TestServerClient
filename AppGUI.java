package serverclient;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.JScrollBar;

public class AppGUI {

	private JFrame clientGUI;
	private JTextField textField;
	private JTextField txtIPAddress;
	private JTextField txtPortNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGUI window = new AppGUI();
					window.clientGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		clientGUI = new JFrame();
		clientGUI.setTitle("Client");
		clientGUI.getContentPane().setEnabled(false);
		clientGUI.setBounds(100, 100, 588, 428);
		clientGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clientGUI.getContentPane().setLayout(null);
		
		JPanel panClientSide = new JPanel();
		panClientSide.setBounds(10, 37, 260, 342);
		clientGUI.getContentPane().add(panClientSide);
		panClientSide.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 85, 240, 20);
		panClientSide.add(textField);
		textField.setColumns(10);
		
		JLabel lblMessageInstructions = new JLabel("Send messages to the server in upper case!");
		lblMessageInstructions.setBounds(10, 11, 240, 20);
		panClientSide.add(lblMessageInstructions);
		
		JLabel lblTypestopTo = new JLabel("Type \"stop\" to exit.");
		lblTypestopTo.setBounds(10, 31, 129, 14);
		panClientSide.add(lblTypestopTo);
		
		JButton btnSendMessage = new JButton("Send message");
		btnSendMessage.setBounds(70, 116, 129, 23);
		panClientSide.add(btnSendMessage);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(86, 256, 89, 23);
		panClientSide.add(btnClear);
		
		JPanel panServerSide = new JPanel();
		panServerSide.setBounds(280, 37, 282, 342);
		clientGUI.getContentPane().add(panServerSide);
		panServerSide.setLayout(null);
		
		JLabel lblIPAddress = new JLabel("IP Address");
		lblIPAddress.setBounds(10, 11, 121, 14);
		panServerSide.add(lblIPAddress);
		
		txtIPAddress = new JTextField();
		txtIPAddress.setEditable(false);
		txtIPAddress.setBounds(10, 36, 241, 20);
		panServerSide.add(txtIPAddress);
		txtIPAddress.setColumns(10);
		
		JLabel lblPortNo = new JLabel("Port Number");
		lblPortNo.setBounds(10, 70, 88, 14);
		panServerSide.add(lblPortNo);
		
		txtPortNo = new JTextField();
		txtPortNo.setEditable(false);
		txtPortNo.setBounds(10, 95, 241, 20);
		panServerSide.add(txtPortNo);
		txtPortNo.setColumns(10);
		
		JLabel lblClientMessages = new JLabel("Client Messages");
		lblClientMessages.setBounds(10, 167, 140, 14);
		panServerSide.add(lblClientMessages);
		
		JTextArea txtServerMsgs = new JTextArea();
		txtServerMsgs.setRows(10);
		txtServerMsgs.setWrapStyleWord(true);
		txtServerMsgs.setBounds(10, 192, 262, 139);
		panServerSide.add(txtServerMsgs);
		
		JLabel lblClient = new JLabel("CLIENT");
		lblClient.setBounds(119, 22, 46, 14);
		clientGUI.getContentPane().add(lblClient);
		
		JLabel lblServer = new JLabel("SERVER");
		lblServer.setBounds(411, 22, 46, 14);
		clientGUI.getContentPane().add(lblServer);
	}
}
