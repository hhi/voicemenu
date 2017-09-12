package jetbrains.mps.samples.VoiceMenu.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class RemoveDuplicateTimeouts_QuickFix extends QuickFix_Runtime {
  public RemoveDuplicateTimeouts_QuickFix() {
    super(new SNodePointer("r:a3d91a5b-5d89-4c37-bb4a-da96d8c37ef1(jetbrains.mps.samples.VoiceMenu.typesystem)", "3026886742211997921"));
  }
  public String getDescription(SNode node) {
    return "Remove Duplicate Timeouts";
  }
  public void execute(SNode node) {
    SNodeOperations.deleteNode(ListSequence.fromList(SLinkOperations.getChildren(((SNode) RemoveDuplicateTimeouts_QuickFix.this.getField("menu")[0]), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_z3y5kn_a0a0a0a0a0a0a2(SPropertyOperations.getString(it, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, 0x5b6b060cf3fde310L, "trigger")), "X");
      }
    }));
  }
  private static boolean eq_z3y5kn_a0a0a0a0a0a0a2(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
