package jetbrains.mps.samples.VoiceMenuTabularEditor.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.BracketsStyleClass;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.DeclarationsStyleClass;
import jetbrains.mps.editor.runtime.style.FocusPolicy;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.samples.VoiceMenu.editor.Styles_StyleSheet.ArrowsStyleClass;
import jetbrains.mps.samples.VoiceMenu.editor.RemoveEventAndActivity;
import jetbrains.mps.nodeEditor.cells.EditorCell_ContextAssistantComponent;

/*package*/ class Event_tabular_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Event_tabular_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_bibga2_a();
  }

  private EditorCell createCollection_bibga2_a() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_bibga2_a");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    Style style = new StyleImpl();
    new BracketsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_bibga2_a0a());
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_bibga2_a0());
    editorCell.addEditorCell(createProperty_bibga2_b0());
    editorCell.addEditorCell(createConstant_bibga2_c0());
    editorCell.addEditorCell(createConstant_bibga2_d0());
    editorCell.addEditorCell(createProperty_bibga2_e0());
    if (nodeCondition_bibga2_a5a()) {
      editorCell.addEditorCell(createContextAssistant_bibga2_f0());
    }
    return editorCell;
  }
  private boolean nodeCondition_bibga2_a5a() {
    return isEmptyString(SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, 0x5b6b060cf3fde310L, "trigger")));
  }
  private SNode _StyleParameter_QueryFunction_bibga2_a0a() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, "jetbrains.mps.samples.VoiceMenu.structure.Menu")), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_cn9l5w_a0a0a0a0a0a0k(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event")), getNode());
      }
    });
  }
  private EditorCell createConstant_bibga2_a0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "    ");
    editorCell.setCellId("Constant_bibga2_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_bibga2_b0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("trigger");
    provider.setNoTargetText("#");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_trigger");
    Style style = new StyleImpl();
    new DeclarationsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_bibga2_a0b0());
    editorCell.getStyle().putAll(style);
    if (true) {
      editorCell.getStyle().set(StyleAttributes.FOCUS_POLICY, FocusPolicy.ATTRACTS_FOCUS);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private SNode _StyleParameter_QueryFunction_bibga2_a0b0() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, "jetbrains.mps.samples.VoiceMenu.structure.Menu")), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_cn9l5w_a0a0a0a0a0a0n(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event")), getNode());
      }
    });
  }
  private EditorCell createConstant_bibga2_c0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "    ");
    editorCell.setCellId("Constant_bibga2_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_bibga2_d0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "->");
    editorCell.setCellId("Constant_bibga2_d0");
    Style style = new StyleImpl();
    new ArrowsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.EDITABLE, false);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_bibga2_a2d0());
    editorCell.getStyle().putAll(style);
    RemoveEventAndActivity.setCellActions(editorCell, myNode, getEditorContext());
    editorCell.setDefaultText("");
    return editorCell;
  }
  private SNode _StyleParameter_QueryFunction_bibga2_a2d0() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, "jetbrains.mps.samples.VoiceMenu.structure.Menu")), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_cn9l5w_a0a0a0a0a0a0q(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event")), getNode());
      }
    });
  }
  private EditorCell createProperty_bibga2_e0() {
    CellProviderWithRole provider = new PropertyCellProvider(myNode, getEditorContext());
    provider.setRole("name");
    provider.setNoTargetText("activity");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    new DeclarationsStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    style.set(StyleAttributes.NAVIGATABLE_NODE, _StyleParameter_QueryFunction_bibga2_a0e0());
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
      return manager.createNodeRoleAttributeCell(attributeConcept, provider.getRoleAttributeKind(), editorCell);
    } else
    return editorCell;
  }
  private SNode _StyleParameter_QueryFunction_bibga2_a0e0() {
    return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(getNode()), MetaAdapterFactory.getConcept(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, "jetbrains.mps.samples.VoiceMenu.structure.Menu")), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"))).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return eq_cn9l5w_a0a0a0a0a0a0s(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "event")), getNode());
      }
    });
  }
  private EditorCell createContextAssistant_bibga2_f0() {
    EditorCell editorCell = new EditorCell_ContextAssistantComponent(getEditorContext(), myNode);
    editorCell.setCellId("ContextAssistant_bibga2_f0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private static boolean isEmptyString(String str) {
    return str == null || str.length() == 0;
  }
  private static boolean eq_cn9l5w_a0a0a0a0a0a0k(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_cn9l5w_a0a0a0a0a0a0n(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_cn9l5w_a0a0a0a0a0a0q(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
  private static boolean eq_cn9l5w_a0a0a0a0a0a0s(Object a, Object b) {
    return (a != null ? a.equals(b) : a == b);
  }
}
