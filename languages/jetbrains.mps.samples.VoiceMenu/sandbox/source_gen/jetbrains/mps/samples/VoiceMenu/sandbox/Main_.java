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

    Event Home = new Event("Jet-Mobile", "0");
    Home.setAction("", true);
    Home.setGreeting("Welcome to " + "Jet-Mobile");

    Home.setGreeting("Hello, welcome in Jet-Mobile");
    Home.childs = new ArrayList<Event>();
    Home.isFinal = false;
    Variables.main_Text = "Jet-Mobile";

    Variables.myHashMap.put("0", Home);


    Event Internet_m25aj_a0 = new Event("Internet", "1");
    Internet_m25aj_a0.isFinal = false;
    Internet_m25aj_a0.setAction("", false);
    Internet_m25aj_a0.setGreeting("");
    Internet_m25aj_a0.playback = "Did you know that our internet is faster than ever?";
    Internet_m25aj_a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01", Internet_m25aj_a0);
    Event Discount_m25aj_a0a0 = new Event("Discount", "1");
    Discount_m25aj_a0a0.isFinal = false;
    Discount_m25aj_a0a0.setAction("", false);
    Discount_m25aj_a0a0.setGreeting("");
    Discount_m25aj_a0a0.playback = "Welcome in section of discounts, here is everything cheaper.";
    Discount_m25aj_a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011", Discount_m25aj_a0a0);
    Event Summer_discount_m25aj_a0a0a0 = new Event("Summer discount", "1");
    Summer_discount_m25aj_a0a0a0.isFinal = false;
    Summer_discount_m25aj_a0a0a0.setAction("", false);
    Summer_discount_m25aj_a0a0a0.setGreeting("");
    Summer_discount_m25aj_a0a0a0.playback = "Don't worry, while waiting you will listen your calm music.";
    Summer_discount_m25aj_a0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0111", Summer_discount_m25aj_a0a0a0);
    Summer_discount_m25aj_a0a0a0.setAction("call", false);
    Summer_discount_m25aj_a0a0a0.childs = new ArrayList<Event>();
    Event Hidden_discounts_m25aj_b0a0a0 = new Event("Hidden discounts", "2");
    Hidden_discounts_m25aj_b0a0a0.isFinal = false;
    Hidden_discounts_m25aj_b0a0a0.setAction("", false);
    Hidden_discounts_m25aj_b0a0a0.setGreeting("");
    Hidden_discounts_m25aj_b0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("0112", Hidden_discounts_m25aj_b0a0a0);
    Hidden_discounts_m25aj_b0a0a0.setAction("getInfo", false);
    Hidden_discounts_m25aj_b0a0a0.childs = new ArrayList<Event>();
    Event Step_back_m25aj_c0a0a0 = new Event("Step back", "*");
    Step_back_m25aj_c0a0a0.isFinal = false;
    Step_back_m25aj_c0a0a0.setAction("", false);
    Step_back_m25aj_c0a0a0.setGreeting("");
    Step_back_m25aj_c0a0a0.playback = "Going back to the previous menu.";
    Step_back_m25aj_c0a0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("011*", Step_back_m25aj_c0a0a0);
    Step_back_m25aj_c0a0a0.setAction("back", false);
    Step_back_m25aj_c0a0a0.childs = new ArrayList<Event>();
    Discount_m25aj_a0a0.childs = new ArrayList<Event>();
    Discount_m25aj_a0a0.childs.add(Summer_discount_m25aj_a0a0a0);
    Discount_m25aj_a0a0.childs.add(Hidden_discounts_m25aj_b0a0a0);
    Discount_m25aj_a0a0.childs.add(Step_back_m25aj_c0a0a0);
    Event Data_limit_m25aj_b0a0 = new Event("Data limit", "2");
    Data_limit_m25aj_b0a0.isFinal = false;
    Data_limit_m25aj_b0a0.setAction("", false);
    Data_limit_m25aj_b0a0.setGreeting("");
    Data_limit_m25aj_b0a0.playback = "Take care this call will be monitored.";
    Data_limit_m25aj_b0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("012", Data_limit_m25aj_b0a0);
    Data_limit_m25aj_b0a0.setAction("call", false);
    Data_limit_m25aj_b0a0.childs = new ArrayList<Event>();
    Event Return_to_main_menu_m25aj_c0a0 = new Event("Return to main menu", "*");
    Return_to_main_menu_m25aj_c0a0.isFinal = false;
    Return_to_main_menu_m25aj_c0a0.setAction("", false);
    Return_to_main_menu_m25aj_c0a0.setGreeting("");
    Return_to_main_menu_m25aj_c0a0.playback = "Going back to the previous menu.";
    Return_to_main_menu_m25aj_c0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("01*", Return_to_main_menu_m25aj_c0a0);
    Return_to_main_menu_m25aj_c0a0.setAction("back", false);
    Return_to_main_menu_m25aj_c0a0.childs = new ArrayList<Event>();
    Event Exit_m25aj_d0a0 = new Event("Exit", "3");
    Exit_m25aj_d0a0.isFinal = false;
    Exit_m25aj_d0a0.setAction("", false);
    Exit_m25aj_d0a0.setGreeting("");
    Exit_m25aj_d0a0.playback = "We are sorry, that you are leaving this menu. Looking forward to hear you again. Goodbye.";
    Exit_m25aj_d0a0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("013", Exit_m25aj_d0a0);
    Exit_m25aj_d0a0.setAction("hangUp", true);
    Exit_m25aj_d0a0.childs = new ArrayList<Event>();
    Internet_m25aj_a0.childs = new ArrayList<Event>();
    Internet_m25aj_a0.childs.add(Discount_m25aj_a0a0);
    Internet_m25aj_a0.childs.add(Data_limit_m25aj_b0a0);
    Internet_m25aj_a0.childs.add(Return_to_main_menu_m25aj_c0a0);
    Internet_m25aj_a0.childs.add(Exit_m25aj_d0a0);
    Event Payment_m25aj_b0 = new Event("Payment", "2");
    Payment_m25aj_b0.isFinal = false;
    Payment_m25aj_b0.setAction("", false);
    Payment_m25aj_b0.setGreeting("");
    Payment_m25aj_b0.playback = "Since now we offer you easiest way of payment.";
    Payment_m25aj_b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02", Payment_m25aj_b0);
    Event Billing_m25aj_a0b0 = new Event("Billing", "1");
    Billing_m25aj_a0b0.isFinal = false;
    Billing_m25aj_a0b0.setAction("", false);
    Billing_m25aj_a0b0.setGreeting("");
    Billing_m25aj_a0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("021", Billing_m25aj_a0b0);
    Billing_m25aj_a0b0.setAction("other", false);
    Billing_m25aj_a0b0.childs = new ArrayList<Event>();
    Event Recharging_m25aj_b0b0 = new Event("Recharging", "2");
    Recharging_m25aj_b0b0.isFinal = false;
    Recharging_m25aj_b0b0.setAction("", false);
    Recharging_m25aj_b0b0.setGreeting("");
    Recharging_m25aj_b0b0.playback = "Now we are sending you super secret informations.";
    Recharging_m25aj_b0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("022", Recharging_m25aj_b0b0);
    Recharging_m25aj_b0b0.setAction("getInfo", false);
    Recharging_m25aj_b0b0.childs = new ArrayList<Event>();
    Event Payments_m25aj_c0b0 = new Event("Payments", "3");
    Payments_m25aj_c0b0.isFinal = false;
    Payments_m25aj_c0b0.setAction("", false);
    Payments_m25aj_c0b0.setGreeting("");
    Payments_m25aj_c0b0.playback = "Connecting you with a human.";
    Payments_m25aj_c0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("023", Payments_m25aj_c0b0);
    Payments_m25aj_c0b0.setAction("call", false);
    Payments_m25aj_c0b0.childs = new ArrayList<Event>();
    Event Step_back_m25aj_d0b0 = new Event("Step back", "*");
    Step_back_m25aj_d0b0.isFinal = false;
    Step_back_m25aj_d0b0.setAction("", false);
    Step_back_m25aj_d0b0.setGreeting("");
    Step_back_m25aj_d0b0.playback = "Going back to the previous menu.";
    Step_back_m25aj_d0b0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("02*", Step_back_m25aj_d0b0);
    Step_back_m25aj_d0b0.setAction("back", false);
    Step_back_m25aj_d0b0.childs = new ArrayList<Event>();
    Payment_m25aj_b0.childs = new ArrayList<Event>();
    Payment_m25aj_b0.childs.add(Billing_m25aj_a0b0);
    Payment_m25aj_b0.childs.add(Recharging_m25aj_b0b0);
    Payment_m25aj_b0.childs.add(Payments_m25aj_c0b0);
    Payment_m25aj_b0.childs.add(Step_back_m25aj_d0b0);
    Event Roaming_m25aj_c0 = new Event("Roaming", "3");
    Roaming_m25aj_c0.isFinal = false;
    Roaming_m25aj_c0.setAction("", false);
    Roaming_m25aj_c0.setGreeting("");
    Roaming_m25aj_c0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("03", Roaming_m25aj_c0);
    Roaming_m25aj_c0.setAction("getInfo", true);
    Roaming_m25aj_c0.childs = new ArrayList<Event>();
    Event News_m25aj_d0 = new Event("News", "4");
    News_m25aj_d0.isFinal = false;
    News_m25aj_d0.setAction("", false);
    News_m25aj_d0.setGreeting("");
    News_m25aj_d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("04", News_m25aj_d0);
    Event Summer_News_m25aj_a0d0 = new Event("Summer News", "1");
    Summer_News_m25aj_a0d0.isFinal = false;
    Summer_News_m25aj_a0d0.setAction("", false);
    Summer_News_m25aj_a0d0.setGreeting("");
    Summer_News_m25aj_a0d0.playback = "Direct call has begun";
    Summer_News_m25aj_a0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("041", Summer_News_m25aj_a0d0);
    Summer_News_m25aj_a0d0.setAction("call", false);
    Summer_News_m25aj_a0d0.childs = new ArrayList<Event>();
    Event Cold_News_m25aj_b0d0 = new Event("Cold News", "2");
    Cold_News_m25aj_b0d0.isFinal = false;
    Cold_News_m25aj_b0d0.setAction("", false);
    Cold_News_m25aj_b0d0.setGreeting("");
    Cold_News_m25aj_b0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("042", Cold_News_m25aj_b0d0);
    Cold_News_m25aj_b0d0.setAction("getInfo", false);
    Cold_News_m25aj_b0d0.childs = new ArrayList<Event>();
    Event Step_Back_m25aj_c0d0 = new Event("Step Back", "3");
    Step_Back_m25aj_c0d0.isFinal = false;
    Step_Back_m25aj_c0d0.setAction("", false);
    Step_Back_m25aj_c0d0.setGreeting("");
    Step_Back_m25aj_c0d0.playback = "Going back to the previous menu.";
    Step_Back_m25aj_c0d0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("043", Step_Back_m25aj_c0d0);
    Step_Back_m25aj_c0d0.setAction("back", false);
    Step_Back_m25aj_c0d0.childs = new ArrayList<Event>();
    News_m25aj_d0.childs = new ArrayList<Event>();
    News_m25aj_d0.childs.add(Summer_News_m25aj_a0d0);
    News_m25aj_d0.childs.add(Cold_News_m25aj_b0d0);
    News_m25aj_d0.childs.add(Step_Back_m25aj_c0d0);
    Event Other_requirements_m25aj_e0 = new Event("Other requirements", "5");
    Other_requirements_m25aj_e0.isFinal = false;
    Other_requirements_m25aj_e0.setAction("", false);
    Other_requirements_m25aj_e0.setGreeting("");
    Other_requirements_m25aj_e0.playback = "You just entered section of special services. Good Luck";
    Other_requirements_m25aj_e0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("05", Other_requirements_m25aj_e0);
    Other_requirements_m25aj_e0.setAction("other", true);
    Other_requirements_m25aj_e0.childs = new ArrayList<Event>();
    Event Record_m25aj_f0 = new Event("Record", "6");
    Record_m25aj_f0.isFinal = false;
    Record_m25aj_f0.setAction("", false);
    Record_m25aj_f0.setGreeting("");
    Record_m25aj_f0.childs = new ArrayList<Event>();
    Variables.myHashMap.put("06", Record_m25aj_f0);
    Record_m25aj_f0.setAction("record", true);
    Record_m25aj_f0.childs = new ArrayList<Event>();

    Home.childs.add(Internet_m25aj_a0);
    Home.childs.add(Payment_m25aj_b0);
    Home.childs.add(Roaming_m25aj_c0);
    Home.childs.add(News_m25aj_d0);
    Home.childs.add(Other_requirements_m25aj_e0);
    Home.childs.add(Record_m25aj_f0);

    Variables.timeout = new Event("timeout", "X");
    Variables.timeout.playback = "";
    Variables.timeout.action = "replay";
    Variables.timeout.isFinal = false;
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
