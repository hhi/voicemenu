package jetbrains.mps.samples.VoiceMenu.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ResetAction_QuickFix extends QuickFix_Runtime {
  public ResetAction_QuickFix() {
    super(new SNodePointer("r:a3d91a5b-5d89-4c37-bb4a-da96d8c37ef1(jetbrains.mps.samples.VoiceMenu.typesystem)", "5461963470562080096"));
  }
  public String getDescription(SNode node) {
    return "Reset Action";
  }
  public void execute(SNode node) {
    SNodeFactoryOperations.replaceWithNewChild(node, CONCEPTS.Command$a6);
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Command$a6 = MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x555e0967dab9863dL, "jetbrains.mps.samples.VoiceMenu.structure.Command");
  }
}
