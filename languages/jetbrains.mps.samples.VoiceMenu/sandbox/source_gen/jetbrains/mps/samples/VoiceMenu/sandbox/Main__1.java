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

    Event Home = new Event("Test160", "0", 8);
    Home.setAction("", true);
    Home.setGreeting("rrr/Users/jetbrains/Documents/sample.wav");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "Test160";

    Variables.myHashMap.put("0", Home);


    Event Get_Info_2032os_a0 = new Event("Get Info", "1", 16);
    Get_Info_2032os_a0.isFinal = false;
    Get_Info_2032os_a0.setAction("", false);
    Get_Info_2032os_a0.setGreeting("");
    Get_Info_2032os_a0.playback = "/Users/jetbrains/Documents/Get.wav";
    Get_Info_2032os_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Get_Info_2032os_a0);
    Get_Info_2032os_a0.setAction("getInfo", false);
    Get_Info_2032os_a0.childs = new ArrayList<Event>();
    Event Menu_2032os_b0 = new Event("Menu", "2", 16);
    Menu_2032os_b0.isFinal = false;
    Menu_2032os_b0.setAction("", false);
    Menu_2032os_b0.setGreeting("");
    Menu_2032os_b0.playback = "/Users/jetbrains/Documents/menu1.wav";
    Menu_2032os_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", Menu_2032os_b0);
    Event HANGUP_2032os_a0b0 = new Event("HANGUP", "1", 16);
    HANGUP_2032os_a0b0.isFinal = false;
    HANGUP_2032os_a0b0.setAction("", false);
    HANGUP_2032os_a0b0.setGreeting("");
    HANGUP_2032os_a0b0.playback = "Hang up";
    HANGUP_2032os_a0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("021", HANGUP_2032os_a0b0);
    HANGUP_2032os_a0b0.setAction("hangUp", true);
    HANGUP_2032os_a0b0.childs = new ArrayList<Event>();
    Event GetInfo_2032os_b0b0 = new Event("GetInfo", "2", 16);
    GetInfo_2032os_b0b0.isFinal = false;
    GetInfo_2032os_b0b0.setAction("", false);
    GetInfo_2032os_b0b0.setGreeting("");
    GetInfo_2032os_b0b0.playback = "get Info";
    GetInfo_2032os_b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022", GetInfo_2032os_b0b0);
    GetInfo_2032os_b0b0.setAction("record", true);
    GetInfo_2032os_b0b0.childs = new ArrayList<Event>();
    Menu_2032os_b0.childs = new ArrayList<Event>();
    Menu_2032os_b0.childs.add(HANGUP_2032os_a0b0);
    Menu_2032os_b0.childs.add(GetInfo_2032os_b0b0);

    Home.childs.add(Get_Info_2032os_a0);
    Home.childs.add(Menu_2032os_b0);
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
