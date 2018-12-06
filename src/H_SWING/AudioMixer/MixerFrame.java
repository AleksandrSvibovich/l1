package H_SWING.AudioMixer;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Hashtable;

/**
 * Created by Aleksandr_Svibovich on 12/6/2018.
 */
public class MixerFrame extends JFrame {
    Presets[] presets;
    private JLabel jLabBass;
    private JLabel jLabMid;
    private JLabel jLabTre;
    private JLabel jLabBal;
    private JLabel jLabVolume;
    private JLabel jLabInfo;

    private JSlider jSldBass;
    private JSlider jSldMid;
    private JSlider jSldTre;
    private JSlider jSldBal;
    private JSlider jSldVolume;

    private JRadioButton jRBpreset1;
    private JRadioButton jRBpreset2;
    private JRadioButton jRBdefault;

    private JButton jBstore;

    DecimalFormat decimalFormat;

    public MixerFrame() {
        decimalFormat = new DecimalFormat("+#;-#");
        setupPresets();

        setupSliders();

        setupLabels();

        setupRaduoButtons();

        jBstore = new JButton("Store setting");

        setupListenersOnSliders();

        jBstore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRBpreset1.isSelected()) {
                    storePreset(presets[1]);
                } else if (jRBpreset2.isSelected()) {
                    storePreset(presets[2]);
                }
            }
        });

        jRBdefault.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[0]);
            }
        });

        jRBpreset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[1]);
            }
        });

        jRBpreset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadPreset(presets[2]);
            }
        });

        JPanel panel = new JPanel(false);
        panel.add(jLabBass);
        panel.add(jSldBass);
        panel.add(jLabMid);
        panel.add(jSldMid);
        panel.add(jLabTre);
        panel.add(jSldTre);
        panel.add(jLabBal);
        panel.add(jSldBal);
        panel.add(jLabVolume);
        panel.add(jSldVolume);
        panel.add(jRBdefault);
        panel.add(jRBpreset1);
        panel.add(jRBpreset2);
        panel.add(jBstore);
        panel.add(new JLabel(""));
        panel.add(jLabInfo);
        add(panel);

    }

    private void setupListenersOnSliders() {
        ChangeListener listenerChanges = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                showSettings();
            }
        };
        jSldBass.addChangeListener(listenerChanges);
        jSldMid.addChangeListener(listenerChanges);
        ;
        jSldTre.addChangeListener(listenerChanges);
        ;
        jSldBal.addChangeListener(listenerChanges);
        ;
        jSldVolume.addChangeListener(listenerChanges);
        ;
    }

    private void setupSliders() {
        jSldBass = new JSlider(-10, 10);
        jSldMid = new JSlider(-10, 10);
        jSldTre = new JSlider(-10, 10);
        jSldBal = new JSlider(-5, 5, 0);
        jSldVolume = new JSlider(-5, 5);

        jSldBass.setMajorTickSpacing(2);
        jSldMid.setMajorTickSpacing(2);
        jSldTre.setMajorTickSpacing(2);
        jSldBal.setMajorTickSpacing(1);
        jSldVolume.setMajorTickSpacing(1);


        jSldBass.setMinorTickSpacing(1);
        jSldMid.setMinorTickSpacing(1);
        jSldTre.setMinorTickSpacing(1);

        Hashtable table = new Hashtable();
        for (int i = -10; i <= 0; i += 2) {
            table.put(new Integer(i), new JLabel("" + i));
        }
        for (int i = 2; i <= 10; i += 2) {
            table.put(new Integer(i), new JLabel("+" + i));
        }
        jSldBass.setLabelTable(table);
        jSldMid.setLabelTable(table);
        jSldTre.setLabelTable(table);

        Hashtable table2 = new Hashtable();
        table2.put(new Integer(-5), new JLabel("L"));
        table2.put(new Integer(0), new JLabel("C"));
        table2.put(new Integer(5), new JLabel("R"));
        jSldBal.setLabelTable(table2);

        jSldVolume.setLabelTable(jSldVolume.createStandardLabels(1));

        jSldBass.setPaintTicks(true);
        jSldMid.setPaintTicks(true);
        jSldTre.setPaintTicks(true);
        jSldBal.setPaintTicks(true);
        jSldVolume.setPaintTicks(true);

        jSldBass.setPaintLabels(true);
        jSldMid.setPaintLabels(true);
        jSldTre.setPaintLabels(true);
        jSldBal.setPaintLabels(true);
        jSldVolume.setPaintLabels(true);

        jSldBass.setSnapToTicks(true);
        jSldMid.setSnapToTicks(true);
        jSldTre.setSnapToTicks(true);
        jSldBal.setSnapToTicks(true);
        jSldVolume.setSnapToTicks(true);

        Dimension dim = new Dimension(240, 60);
        jSldBass.setPreferredSize(dim);
        jSldMid.setPreferredSize(dim);
        jSldTre.setPreferredSize(dim);
        jSldBal.setPreferredSize(dim);
        jSldVolume.setPreferredSize(dim);

    }

    private void setupLabels() {
        jLabBass = new JLabel("Bass");
        jLabMid = new JLabel("Midrange");
        jLabTre = new JLabel("Treble");
        jLabBal = new JLabel("Balance");
        jLabVolume = new JLabel("Volume");

        Dimension dim = new Dimension(60, 25);

        jLabBass.setPreferredSize(dim);
        jLabMid.setPreferredSize(dim);
        jLabTre.setPreferredSize(dim);
        jLabBal.setPreferredSize(dim);
        jLabVolume.setPreferredSize(dim);

        jLabInfo = new JLabel("");
        jLabInfo.setPreferredSize(new Dimension(110, 100));
        showSettings();
    }

    private void setupRaduoButtons() {
        jRBpreset1 = new JRadioButton("Preset 1");
        jRBpreset2 = new JRadioButton("Preset 2");
        jRBdefault = new JRadioButton("Default");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jRBdefault);
        bg.add(jRBpreset1);
        bg.add(jRBpreset2);

        jRBdefault.setSelected(true);
    }

    private void showSettings() {
        String bal;

        int b = jSldBal.getValue();
        if (b > 0) {
            bal = "Rigth " + " + "+(jSldBal.getValue());
        } else if (b == 0) {
            bal = "Center";
        } else {
            bal = "Left " + (jSldBal.getValue());
        }

        jLabInfo.setText("<html>Treble: " +
                decimalFormat.format(jSldTre.getValue()) +
                "<br>Midrange: " +
                decimalFormat.format(jSldMid.getValue()) +
                "<br>Bass: " +
                decimalFormat.format(jSldBass.getValue()) +
                "<br>Balance: " + bal +
                "<br>Volume: " +
                decimalFormat.format(jSldVolume.getValue())
        );
    }

    private void setupPresets(){
        presets = new Presets[3];
        presets[0] =  new Presets(0,0,0,0,0);
        presets[1] =  new Presets(4,-2,7,6,4);
        presets[2] =  new Presets(5,3,-2,1,7);
    }

    private void storePreset(Presets info){
        info.vol = jSldVolume.getValue();
        info.bal = jSldBal.getValue();
        info.mid = jSldMid.getValue();
        info.tre = jSldTre.getValue();
        info.bas = jSldBass.getValue();
    }

    private void loadPreset(Presets info){
        jSldBal.setValue(info.bal);
        jSldVolume.setValue(info.vol);
        jSldMid.setValue(info.mid);
        jSldTre.setValue(info.tre);
        jSldBass.setValue(info.bas);
    }
}

