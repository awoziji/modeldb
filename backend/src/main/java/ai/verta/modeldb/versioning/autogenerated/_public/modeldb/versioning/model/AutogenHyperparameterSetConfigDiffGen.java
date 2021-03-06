// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class AutogenHyperparameterSetConfigDiffGen
    extends Generator<AutogenHyperparameterSetConfigDiff> {
  public AutogenHyperparameterSetConfigDiffGen() {
    super(AutogenHyperparameterSetConfigDiff.class);
  }

  @Override
  public AutogenHyperparameterSetConfigDiff generate(
      SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    AutogenHyperparameterSetConfigDiff obj = new AutogenHyperparameterSetConfigDiff();
    if (r.nextBoolean()) {
      obj.setA(
          Utils.removeEmpty(
              gen().type(AutogenHyperparameterSetConfigBlob.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setB(
          Utils.removeEmpty(
              gen().type(AutogenHyperparameterSetConfigBlob.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setStatus(
          Utils.removeEmpty(gen().type(AutogenDiffStatusEnumDiffStatus.class).generate(r, status)));
    }
    return obj;
  }
}
