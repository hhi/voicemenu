package voicemenu.plugin.project.wizard;

/*Generated by MPS */

import jetbrains.mps.workbench.dialogs.project.newproject.ProjectTemplatesGroup;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.workbench.dialogs.project.newproject.MPSProjectTemplate;
import java.util.List;
import java.util.ArrayList;

public class VoiceMenuProjectGroup implements ProjectTemplatesGroup {
  @NotNull
  @Override
  public String getName() {
    return "Voice menu";
  }
  @NotNull
  @Override
  public Collection<MPSProjectTemplate> getTemplates() {
    List<MPSProjectTemplate> list = new ArrayList<MPSProjectTemplate>();
    list.add(new VoiceMenuProjectTemplate());
    return list;
  }
}
