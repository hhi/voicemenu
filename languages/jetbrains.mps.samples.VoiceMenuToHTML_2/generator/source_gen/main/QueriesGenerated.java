package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodeQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import jetbrains.mps.generator.impl.query.QueryKeyImpl;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.Collection;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.generator.impl.query.IfMacroCondition;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetPropertyValue_2702278965990747767(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_2702278965991007461(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf40204c8L, 0x25806c66fbe3905cL, "greeting"));
  }
  public static Object propertyMacro_GetPropertyValue_2702278965990576193(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08f3L, "events")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_2702278965991168240(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "greeting"));
  }
  public static Object propertyMacro_GetPropertyValue_2702278965990482133(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_2702278965990485226(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde30cL, 0x5b6b060cf3fde310L, "trigger"));
  }
  public static boolean ifMacro_Condition_2702278965991008820(final IfMacroContext _context) {
    return isNotEmptyString(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf40204c8L, 0x25806c66fbe3905cL, "greeting")));
  }
  public static boolean ifMacro_Condition_2702278965991168248(final IfMacroContext _context) {
    return isNotEmptyString(SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x25806c66fbe600f7L, "greeting")));
  }
  public static SNode sourceNodeQuery_2702278965990478461(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf40204c8L, 0x5b6b060cf40204ebL, "bodyMenu"));
  }
  public static SNode sourceNodeQuery_2702278965990687195(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde68dL, 0x5b6b060cf3fe08d2L, "commands"));
  }
  public static Iterable<SNode> sourceNodesQuery_2702278965990477955(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde688L, "events"));
  }
  public static Iterable<SNode> sourceNodesQuery_2702278965990570771(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x5b6b060cf3fde308L, 0x5b6b060cf3fde68aL, "activities"));
  }
  private final Map<String, SourceNodeQuery> snqMethods = new HashMap<String, SourceNodeQuery>();
  {
    int i = 0;
    snqMethods.put("2702278965990478461", new QueriesGenerated.SNQ(i++));
    snqMethods.put("2702278965990687195", new QueriesGenerated.SNQ(i++));
  }
  @NotNull
  @Override
  public SourceNodeQuery getSourceNodeQuery(@NotNull QueryKey identity) {
    final String id = ((QueryKeyImpl) identity).getQueryNodeId().toString();
    if (!(snqMethods.containsKey(id))) {
      return super.getSourceNodeQuery(identity);
    }
    return snqMethods.get(id);
  }
  private static class SNQ implements SourceNodeQuery {
    private final int methodKey;
    public SNQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public SNode evaluate(@NotNull SourceSubstituteMacroNodeContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.sourceNodeQuery_2702278965990478461(ctx);
        case 1:
          return QueriesGenerated.sourceNodeQuery_2702278965990687195(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("2702278965990477955", new QueriesGenerated.SNsQ(i++));
    snsqMethods.put("2702278965990570771", new QueriesGenerated.SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    final String id = ((QueryKeyImpl) identity).getQueryNodeId().toString();
    if (!(snsqMethods.containsKey(id))) {
      return super.getSourceNodesQuery(identity);
    }
    return snsqMethods.get(id);
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2702278965990477955(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2702278965990570771(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("2702278965990747764", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "name"));
    pvqMethods.put("2702278965991007458", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "text"));
    pvqMethods.put("2702278965990576192", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "name"));
    pvqMethods.put("2702278965991168239", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "text"));
    pvqMethods.put("2702278965990482132", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "name"));
    pvqMethods.put("2702278965990485225", new QueriesGenerated.PVQ(i++, MetaAdapterFactory.getProperty(0x479c7a8c02f943b5L, 0x9139d910cb22f298L, 0x16838b3fce9aa513L, 0x16838b3fce9aaa68L, "value"), "trigger"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(pvqMethods.containsKey(id))) {
      return super.getPropertyValueQuery(identity);
    }
    return pvqMethods.get(id);
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965990747767(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965991007461(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965990576193(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965991168240(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965990482133(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetPropertyValue_2702278965990485226(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("2702278965991008818", new QueriesGenerated.IfMC(i++));
    imcMethods.put("2702278965991168247", new QueriesGenerated.IfMC(i++));
  }
  @NotNull
  @Override
  public IfMacroCondition getIfMacroCondition(@NotNull QueryKey identity) {
    final String id = identity.getTemplateNode().getNodeId().toString();
    if (!(imcMethods.containsKey(id))) {
      return super.getIfMacroCondition(identity);
    }
    return imcMethods.get(id);
  }
  private static class IfMC implements IfMacroCondition {
    private final int methodKey;
    public IfMC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull IfMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.ifMacro_Condition_2702278965991008820(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_2702278965991168248(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
