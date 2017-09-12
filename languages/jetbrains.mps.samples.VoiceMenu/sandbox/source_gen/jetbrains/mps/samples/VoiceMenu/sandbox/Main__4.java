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

public class Main__4 implements ActionListener {


  public static Main__4 instance;

  public static void initHashMap() {

    Event Home = new Event("JetBrains", "0", 8);
    Home.setAction("", true);
    Home.setGreeting("");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "JetBrains";

    Variables.myHashMap.put("0", Home);


    Event Sales_9upjpn_a0 = new Event("Sales", "1", 16);
    Sales_9upjpn_a0.isFinal = false;
    Sales_9upjpn_a0.setAction("", false);
    Sales_9upjpn_a0.setGreeting("");
    Sales_9upjpn_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Sales_9upjpn_a0);
    Sales_9upjpn_a0.setAction("call", true);
    Sales_9upjpn_a0.childs = new ArrayList<Event>();
    Event NetSuite_9upjpn_b0 = new Event("NetSuite", "2", 16);
    NetSuite_9upjpn_b0.isFinal = false;
    NetSuite_9upjpn_b0.setAction("", false);
    NetSuite_9upjpn_b0.setGreeting("");
    NetSuite_9upjpn_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", NetSuite_9upjpn_b0);
    Event Call_Martina_9upjpn_a0b0 = new Event("Call Martina", "1", 16);
    Call_Martina_9upjpn_a0b0.isFinal = false;
    Call_Martina_9upjpn_a0b0.setAction("", false);
    Call_Martina_9upjpn_a0b0.setGreeting("");
    Call_Martina_9upjpn_a0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("021", Call_Martina_9upjpn_a0b0);
    Call_Martina_9upjpn_a0b0.setAction("call", true);
    Call_Martina_9upjpn_a0b0.childs = new ArrayList<Event>();
    Event Call_Oscar_9upjpn_b0b0 = new Event("Call Oscar", "2", 16);
    Call_Oscar_9upjpn_b0b0.isFinal = false;
    Call_Oscar_9upjpn_b0b0.setAction("", false);
    Call_Oscar_9upjpn_b0b0.setGreeting("");
    Call_Oscar_9upjpn_b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022", Call_Oscar_9upjpn_b0b0);
    Call_Oscar_9upjpn_b0b0.setAction("call", true);
    Call_Oscar_9upjpn_b0b0.childs = new ArrayList<Event>();
    Event Go_back_9upjpn_c0b0 = new Event("Go back", "3", 16);
    Go_back_9upjpn_c0b0.isFinal = false;
    Go_back_9upjpn_c0b0.setAction("", false);
    Go_back_9upjpn_c0b0.setGreeting("");
    Go_back_9upjpn_c0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("023", Go_back_9upjpn_c0b0);
    Go_back_9upjpn_c0b0.setAction("back", false);
    Go_back_9upjpn_c0b0.childs = new ArrayList<Event>();
    NetSuite_9upjpn_b0.childs = new ArrayList<Event>();
    NetSuite_9upjpn_b0.childs.add(Call_Martina_9upjpn_a0b0);
    NetSuite_9upjpn_b0.childs.add(Call_Oscar_9upjpn_b0b0);
    NetSuite_9upjpn_b0.childs.add(Go_back_9upjpn_c0b0);

    Home.childs.add(Sales_9upjpn_a0);
    Home.childs.add(NetSuite_9upjpn_b0);
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main__4();
    Main__4.initHashMap();
    initView();
    Behaviour.runInitSetup();
    (Variables.timerThr = new Thread(new Behaviour.myTimer(null, true, 13))).start();

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
        if (Variables.timerThr.isAlive()) {
          Variables.timerThr.interrupt();
        }
        Behaviour.runLogic(event, false);

      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
