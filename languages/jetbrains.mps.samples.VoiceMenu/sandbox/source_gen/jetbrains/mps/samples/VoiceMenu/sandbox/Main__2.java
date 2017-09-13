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

public class Main__2 implements ActionListener {


  public static Main__2 instance;

  public static void initHashMap() {

    Event Home = new Event("JetBrains2", "0");
    Home.setAction("", true);
    Home.setGreeting("Welcome to " + "JetBrains2");

    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "JetBrains2";

    Variables.myHashMap.put("0", Home);


    Event Sales_lbjr72_a0 = new Event("Sales", "1");
    Sales_lbjr72_a0.isFinal = false;
    Sales_lbjr72_a0.setAction("", false);
    Sales_lbjr72_a0.setGreeting("");
    Sales_lbjr72_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Sales_lbjr72_a0);
    Event Call_department_lbjr72_a0a0 = new Event("Call department", "1");
    Call_department_lbjr72_a0a0.isFinal = false;
    Call_department_lbjr72_a0a0.setAction("", false);
    Call_department_lbjr72_a0a0.setGreeting("");
    Call_department_lbjr72_a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011", Call_department_lbjr72_a0a0);
    Call_department_lbjr72_a0a0.setAction("call", true);
    Call_department_lbjr72_a0a0.childs = new ArrayList<Event>();
    Event Get_Informations_lbjr72_b0a0 = new Event("Get Informations", "2");
    Get_Informations_lbjr72_b0a0.isFinal = false;
    Get_Informations_lbjr72_b0a0.setAction("", false);
    Get_Informations_lbjr72_b0a0.setGreeting("");
    Get_Informations_lbjr72_b0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("012", Get_Informations_lbjr72_b0a0);
    Get_Informations_lbjr72_b0a0.setAction("getInfo", false);
    Get_Informations_lbjr72_b0a0.childs = new ArrayList<Event>();
    Event Previous_Menu_lbjr72_c0a0 = new Event("Previous Menu", "#");
    Previous_Menu_lbjr72_c0a0.isFinal = false;
    Previous_Menu_lbjr72_c0a0.setAction("", false);
    Previous_Menu_lbjr72_c0a0.setGreeting("");
    Previous_Menu_lbjr72_c0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01#", Previous_Menu_lbjr72_c0a0);
    Previous_Menu_lbjr72_c0a0.setAction("back", false);
    Previous_Menu_lbjr72_c0a0.childs = new ArrayList<Event>();
    Sales_lbjr72_a0.childs = new ArrayList<Event>();
    Sales_lbjr72_a0.childs.add(Call_department_lbjr72_a0a0);
    Sales_lbjr72_a0.childs.add(Get_Informations_lbjr72_b0a0);
    Sales_lbjr72_a0.childs.add(Previous_Menu_lbjr72_c0a0);
    Event General_Questions_lbjr72_b0 = new Event("General Questions", "2");
    General_Questions_lbjr72_b0.isFinal = false;
    General_Questions_lbjr72_b0.setAction("", false);
    General_Questions_lbjr72_b0.setGreeting("");
    General_Questions_lbjr72_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", General_Questions_lbjr72_b0);
    Event Leave_a_message_lbjr72_a0b0 = new Event("Leave a message", "1");
    Leave_a_message_lbjr72_a0b0.isFinal = false;
    Leave_a_message_lbjr72_a0b0.setAction("", false);
    Leave_a_message_lbjr72_a0b0.setGreeting("");
    Leave_a_message_lbjr72_a0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("021", Leave_a_message_lbjr72_a0b0);
    Leave_a_message_lbjr72_a0b0.setAction("record", true);
    Leave_a_message_lbjr72_a0b0.childs = new ArrayList<Event>();
    Event MPS_Support_lbjr72_b0b0 = new Event("MPS Support", "2");
    MPS_Support_lbjr72_b0b0.isFinal = false;
    MPS_Support_lbjr72_b0b0.setAction("", false);
    MPS_Support_lbjr72_b0b0.setGreeting("");
    MPS_Support_lbjr72_b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022", MPS_Support_lbjr72_b0b0);
    Event Direct_Call_lbjr72_a0b0b0 = new Event("Direct Call", "1");
    Direct_Call_lbjr72_a0b0b0.isFinal = false;
    Direct_Call_lbjr72_a0b0b0.setAction("", false);
    Direct_Call_lbjr72_a0b0b0.setGreeting("");
    Direct_Call_lbjr72_a0b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0221", Direct_Call_lbjr72_a0b0b0);
    Direct_Call_lbjr72_a0b0b0.setAction("call", true);
    Direct_Call_lbjr72_a0b0b0.childs = new ArrayList<Event>();
    Event Get_Info_lbjr72_b0b0b0 = new Event("Get Info", "2");
    Get_Info_lbjr72_b0b0b0.isFinal = false;
    Get_Info_lbjr72_b0b0b0.setAction("", false);
    Get_Info_lbjr72_b0b0b0.setGreeting("");
    Get_Info_lbjr72_b0b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0222", Get_Info_lbjr72_b0b0b0);
    Get_Info_lbjr72_b0b0b0.setAction("getInfo", false);
    Get_Info_lbjr72_b0b0b0.childs = new ArrayList<Event>();
    Event Previous_Menu_lbjr72_c0b0b0 = new Event("Previous Menu", "#");
    Previous_Menu_lbjr72_c0b0b0.isFinal = false;
    Previous_Menu_lbjr72_c0b0b0.setAction("", false);
    Previous_Menu_lbjr72_c0b0b0.setGreeting("");
    Previous_Menu_lbjr72_c0b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022#", Previous_Menu_lbjr72_c0b0b0);
    Previous_Menu_lbjr72_c0b0b0.setAction("back", false);
    Previous_Menu_lbjr72_c0b0b0.childs = new ArrayList<Event>();
    MPS_Support_lbjr72_b0b0.childs = new ArrayList<Event>();
    MPS_Support_lbjr72_b0b0.childs.add(Direct_Call_lbjr72_a0b0b0);
    MPS_Support_lbjr72_b0b0.childs.add(Get_Info_lbjr72_b0b0b0);
    MPS_Support_lbjr72_b0b0.childs.add(Previous_Menu_lbjr72_c0b0b0);
    Event Previous_Menu_lbjr72_c0b0 = new Event("Previous Menu", "#");
    Previous_Menu_lbjr72_c0b0.isFinal = false;
    Previous_Menu_lbjr72_c0b0.setAction("", false);
    Previous_Menu_lbjr72_c0b0.setGreeting("");
    Previous_Menu_lbjr72_c0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02#", Previous_Menu_lbjr72_c0b0);
    Previous_Menu_lbjr72_c0b0.setAction("back", false);
    Previous_Menu_lbjr72_c0b0.childs = new ArrayList<Event>();
    General_Questions_lbjr72_b0.childs = new ArrayList<Event>();
    General_Questions_lbjr72_b0.childs.add(Leave_a_message_lbjr72_a0b0);
    General_Questions_lbjr72_b0.childs.add(MPS_Support_lbjr72_b0b0);
    General_Questions_lbjr72_b0.childs.add(Previous_Menu_lbjr72_c0b0);

    Home.childs.add(Sales_lbjr72_a0);
    Home.childs.add(General_Questions_lbjr72_b0);

    Variables.timeout = new Event("timeout", "X");
    Variables.timeout.playback = "";
    Variables.timeout.action = "getInfo";
    Variables.timeout.isFinal = false;
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main__2();
    Main__2.initHashMap();
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
