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

public class AutogenVersionEnvironmentDiff implements ProtoType {
  private AutogenVersionEnvironmentBlob A;
  private AutogenVersionEnvironmentBlob B;
  private AutogenDiffStatusEnumDiffStatus Status;

  public AutogenVersionEnvironmentDiff() {
    this.A = null;
    this.B = null;
    this.Status = null;
  }

  public Boolean isEmpty() {
    if (this.A != null && !this.A.equals(null)) {
      return false;
    }
    if (this.B != null && !this.B.equals(null)) {
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
    sb.append("{\"class\": \"AutogenVersionEnvironmentDiff\", \"fields\": {");
    boolean first = true;
    if (this.A != null && !this.A.equals(null)) {
      if (!first) sb.append(", ");
      sb.append("\"A\": " + A);
      first = false;
    }
    if (this.B != null && !this.B.equals(null)) {
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
    sb.append("AutogenVersionEnvironmentDiff");
    if (this.A != null && !this.A.equals(null)) {
      sb.append("::A::").append(A);
    }
    if (this.B != null && !this.B.equals(null)) {
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
    if (!(o instanceof AutogenVersionEnvironmentDiff)) return false;
    AutogenVersionEnvironmentDiff other = (AutogenVersionEnvironmentDiff) o;

    {
      Function3<AutogenVersionEnvironmentBlob, AutogenVersionEnvironmentBlob, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.A != null || other.A != null) {
        if (this.A == null && other.A != null) return false;
        if (this.A != null && other.A == null) return false;
        if (!f.apply(this.A, other.A)) return false;
      }
    }
    {
      Function3<AutogenVersionEnvironmentBlob, AutogenVersionEnvironmentBlob, Boolean> f =
          (x, y) -> x.equals(y);
      if (this.B != null || other.B != null) {
        if (this.B == null && other.B != null) return false;
        if (this.B != null && other.B == null) return false;
        if (!f.apply(this.B, other.B)) return false;
      }
    }
    {
      Function3<AutogenDiffStatusEnumDiffStatus, AutogenDiffStatusEnumDiffStatus, Boolean> f =
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

  public AutogenVersionEnvironmentDiff setA(AutogenVersionEnvironmentBlob value) {
    this.A = Utils.removeEmpty(value);
    return this;
  }

  public AutogenVersionEnvironmentBlob getA() {
    return this.A;
  }

  public AutogenVersionEnvironmentDiff setB(AutogenVersionEnvironmentBlob value) {
    this.B = Utils.removeEmpty(value);
    return this;
  }

  public AutogenVersionEnvironmentBlob getB() {
    return this.B;
  }

  public AutogenVersionEnvironmentDiff setStatus(AutogenDiffStatusEnumDiffStatus value) {
    this.Status = Utils.removeEmpty(value);
    return this;
  }

  public AutogenDiffStatusEnumDiffStatus getStatus() {
    return this.Status;
  }

  public static AutogenVersionEnvironmentDiff fromProto(
      ai.verta.modeldb.versioning.VersionEnvironmentDiff blob) {
    if (blob == null) {
      return null;
    }

    AutogenVersionEnvironmentDiff obj = new AutogenVersionEnvironmentDiff();
    {
      Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff, AutogenVersionEnvironmentBlob>
          f = x -> AutogenVersionEnvironmentBlob.fromProto(blob.getA());
      obj.setA(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff, AutogenVersionEnvironmentBlob>
          f = x -> AutogenVersionEnvironmentBlob.fromProto(blob.getB());
      obj.setB(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff, AutogenDiffStatusEnumDiffStatus>
          f = x -> AutogenDiffStatusEnumDiffStatus.fromProto(blob.getStatus());
      obj.setStatus(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.VersionEnvironmentDiff.Builder toProto() {
    ai.verta.modeldb.versioning.VersionEnvironmentDiff.Builder builder =
        ai.verta.modeldb.versioning.VersionEnvironmentDiff.newBuilder();
    {
      if (this.A != null && !this.A.equals(null)) {
        Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setA(this.A.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.B != null && !this.B.equals(null)) {
        Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff.Builder, Void> f =
            x -> {
              builder.setB(this.B.toProto());
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Status != null && !this.Status.equals(null)) {
        Function<ai.verta.modeldb.versioning.VersionEnvironmentDiff.Builder, Void> f =
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
    visitor.preVisitAutogenVersionEnvironmentDiff(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepAutogenVersionEnvironmentBlob(this.A);
    visitor.preVisitDeepAutogenVersionEnvironmentBlob(this.B);
    visitor.preVisitDeepAutogenDiffStatusEnumDiffStatus(this.Status);
  }

  public AutogenVersionEnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
    return visitor.postVisitAutogenVersionEnvironmentDiff(this);
  }

  public AutogenVersionEnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
    this.setA(visitor.postVisitDeepAutogenVersionEnvironmentBlob(this.A));
    this.setB(visitor.postVisitDeepAutogenVersionEnvironmentBlob(this.B));
    this.setStatus(visitor.postVisitDeepAutogenDiffStatusEnumDiffStatus(this.Status));
    return this.postVisitShallow(visitor);
  }
}
