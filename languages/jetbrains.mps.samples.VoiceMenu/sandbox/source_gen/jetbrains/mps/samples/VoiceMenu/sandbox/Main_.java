package jetbrains.mps.samples.VoiceMenu.sandbox;

/*Generated by MPS */

import java.awt.event.ActionListener;
import JavaVoiceMenu.runtime.Event;
import java.util.ArrayList;
import JavaVoiceMenu.runtime.Variables;
import JavaVoiceMenu.runtime.Behaviour;
import JavaVoiceMenu.runtime.Style;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import JavaVoiceMenu.runtime.Data;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Main_ implements ActionListener {


  public static Main_ instance;

  public static void initHashMap() {

    Event Home = new Event("Sample", "0");
    Home.setAction("");
    Home.setGreeting("Welcome to the Sample Menu");
    Home.childs = new ArrayList<Event>();
    Variables.main_Text = "Sample";
    Variables.myHashMap.put("0", Home);


    Event Sample_Activity_kf1bs5_a0 = new Event("Sample Activity", "1");
    Sample_Activity_kf1bs5_a0.setAction("");
    Sample_Activity_kf1bs5_a0.setGreeting("");
    Sample_Activity_kf1bs5_a0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + Sample_Activity_kf1bs5_a0.trigger;
    Variables.myHashMap.put(Variables.path, Sample_Activity_kf1bs5_a0);
    Sample_Activity_kf1bs5_a0.setAction("getInfo");
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    Sample_Activity_kf1bs5_a0.childs = new ArrayList<Event>();
    Event Luka_kf1bs5_b0 = new Event("Luka", "0");
    Luka_kf1bs5_b0.setAction("");
    Luka_kf1bs5_b0.setGreeting("");
    Luka_kf1bs5_b0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + Luka_kf1bs5_b0.trigger;
    Variables.myHashMap.put(Variables.path, Luka_kf1bs5_b0);
    Luka_kf1bs5_b0.setAction("back");
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    Luka_kf1bs5_b0.childs = new ArrayList<Event>();
    Event Lukajda_kf1bs5_c0 = new Event("Lukajda", "4");
    Lukajda_kf1bs5_c0.setAction("");
    Lukajda_kf1bs5_c0.setGreeting("");
    Lukajda_kf1bs5_c0.setGreeting("ahoja");
    Lukajda_kf1bs5_c0.childs = new ArrayList<Event>();
    Variables.path = Variables.path + Lukajda_kf1bs5_c0.trigger;
    Variables.myHashMap.put(Variables.path, Lukajda_kf1bs5_c0);
    Lukajda_kf1bs5_c0.setAction("getInfo");
    Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
    Lukajda_kf1bs5_c0.childs = new ArrayList<Event>();

    Home.childs.add(Sample_Activity_kf1bs5_a0);
    Home.childs.add(Luka_kf1bs5_b0);
    Home.childs.add(Lukajda_kf1bs5_c0);
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main_();
    Main_.initHashMap();
    initView();
    Behaviour.runInitSetup();
  }

  public static void initView() {
    Style.setContent();
    addButtons(Style.myPanelOfButtons);
    Style.myPhone.add(Style.myPanelOfButtons, BorderLayout.SOUTH);
    Style.setFrame();
  }

  public static void addButtons(JPanel myPanelOfButtons) {
    for (Data.Status item : Data.Status.values()) {
      JButton button = new JButton(item.getCode());
      button.setActionCommand(item.getCode());
      button.addActionListener(instance);
      button.setPreferredSize(new Dimension(78, 76));
      Border border = new LineBorder(Color.white, 13);
      button.setBorder(border);
      myPanelOfButtons.add(button);
    }
  }
  @Override
  public void actionPerformed(ActionEvent event) {
    if (!(((Variables.path == null || Variables.path.length() == 0) || Variables.finished == true || Variables.started == false))) {
      try {
        Behaviour.runLogic(event);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
