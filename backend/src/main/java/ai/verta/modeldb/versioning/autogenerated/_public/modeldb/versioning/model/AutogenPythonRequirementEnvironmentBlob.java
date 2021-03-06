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

public class AutogenPythonRequirementEnvironmentBlob implements ProtoType {
  private String Constraint;
  private String Library;
  private AutogenVersionEnvironmentBlob Version;

  public AutogenPythonRequirementEnvironmentBlob() {
    this.Constraint = "";
    this.Library = "";
    this.Version = null;
  }

  public Boolean isEmpty() {
    if (this.Constraint != null && !this.Constraint.equals("")) {
      return false;
    }
    if (this.Library != null && !this.Library.equals("")) {
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
    sb.append("{\"class\": \"AutogenPythonRequirementEnvironmentBlob\", \"fields\": {");
    boolean first = true;
    if (this.Constraint != null && !this.Constraint.equals("")) {
      if (!first) sb.append(", ");
      sb.append("\"Constraint\": " + "\"" + Constraint + "\"");
      first = false;
    }
    if (this.Library != null && !this.Library.equals("")) {
      if (!first) sb.append(", ");
      sb.append("\"Library\": " + "\"" + Library + "\"");
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
    sb.append("AutogenPythonRequirementEnvironmentBlob");
    if (this.Constraint != null && !this.Constraint.equals("")) {
      sb.append("::Constraint::").append(Constraint);
    }
    if (this.Library != null && !this.Library.equals("")) {
      sb.append("::Library::").append(Library);
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
    if (!(o instanceof AutogenPythonRequirementEnvironmentBlob)) return false;
    AutogenPythonRequirementEnvironmentBlob other = (AutogenPythonRequirementEnvironmentBlob) o;

    {
      Function3<String, String, Boolean> f = (x, y) -> x.equals(y);
      if (this.Constraint != null || other.Constraint != null) {
        if (this.Constraint == null && other.Constraint != null) return false;
        if (this.Constraint != null && other.Constraint == null) return false;
        if (!f.apply(this.Constraint, other.Constraint)) return false;
      }
    }
    {
      Function3<String, String, Boolean> f = (x, y) -> x.equals(y);
      if (this.Library != null || other.Library != null) {
        if (this.Library == null && other.Library != null) return false;
        if (this.Library != null && other.Library == null) return false;
        if (!f.apply(this.Library, other.Library)) return false;
      }
    }
    {
      Function3<AutogenVersionEnvironmentBlob, AutogenVersionEnvironmentBlob, Boolean> f =
          (x, y) -> x.equals(y);
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
    return Objects.hash(this.Constraint, this.Library, this.Version);
  }

  public AutogenPythonRequirementEnvironmentBlob setConstraint(String value) {
    this.Constraint = Utils.removeEmpty(value);
    return this;
  }

  public String getConstraint() {
    return this.Constraint;
  }

  public AutogenPythonRequirementEnvironmentBlob setLibrary(String value) {
    this.Library = Utils.removeEmpty(value);
    return this;
  }

  public String getLibrary() {
    return this.Library;
  }

  public AutogenPythonRequirementEnvironmentBlob setVersion(AutogenVersionEnvironmentBlob value) {
    this.Version = Utils.removeEmpty(value);
    return this;
  }

  public AutogenVersionEnvironmentBlob getVersion() {
    return this.Version;
  }

  public static AutogenPythonRequirementEnvironmentBlob fromProto(
      ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob blob) {
    if (blob == null) {
      return null;
    }

    AutogenPythonRequirementEnvironmentBlob obj = new AutogenPythonRequirementEnvironmentBlob();
    {
      Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob, String> f =
          x -> (blob.getConstraint());
      obj.setConstraint(f.apply(blob));
    }
    {
      Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob, String> f =
          x -> (blob.getLibrary());
      obj.setLibrary(f.apply(blob));
    }
    {
      Function<
              ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob,
              AutogenVersionEnvironmentBlob>
          f = x -> AutogenVersionEnvironmentBlob.fromProto(blob.getVersion());
      obj.setVersion(f.apply(blob));
    }
    return obj;
  }

  public ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder toProto() {
    ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder builder =
        ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.newBuilder();
    {
      if (this.Constraint != null && !this.Constraint.equals("")) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
            x -> {
              builder.setConstraint(this.Constraint);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Library != null && !this.Library.equals("")) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
            x -> {
              builder.setLibrary(this.Library);
              return null;
            };
        f.apply(builder);
      }
    }
    {
      if (this.Version != null && !this.Version.equals(null)) {
        Function<ai.verta.modeldb.versioning.PythonRequirementEnvironmentBlob.Builder, Void> f =
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
    visitor.preVisitAutogenPythonRequirementEnvironmentBlob(this);
  }

  public void preVisitDeep(Visitor visitor) throws ModelDBException {
    this.preVisitShallow(visitor);
    visitor.preVisitDeepString(this.Constraint);
    visitor.preVisitDeepString(this.Library);
    visitor.preVisitDeepAutogenVersionEnvironmentBlob(this.Version);
  }

  public AutogenPythonRequirementEnvironmentBlob postVisitShallow(Visitor visitor)
      throws ModelDBException {
    return visitor.postVisitAutogenPythonRequirementEnvironmentBlob(this);
  }

  public AutogenPythonRequirementEnvironmentBlob postVisitDeep(Visitor visitor)
      throws ModelDBException {
    this.setConstraint(visitor.postVisitDeepString(this.Constraint));
    this.setLibrary(visitor.postVisitDeepString(this.Library));
    this.setVersion(visitor.postVisitDeepAutogenVersionEnvironmentBlob(this.Version));
    return this.postVisitShallow(visitor);
  }
}
