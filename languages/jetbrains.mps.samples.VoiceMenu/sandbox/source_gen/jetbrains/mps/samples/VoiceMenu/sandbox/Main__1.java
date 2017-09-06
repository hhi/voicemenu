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

public class Main__1 implements ActionListener {


  public static Main__1 instance;

  public static void initHashMap() {

    Event Home = new Event("Test", "0", 8);
    Home.setAction("", true);
    Home.setGreeting("" + ", ");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "Test";

    Variables.myHashMap.put("0", Home);


    Event Technical_issues_rwbd_a0 = new Event("Technical issues", "1", 16);
    Technical_issues_rwbd_a0.isFinal = false;
    Technical_issues_rwbd_a0.setAction("", false);
    Technical_issues_rwbd_a0.setGreeting("");
    Technical_issues_rwbd_a0.duration = 5;
    Technical_issues_rwbd_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Technical_issues_rwbd_a0);
    Event timeout_rwbd_c0a0 = new Event("timeout", "X", 16);
    timeout_rwbd_c0a0.isFinal = false;
    timeout_rwbd_c0a0.setAction("", false);
    timeout_rwbd_c0a0.setGreeting("");
    timeout_rwbd_c0a0.setGreeting("TIMEOUT CHANGED");
    timeout_rwbd_c0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01X", timeout_rwbd_c0a0);
    timeout_rwbd_c0a0.setAction("repeat", false);
    timeout_rwbd_c0a0.childs = new ArrayList<Event>();
    Event GetInfo_rwbd_a0a0 = new Event("GetInfo", "1", 16);
    GetInfo_rwbd_a0a0.isFinal = false;
    GetInfo_rwbd_a0a0.setAction("", false);
    GetInfo_rwbd_a0a0.setGreeting("");
    GetInfo_rwbd_a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011", GetInfo_rwbd_a0a0);
    GetInfo_rwbd_a0a0.setAction("getInfo", false);
    GetInfo_rwbd_a0a0.childs = new ArrayList<Event>();
    Event DirectCall_rwbd_b0a0 = new Event("DirectCall", "2", 16);
    DirectCall_rwbd_b0a0.isFinal = false;
    DirectCall_rwbd_b0a0.setAction("", false);
    DirectCall_rwbd_b0a0.setGreeting("");
    DirectCall_rwbd_b0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("012", DirectCall_rwbd_b0a0);
    DirectCall_rwbd_b0a0.setAction("call", true);
    DirectCall_rwbd_b0a0.childs = new ArrayList<Event>();
    Technical_issues_rwbd_a0.childs = new ArrayList<Event>();
    Technical_issues_rwbd_a0.childs.add(GetInfo_rwbd_a0a0);
    Technical_issues_rwbd_a0.childs.add(DirectCall_rwbd_b0a0);
    Event record_rwbd_b0 = new Event("record", "2", 16);
    record_rwbd_b0.isFinal = false;
    record_rwbd_b0.setAction("", false);
    record_rwbd_b0.setGreeting("");
    record_rwbd_b0.setGreeting("Leave us a message");
    record_rwbd_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", record_rwbd_b0);
    record_rwbd_b0.setAction("record", true);
    record_rwbd_b0.childs = new ArrayList<Event>();
    Event timeout_rwbd_d0 = new Event("timeout", "X", 16);
    timeout_rwbd_d0.isFinal = false;
    timeout_rwbd_d0.setAction("", false);
    timeout_rwbd_d0.setGreeting("");
    timeout_rwbd_d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0X", timeout_rwbd_d0);
    timeout_rwbd_d0.setAction("getInfo", true);
    timeout_rwbd_d0.childs = new ArrayList<Event>();
    Event Technical_issues_rwbd_a0_0 = new Event("Technical issues", "1", 16);
    Technical_issues_rwbd_a0_0.isFinal = false;
    Technical_issues_rwbd_a0_0.setAction("", false);
    Technical_issues_rwbd_a0_0.setGreeting("");
    Technical_issues_rwbd_a0_0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Technical_issues_rwbd_a0_0);
    Technical_issues_rwbd_a0_0.childs = new ArrayList<Event>();

    Home.childs.add(Technical_issues_rwbd_a0);
    Home.childs.add(record_rwbd_b0);
    Home.childs.add();
  }

  public static void main(String[] args) {
    initHashMap();
    instance = new Main__1();
    Main__1.initHashMap();
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
