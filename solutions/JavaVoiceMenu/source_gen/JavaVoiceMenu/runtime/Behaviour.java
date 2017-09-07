package JavaVoiceMenu.runtime;

/*Generated by MPS */

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Behaviour {
  public static class myTimer implements Runnable {
    public static ActionEvent evt;
    /*package*/ int duration;
    public static boolean loadEvnt;
    /*package*/ String action = "";

    public myTimer(ActionEvent EVNT, boolean RPT, int drtn) {
      evt = EVNT;
      loadEvnt = RPT;
      duration = drtn;
    }
    public void run() {
      try {
        action = "";
        TimeUnit.SECONDS.sleep(duration);
        if (neq_d7l93i_a0c0a0g0(Variables.path.charAt(Variables.path.length() - 1), 'X')) {
          Variables.path += "X";
        } else {
          action = Variables.myHashMap.get(Variables.path).action;
          if (eq_d7l93i_a0b0a2a0a6a(action, "")) {
            // Activity is menu, so we have to nest into it 
            Variables.path += "X";
          }
        }
        System.out.println("TIMER path:" + Variables.path);
        if (Variables.timerThr.isAlive()) {
          Variables.timerThr.interrupt();
        }
        Behaviour.runLogic(evt, true);
      } catch (Exception e) {
        if (eq_d7l93i_a0a0a0a6a(Variables.path.charAt(Variables.path.length() - 1), 'X')) {
          Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
        }
        System.out.println("repeat interrupted");
      }
    }
    private static boolean neq_d7l93i_a0c0a0g0(Object a, Object b) {
      return !(((a != null ? a.equals(b) : a == b)));
    }
    private static boolean eq_d7l93i_a0b0a2a0a6a(Object a, Object b) {
      return (a != null ? a.equals(b) : a == b);
    }
    private static boolean eq_d7l93i_a0a0a0a6a(Object a, Object b) {
      return (a != null ? a.equals(b) : a == b);
    }
  }
  public static void runLogic(ActionEvent evt, boolean repeat) throws IOException {
    Variables.voice.stop();
    // Initilization of voice output 
    Boolean wrongButtonPressed = false;
    // Variable to store which character was pressed 
    if (!(repeat)) {
      String character = evt.getActionCommand();
      if (!(Variables.possibleOptList.contains(character))) {
        String charToRead;
        if (character == "*") {
          charToRead = "star ";
        } else if (character == "#") {
          charToRead = "hash";
        } else {
          charToRead = character;
        }

        Variables.voice.addText(charToRead + "is a bad option. please try again");
        wrongButtonPressed = true;
      } else {
        Variables.path = Variables.path + character;
      }



    }
    // Checking if correct option was pressed. If so Variables.path is updated 


    System.out.println(Variables.path);
    // Loading next Event according to what is specified in "Variables.path" 
    Event currentEvent = Variables.myHashMap.get(Variables.path);
    // Checking if "back" option was selected via name of the current event 
    System.out.println(currentEvent.action);
    if (!(isEmptyString(currentEvent.action))) {
      System.out.println(currentEvent.action);
      if (currentEvent.action.equals("back")) {
        // updating Variables.path to get back 
        Variables.voice.addText("Going to the previous menu");
        Variables.path = Variables.path.substring(0, Variables.path.length() - 2);
        // loading previous event 
      } else
      if (currentEvent.action.equals("call")) {
        Variables.voice.addText("Direct call started");
        Style.setTextToScreen("Direct Call");
        Variables.finished = currentEvent.isFinal;
      } else
      if (currentEvent.action.equals("getInfo")) {
        if (isEmptyString(currentEvent.info)) {
          Variables.voice.addText("Getting you the latest information");
        } else {
          Variables.voice.addText(currentEvent.info);
        }
        Style.setTextToScreen("Getting Informations");
        Variables.finished = currentEvent.isFinal;

      } else
      if (currentEvent.action.equals("other")) {
        Variables.voice.addText(currentEvent.info);
        Variables.voice.addText("You've entered section of Other Services");
        Style.setTextToScreen("Other Services");
        Variables.finished = currentEvent.isFinal;

      } else if (currentEvent.action.equals("hangUp")) {
        Variables.voice.addText(currentEvent.info);
        Variables.voice.addText("Phone call ended");
        Style.setTextToScreen("End of Call");
        Variables.finished = currentEvent.isFinal;

      } else if (currentEvent.action.equals("record")) {
        Variables.voice.addText(currentEvent.info);
        Style.setTextToScreen("Recording");
        Variables.voice.addText("After beep start speaking beep");
        Variables.voice.speak();
        try {
          Thread.sleep(((long) 5));
        } catch (Exception e) {

        }
        Variables.voice.addText("Succesfully recorded");
      } else if (currentEvent.action.equals("repeat")) {
        Variables.voice.addText("Repeating possible options");
        Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
      }
      Variables.finished = currentEvent.isFinal;
      System.out.println(currentEvent.name + " + " + currentEvent.isFinal);
      if (Variables.finished) {
        Variables.voice.speak();
        Style.setTextToScreen("PhoneCall finished");
        return;
      } else {
        if (!(currentEvent.action.equals("back")) && !(currentEvent.action.equals("repeat"))) {
          Variables.path = Variables.path.substring(0, Variables.path.length() - 1);
        }
        currentEvent = Variables.myHashMap.get(Variables.path);
      }
      Style.setTextToScreen(currentEvent.action);
    }
    Style.setTextToScreen(currentEvent.name);
    // Handling voice output 
    if (wrongButtonPressed == false) {
      Variables.voice.addText(currentEvent.info);
    }
    Variables.voice.addText("Choose from this menu, ");
    // Delete all the previous possible options 
    Variables.possibleOptList.clear();
    // Proposing possible options consisting of next events 
    for (Event child : currentEvent.childs) {
      String trigger;
      if (child.trigger == "*") {
        trigger = " star";
      } else if (child.trigger == "#") {
        trigger = " hash";
      } else {
        trigger = child.trigger;
      }

      Variables.voice.addText(" For " + child.name + " press " + trigger + ",");
      Variables.possibleOptList.add(child.trigger);
    }
    Variables.voice.speak();
    if (!(Variables.finished)) {
      System.out.println("duration: " + currentEvent.duration + currentEvent.name);
      (Variables.timerThr = new Thread(new Behaviour.myTimer(evt, false, 11))).start();
    }
  }
  public static void runInitSetup() {
    // Static first iteration of Voicemenu 
    // declaring first possible following characters 
    Event currentEvent = Variables.myHashMap.get("0");
    for (Event item : currentEvent.childs) {
      Variables.possibleOptList.add(item.trigger);
    }
    // Itialization of voice output 
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
}
