// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.generator.java.util.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;

public class AutogenPathDatasetComponentDiffGen extends Generator<AutogenPathDatasetComponentDiff> {
  public AutogenPathDatasetComponentDiffGen() {
    super(AutogenPathDatasetComponentDiff.class);
  }

  @Override
  public AutogenPathDatasetComponentDiff generate(SourceOfRandomness r, GenerationStatus status) {
    // if (r.nextBoolean())
    //     return null;

    AutogenPathDatasetComponentDiff obj = new AutogenPathDatasetComponentDiff();
    if (r.nextBoolean()) {
      obj.setA(
          Utils.removeEmpty(gen().type(AutogenPathDatasetComponentBlob.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setB(
          Utils.removeEmpty(gen().type(AutogenPathDatasetComponentBlob.class).generate(r, status)));
    }
    if (r.nextBoolean()) {
      obj.setStatus(
          Utils.removeEmpty(gen().type(AutogenDiffStatusEnumDiffStatus.class).generate(r, status)));
    }
    return obj;
  }
}
