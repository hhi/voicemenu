package jetbrains.mps.samples.VoiceMenuTabularEditor.editor;

/*Generated by MPS */

import jetbrains.mps.lang.editor.table.runtime.AbstractTableModel;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class VoiceMenuTable extends AbstractTableModel {

  private final SNode myNode;
  private final EditorContext myEditorContext;

  public VoiceMenuTable(SNode node, EditorContext cotext) {
    myNode = node;
    myEditorContext = cotext;
  }
  @Override
  public int getColumnCount() {
    return 1;
  }
  @Override
  public int getRowCount() {
    return SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events")).size();
  }
  @Override
  public SNode getValueAt(int row, int column) {
    if (row >= 0 && (column == 0)) {
      return ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"))).getElement(row);
    }
    return null;
  }
  @Override
  public void insertRow(int rowNumber) {
    SNodeFactoryOperations.addNewChild(myNode, MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, "jetbrains.mps.samples.VoiceMenu.structure.Event")));
  }

  @Override
  public void deleteRow(int rowNumber) {
    SNodeOperations.deleteNode(ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"))).getElement(rowNumber));
  }


}
