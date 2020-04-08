package gui;

import businesslogic.MorseCodeTranslator;
import businesslogic.MorseCodeTranslatorImpl;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Font.*;
import static javax.swing.JSplitPane.*;
import static javax.swing.SwingConstants.*;

public class GUIManagerImpl implements GUIManager {
    private String info = "Morse Code Translator. The end of every word in the Morse Code field is marked with //.";

    private JTextArea morseArea;
    private JTextArea englishArea;

    private JPanel morseTextPanel;
    private JPanel englishTextPanel;
    private JPanel mainPanel;
    private JPanel infoPanel;

    private JFrame frame;

    private JSplitPane splitPane;

    private MorseCodeTranslator morseCodeTranslator;

    public GUIManagerImpl() {
        morseCodeTranslator = new MorseCodeTranslatorImpl();
    }

    @Override
    public void initialize() {
        setEnglishTextArea();
        setMorseTextArea();
        setEnglishPanel();
        setMorsePanel();
        setSplitPane();


        JTextArea infoTextArea = new JTextArea();
        infoTextArea.setLineWrap(true);
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setText(info);
        infoTextArea.setEditable(false);
        infoTextArea.setSelectedTextColor(yellow);
        infoTextArea.setBackground(darkGray);
        infoTextArea.setForeground(WHITE);


        infoTextArea.setMargin(new Insets(5, 5, 5, 5));

        this.infoPanel = new JPanel(new BorderLayout());
        this.infoPanel.add(infoTextArea, BorderLayout.CENTER);
        this.infoPanel.setBackground(darkGray);
        this.infoPanel.setForeground(WHITE);
        this.infoPanel.setBorder(BorderFactory.createEtchedBorder());

        this.mainPanel = new JPanel(new BorderLayout());
        this.mainPanel.add(infoPanel, BorderLayout.NORTH);
        this.mainPanel.add(splitPane, BorderLayout.CENTER);


        this.frame = new JFrame();
        this.frame.setTitle("Morse Translator");
        this.frame.setFont(new Font(SERIF,BOLD,16));
        this.frame.setLayout(new BorderLayout());
        this.frame.add(mainPanel, BorderLayout.CENTER);
        this.frame.setSize(new Dimension(800, 650));
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(true);
        this.frame.setVisible(true);



        this.splitPane.setDividerLocation(this.frame.getWidth() / 2);
        this.splitPane.setBackground(black);
    }

    private void setMorseTextArea() {
        this.morseArea = new JTextArea();

        this.morseArea.setLineWrap(true);
        this.morseArea.setBackground(new Color(71,113,165));
        this.morseArea.setWrapStyleWord(true);
        this.morseArea.setForeground(white);
        this.morseArea.setMargin(new Insets(10, 10, 10, 10));
    }

    private void setMorsePanel() {
        JLabel morseText = new JLabel("MORSE CODE");
        morseText.setHorizontalAlignment(CENTER);
        morseText.setFont(new Font(SERIF, BOLD, 16));
        morseText.setForeground(WHITE);


        JButton morseToEnglishBt = new JButton("Morse >> English");
        morseToEnglishBt.setBackground(new Color(255,193,37));
        morseToEnglishBt.setForeground(black);

        JButton clearMorseText = new JButton("Clear Text >>");
        clearMorseText.setBackground(new Color(255,193,37));
        clearMorseText.setForeground(black);


        morseToEnglishBt.addActionListener((listener) -> {
            String text = this.morseArea.getText().trim();
            this.englishArea.setText(this.morseCodeTranslator.morseToEnglish(text));
        });

        clearMorseText.addActionListener((listener) -> {
            this.morseArea.setText(null);
        });


        JPanel morseControlPanel = new JPanel();
        morseControlPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        morseControlPanel.add(morseToEnglishBt);
        morseControlPanel.add(clearMorseText);
        morseControlPanel.setBackground(black);

        this.morseTextPanel = new JPanel();
        this.morseTextPanel.setLayout(new BorderLayout());
        this.morseTextPanel.setBackground(black);
        this.morseTextPanel.add(morseText, BorderLayout.NORTH);
        this.morseTextPanel.add(new JScrollPane(this.morseArea), BorderLayout.CENTER);
        this.morseTextPanel.add(morseControlPanel, BorderLayout.SOUTH);
    }

    private void setEnglishTextArea() {
        this.englishArea = new JTextArea(25, 25);
        this.englishArea.setLineWrap(true);
        this.englishArea.setWrapStyleWord(true);
        this.englishArea.setMargin(new Insets(10, 10, 10, 10));
        this.englishArea.setBackground(new Color(71,113,165));
        this.englishArea.setForeground(white);

    }

    private void setEnglishPanel() {
        JLabel englishText = new JLabel("ENGLISH TEXT");
        englishText.setHorizontalAlignment(CENTER);
        englishText.setFont(new Font(SERIF, BOLD, 16));
        englishText.setForeground(WHITE);


        JButton clearTextBtn = new JButton("<< Clear Text");
        clearTextBtn.setBackground(new Color(255,193,37));
        clearTextBtn.setForeground(black);

        JButton englishToMorseBtn = new JButton("English >> Morse");
        englishToMorseBtn.setBackground(new Color(255,193,37));
        englishToMorseBtn.setForeground(black);

        englishToMorseBtn.addActionListener((listener) -> {
            String text = this.englishArea.getText().trim();
            this.morseArea.setText(morseCodeTranslator.englishToMorse(text));
        });

        clearTextBtn.addActionListener((listener) -> {
            this.englishArea.setText(null);
        });


        JPanel englishControlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        englishControlPanel.add(clearTextBtn);
        englishControlPanel.add(englishToMorseBtn);
        englishControlPanel.setBackground(black);

        this.englishTextPanel = new JPanel();
        this.englishTextPanel.setLayout(new BorderLayout());
        this.englishTextPanel.add(englishText, BorderLayout.NORTH);
        this.englishTextPanel.setBackground(black);
        this.englishTextPanel.add(new JScrollPane(this.englishArea), BorderLayout.CENTER);
        this.englishTextPanel.add(englishControlPanel, BorderLayout.SOUTH);
    }

    private void setSplitPane() {
        this.splitPane = new JSplitPane(HORIZONTAL_SPLIT, englishTextPanel, morseTextPanel);
        this.splitPane.setBorder(BorderFactory.createLineBorder(BLACK));
        this.splitPane.setBackground(black);

        this.splitPane.setUI(new BasicSplitPaneUI() {
            public BasicSplitPaneDivider createDefaultDivider() {
                return new BasicSplitPaneDivider(this) {
                    public void setBorder(Border b) {
                    }

                    @Override
                    public void paint(Graphics g) {
                        g.setColor(BLACK);
                        g.fillRect(0, 0, getSize().width, getSize().height);
                        super.paint(g);
                    }
                };
            }
        });
        splitPane.setBorder(null);
    }


}
