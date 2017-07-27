package jetbrains.mps.samples.VoiceMenu.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptInput = createDescriptorForInput();
  /*package*/ final ConceptDescriptor myConceptMenu = createDescriptorForMenu();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptInput, myConceptMenu);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.Input:
        return myConceptInput;
      case LanguageConceptSwitch.Menu:
        return myConceptMenu;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.VoiceMenu", "Action", 0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28d426aL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:2ab0b85f-01aa-4be4-a845-4ce3631e76c1(jetbrains.mps.samples.VoiceMenu.structure)/6220196697617547882");
    b.aggregate("trigger", 0x565293f0c28d63a6L).target(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28d5b63L).optional(false).ordered(true).multiple(false).origin("6220196697617556390").done();
    b.alias("action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInput() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.VoiceMenu", "Input", 0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28d5b63L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:2ab0b85f-01aa-4be4-a845-4ce3631e76c1(jetbrains.mps.samples.VoiceMenu.structure)/6220196697617554275");
    b.alias("input");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMenu() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("jetbrains.mps.samples.VoiceMenu", "Menu", 0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28cbe65L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:2ab0b85f-01aa-4be4-a845-4ce3631e76c1(jetbrains.mps.samples.VoiceMenu.structure)/6220196697617514085");
    b.aggregate("actions", 0x565293f0c28d47fdL).target(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28d426aL).optional(true).ordered(true).multiple(true).origin("6220196697617549309").done();
    b.aggregate("menus", 0x565293f0c28d0ba8L).target(0x4bc750d756884f52L, 0xb7d5b263a3393a24L, 0x565293f0c28cbe65L).optional(true).ordered(true).multiple(true).origin("6220196697617533864").done();
    b.alias("menu");
    return b.create();
  }
}
