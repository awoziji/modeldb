// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.diff.*;
import ai.verta.modeldb.versioning.blob.diff.Function3;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;
import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AutogenS3DatasetDiff implements ProtoType {
  private List<AutogenS3DatasetComponentDiff> Components;

  public AutogenS3DatasetDiff() {
    this.Components = null;
  }

  public Boolean isEmpty() {
    if (this.Components != null && !this.Components.equals(null) && !this.Components.isEmpty()) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"AutogenS3DatasetDiff\", \"fields\": {");
    boolean first = true;
    if (this.Components != null && !this.Components.equals(null) && !this.Components.isEmpty()) {
      if (!first) sb.append(", ");
      sb.append("\"Components\": " + Components);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  // TODO: actually hash
  public String getSHA() {
    StringBuilder sb = new StringBuilder();
    sb.append("AutogenS3DatasetDiff");
    if (this.Components != null && !this.Components.equals(null) && !this.Components.isEmpty()) {
      sb.append("::Components::").append(Components);
    }

    return sb.toString();
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof AutogenS3DatasetDiff)) return false;
    AutogenS3DatasetDiff other = (AutogenS3DatasetDiff) o;

    {
      Function3<List<AutogenS3DatasetComponentDiff>, List<AutogenS3DatasetComponentDiff>, Boolean>
          f =
              (x2, y2) ->
                  IntStream.range(0, Math.min(x2.size(), y2.size()))
                      .mapToObj(
                          i -> {
                            Function3<
                                    AutogenS3DatasetComponentDiff,
                                    AutogenS3DatasetComponentDiff,
                                    Boolean>
                                f2 = (x, y) -> x.equals(y);
                            return f2.apply(x2.get(i), y2.get(i));
                          })
                      .filter(x -> x.equals(false))
                      .collect(Collectors.toList())
                      .isEmpty();
      if (this.Components != null || other.Components != null) {
        if (this.Components == null && other.Components != null) return false;
        if (this.Components != null && other.Components == null) return false;
        if (!f.apply(this.Components, other.Components)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Components);
  }

  public AutogenS3DatasetDiff setComponents(List<AutogenS3DatasetComponentDiff> value) {
    this.Components = Utils.removeEmpty(value);
    if (this.Components != null) {
      this.Components.sort(Comparator.comparingInt(AutogenS3DatasetComponentDiff::hashCode));
    }
    return this;
  }

  public List<AutogenS3DatasetComponentDiff> getComponents() {
    return this.Components;
  }

  public static AutogenS3DatasetDiff fromProto(ai.verta.modeldb.versioning.S3DatasetDiff blob) {
    if (blob == null) {
      return null;
    }

    AutogenS3DatasetDiff obj = new AutogenS3DatasetDiff();
    {
      Function<ai.verta.modeldb.versioning.S3DatasetDiff, List<AutogenS3DatasetComponentDiff>> f =
          x ->
              blob.getComponentsList().stream()
                  .map(AutogenS3DatasetComponentDiff::fromProto)
                  .collect(Collectors.toList());
      obj.setComponents(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.S3DatasetDiff.Builder toProto() {
    ai.verta.modeldb.versioning.S3DatasetDiff.Builder builder =
        ai.verta.modeldb.versioning.S3DatasetDiff.newBuilder();
    {
      if (this.Components != null && !this.Components.equals(null) && !this.Components.isEmpty()) {
        Function<ai.verta.modeldb.versioning.S3DatasetDiff.Builder, Void> f =
            x -> {
              builder.addAllComponents(
                  this.Components.stream()
                      .map(y -> y.toProto().build())
                      .collect(Collectors.toList()));
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitAutogenS3DatasetDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepListOfAutogenS3DatasetComponentDiff(this.Components);
  }

  public AutogenS3DatasetDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitAutogenS3DatasetDiff(this);
  }

  public AutogenS3DatasetDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setComponents(visitor.postVisitDeepListOfAutogenS3DatasetComponentDiff(this.Components));

    return this.postVisitShallow(visitor);
  }
}
