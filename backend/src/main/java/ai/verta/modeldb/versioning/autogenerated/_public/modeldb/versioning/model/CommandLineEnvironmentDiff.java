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

public class CommandLineEnvironmentDiff implements ProtoType {
  private List<String> A;
  private List<String> B;
  private DiffStatusEnumDiffStatus Status;

  public CommandLineEnvironmentDiff() {
    this.A = null;
    this.B = null;
    this.Status = null;
  }

  public Boolean isEmpty() {
    if (this.A != null && !this.A.equals(null) && !this.A.isEmpty()) {
      return false;
    }
    if (this.B != null && !this.B.equals(null) && !this.B.isEmpty()) {
      return false;
    }
    if (this.Status != null && !this.Status.equals(null)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\"class\": \"CommandLineEnvironmentDiff\", \"fields\": {");
    boolean first = true;
    if (this.A != null && !this.A.equals(null) && !this.A.isEmpty()) {
      if (!first) sb.append(", ");
      sb.append("\"A\": " + A);
      first = false;
    }
    if (this.B != null && !this.B.equals(null) && !this.B.isEmpty()) {
      if (!first) sb.append(", ");
      sb.append("\"B\": " + B);
      first = false;
    }
    if (this.Status != null && !this.Status.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"Status\": " + Status);
      first = false;
    }
    sb.append("}}");
    return sb.toString();
  }

  // TODO: actually hash
  public String getSHA() {
    StringBuilder sb = new StringBuilder();
    sb.append("CommandLineEnvironmentDiff");
    if (this.A != null && !this.A.equals(null) && !this.A.isEmpty()) {
      sb.append("::A::").append(A);
    }
    if (this.B != null && !this.B.equals(null) && !this.B.isEmpty()) {
      sb.append("::B::").append(B);
    }
    if (this.Status != null && !this.Status.equals(null)) {
      sb.append("::Status::").append(Status);
    }

    return sb.toString();
  }

  // TODO: not consider order on lists
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof CommandLineEnvironmentDiff)) return false;
    CommandLineEnvironmentDiff other = (CommandLineEnvironmentDiff) o;

    {
      Function3<List<String>, List<String>, Boolean> f =
          (x2, y2) ->
              IntStream.range(0, Math.min(x2.size(), y2.size()))
                  .mapToObj(
                      i -> {
                        Function3<String, String, Boolean> f2 = (x, y) -> x.equals(y);
                        return f2.apply(x2.get(i), y2.get(i));
                      })
                  .filter(x -> x.equals(false))
                  .collect(Collectors.toList())
                  .isEmpty();
      if (this.A != null || other.A != null) {
        if (this.A == null && other.A != null) return false;
        if (this.A != null && other.A == null) return false;
        if (!f.apply(this.A, other.A)) return false;
      }
    }
    {
      Function3<List<String>, List<String>, Boolean> f =
          (x2, y2) ->
              IntStream.range(0, Math.min(x2.size(), y2.size()))
                  .mapToObj(
                      i -> {
                        Function3<String, String, Boolean> f2 = (x, y) -> x.equals(y);
                        return f2.apply(x2.get(i), y2.get(i));
                      })
                  .filter(x -> x.equals(false))
                  .collect(Collectors.toList())
                  .isEmpty();
      if (this.B != null || other.B != null) {
        if (this.B == null && other.B != null) return false;
        if (this.B != null && other.B == null) return false;
        if (!f.apply(this.B, other.B)) return false;
      }
    }
    {
      Function3<DiffStatusEnumDiffStatus, DiffStatusEnumDiffStatus, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.Status != null || other.Status != null) {
        if (this.Status == null && other.Status != null) return false;
        if (this.Status != null && other.Status == null) return false;
        if (!f.apply(this.Status, other.Status)) return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.A, this.B, this.Status);
  }

  public CommandLineEnvironmentDiff setA(List<String> value) {
    this.A = Utils.removeEmpty(value);
    return this;
  }

  public List<String> getA() {
    return this.A;
  }

  public CommandLineEnvironmentDiff setB(List<String> value) {
    this.B = Utils.removeEmpty(value);
    return this;
  }

  public List<String> getB() {
    return this.B;
  }

  public CommandLineEnvironmentDiff setStatus(DiffStatusEnumDiffStatus value) {
    this.Status = Utils.removeEmpty(value);
    return this;
  }

  public DiffStatusEnumDiffStatus getStatus() {
    return this.Status;
  }

  public static CommandLineEnvironmentDiff fromProto(
      ai.verta.modeldb.versioning.CommandLineEnvironmentDiff blob) {
    if (blob == null) {
      return null;
    }

    CommandLineEnvironmentDiff obj = new CommandLineEnvironmentDiff();
    {
      Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff, List<String>> f =
          x -> blob.getAList();
      obj.A = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff, List<String>> f =
          x -> blob.getBList();
      obj.B = Utils.removeEmpty(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff, DiffStatusEnumDiffStatus> f =
          x -> DiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.Status = Utils.removeEmpty(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.Builder toProto() {
    ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.Builder builder =
        ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.newBuilder();
    {
      if (this.A != null && !this.A.equals(null) && !this.A.isEmpty()) {
        Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.addAllA(this.A);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.B != null && !this.B.equals(null) && !this.B.isEmpty()) {
        Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.addAllB(this.B);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Status != null && !this.Status.equals(null)) {
        Function<ai.verta.modeldb.versioning.CommandLineEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setStatus(this.Status.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    return builder;
  }

  public void preVisitShallow(Visitor visitor) throws ModelDBException {
    visitor.preVisitCommandLineEnvironmentDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepListOfString(this.A);
    visitor.preVisitDeepListOfString(this.B);
    visitor.preVisitDeepDiffStatusEnumDiffStatus(this.Status);
  }

  public CommandLineEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitCommandLineEnvironmentDiff(this);
  }

  public CommandLineEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setA(visitor.postVisitDeepListOfString(this.A));
    this.setB(visitor.postVisitDeepListOfString(this.B));
    this.setStatus(visitor.postVisitDeepDiffStatusEnumDiffStatus(this.Status));
    return this.postVisitShallow(visitor);
  }
}