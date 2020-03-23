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

public class PythonEnvironmentDiff implements ProtoType {
  private List<PythonRequirementEnvironmentDiff> Constraints;
  private List<PythonRequirementEnvironmentDiff> Requirements;
  private VersionEnvironmentDiff Version;

  public PythonEnvironmentDiff() {
    this.Constraints = null;
    this.Requirements = null;
    this.Version = null;
  }

  public Boolean isEmpty() {
    if (this.Constraints != null && !this.Constraints.equals(null) && !this.Constraints.isEmpty()) {
      return false;
    }
    if (this.Requirements != null
        && !this.Requirements.equals(null)
        && !this.Requirements.isEmpty()) {
      return false;
    }
    if (this.Version != null && !this.Version.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"PythonEnvironmentDiff\", \"fields\": {");
    boolean first = true;
    if (this.Constraints != null && !this.Constraints.equals(null) && !this.Constraints.isEmpty()) {
      if (!first) sb.append(", ");
      sb.append("\"Constraints\": " + Constraints);
      first = false;
    }
    if (this.Requirements != null
        && !this.Requirements.equals(null)
        && !this.Requirements.isEmpty()) {
      if (!first) sb.append(", ");
      sb.append("\"Requirements\": " + Requirements);
      first = false;
    }
    if (this.Version != null && !this.Version.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"Version\": " + Version);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  // TODO: actually hash
  public String getSHA() {
    StringBuilder sb = new StringBuilder();
    sb.append("PythonEnvironmentDiff");
    if (this.Constraints != null && !this.Constraints.equals(null) && !this.Constraints.isEmpty()) {
      sb.append("::Constraints::").append(Constraints);
    }
    if (this.Requirements != null
        && !this.Requirements.equals(null)
        && !this.Requirements.isEmpty()) {
      sb.append("::Requirements::").append(Requirements);
    }
    if (this.Version != null && !this.Version.equals(null)) {
      sb.append("::Version::").append(Version);
    }

    return sb.toString();
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof PythonEnvironmentDiff)) return false;
    PythonEnvironmentDiff other = (PythonEnvironmentDiff) o;

    {
      Function3<
              List<PythonRequirementEnvironmentDiff>,
              List<PythonRequirementEnvironmentDiff>,
              Boolean>
          f =
              (x2, y2) ->
                  IntStream.range(0, Math.min(x2.size(), y2.size()))
                      .mapToObj(
                          i -> {
                            Function3<
                                    PythonRequirementEnvironmentDiff,
                                    PythonRequirementEnvironmentDiff,
                                    Boolean>
                                f2 = (x, y) -> x.equals(y);
                            return f2.apply(x2.get(i), y2.get(i));
                          })
                      .filter(x -> x.equals(false))
                      .collect(Collectors.toList())
                      .isEmpty();
      if (this.Constraints != null || other.Constraints != null) {
        if (this.Constraints == null && other.Constraints != null) return false;
        if (this.Constraints != null && other.Constraints == null) return false;
        if (!f.apply(this.Constraints, other.Constraints)) return false;
      }
    }
    {
      Function3<
              List<PythonRequirementEnvironmentDiff>,
              List<PythonRequirementEnvironmentDiff>,
              Boolean>
          f =
              (x2, y2) ->
                  IntStream.range(0, Math.min(x2.size(), y2.size()))
                      .mapToObj(
                          i -> {
                            Function3<
                                    PythonRequirementEnvironmentDiff,
                                    PythonRequirementEnvironmentDiff,
                                    Boolean>
                                f2 = (x, y) -> x.equals(y);
                            return f2.apply(x2.get(i), y2.get(i));
                          })
                      .filter(x -> x.equals(false))
                      .collect(Collectors.toList())
                      .isEmpty();
      if (this.Requirements != null || other.Requirements != null) {
        if (this.Requirements == null && other.Requirements != null) return false;
        if (this.Requirements != null && other.Requirements == null) return false;
        if (!f.apply(this.Requirements, other.Requirements)) return false;
      }
    }
    {
      Function3<VersionEnvironmentDiff, VersionEnvironmentDiff, Boolean> f = (x, y) -> x.equals(y);
      if (this.Version != null || other.Version != null) {
        if (this.Version == null && other.Version != null) return false;
        if (this.Version != null && other.Version == null) return false;
        if (!f.apply(this.Version, other.Version)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.Constraints, this.Requirements, this.Version);
  }

  public PythonEnvironmentDiff setConstraints(List<PythonRequirementEnvironmentDiff> value) {
    this.Constraints = Utils.removeEmpty(value);
    if (this.Constraints != null) {
      this.Constraints.sort(Comparator.comparingInt(PythonRequirementEnvironmentDiff::hashCode));
    }
    return this;
  }

  public List<PythonRequirementEnvironmentDiff> getConstraints() {
    return this.Constraints;
  }

  public PythonEnvironmentDiff setRequirements(List<PythonRequirementEnvironmentDiff> value) {
    this.Requirements = Utils.removeEmpty(value);
    if (this.Requirements != null) {
      this.Requirements.sort(Comparator.comparingInt(PythonRequirementEnvironmentDiff::hashCode));
    }
    return this;
  }

  public List<PythonRequirementEnvironmentDiff> getRequirements() {
    return this.Requirements;
  }

  public PythonEnvironmentDiff setVersion(VersionEnvironmentDiff value) {
    this.Version = Utils.removeEmpty(value);
    return this;
  }

  public VersionEnvironmentDiff getVersion() {
    return this.Version;
  }

  public static PythonEnvironmentDiff fromProto(
      ai.verta.modeldb.versioning.PythonEnvironmentDiff blob) {
    if (blob == null) {
      return null;
    }

    PythonEnvironmentDiff obj = new PythonEnvironmentDiff();
    {
      Function<
              ai.verta.modeldb.versioning.PythonEnvironmentDiff,
              List<PythonRequirementEnvironmentDiff>>
          f =
              x ->
                  blob.getConstraintsList().stream()
                      .map(PythonRequirementEnvironmentDiff::fromProto)
                      .collect(Collectors.toList());
      obj.Constraints = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonEnvironmentDiff,
              List<PythonRequirementEnvironmentDiff>>
          f =
              x ->
                  blob.getRequirementsList().stream()
                      .map(PythonRequirementEnvironmentDiff::fromProto)
                      .collect(Collectors.toList());
      obj.Requirements = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff, VersionEnvironmentDiff> f =
          x -> VersionEnvironmentDiff.fromProto(blob.getVersion());
      obj.Version = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder toProto() {
    ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder builder =
        ai.verta.modeldb.versioning.PythonEnvironmentDiff.newBuilder();
    {
      if (this.Constraints != null
          && !this.Constraints.equals(null)
          && !this.Constraints.isEmpty()) {
        Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.addAllConstraints(
                  this.Constraints.stream()
                      .map(y -> y.toProto().build())
                      .collect(Collectors.toList()));
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Requirements != null
          && !this.Requirements.equals(null)
          && !this.Requirements.isEmpty()) {
        Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.addAllRequirements(
                  this.Requirements.stream()
                      .map(y -> y.toProto().build())
                      .collect(Collectors.toList()));
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Version != null && !this.Version.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setVersion(this.Version.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitPythonEnvironmentDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepListOfPythonRequirementEnvironmentDiff(this.Constraints);
    visitor.preVisitDeepListOfPythonRequirementEnvironmentDiff(this.Requirements);
    visitor.preVisitDeepVersionEnvironmentDiff(this.Version);
  }

  public PythonEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitPythonEnvironmentDiff(this);
  }

  public PythonEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setConstraints(
        visitor.postVisitDeepListOfPythonRequirementEnvironmentDiff(this.Constraints));
    this.setRequirements(
        visitor.postVisitDeepListOfPythonRequirementEnvironmentDiff(this.Requirements));
    this.setVersion(visitor.postVisitDeepVersionEnvironmentDiff(this.Version));
    return this.postVisitShallow(visitor);
  }
}