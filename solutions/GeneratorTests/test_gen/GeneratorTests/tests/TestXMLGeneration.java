package GeneratorTests.tests;

/*Generated by MPS */

import jetbrains.mps.lang.test.generator.rt.BaseGeneratorTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.jetbrains.mps.openapi.model.SModel;
import org.junit.Before;
import org.junit.Test;
import jetbrains.mps.lang.test.generator.rt.TransformHelper;

public class TestXMLGeneration extends BaseGeneratorTest {

  @ClassRule
  public static TestParametersCache ourParamsCache = new TestParametersCache(TestXMLGeneration.class, "${project_home}", "r:ecaa69fb-f0ed-4254-93f7-01f043deade1(GeneratorTests.tests@tests)", false);

  private SModel myArg_input;
  private SModel myArg_expectedXMLOutput;
  private SModel myArg_expectedJavaOutput;
  private SModel myArg_xmlplan;
  private SModel myArg_javaPlan;

  @Before
  public void initProject() throws Exception {
    ourParamsCache.initializeOnce(this, getEnvironment());
    setProject(ourParamsCache.getProject());
  }

  @Before
  public void prepareArguments() {
    myArg_input = findModel("input", "r:0d8f1d70-07b2-4dc2-94d2-5048c3631076(GeneratorTests.source)");
    myArg_expectedXMLOutput = findModel("expectedXMLOutput", "r:a9f530cc-ebfa-4005-979f-ec102c5a259b(GeneratorTests.result)");
    myArg_expectedJavaOutput = findModel("expectedJavaOutput", "r:f0b46b5d-6877-46b8-adba-e0c33f897e27(GeneratorTests.resultJava)");
    myArg_xmlplan = findModel("xmlplan", "r:449eadb4-490b-4078-be90-e200276f01b4(GeneratorTests.planxml)");
    myArg_javaPlan = findModel("javaPlan", "r:47054eeb-0fb8-4654-927d-6bb72d193714(GeneratorTests.planjava)");
  }

  @Test
  public void testTransformAndMatch0() {
    TransformHelper t = newTransformer();
    SModel i = myArg_input;
    t.setInput(i);
    t.setPlanProvider(planProviderFromModel(myArg_xmlplan));
    t.transform();
    SModel rm = myArg_expectedXMLOutput;
    assertMatch(t.getOutputModel(), rm);
  }
  @Test
  public void testTransformAndMatch1() {
    TransformHelper t = newTransformer();
    SModel i = myArg_input;
    t.setInput(i);
    t.setPlanProvider(planProviderFromModel(myArg_javaPlan));
    t.transform();
    SModel rm = myArg_expectedJavaOutput;
    assertMatch(t.getOutputModel(), rm);
  }

}