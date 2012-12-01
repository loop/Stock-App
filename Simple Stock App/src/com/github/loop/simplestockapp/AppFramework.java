package com.github.loop.simplestockapp;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


/**
 * @author Yogesh Nagarur
 * 
 * This is the class where the keyboard is coded and action listeners are present.
 */
public class AppFramework extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel outputLabelText,inputLabelText; 
	private JTextField inputTextArea; 
	private JTextPane outputTextArea;
	private JButton a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t,
			u, v, w, x, y, z, keyBoardSpace, keyBoardNum1, keyBoardNum2,
			keyBoardNum3, keyBoardNum4, keyBoardNum5, keyBoardNum6,
			keyBoardNum7, keyBoardNum8, keyBoardNum9, keyBoardNum0,
			keyBoardFullStop, keyBoardReturnKey, keyBoardDeleteKey;
	DataMaintenance datacheck = new DataMaintenance();


	public AppFramework() {
		super("A Simple Stock Market GUI");
		JPanel pane2 = new JPanel();
		GridBagLayout grid = new GridBagLayout();
		pane2.setLayout(grid);
		BorderLayout border1 = new BorderLayout();
		setLayout(border1);
		add(pane2);
		
		//Lines 56-474 declare where the UI elements should be placed onto the JFrame using GridBagLayout.
		 
		outputLabelText = new JLabel("Output: ", SwingConstants.RIGHT);
		outputLabelText
				.setToolTipText("Status of the entered stock stockSymbolsInput."); //Hover text

		GridBagConstraints con = new GridBagConstraints();
		
		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 0;
		con.gridy = 0;
		pane2.add(outputLabelText, con);

		outputTextArea = new JTextPane();
		outputTextArea.setContentType("text/html");
		outputTextArea.setEditable(false);

		JScrollPane scroll1 = new JScrollPane(outputTextArea);
		scroll1.setAutoscrolls(true);

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 4;
		con.gridx = 1;
		con.gridy = 0;
		pane2.add(scroll1, con);

		inputLabelText = new JLabel("Input:", SwingConstants.RIGHT);
		inputLabelText
				.setToolTipText("The input of your chosen stock stockSymbolsInput.");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 0;
		con.gridy = 1;
		pane2.add(inputLabelText, con);

		JPanel keyboard = new JPanel();
		GridBagLayout grid2 = new GridBagLayout();
		keyboard.setLayout(grid2);

		inputTextArea = new JTextField(10);
		inputTextArea.setEditable(false);
		inputTextArea.setOpaque(false);
		inputTextArea.setBorder(null);
		inputTextArea.setBackground(new Color(0, 0, 0, 0));

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 5;
		con.gridx = 1;
		con.gridy = 1;
		pane2.add(inputTextArea, con);

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridwidth = 2;
		con.gridx = 0;
		con.gridy = 2;
		pane2.add(keyboard, con);

		keyBoardNum0 = new JButton("0");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.gridwidth = 1;
		con.gridx = 0;
		con.gridy = 0;
		keyboard.add(keyBoardNum0, con);

		keyBoardNum1 = new JButton("1");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 1;
		con.gridy = 0;
		keyboard.add(keyBoardNum1, con);

		keyBoardNum2 = new JButton("2");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 2;
		con.gridy = 0;
		keyboard.add(keyBoardNum2, con);

		keyBoardNum3 = new JButton("3");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 3;
		con.gridy = 0;
		keyboard.add(keyBoardNum3, con);

		keyBoardNum4 = new JButton("4");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 4;
		con.gridy = 0;
		keyboard.add(keyBoardNum4, con);

		keyBoardNum5 = new JButton("5");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 5;
		con.gridy = 0;
		keyboard.add(keyBoardNum5, con);

		keyBoardNum6 = new JButton("6");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 6;
		con.gridy = 0;
		keyboard.add(keyBoardNum6, con);

		keyBoardNum7 = new JButton("7");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 7;
		con.gridy = 0;
		keyboard.add(keyBoardNum7, con);

		keyBoardNum8 = new JButton("8");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 8;
		con.gridy = 0;
		keyboard.add(keyBoardNum8, con);

		keyBoardNum9 = new JButton("9");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 9;
		con.gridy = 0;
		keyboard.add(keyBoardNum9, con);

		q = new JButton("Q");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 0;
		con.gridy = 1;
		keyboard.add(q, con);

		w = new JButton("W");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 1;
		con.gridy = 1;
		keyboard.add(w, con);

		e = new JButton("E");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.gridx = 2;
		con.gridy = 1;
		keyboard.add(e, con);

		r = new JButton("R");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 3;
		con.gridy = 1;
		keyboard.add(r, con);

		t = new JButton("T");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 4;
		con.gridy = 1;
		keyboard.add(t, con);

		y = new JButton("Y");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 5;
		con.gridy = 1;
		keyboard.add(y, con);

		u = new JButton("U");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 6;
		con.gridy = 1;
		keyboard.add(u, con);

		i = new JButton("I");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 7;
		con.gridy = 1;
		keyboard.add(i, con);

		o = new JButton("O");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 8;
		con.gridy = 1;
		keyboard.add(o, con);

		p = new JButton("P");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 9;
		con.gridy = 1;
		keyboard.add(p, con);

		keyBoardDeleteKey = new JButton("Del");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 9;
		con.gridy = 3;
		keyboard.add(keyBoardDeleteKey, con);

		a = new JButton("A");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 0;
		con.gridy = 2;
		keyboard.add(a, con);

		s = new JButton("S");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 1;
		con.gridy = 2;
		keyboard.add(s, con);

		d = new JButton("D");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 2;
		con.gridy = 2;
		keyboard.add(d, con);

		f = new JButton("F");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 3;
		con.gridy = 2;
		keyboard.add(f, con);

		g = new JButton("G");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 4;
		con.gridy = 2;
		keyboard.add(g, con);

		h = new JButton("H");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 5;
		con.gridy = 2;
		keyboard.add(h, con);

		j = new JButton("J");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 6;
		con.gridy = 2;
		keyboard.add(j, con);

		k = new JButton("K");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 7;
		con.gridy = 2;
		keyboard.add(k, con);

		l = new JButton("L");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 8;
		con.gridy = 2;
		keyboard.add(l, con);

		keyBoardReturnKey = new JButton("Ret");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 9;
		con.gridy = 2;
		keyboard.add(keyBoardReturnKey, con);

		z = new JButton("Z");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 0;
		con.gridy = 3;
		keyboard.add(z, con);

		x = new JButton("X");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 1;
		con.gridy = 3;
		keyboard.add(x, con);

		c = new JButton("C");
		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 2;
		con.gridy = 3;
		keyboard.add(c, con);

		v = new JButton("V");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 3;
		con.gridy = 3;
		keyboard.add(v, con);

		b = new JButton("B");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 4;
		con.gridy = 3;
		keyboard.add(b, con);

		n = new JButton("N");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 5;
		con.gridy = 3;
		keyboard.add(n, con);

		m = new JButton("M");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 6;
		con.gridy = 3;
		keyboard.add(m, con);

		keyBoardFullStop = new JButton(".");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 7;
		con.gridy = 3;
		keyboard.add(keyBoardFullStop, con);

		keyBoardSpace = new JButton(" ");

		con.fill = GridBagConstraints.BOTH;
		con.weightx = 0.5;
		con.weighty = 0.5;
		con.gridx = 8;
		con.gridy = 3;
		keyboard.add(keyBoardSpace, con);

		/**
		 * Adds action listeners to each of the buttons. It also calls a takes a
		 * argument which is the letter or number of which the button should
		 * output when pressed
		 */
		
		a.addActionListener(new letterListener('A'));
		b.addActionListener(new letterListener('B'));
		c.addActionListener(new letterListener('C'));
		d.addActionListener(new letterListener('D'));
		e.addActionListener(new letterListener('E'));
		f.addActionListener(new letterListener('F'));
		g.addActionListener(new letterListener('G'));
		h.addActionListener(new letterListener('H'));
		i.addActionListener(new letterListener('I'));
		j.addActionListener(new letterListener('J'));
		k.addActionListener(new letterListener('K'));
		l.addActionListener(new letterListener('L'));
		m.addActionListener(new letterListener('M'));
		n.addActionListener(new letterListener('N'));
		o.addActionListener(new letterListener('O'));
		p.addActionListener(new letterListener('P'));
		q.addActionListener(new letterListener('Q'));
		r.addActionListener(new letterListener('R'));
		s.addActionListener(new letterListener('S'));
		t.addActionListener(new letterListener('T'));
		u.addActionListener(new letterListener('U'));
		v.addActionListener(new letterListener('V'));
		w.addActionListener(new letterListener('W'));
		x.addActionListener(new letterListener('X'));
		y.addActionListener(new letterListener('Y'));
		z.addActionListener(new letterListener('Z'));
		keyBoardNum1.addActionListener(new numberListener(1));
		keyBoardNum2.addActionListener(new numberListener(2));
		keyBoardNum3.addActionListener(new numberListener(3));
		keyBoardNum4.addActionListener(new numberListener(4));
		keyBoardNum5.addActionListener(new numberListener(5));
		keyBoardNum6.addActionListener(new numberListener(6));
		keyBoardNum7.addActionListener(new numberListener(7));
		keyBoardNum8.addActionListener(new numberListener(8));
		keyBoardNum9.addActionListener(new numberListener(9));
		keyBoardNum0.addActionListener(new numberListener(0));
		keyBoardDeleteKey.addActionListener(new deleteListener());
		keyBoardReturnKey.addActionListener(new returnListener());
		keyBoardSpace.addActionListener(new letterListener(' '));
		keyBoardFullStop.addActionListener(new letterListener('.'));

	}

	private class letterListener implements ActionListener {

		private final char letter;

		/**
		 * @param letter of type char
		 * 
		 */
		public letterListener(char letter) {
			this.letter = letter;
		}

		/**
		 * When button is pressed the char is appended to the input JTextField.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			inputTextArea.setText(inputTextArea.getText() + letter);
		}

	}

	private class numberListener implements ActionListener {

		private final int number;
		/**
		 * @param number of type int
		 * 
		 */
		public numberListener(int number) {
			this.number = number;
		}
		/**
		 * When button is pressed the int is appended to the input JTextField.
		 * 
		 * @param e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			inputTextArea.setText(inputTextArea.getText() + number);
		}
	}
	
	private class deleteListener implements ActionListener {
		/**
		 * Truncates the input text  by taking the substring of index 0 to length-1
		 * every time delete is pressed
		 * 
		 * @param e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			String inputText = inputTextArea.getText();
			if (inputText.length() == 0) { 
				JOptionPane.showMessageDialog(null,
						"Sorry, you cannot delete nothing!");
			} else {
				String newText = inputText.substring(0, inputText.length() - 1);
				inputTextArea.setText(newText);
			}
		}

	}

	private class returnListener implements ActionListener {
		/**
		 * Used for executing the yahooDataProcessing method to fetch data form input.
		 * @param e
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			String inputText = inputTextArea.getText();
			if (inputText.length() == 0) { 

				JOptionPane.showMessageDialog(null,
						"Sorry, you cannot look for nothing!");
			} else {
				inputTextArea.setText("Please, wait.");
				inputTextArea.setEnabled(false);
				keyBoardReturnKey.setEnabled(false);
				keyBoardDeleteKey.setEnabled(false);

				yahooDataProcessing(inputText);
			}

		}
	}
	
	/**
	 * @param User string input from the keyboard
	 * 
	 * This method processes the input from the input,
	 * fetches it from Yahoo! using URLReader class and formats the data and outputs it.
	 */
	public void yahooDataProcessing(String input) {
		HashMap<String, StockDetails> results = new HashMap<String, StockDetails>();
		String[] queryArray = input.split(" "); 

		String ask = "";

		for (String symbol : queryArray) {		
			if (!results.containsKey(symbol)) { 
				if (!ask.equals(""))
					ask += "+";
				ask += symbol;
			}
		}

		String stock = URLReader
				.readURL("http://finance.yahoo.com/d/quotes.csv?s=" + ask
						+ "+&f=nl1dj1xp");
		String[] array = stock.split("\n"); 

		int i = 0;
		for (String line : array) {
			if (!line.equals("N/A") || !(line.length() < 8)) { 
				StockDetails result = processLine(line); 
				if (result != null) {
					results.put(queryArray[i], result);
				} else { 
					JOptionPane
							.showMessageDialog(
									null,
									"Sorry, it seems the symbol \""
											+ queryArray[i]
											+ "\" doesn't exist or is over 8 characters.");
				}
			}
			i++;
		}

		for (StockDetails detail : results.values()) { 

			StyledDocument doc = outputTextArea.getStyledDocument(); 

			try {
				Style normal = doc.addStyle("normal", null); 

				Style bold = doc.addStyle("bold", null); 
				StyleConstants.setBold(bold, true); 
				StyleConstants.setForeground(bold, Color.black);

				Style red = doc.addStyle("red", null); 
				StyleConstants.setForeground(red, Color.red);
				Style green = doc.addStyle("green", null);
				StyleConstants.setForeground(green, new Color(0, 128, 0));
				String nameReplaced = detail.getName().replaceAll("\"", ""); 
				String nameReplacedProper = nameReplaced.replaceAll("--", ", ");

				doc.insertString(doc.getLength(), nameReplacedProper + "\n",
						bold);

				doc.insertString(doc.getLength(), "Price: ", normal);
				doc.insertString(doc.getLength(),
						detail.getPrice()
								+ datacheck.checkCurrency(detail.getStockExchange() 
										.replaceAll("\"", "")) + "\n", normal);

				doc.insertString(doc.getLength(), "Change: ", normal);
				double diff = (detail.getPrice() - detail.getOldPrice()); 
				double diffPercentile = (diff / detail.getOldPrice()) * 100; 

				if (diff < 0) {
					doc.insertString(doc.getLength(), datacheck.roundTwoDecimals(diff)
							+ "(" + datacheck.roundTwoDecimals(diffPercentile) + "%)\n",
							red);
				}
				if (diff > 0) {
					doc.insertString(doc.getLength(), "+"
							+ datacheck.roundTwoDecimals(diff) + "(+"
							+ datacheck.roundTwoDecimals(diffPercentile) + "%)\n", green);
				}
				if (diff == 0) {
					doc.insertString(doc.getLength(), "+"
							+ datacheck.roundTwoDecimals(diff) + "(+"
							+ datacheck.roundTwoDecimals(diffPercentile) + "%)\n", normal);
				}

				doc.insertString(doc.getLength(), "Dividends: ", normal);
				doc.insertString(doc.getLength(), detail.getDividend() + "\n",
						normal);

				doc.insertString(doc.getLength(), "Market Cap: ", normal);
				doc.insertString(doc.getLength(), detail.getMarketCap() + "\n",
						normal);

				doc.insertString(doc.getLength(), "Stock Exchange: ", normal);
				doc.insertString(doc.getLength(), detail.getStockExchange()
						.replaceAll("\"", "") + "\n\n", normal);

			} catch (BadLocationException e) { 
				e.printStackTrace(); 
			}

		}
		inputTextArea.setText(null);
		inputTextArea.setEnabled(true);
		keyBoardReturnKey.setEnabled(true);
		keyBoardDeleteKey.setEnabled(true);

	}
	/**
	 * @param One string from the data which was fetched from the Yahoo! query.
	 * @return Returns data using StockDetails class
	 * 
	 */
	public static StockDetails processLine(String line) {
		String replacedLine = line.replaceAll(", ", "--"); 
		String[] parts = replacedLine.split(","); 

		try {
			// Data is like this - "Google Inc.",577.87,0.00,187.9B,"NasdaqNM",579.98
			String name = parts[0];
			float price = Float.parseFloat(parts[1]);
			float oldPrice = Float.parseFloat(parts[5]);
			float dividend = Float.parseFloat(parts[2]);
			String marketCap = parts[3];
			String stockEchange = parts[4];

			return new StockDetails(name, price, oldPrice, dividend, marketCap,
					stockEchange);
		}
		// not possible to parse, symbol doesn't exist.
		catch (NumberFormatException e) {
			return null;
		}
	}
	

}